package ks43team01.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ks43team01.dto.Board;
import ks43team01.dto.BoardCategory;
import ks43team01.dto.goodsTopCategory;
import ks43team01.service.BoardService;


@Controller
public class BoardController {
	
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	public final BoardService boardService;
	
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	/* 사용자용 게시판 대분류 카테고리 가져오기 */
	@GetMapping("/addBoard")//가입내역을 확인하고 판매자회원추가진행로
	public String getBoardCategorySelect(Model model) {
		
		List<BoardCategory> bigCategory = boardService.getBoardCategorySelect();
		model.addAttribute("boardCategory",bigCategory);//탑카테고리 받아옴
		log.info("게시판 대분류 카테고리   :{}",bigCategory);
		
		return "userpage/board/addBoard";
	}
	
	/* 관리자용 게시판 대분류 카테고리 조회*/
	@GetMapping("/boardCategoryList")
	public String getBoardCategoryList(Model model) {
		List<BoardCategory> boardCategoryList = boardService.getBoardCategoryList();
		log.info("게시판 게시글 목록: {}", boardCategoryList);
		model.addAttribute("boardCategoryList", boardCategoryList);
		
		return "userpage/board/boardCategoryList";
	}
    
	/*공지사항 게시글 등록*/
    @PostMapping("/addBoard")
    public String addBoard(Board board, HttpServletRequest request) {
    	
       boardService.addBoard(board);
       
       return "redirect:/userpage/board/noticeBoardList";
    }
    
    @GetMapping("/addBoard")
    public String addBoard(Model model) {
       
    	List<Board> noticeBoardList = boardService.getNoticeBoardList();
    	model.addAttribute("addBoard", noticeBoardList);
    	log.info("noticeBoardList: {}", noticeBoardList);
    	
       return "userpage/board/addBoard";
    }
	
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
	
	
	/*사용자용 공지사항 목록*/
	@GetMapping("/noticeBoardList")
	public String getNoticeBoardList(Model model) {
		List<Board> noticeBoardList = boardService.getNoticeBoardList();
		log.info("공지사항 게시글 목록: {}", noticeBoardList);
		model.addAttribute("noticeBoardList", noticeBoardList);
		
		return "userpage/board/noticeBoardList";
	}
	
}
