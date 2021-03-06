package ks43team01.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

import ks43team01.dto.Goods;
import ks43team01.dto.GoodsSubCategory;
import ks43team01.dto.GoodsTopCategory;
import ks43team01.service.GoodsService;

@Controller
@RequestMapping("/adminpage/goods")
public class AdminGoodsController {
	
	private static final Logger log = LoggerFactory.getLogger(AdminGoodsController.class);

	private final GoodsService goodsService;
	
	public AdminGoodsController(GoodsService goodsService) {
		this.goodsService = goodsService;
	}
	
	//상품 삭제
	@GetMapping("/removeAdminGoods")
	public String removeAdminGoods(String goodsCode) {
		
		goodsService.removeAdminGoods(goodsCode);
		
		return "adminpage/goods/removeAdminGoods";
	}
	
	//개별 상품 보기
	@GetMapping("/goodsInfo")
	public String goodsInfo(@RequestParam(value = "goodsCode")String goodsCode, Model model) {
		
		Goods goods = goodsService.getGoodsInfoCode(goodsCode);
		model.addAttribute("goods", goods);
		
		return "userpage/goods/goodsInfo" ;
		
	}
	
	//상품 리스트
	@GetMapping("/adminGoodsList")
	public String getAdminGoodsList(Model model) {
		
		List<Goods> adminGoodsList = goodsService.getAdminGoodsList();
		
		model.addAttribute("adminGoodsList", adminGoodsList);
		
		return "adminpage/goods/adminGoodsList";
		
	}
	
	//상품 하위 카테고리 삭제
	@GetMapping("/removeGoodsSubCategory")
	public String removeGoodsSubCategory(String goodsSubCategoryCode) {
		
		goodsService.removeGoodsSubCategory(goodsSubCategoryCode);
		
		return "adminpage/goods/removeGoodsSubCategory";
	
	}
	
	//상품 하위 카테고리 수정
	@PostMapping("/modifyGoodsSubCategory")
	public String modifyGoodsSubCategory(GoodsSubCategory goodsSubCategory
			,RedirectAttributes reAttr) {
		
		goodsService.modifyGoodsSubCategory(goodsSubCategory);
		String goodsSubCategoryCode = goodsSubCategory.getGoodsSubCategoryCode();
		reAttr.addAttribute("goodsSubCategoryCode", goodsSubCategoryCode);
		
		return "redirect:/adminpage/goods/goodsSubCategoryList";
		
	}
	
	//상품 하위 카테고리 수정
	@GetMapping("/modifyGoodsSubCategory")
	public String modifyGoodsSubCategory(@RequestParam(value="goodsSubCategoryCode", required= false)String goodsSubCategoryCode
			,Model model) {
		
		GoodsSubCategory goodsSubCategory = goodsService.getModifyGoodsSubCategoryCode(goodsSubCategoryCode);
		List<GoodsTopCategory> goodsTopCategoryList = goodsService.getGoodsTopCategoryList();
		
		model.addAttribute("goodsSubCategory", goodsSubCategory);
		model.addAttribute("goodsTopCategoryList", goodsTopCategoryList);
		model.addAttribute("goodsSubCategoryCode", goodsSubCategoryCode);
		
		return "adminpage/goods/modifyGoodsSubCategory";
		
	}	

	//상품 하위 카테고리 리스트
	@GetMapping("/goodsSubCategoryList")
	public String getGoodsSubCategoryList(Model model) {
		
		List<GoodsSubCategory> goodsSubCategoryList = goodsService.getGoodsSubCategoryList();
		
		model.addAttribute("goodsSubCategoryList", goodsSubCategoryList);
		
		return "adminpage/goods/goodsSubCategoryList";
		
	}
	
	//상품 하위 카테고리 등록
	@PostMapping("/addGoodsSubCategory")
	public String addGoodsSubCategory(HttpSession session
			,GoodsSubCategory goodsSubCategory
			,HttpServletRequest request) {
		
		String sessionId = (String) session.getAttribute("UID");
		goodsService.addGoodsSubCategory(sessionId, goodsSubCategory);

			return "redirect:/adminpage/goods/goodsSubCategoryList";

	}

	//상품 하위 카테고리 등록
	@GetMapping("/addGoodsSubCategory")
	public String addGoodsSubCategory(Model model) {
		
		List<GoodsSubCategory> goodsSubCategoryList = goodsService.getGoodsSubCategoryList();
		List<GoodsTopCategory> goodsTopCategoryList = goodsService.getGoodsTopCategoryList();
		
		model.addAttribute("goodsSubCategoryList", goodsSubCategoryList);
		model.addAttribute("goodsTopCategoryList", goodsTopCategoryList);
		
		return "adminpage/goods/addGoodsSubCategory";
		
	}
	
	//상품 상위 카테고리 삭제
	@GetMapping("/removeGoodsTopCategory")
	public String removeGoodsTopCategory(String goodsTopCategoryCode ,HttpServletResponse response) throws IOException {
		
		int result = goodsService.removeGoodsTopCategory(goodsTopCategoryCode);
		
		if(result == 0) {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();

			out.println("<script language='javascript'>alert('해당 하위 카테고리가 존재합니다.'); location.href='/adminpage/goods/goodsTopCategoryList';</script>");
			
		}
		
		return "adminpage/goods/removeGoodsTopCategory";
	}	
	
	//상품 상위 카테고리 수정
	@PostMapping("/modifyGoodsTopCategory")
	public String modifyGoodsTopCategory(GoodsTopCategory goodsTopCategory
			,RedirectAttributes reAttr) {
		
		goodsService.modifyGoodsTopCategory(goodsTopCategory);
		String goodsTopCategoryCode = goodsTopCategory.getGoodsTopCategoryCode();
		reAttr.addAttribute("goodsTopCategoryCode", goodsTopCategoryCode);
		
		return "redirect:/adminpage/goods/goodsTopCategoryList";
		
	}
	
	//상품 상위 카테고리 수정
	@GetMapping("/modifyGoodsTopCategory")
	public String modifyGoodsTopCategory(@RequestParam(value="goodsTopCategoryCode", required= false)String goodsTopCategoryCode
			,Model model) {
		
		GoodsTopCategory goodsTopCategory = goodsService.getModifyGoodsTopCategoryCode(goodsTopCategoryCode);

		model.addAttribute("goodsTopCategory", goodsTopCategory);
		model.addAttribute("goodsTopCategoryCode", goodsTopCategoryCode);
		
		return "adminpage/goods/modifyGoodsTopCategory";
		
	}	
	
	//상품 상위 카테고리 리스트
	@GetMapping("/goodsTopCategoryList")
	public String getGoodsTopCategoryList(Model model) {
		
		List<GoodsTopCategory> goodsTopCategoryList = goodsService.getGoodsTopCategoryList();
		
		model.addAttribute("goodsTopCategoryList", goodsTopCategoryList);
		
		return "adminpage/goods/goodsTopCategoryList";
		
	}
	
	//상품 상위 카테고리 등록
	@PostMapping("/addGoodsTopCategory")
	public String addGoodsTopCategory(HttpSession session
			,GoodsTopCategory goodsTopCategory
			,HttpServletRequest request) {
		
		String sessionId = (String) session.getAttribute("UID");
		
		goodsService.addGoodsTopCategory(sessionId, goodsTopCategory);
		
		return "redirect:/adminpage/goods/goodsTopCategoryList";
		
	}
	
	//상품 상위 카테고리 등록
	@GetMapping("/addGoodsTopCategory")
	public String addGoodsTopCategory(Model model) {
		
		List<GoodsTopCategory> goodsTopCategoryList = goodsService.getGoodsTopCategoryList();
		
		model.addAttribute("goodsTopCategoryList", goodsTopCategoryList);
		
		return "adminpage/goods/addGoodsTopCategory";
	}

	public static Logger getLog() {
		return log;
	}
	
}