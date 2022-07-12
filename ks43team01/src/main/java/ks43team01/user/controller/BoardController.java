package ks43team01.user.controller;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.print.DocFlavor.STRING;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ks43team01.dto.Board;
import ks43team01.dto.BoardComment;
import ks43team01.dto.BoardLargeCategory;
import ks43team01.dto.BoardMediumCategory;
import ks43team01.dto.File;
import ks43team01.dto.QnaBoard;
import ks43team01.dto.QnaBoardReply;
import ks43team01.service.BoardService;


@Controller
@RequestMapping("/userpage/board")
public class BoardController {
	
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	public final BoardService boardService;
	
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	/*
	 * 사용자 화면
	 * 
	 * */
	
	// 1:1 문의 게시글 관리
	
	/* 1:1 문의 게시글 답변글 등록  (post) */
	@PostMapping("/addQnaBoardReply")
	public String addQnaBoardReply(QnaBoard qnaBoard, HttpSession session, RedirectAttributes reAttr) {
		
		log.info("qnaBoard", qnaBoard);
		
		String sessionId = (String) session.getAttribute("UID");
		boardService.addQnaBoardReply(sessionId, qnaBoard);
		
		String boardQuestionCode = qnaBoard.getBoardQuestionCode();
		reAttr.addAttribute("boardQuestionCode", boardQuestionCode);
		
		return "redirect:/userpage/board/qnaBoardReplyDetail";
	}
	
	/*1:1 문의 게시글 답변글 등록(get)*/
	@GetMapping("/addQnaBoardReply")
	public String addQnaBoardReply(@RequestParam(name = "boardQuestionCode", required = false) String boardQuestionCode
									, @RequestParam(name = "boardLargeCategoryCode", required = false) String boardLargeCategoryCode
									, @RequestParam(name = "boardMediumCategoryCode", required = false) String boardMediumCategoryCode
									, Model model) {
		
		
		QnaBoard qnaBoard = boardService.getQnaBoardByCode(boardQuestionCode);
		model.addAttribute("qnaBoard", qnaBoard);
		model.addAttribute("boardQuestionCode", boardQuestionCode);
		model.addAttribute("boardLargeCategoryCode", boardLargeCategoryCode);
		model.addAttribute("boardMediumCategoryCode", boardMediumCategoryCode);
		return "/userpage/board/addQnaBoardReply";
	}
	
	
	//1차 카테고리 선택 시 2차 카테고리 응답
	@GetMapping("/getBoardMediumCategory")
	@ResponseBody
	public List<BoardMediumCategory> getBoardMediumCategory(@RequestParam(name="boardLargeCategoryName")String boardLargeCategory) {
	
		log.info("2차 카테고리에서 받아온 값 : {}",boardLargeCategory);
		List<BoardMediumCategory> getBoardMediumCategory = boardService.getBoardMediumCategory(boardLargeCategory);
		
		return getBoardMediumCategory;
	}

		
	/*1:1 문의 게시글 상세 조회*/
	@GetMapping("/qnaBoardDetail")
	public String qnaBoardDetail(@RequestParam(value = "boardQuestionCode")String boardQuestionCode, Model model) {
		QnaBoard qnaBoard = boardService.getQnaBoardByCode(boardQuestionCode);
		
		log.info("qnaBoard : {}", qnaBoard);
		
		model.addAttribute("qnaBoard", qnaBoard);
		
		return "/userpage/board/qnaBoardDetail";
	}
	
	/* 게시글 댓글 삭제 */
	@GetMapping("/removeComment")
	public String removeComment( Model model
								, BoardComment boardComment
								, @RequestParam(name = "boardCommentCode", required = false) String boardCommentCode
								, @RequestParam(value = "boardPostCode", required = false) String boardPostCode
								, RedirectAttributes reAttr) {
		
		boardService.getBoardByCode(boardPostCode);
		boardService.removeComment(boardCommentCode);

		log.info("댓글 삭제 : {}", boardCommentCode);
		reAttr.addAttribute("boardPostCode", boardPostCode);
		
		return "redirect:/userpage/board/freeBoardDetail";
	}
	
	/* 게시글  댓글 수정 (post) */
	@PostMapping("/modifyComment")
	public String modifyComment(BoardComment boardComment
								, Board board
								, RedirectAttributes reAttr) {
		log.info("boardComment: {}", boardComment);
		boardService.modifyComment(boardComment);
		String boardPostCode = board.getBoardPostCode();
		reAttr.addAttribute("boardPostCode", boardPostCode);
		
		return "redirect:/userpage/board/freeBoardDetail";
	}
	
	/* 게시글  댓글 수정 (get) */
	@GetMapping("/modifyComment")
	public String modifyComment(Model model
								, @RequestParam(value = "boardPostCode", required = false)String boardPostCode
								, @RequestParam(value = "boardCommentCode", required = false)String boardCommentCode) {
		Board board = boardService.getBoardByCode(boardPostCode);
		List<BoardComment> boardComment = boardService.getBoardCommentList();
		model.addAttribute("board",board);
		model.addAttribute("boardComment", boardComment);

		
		return "/userpage/board/freeBoardDetail";
	}
	
	
	/* 게시글 댓글 등록 (post) */
	@PostMapping("/addComment")
	public String addComment (@RequestParam(name="boardPostCode", required = false)String boardPostCode
							, BoardComment boardComment
							, HttpSession session
							, Board board
							, RedirectAttributes reAttr) {
		
		session.setAttribute("userName", boardComment.getUserName()); //세션 값 설정
		String sessionId = (String) session.getAttribute("UID");
		String sessionName = (String) session.getAttribute("UNAME"); //세션값 가져오기
		boardComment.setUserName(sessionName);
		log.info("sessionName값 : {}",sessionName);
	    String boardPostCode1 = board.getBoardPostCode();
		boardComment.setBoardPostCode(boardPostCode1);
	    log.info("가져온 코드값 :  {}",boardPostCode1);
		boardService.addComment(sessionId, sessionName, boardComment);
		
		reAttr.addAttribute("boardPostCode", boardPostCode1);
		return "redirect:/userpage/board/freeBoardDetail";
	}
	
	
	/* 게시글 댓글 등록 (get) */
	@GetMapping("/addComment")
	public String addComment (Model model) {
		

		return "/userpage/board/freeBoardDetail";
	}
	
	/* 5-3. 자유게시판 게시글 삭제 */
	@GetMapping("/removeFreeBoard")
	public String removeFreeBoard(@RequestParam(value = "boardPostCode")String boardPostCode) {
		log.info("나가는 값:{}", "test");
		boardService.removeBoard(boardPostCode);
		
		return "redirect:/userpage/board/freeBoardList";
	}
	
	/* 5-2. 자주묻는 질문 게시글 삭제 */
	@GetMapping("/removeFaqBoard")
	public String removeFaqBoard(@RequestParam(value = "boardPostCode")String boardPostCode) {
		log.info("나가는 값:{}", "test");
		boardService.removeBoard(boardPostCode);
		
		return "redirect:/userpage/board/faqBoardList";
	}
	
	/* 5-1. 공지사항 게시글 삭제 */
	@GetMapping("/removeNoticeBoard")
	public String removeNoticeBoard(@RequestParam(value = "boardPostCode", required = false)String boardPostCode) {
		log.info("나가는 값:{}", "test");
		boardService.removeBoard(boardPostCode);
		
		return "redirect:/userpage/board/noticeBoardList";
	}

	/* 4-3. 자유게시판 게시글 수정 (post) */
	@PostMapping("/modifyFreeBoard")
	public String modifyFreeBoard(Board board
								, RedirectAttributes reAttr) {
		log.info("board: {}", board);
		boardService.modifyBoard(board);
		String boardPostCode = board.getBoardPostCode();
		reAttr.addAttribute("boardPostCode", boardPostCode);
		
		return "redirect:/userpage/board/freeBoardDetail";
	}
	
	/* 4-3. 자유게시판 게시글 수정 (get) */
	@GetMapping("/modifyFreeBoard")
	public String modifyFreeBoard(@RequestParam(value = "boardPostCode", required = false)String boardPostCode, Model model) {
		Board board = boardService.getBoardByCode(boardPostCode);
		model.addAttribute("board",board);
		
		return "/userpage/board/modifyFreeBoard";
	}
	
	/* 4-2. 자주묻는 질문 게시글 수정 (post) */
	@PostMapping("/modifyFaqBoard")
	public String modifyFaqBoard(Board board
			, RedirectAttributes reAttr) {
		log.info("board: {}", board);
		boardService.modifyBoard(board);
		String boardPostCode = board.getBoardPostCode();
		reAttr.addAttribute("boardPostCode", boardPostCode);
		
		return "redirect:/userpage/board/faqBoardDetail";
	}
	
	/* 4-2. 자주묻는 질문 게시글 수정 (get) */
	@GetMapping("/modifyFaqBoard")
	public String modifyFaqBoard(@RequestParam(value = "boardPostCode", required = false)String boardPostCode, Model model) {
		Board board = boardService.getBoardByCode(boardPostCode);
		model.addAttribute("board",board);
		
		return "/userpage/board/modifyFaqBoard";
	}
	
	/* 4-1. 공지사항 게시글 수정 (post) */
	@PostMapping("/modifyNoticeBoard")
	public String modifyNoticeBoard(Board board
								, RedirectAttributes reAttr) {
		log.info("board: {}", board);
		boardService.modifyBoard(board);
		String boardPostCode = board.getBoardPostCode();
		reAttr.addAttribute("boardPostCode", boardPostCode);
		
		return "redirect:/userpage/board/noticeBoardDetail";
	}
	
	/* 4-1. 공지사항 게시글 수정 (get) */
	@GetMapping("/modifyNoticeBoard")
	public String modifyNoticeBoard(@RequestParam(value = "boardPostCode", required = false)String boardPostCode, Model model) {
		Board board = boardService.getBoardByCode(boardPostCode);
		model.addAttribute("board",board);
		
		return "/userpage/board/modifyNoticeBoard";
	}
	
	/* 3-3. 자유게시판 게시글 상세 페이지 조회 */
	@GetMapping("/freeBoardDetail")
	public String freeBoardDetail(@RequestParam(value = "boardPostCode")String boardPostCode, Model model) {
		Board board = boardService.getBoardByCode(boardPostCode);
		
		
		List<BoardComment> boardPostCommentList = boardService.getBoardPostCommentList(boardPostCode);
		model.addAttribute("board", board);
		model.addAttribute("boardPostCommentList", boardPostCommentList);
		 
		
		log.info("board : {}", board);
		log.info("boardPostCommentList: {}" ,boardPostCommentList);
		
		return "/userpage/board/freeBoardDetail";
		
	}
	/* 3-2. 자주묻는 질문 게시글 상세 페이지 조회 */
	@GetMapping("/faqBoardDetail")
	public String faqBoardDetail(@RequestParam(value = "boardPostCode")String boardPostCode, Model model) {
		Board board = boardService.getBoardByCode(boardPostCode);
		log.info("board : {}", board);
		model.addAttribute("board", board);
		return "/userpage/board/faqBoardDetail";
	}
	/* 3-1. 공지사항 게시글 상세 페이지 조회 */
	@GetMapping("/noticeBoardDetail")
	public String noticeBoardDetail(@RequestParam(value = "boardPostCode")String boardPostCode, Model model) {
		Board board = boardService.getBoardByCode(boardPostCode);
		log.info("board : {}", board);
		model.addAttribute("board", board);
		return "/userpage/board/noticeBoardDetail";
	}
	
	/* 1:1 게시글 파일 다운로드 */
	@GetMapping("/download")
	public void download(HttpServletResponse response
						,@RequestParam MultipartFile[] boardImgFile
						, File file) {
	
		String fileName = file.getFileReName();
		String saveFileName = file.getFileOriginalName();
		int fileLength = file.getFileSize();
		
		response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\";");
		response.setHeader("Content-Transfer-Encoding", "binary");
		response.setHeader("Content-Length", "" + fileLength);
		response.setHeader("Pragma", "no-cache;");
		response.setHeader("Expires", "-1;");
		
		try(
				FileInputStream fis = new FileInputStream(saveFileName);
				OutputStream out = response.getOutputStream();
			){
				int readCount = 0;
				byte[] buffer = new byte[1024];
				while((readCount = fis.read(buffer)) != -1){
					out.write(buffer,0,readCount);
				}
			}catch(Exception ex){
			  throw new RuntimeException("file Save Error");
			}
		
	}
	
	/* 2-4. 사용자 1:1 문의 게시판 게시글 등록 (post) */
	@PostMapping("/addQnaBoard")
	public String addQnaBoard(QnaBoard qnaBoard
							, HttpSession session
							, RedirectAttributes reAttr
							, @RequestParam MultipartFile[] boardImgFile
							, HttpServletRequest request) {
		
		
		String serverName = request.getServerName();
		String sessionId = (String) session.getAttribute("UID");
		qnaBoard.setUserIdCode(sessionId);
		String userIdCode = qnaBoard.getUserIdCode();
		List<QnaBoard> resultList = boardService.getQnaBoard(userIdCode);
		log.info("아이디 넣고 리스트로 정보 출력가능한지  :  {} ",resultList);
		log.info("아이디 가져오는지 세션아이디!! : {}", qnaBoard.getUserIdCode());
		
		String fileRealPath = "";
		log.info("작성 게시글 내용 : {}", resultList);
		
		if("localhost".equals(serverName)) {
			// server 가 localhost 일때 접근
			fileRealPath = System.getProperty("user.dir") + "/src/main/resources/static/";
			System.out.println(System.getProperty("user.dir"));
			//fileRealPath = request.getSession().getServletContext().getRealPath("/WEB-INF/classes/static/");
		}else {
			//배포용 주소
			fileRealPath = request.getSession().getServletContext().getRealPath("/WEB-INF/classes/static/");
		}
		
		String boardQuestionCode = boardService.addQnaBoard(sessionId, qnaBoard, boardImgFile, fileRealPath);
		log.info("boardQuestionCode : {}" ,boardQuestionCode);
		
		reAttr.addAttribute("boardQuestionCode", boardQuestionCode);
		
		return "redirect:/userpage/board/qnaBoardList";
    }
	
	
	/* 2-4. 사용자 1:1 문의 게시판 게시글 등록 (get) */
    @GetMapping("/addQnaBoard")
    public String addQnaBoard(Model model) {
    	List<BoardLargeCategory> boardLargeCategory = boardService.getBoardLargeCategory();
		
		model.addAttribute("boardLargeCategory", boardLargeCategory);
		
		log.info("1차 카테고리 : {}",boardLargeCategory);
		
       return "/userpage/board/addQnaBoard";
    }

	/* 2-3. 사용자 자유게시판 게시글 등록 (post) */
	@PostMapping("/addFreeBoard")
	public String addFreeBoard(Board board 
							, HttpSession session
							, HttpServletRequest request) {
		String sessionId = (String) session.getAttribute("UID");
		boardService.addFreeBoard(sessionId, board);
       
		return "redirect:/userpage/board/freeBoardList";
    }

    /* 2-3. 사용자 자유게시판 게시글 등록 (get) */
	@GetMapping("/addFreeBoard")
	public String addFreeBoard(Model model) {
		
		return "/userpage/board/addFreeBoard";
    }

	/* 2-2. 사용자 자주묻는 질문 게시글 등록 (post) */
	@PostMapping("/addFaqBoard")
	public String addFaqBoard(Board board
							, HttpSession session
    						, HttpServletRequest request) {
		String sessionId = (String) session.getAttribute("UID");
		boardService.addFaqBoard(sessionId, board);
       
		return "redirect:/userpage/board/faqBoardList";
    }
    
    /* 2-2. 사용자 자주묻는 질문 게시글 등록 (get) */
	@GetMapping("/addFaqBoard")
	public String addFaqBoard(Model model) {
	
		return "/userpage/board/addFaqBoard";
    }
    

	/* 2-1. 사용자 공지사항 게시글 등록 (post) */
	@PostMapping("/addNoticeBoard")
	public String addNoticeBoard(Board board
								, HttpSession session
								, HttpServletRequest request) {
		String sessionId = (String) session.getAttribute("UID");
		boardService.addNoticeBoard(sessionId, board);
       
		return "redirect:/userpage/board/noticeBoardList";
    }
    
    /* 2-1. 사용자 공지사항 게시글 등록 (get) */
	@GetMapping("/addNoticeBoard")
	public String addNoticeBoard(Model model) {	
		
		return "/userpage/board/addNoticeBoard";
    }

	/*1:1 게시글 목록 조회*/
	   @GetMapping("/qnaBoardList")
	   public String getqnaBoardList(@RequestParam(name = "currentPage", required = false, defaultValue = "1")int currentPage
	                           , Model model) {
	      
	      Map<String, Object> resultMap = boardService.getQnaBoardList(currentPage);
	      model.addAttribute("getQnaBoardList", resultMap.get("getQnaBoardList"));
	      model.addAttribute("resultMap", resultMap);
	      model.addAttribute("currentPage", currentPage);
	      model.addAttribute("lastPage", resultMap.get("lastPage"));
	      model.addAttribute("startPageNum", resultMap.get("startPageNum"));
	      model.addAttribute("endPageNum", resultMap.get("endPageNum"));
	      model.addAttribute("rowCount", resultMap.get("rowCount"));
	      System.out.println("getQnaBoardList resultMap-----------"+resultMap);
	      
	      return "/userpage/board/qnaBoardList";
	      
	   }
	      
	   /* 1. 사용자 게시글 목록 조회 */
	   @GetMapping("/{boardCategory}")
	   public String getBoardList(@PathVariable(value="boardCategory", required = false) String boardCategory
	                        ,Model model) {
	      
	      if(boardCategory.equals("noticeBoardList")) {
	         List<Board> noticeBoardList = boardService.getNoticeBoardList();
	         log.info("공지사항 게시글 목록: {}", noticeBoardList);
	         model.addAttribute("noticeBoardList", noticeBoardList);
	      }else if(boardCategory.equals("faqBoardList")){
	         List<Board> faqBoardList = boardService.getFaqBoardList();
	         log.info("자주묻는 질문 게시글 목록: {}", faqBoardList);
	         model.addAttribute("faqBoardList", faqBoardList);
	      }else {
	         List<Board> freeBoardList = boardService.getFreeBoardList();
	         log.info("자유게시판 게시글 목록: {}", freeBoardList);
	         model.addAttribute("freeBoardList", freeBoardList);
	      }
	      
	      return "/userpage/board/"+boardCategory;
	   }
	   
	
}
