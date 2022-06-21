package ks43team01.admin.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ks43team01.dto.Board;
import ks43team01.dto.BoardCategory;
import ks43team01.dto.BoardLargeCategory;
import ks43team01.dto.BoardMediumCategory;
import ks43team01.service.BoardService;
import ks43team01.user.controller.BoardController;

@Controller
public class AdminBoardCategoryController {

private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	public final BoardService boardService;
	
	public AdminBoardCategoryController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	/* 문의 게시판 2차 카테고리 조회 */
	@GetMapping("/adminpage/boardAdmin/boardMediumCategoryList")
		public String getBoardMediumCategoryList(Model model) {
		List<BoardMediumCategory> boardMediumCategoryList = boardService.getBoardMediumCategoryList();
		log.info("문의 게시판 2차 카테고리 목록: {}", boardMediumCategoryList);
		model.addAttribute("boardMediumCategoryList", boardMediumCategoryList);
		
		return "adminpage/boardAdmin/boardMediumCategoryList";
	}
	
	
	/* 문의 게시판 1차 카테고리 조회 */
	@GetMapping("/adminpage/boardAdmin/boardLargeCategoryList")
		public String getBoardLargeCategoryList(Model model) {
		List<BoardLargeCategory> boardLargeCategoryList = boardService.getBoardLargeCategoryList();
		log.info("문의 게시판 1차 카테고리 목록: {}", boardLargeCategoryList);
		model.addAttribute("boardLargeCategoryList", boardLargeCategoryList);
		
		return "adminpage/boardAdmin/boardLargeCategoryList";
	}
	
	
	/* 게시판 대분류 카테고리 조회 */
	@GetMapping("/adminpage/boardAdmin/boardCategoryList")
		public String getBoardCategoryList(Model model) {
		List<BoardCategory> boardCategoryList = boardService.getBoardCategoryList();
		log.info("게시판 대분류 카테고리 목록: {}", boardCategoryList);
		model.addAttribute("boardCategoryList", boardCategoryList);
	      
		return "adminpage/boardAdmin/boardCategoryList";
	   }
	
	/* 관리자용 게시글 목록 조회 */
	@GetMapping("/adminpage/boardAdmin/boardList")
	public String getBoardList(Model model) {
		List<Board> boardList = boardService.getBoardList();
		log.info("전체 게시글 목록: {}", boardList);
		model.addAttribute("boardList", boardList);
		
		return "adminpage/boardAdmin/boardList";
	}
}
