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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ks43team01.dto.Sales;
import ks43team01.dto.Spending;
import ks43team01.service.ProfitAndLossService;

@Controller
@RequestMapping("/adminpage/profitAndLoss")
public class ProfitAndLossController {
	
	private static final Logger log = LoggerFactory.getLogger(ProfitAndLossController.class);

	
	//DI (의존성 주입)
	// 3. 생성자 메서드 주입방식
	private final ProfitAndLossService profitAndLossService;
	
	public ProfitAndLossController(ProfitAndLossService profitAndLossService) {
		this.profitAndLossService = profitAndLossService;
	}

	/*
	 * 커맨드 객체 : http 통신 시에 data(key, value) => DTO(멤버변수 명 일치 시) 자동으로 바인딩 하는 객체
	 * String memberId = request.getParameter("memberId")
	 * Member member = new Member();
	 * member.setMemberId(memberID);
	 * @RequestParam(name="memberId", required, defaultValue, value) String memberId (==) String memberId = request.getParameter("memberId")
	 * @param Member member (커맨드 객체)
	 * @return Controller (String) "redirect:/" == response.sendRedirect("/")
	 * */

	//매출 검색
	@PostMapping("/salesList")
	public String getsearchSalesList(@RequestParam(name="searchKey") String searchKey
									   ,@RequestParam(name="searchValue", required = false) String searchValue
									   ,Model model) {
		log.info("searchKey : {}", searchKey);
		log.info("searchValue : {}", searchValue);
		if("accountName".equals(searchKey)) {
			searchKey = "account_name";
		}else if("salesYear".equals(searchKey)){
			searchKey = "sales_year";
		}else if("salesMonth".equals(searchKey)){
			searchKey = "sales_month";
		}
		
		List<Sales> searchSalesList = profitAndLossService.getSearchSalesList(searchKey, searchValue);
		
		if(searchSalesList != null) model.addAttribute("salesList", searchSalesList);
		
		return "profitAndLoss/salesList";
	}
	
	//지출 검색
	@PostMapping("/spendingList")
	public String getsearchSpendingList(@RequestParam(name="searchKey") String searchKey
			,@RequestParam(name="searchValue", required = false) String searchValue
			,Model model) {
		log.info("searchKey : {}", searchKey);
		log.info("searchValue : {}", searchValue);
		if("accountName".equals(searchKey)) {
			searchKey = "account_name";
		}else if("spendingYear".equals(searchKey)){
			searchKey = "spending_year";
		}else if("spendingMonth".equals(searchKey)){
			searchKey = "spending_month";
		}
		
		List<Spending> searchSpendingList = profitAndLossService.getSearchSpendingList(searchKey, searchValue);
		
		if(searchSpendingList != null) model.addAttribute("spendingList", searchSpendingList);
		
		return "profitAndLoss/spendingList";
	}
	
	//매출 등록
	@PostMapping("/addSales")
	public String addSales(Sales sales 
								,HttpServletRequest request) {
		
		profitAndLossService.addSales(sales);
		
		return "redirect:/profitAndLoss/salesList";
	}
	
	@GetMapping("/addSales")
	public String addSales(Model model) {
		
		List<Sales> salesList = profitAndLossService.getSalesList();
		
		model.addAttribute("salesList", salesList);
		
		return "profitAndLoss/addSales";
	}
	
	//지출 등록
	@PostMapping("/addSpending")
	public String addSpending(Spending spending 
			,HttpServletRequest request) {
		
		profitAndLossService.addSpending(spending);
		
		return "redirect:/profitAndLoss/spendingList";
	}
	
	@GetMapping("/addSpending")
	public String addSpending(Model model) {
		
		List<Spending> spendingList = profitAndLossService.getSpendingList();
		
		model.addAttribute("spendingList", spendingList);
		
		return "profitAndLoss/addSpending";
	}
	
	//매출 내역
	@GetMapping("/salesList")
	public String getSalesList(Model model) {
		
		List<Sales> salesList = profitAndLossService.getSalesList();
		//log.info("회원 전체 목록: {}", salesList);
		model.addAttribute("salesList", salesList);
		
		return "adminpage/profitAndLoss/salesList";
	}
	
	@GetMapping("/spendingList")
	public String getSpendingList(Model model) {
		
		List<Spending> spendingList = profitAndLossService.getSpendingList();
		String str = "";
		model.addAttribute("spendingList", spendingList);
		model.addAttribute("str", str);
		//log.info("회원 전체 목록: {}", spendingList);
		
		return "adminpage/profitAndLoss/spendingList";
	}
}