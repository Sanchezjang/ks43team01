package ks43team01.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import ks43team01.dto.Board;
import ks43team01.dto.BoardCategory;
import ks43team01.dto.QnaBoard;
import ks43team01.service.BoardService;


@Controller
public class BoardController {
	
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	public final BoardService boardService;
	
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	/* 1:1 문의 등록*/
    @PostMapping("/addQnaBoard")
    public String addQnaBoard(QnaBoard qnaBoard ,HttpServletRequest request) {
       boardService.addQnaBoard(qnaBoard);
       
       return "redirect:/userpage/board/qnaBoardList";
    }

    /**
     * 공지사항 게시글 등록
     * @param model
     * @return
     */
    @GetMapping("/addQnaBoard")
    public String addQnaBoard(Model model) {
    	List<QnaBoard> qnaBoardList = boardService.getQnaBoardList();
    	
    	model.addAttribute("qnaBoardList", qnaBoardList);
		
       return "userpage/board/addQnaBoard";
    }
	
	
	/* 1:1 게시판 게시글 조회*/
	@GetMapping("/qnaBoardList")
	public String getQnaBoardList(Model model) {
		List<QnaBoard> qnaBoardList = boardService.getQnaBoardList();
		log.info("1:1 게시판 게시글 목록: {}", qnaBoardList);
		model.addAttribute("qnaBoardList", qnaBoardList);
		
		return "userpage/board/qnaBoardList";
	}
	
	
	/* 게시판 대분류 카테고리 조회*/
	@GetMapping("/adminpage/boardAdmin/boardCategoryList")
	public String getBoardCategoryList(Model model) {
		List<BoardCategory> boardCategoryList = boardService.getBoardCategoryList();
		log.info("게시판 대분류 카테고리 목록: {}", boardCategoryList);
		model.addAttribute("boardCategoryList", boardCategoryList);
		
		return "adminpage/boardAdmin/boardCategoryList";
		
	}
	/**
	 * 
	 * @param board
	 * @param request
	 * @return
	 */

	
	/*사용자용 자유게시판 목록*/
	@GetMapping("/freeBoardList")
	public String getFreeBoardList(Model model) {
		List<Board> freeBoardList = boardService.getFreeBoardList();
		log.info("자유게시판 게시글 목록: {}", freeBoardList);
		model.addAttribute("freeBoardList", freeBoardList);
		
		return "userpage/board/freeBoardList";
	}

	
	/*사용자용 자주묻는 질문 목록*/
	@GetMapping("/faqBoardList")
	public String getFaqBoardList(Model model) {
		List<Board> faqBoardList = boardService.getFaqBoardList();
		log.info("자주묻는 질문 게시글 목록: {}", faqBoardList);
		model.addAttribute("faqBoardList", faqBoardList);
		
		return "userpage/board/faqBoardList";
	}
	
	
	/* 공지사항 게시글 등록*/
    @PostMapping("/addNoticeBoard")
    public String addNoticeBoard(Board board ,HttpServletRequest request) {
       boardService.addNoticeBoard(board);
       
       return "redirect:/userpage/board/noticeBoardList";
    }

    /**
     * 공지사항 게시글 등록
     * @param model
     * @return
     */
    @GetMapping("/addNoticeBoard")
    public String addNoticeBoard(Model model) {
    	List<Board> noticeBoardList = boardService.getNoticeBoardList();
    	
    	model.addAttribute("noticeBoardList", noticeBoardList);
		
       return "userpage/board/addNoticeBoard";
    }
	
	/*사용자용 공지사항 목록*/
	@GetMapping("/noticeBoardList")
	public String getNoticeBoardList(Model model) {
		List<Board> noticeBoardList = boardService.getNoticeBoardList();
		log.info("공지사항 게시글 목록: {}", noticeBoardList);
		model.addAttribute("noticeBoardList", noticeBoardList);
		
		return "userpage/board/noticeBoardList";
	}
	
	/*관리자용 게시글 목록*/
	@GetMapping("/adminpage/boardAdmin/boardList")
	public String getBoardList(Model model) {
		List<Board> boardList = boardService.getBoardList();
		log.info("전체 게시글 목록: {}", boardList);
		model.addAttribute("boardList", boardList);
		
		return "adminpage/boardAdmin/boardList";
	}
	
	
}
