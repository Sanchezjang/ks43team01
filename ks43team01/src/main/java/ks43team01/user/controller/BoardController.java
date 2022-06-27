package ks43team01.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ks43team01.dto.Board;
import ks43team01.dto.BoardLargeCategory;
import ks43team01.dto.BoardMediumCategory;
import ks43team01.dto.QnaBoard;
import ks43team01.service.BoardService;


@Controller
@RequestMapping("/userpage/board")
public class BoardController {
	
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	public final BoardService boardService;
	
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
 
	/* 자유게시판 게시글 삭제 */
	@GetMapping("/removeFreeBoard")
	public String removeFreeBoard(@RequestParam(value = "boardPostCode")String boardPostCode) {
		log.info("나가는 값:{}", "test");
		boardService.removeBoard(boardPostCode);
		
		return "redirect:/userpage/board/freeBoardList";
	}
	
	/* 자주묻는 질문 게시글 삭제 */
	@GetMapping("/removeFaqBoard")
	public String removeFaqBoard(@RequestParam(value = "boardPostCode")String boardPostCode) {
		log.info("나가는 값:{}", "test");
		boardService.removeBoard(boardPostCode);
		
		return "redirect:/userpage/board/faqBoardList";
	}
	
	/* 공지사항 게시글 삭제 */
	@GetMapping("/removeNoticeBoard")
	public String removeNoticeBoard(@RequestParam(value = "boardPostCode")String boardPostCode) {
		log.info("나가는 값:{}", "test");
		boardService.removeBoard(boardPostCode);
		
		return "redirect:/userpage/board/noticeBoardList";
	}

	/* 게시글 수정 (post) */
	@PostMapping("/modifyFreeBoard")
	public String modifyFreeBoard(Board board
								, RedirectAttributes reAttr) {
		log.info("board: {}", board);
		boardService.modifyBoard(board);
		String boardPostCode = board.getBoardPostCode();
		reAttr.addAttribute("boardPostCode", boardPostCode);
		
		return "redirect:/userpage/board/freeBoardDetail";
	}
	
	/* 게시글 수정 (get) */
	@GetMapping("/modifyFreeBoard")
	public String modifyFreeBoard(@RequestParam(value = "boardPostCode", required = false)String boardPostCode, Model model) {
		Board board = boardService.getBoardByCode(boardPostCode);
		model.addAttribute("board",board);
		
		return "/userpage/board/modifyFreeBoard";
	}
	
	/* 게시글 수정 (post) */
	@PostMapping("/modifyFaqBoard")
	public String modifyFaqBoard(Board board
			, RedirectAttributes reAttr) {
		log.info("board: {}", board);
		boardService.modifyBoard(board);
		String boardPostCode = board.getBoardPostCode();
		reAttr.addAttribute("boardPostCode", boardPostCode);
		
		return "redirect:/userpage/board/faqBoardDetail";
	}
	
	/* 게시글 수정 (get) */
	@GetMapping("/modifyFaqBoard")
	public String modifyFaqBoard(@RequestParam(value = "boardPostCode", required = false)String boardPostCode, Model model) {
		Board board = boardService.getBoardByCode(boardPostCode);
		model.addAttribute("board",board);
		
		return "/userpage/board/modifyFaqBoard";
	}
	
	/* 게시글 수정 (post) */
	@PostMapping("/modifyNoticeBoard")
	public String modifyNoticeBoard(Board board
								, RedirectAttributes reAttr) {
		log.info("board: {}", board);
		boardService.modifyBoard(board);
		String boardPostCode = board.getBoardPostCode();
		reAttr.addAttribute("boardPostCode", boardPostCode);
		
		return "redirect:/userpage/board/noticeBoardDetail";
	}
	
	/* 게시글 수정 (get) */
	@GetMapping("/modifyNoticeBoard")
	public String modifyNoticeBoard(@RequestParam(value = "boardPostCode", required = false)String boardPostCode, Model model) {
		Board board = boardService.getBoardByCode(boardPostCode);
		model.addAttribute("board",board);
		
		return "/userpage/board/modifyNoticeBoard";
	}
	
	/* 게시글 상세 페이지*/
	@GetMapping("/freeBoardDetail")
	public String freeBoardDetail(@RequestParam(value = "boardPostCode")String boardPostCode, Model model) {
		Board board = boardService.getBoardByCode(boardPostCode);
		log.info("board : {}", board);
		model.addAttribute("board", board);
		return "/userpage/board/freeBoardDetail";
	}
	/* 게시글 상세 페이지*/
	@GetMapping("/faqBoardDetail")
	public String faqBoardDetail(@RequestParam(value = "boardPostCode")String boardPostCode, Model model) {
		Board board = boardService.getBoardByCode(boardPostCode);
		log.info("board : {}", board);
		model.addAttribute("board", board);
		return "/userpage/board/faqBoardDetail";
	}
	/* 게시글 상세 페이지*/
	@GetMapping("/noticeBoardDetail")
	public String noticeBoardDetail(@RequestParam(value = "boardPostCode")String boardPostCode, Model model) {
		Board board = boardService.getBoardByCode(boardPostCode);
		log.info("board : {}", board);
		model.addAttribute("board", board);
		return "/userpage/board/noticeBoardDetail";
	}
	
	/* 4-2. 1:1 문의 게시판 게시글 등록 (post) */
	@PostMapping("/addQnaBoard")
	public String addQnaBoard(QnaBoard qnaBoard
							, HttpSession session
							, HttpServletRequest request) {
		String sessionId = (String) session.getAttribute("UID");
		boardService.addQnaBoard(sessionId, qnaBoard);
       
		return "redirect:/userpage/board/qnaBoardList";
    }
	/* 4-2. 1:1 문의 게시판 게시글 등록 (get) */
    @GetMapping("/addQnaBoard")
    public String addQnaBoard(Model model) {
    	List<BoardLargeCategory> boardLargeCategoryList = boardService.getBoardLargeCategoryList();
		List<BoardMediumCategory> boardMediumCategoryList = boardService.getBoardMediumCategoryList();
		
		model.addAttribute("boardLargeCategoryList", boardLargeCategoryList);
		model.addAttribute("boardMediumCategoryList", boardMediumCategoryList);
		
       return "/userpage/board/addQnaBoard";
    }
	
	
	/* 4. 1:1 게시판 게시글 조회
	@GetMapping("/qnaBoardList")
	public String getQnaBoardList(Model model) {
		List<QnaBoard> qnaBoardList = boardService.getQnaBoardList();
		log.info("1:1 게시판 게시글 목록: {}", qnaBoardList);
		model.addAttribute("qnaBoardList", qnaBoardList);
		
		return "/userpage/board/qnaBoardList";
	}
	*/

	/* 3-2. 자유게시판 게시글 등록 (post) */
	@PostMapping("/addFreeBoard")
	public String addFreeBoard(Board board 
							, HttpSession session
							, HttpServletRequest request) {
		String sessionId = (String) session.getAttribute("UID");
		boardService.addFreeBoard(sessionId, board);
       
		return "redirect:/userpage/board/freeBoardList";
    }

    /* 3-2. 자유게시판 게시글 등록 (get) */
	@GetMapping("/addFreeBoard")
	public String addFreeBoard(Model model) {
		
		return "/userpage/board/addFreeBoard";
    }
	/*
	// 3. 사용자용 자유게시판 목록 조회
	@GetMapping("/freeBoardList")
	public String getFreeBoardList(Model model) {
		List<Board> freeBoardList = boardService.getFreeBoardList();
		log.info("자유게시판 게시글 목록: {}", freeBoardList);
		model.addAttribute("freeBoardList", freeBoardList);
		
		return "/userpage/board/freeBoardList";
	}
	*/
	/* 2-2. 자주묻는 질문 게시글 등록 (post) */
	@PostMapping("/addFaqBoard")
	public String addFaqBoard(Board board
							, HttpSession session
    						, HttpServletRequest request) {
		String sessionId = (String) session.getAttribute("UID");
		boardService.addFaqBoard(sessionId, board);
       
		return "redirect:/userpage/board/faqBoardList";
    }
    
    /* 2-2. 자주묻는 질문 등록 (get) */
	@GetMapping("/addFaqBoard")
	public String addFaqBoard(Model model) {
	
		return "/userpage/board/addFaqBoard";
    }
    
	/*
	// 2. 사용자용 자주묻는 질문 목록
	@GetMapping("/faqBoardList")
	public String getFaqBoardList(Model model) {
		List<Board> faqBoardList = boardService.getFaqBoardList();
		log.info("자주묻는 질문 게시글 목록: {}", faqBoardList);
		model.addAttribute("faqBoardList", faqBoardList);
		
		return "/userpage/board/faqBoardList";
	}
	*/
	/* 1-2. 공지사항 게시글 등록 (post) */
	@PostMapping("/addNoticeBoard")
	public String addNoticeBoard(Board board
								, HttpSession session
								, HttpServletRequest request) {
		String sessionId = (String) session.getAttribute("UID");
		boardService.addNoticeBoard(sessionId, board);
       
		return "redirect:/userpage/board/noticeBoardList";
    }
    
    /* 1-2. 공지사항 등록 (get) */
	@GetMapping("/addNoticeBoard")
	public String addNoticeBoard(Model model) {	
		
		return "/userpage/board/addNoticeBoard";
    }
	/*
	//1.사용자용 공지사항 목록 조회 
	@GetMapping("/noticeBoardList")
	public String getNoticeBoardList(Model model) {
		List<Board> noticeBoardList = boardService.getNoticeBoardList();
		log.info("공지사항 게시글 목록: {}", noticeBoardList);
		model.addAttribute("noticeBoardList", noticeBoardList);
		
		return "/userpage/board/noticeBoardList";
	}
	*/
		
	/* 사용자 게시글 조회 */
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
		}else if(boardCategory.equals("qnaBoardList")){
			List<QnaBoard> qnaBoardList = boardService.getQnaBoardList();
			log.info("1:1 게시판 게시글 목록: {}", qnaBoardList);
			model.addAttribute("qnaBoardList", qnaBoardList);
		}else {
			List<Board> freeBoardList = boardService.getFreeBoardList();
			log.info("자유게시판 게시글 목록: {}", freeBoardList);
			model.addAttribute("freeBoardList", freeBoardList);
		}
		
		return "/userpage/board/"+boardCategory;
	}
	
	
	
}
