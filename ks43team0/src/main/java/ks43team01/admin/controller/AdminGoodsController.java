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

import ks43team01.dto.Board;
import ks43team01.dto.BoardCategory;
import ks43team01.dto.BoardLargeCategory;
import ks43team01.dto.BoardMediumCategory;
import ks43team01.dto.BoardPostFile;
import ks43team01.dto.Goods;

import ks43team01.service.GoodsService;
import ks43team01.user.controller.BoardController;
import ks43team01.user.controller.GoodsController;



	@RequestMapping("/adminpage/goodsAdmin")
	@Controller
	public class AdminGoodsController {

	private static final Logger log = LoggerFactory.getLogger(GoodsController.class);
		
		public final GoodsService goodsService;
		
		public AdminGoodsController(GoodsService goodsService) {
			this.goodsService = goodsService;
		}
		
		
		//관리자용 등록된 상품 정보 보기
		@GetMapping("/goodsList")
		public String getGoodsList(Model model) {
			List<Goods> goodsList = goodsService.getGoodsList();
			log.info("관리자용 등록상품정보 보기: {}", goodsList);
			model.addAttribute("goodsList", goodsList);
			
			return "adminpage/goodsAdmin/goodsList";
		}
		
		//상품기본정보
		@GetMapping("/goodsBasicInfo")
		public String getGoodsBasicInfo(Model model) {
			List<Goods> goodsBasicInfo = goodsService.getGoodsBasicInfo();
			log.info("관리자용 등록상품기본정보보기: {}", goodsBasicInfo);
			model.addAttribute("goodsBasicInfo", goodsBasicInfo);
			
			return "adminpage/goodsAdmin/goodsBasicInfo";
		}
	}

