package ks43team01.admin.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ks43team01.dto.Board;
import ks43team01.dto.BoardAnswer;
import ks43team01.dto.BoardCategory;
import ks43team01.dto.BoardComment;
import ks43team01.dto.BoardLargeCategory;
import ks43team01.dto.BoardMediumCategory;
import ks43team01.service.BoardService;
import ks43team01.user.controller.BoardController;

@RequestMapping("/adminpage/boardAdmin")
@Controller
public class AdminBoardController {

private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	public final BoardService boardService;
	
	public AdminBoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	/*게시판 대분류 카테고리 삭제 */
	@GetMapping("/removeBoardCategory")
	public String removeBoardCategory(String boardCategoryCode) {
		
		boardService.removeBoardCategory(boardCategoryCode);
		log.info("삭제 확인 :{}", boardCategoryCode);
		return "adminpage/boardAdmin/removeBoardCategory";
	}
	
	/*게시판 대분류 카테고리 수정 (post)*/
	@PostMapping("/modifyBoardCategory")
	public String modifyBoardCategory(BoardCategory boardCategory
									,RedirectAttributes reAttr) {
		
		boardService.modifyBoardCategory(boardCategory);
		String boardCategoryCode = boardCategory.getBoardCategoryCode();
		reAttr.addAttribute("boardCategoryCode", boardCategoryCode);
		
		return "redirect:/adminpage/boardAdmin/boardCategoryList";
	}
	
	/*게시판 대분류 카테고리 수정 (get)*/
	@GetMapping("/modifyBoardCategory")
	public String modifyBoardCategory(@RequestParam(value = "boardCategoryCode", required = false)String boardCategoryCode
									, Model model) {
		
		BoardCategory boardCategory = boardService.getBoardCategoryByCode(boardCategoryCode);
		
		log.info("boardCategory : {}", boardCategory);
		model.addAttribute("boardCategory", boardCategory);
		model.addAttribute("boardCategoryCode", boardCategoryCode);
		
		
		return "adminpage/boardAdmin/modifyBoardCategory";
	}
	
	
	/*게시글 답변 모음 목록 조회*/
	@GetMapping("/boardAnswerList")
	public String getBoardAnswerList(Model model) {
		List<BoardAnswer> boardAnswerList = boardService.getBoardAnswerList();
		log.info("게시글 답변 모음 목록 조회: {}", boardAnswerList);
		model.addAttribute("boardAnswerList", boardAnswerList);
		
		return "adminpage/boardAdmin/boardAnswerList";
	}
	
	/*게시글 댓글 목록 조회 */
	@GetMapping("/boardCommentList")
	public String getBoardCommentList(Model model) {
		List<BoardComment> boardCommentList = boardService.getBoardCommentList();
		log.info("게시글 댓글 목록: {}", boardCommentList);
		model.addAttribute("boardCommentList", boardCommentList);
		
		return "adminpage/boardAdmin/boardCommentList";
	}
	
	
	/*문의게시판 2차 카테고리 등록 (post) */
	@PostMapping("/addBoardMediumCategory")
	public String addBoardMediumCategory(HttpSession session
								, BoardMediumCategory boardMediumCategory
								, HttpServletRequest request) {
		String sessionId = (String) session.getAttribute("UID");
		boardService.addBoardMediumCategory(sessionId, boardMediumCategory);
		
		return "redirect:/adminpage/boardAdmin/boardMediumCategoryList";
	}
	/*문의게시판 2차 카테고리 등록 (get) */
	@GetMapping("/addBoardMediumCategory")
	public String addBoardMediumCategory(Model model) {
		List<BoardLargeCategory> boardLargeCategoryList = boardService.getBoardLargeCategoryList();
		List<BoardMediumCategory> boardMediumCategoryList = boardService.getBoardMediumCategoryList();
		
		model.addAttribute("boardLargeCategoryList", boardLargeCategoryList);
		model.addAttribute("boardMediumCategoryList", boardMediumCategoryList);
		return "adminpage/boardAdmin/addBoardMediumCategory";
	}
	
	/*문의 게시판 2차 카테고리 조회 */
	@GetMapping("/boardMediumCategoryList")
		public String getBoardMediumCategoryList(Model model) {
		List<BoardMediumCategory> boardMediumCategoryList = boardService.getBoardMediumCategoryList();
		log.info("문의 게시판 2차 카테고리 목록: {}", boardMediumCategoryList);
		model.addAttribute("boardMediumCategoryList", boardMediumCategoryList);
		
		return "adminpage/boardAdmin/boardMediumCategoryList";
	}
	
	/*문의게시판 1차 카테고리 등록 (post) */
	@PostMapping("/addBoardLargeCategory")
	public String addBoardLargeCategory(HttpSession session
								, BoardLargeCategory boardLargeCategory
								, HttpServletRequest request) {
		String sessionId = (String) session.getAttribute("UID");
		boardService.addBoardLargeCategory(sessionId, boardLargeCategory);
		
		return "redirect:/adminpage/boardAdmin/boardLargeCategoryList";
	}
	/*문의게시판 1차 카테고리 등록 (get) */
	@GetMapping("/addBoardLargeCategory")
	public String addBoardLargeCategory(Model model) {
		List<BoardLargeCategory> boardLargeCategoryList = boardService.getBoardLargeCategoryList();
		
		model.addAttribute("boardLargeCategoryList", boardLargeCategoryList);
		return "adminpage/boardAdmin/addBoardLargeCategory";
	}
	
	/*문의 게시판 1차 카테고리 조회 */
	@GetMapping("/boardLargeCategoryList")
		public String getBoardLargeCategoryList(Model model) {
		List<BoardLargeCategory> boardLargeCategoryList = boardService.getBoardLargeCategoryList();
		log.info("문의 게시판 1차 카테고리 목록: {}", boardLargeCategoryList);
		model.addAttribute("boardLargeCategoryList", boardLargeCategoryList);
		
		return "adminpage/boardAdmin/boardLargeCategoryList";
	}
	/*게시판 대분류 카테고리 등록 (post) */
	@PostMapping("/addBoardCategory")
	public String addBoardCategory(HttpSession session
								, BoardCategory boardCategory
								, HttpServletRequest request) {
		String sessionId = (String) session.getAttribute("UID");
		boardService.addBoardCategory(sessionId, boardCategory);
		
		return "redirect:/adminpage/boardAdmin/boardCategoryList";
	}
	/*게시판 대분류 카테고리 등록 (get) */
	@GetMapping("/addBoardCategory")
	public String addBoardCategory(Model model) {
		List<BoardCategory> boardCategoryList = boardService.getBoardCategoryList();
		
		model.addAttribute("boardCategoryList", boardCategoryList);
		return "adminpage/boardAdmin/addBoardCategory";
	}
	
	/*게시판 대분류 카테고리 조회 */
	@GetMapping("/boardCategoryList")
		public String getBoardCategoryList(Model model) {
		List<BoardCategory> boardCategoryList = boardService.getBoardCategoryList();
		log.info("게시판 대분류 카테고리 목록: {}", boardCategoryList);
		model.addAttribute("boardCategoryList", boardCategoryList);
	      
		return "adminpage/boardAdmin/boardCategoryList";
	   }
	
	/*게시글 목록 삭제*/
	@GetMapping("/removeBoard")
	public String removeBoard(String boardPostCode) {
		
		boardService.removeBoard(boardPostCode);
		
		return "adminpage/boardAdmin/removeBoard";
	}
	
	/*게시글 목록 조회 */
	@GetMapping("/boardList")
	public String getBoardList(Model model) {
		List<Board> boardList = boardService.getBoardList();
		log.info("전체 게시글 목록: {}", boardList);
		model.addAttribute("boardList", boardList);
		
		return "adminpage/boardAdmin/boardList";
	}
}
