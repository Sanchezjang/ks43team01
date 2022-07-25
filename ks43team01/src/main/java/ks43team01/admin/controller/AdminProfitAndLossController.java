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

import ks43team01.dto.Account;
import ks43team01.dto.Sales;
import ks43team01.dto.Spending;
import ks43team01.service.ProfitAndLossService;

@Controller
@RequestMapping("/adminpage/profitAndLoss")
public class AdminProfitAndLossController {
	
	private static final Logger log = LoggerFactory.getLogger(AdminProfitAndLossController.class);

	private final ProfitAndLossService profitAndLossService;
	
	public AdminProfitAndLossController(ProfitAndLossService profitAndLossService) {
		this.profitAndLossService = profitAndLossService;
	}
	
	//지출 내역 삭제
	@GetMapping("/removeSpending")
	public String removeSpending(String spendingGroupCode) {
		
		profitAndLossService.removeSpending(spendingGroupCode);
		
		return "adminpage/profitAndLoss/removeSpending";
		
	}
	
	//지출 내역
	@GetMapping("/spendingList")
	public String getSpendingList(Model model) {
		
		List<Spending> spendingList = profitAndLossService.getSpendingList();
		String str = "";
		
		model.addAttribute("spendingList", spendingList);
		model.addAttribute("str", str);
		
		return "adminpage/profitAndLoss/spendingList";
		
	}
	
	//지출 등록
	@PostMapping("/addSpending")
	public String addSpending(HttpSession session
			,Spending spending
			,HttpServletRequest request) {
		
		String sessionId = (String) session.getAttribute("UID");
		
		profitAndLossService.addSpending(sessionId, spending);
		
		return "redirect:/adminpage/profitAndLoss/spendingList";
		
	}
	
	//지출 등록
	@GetMapping("/addSpending")
	public String addSpending(Model model) {
		
		List<Spending> spendingList = profitAndLossService.getSpendingList();
		List<Account> accountList = profitAndLossService.getAccountList();
		
		model.addAttribute("spendingList", spendingList);
		model.addAttribute("accountList", accountList);
		
		return "adminpage/profitAndLoss/addSpending";
		
	}
	
	//매출 내역 삭제
	@GetMapping("/removeSales")
	public String removeSales(String salesGroupCode) {
		
		profitAndLossService.removeSales(salesGroupCode);
		
		return "adminpage/profitAndLoss/removeSales";
		
	}
	
	//매출 내역
	@GetMapping("/salesList")
	public String getSalesList(Model model) {
		
		List<Sales> salesList = profitAndLossService.getSalesList();

		model.addAttribute("salesList", salesList);
		
		return "adminpage/profitAndLoss/salesList";
		
	}
	
	//매출 등록
	@PostMapping("/addSales")
	public String addSales(HttpSession session
			,Sales sales
			,HttpServletRequest request) {
		
		String sessionId = (String) session.getAttribute("UID");
		
		profitAndLossService.addSales(sessionId, sales);
		
		return "redirect:/adminpage/profitAndLoss/salesList";
		
	}
	
	//매출 등록
	@GetMapping("/addSales")
	public String addSales(Model model) {
		
		List<Sales> salesList = profitAndLossService.getSalesList();
		List<Account> accountList = profitAndLossService.getAccountList();
		
		model.addAttribute("salesList", salesList);
		model.addAttribute("accountList", accountList);
		
		return "adminpage/profitAndLoss/addSales";
		
	}
	
	//계정과목 삭제
	@GetMapping("/removeAccount")
	public String removeAccount(String accountSubjectCode) {

		profitAndLossService.removeAccount(accountSubjectCode);
		
		return "adminpage/profitAndLoss/removeAccount";
		
	}
	
	//손익 계정과목 수정
	@PostMapping("/modifyAccount")
	public String modifyAccount(Account account
							   ,RedirectAttributes reAttr) {
		
		profitAndLossService.modifyAccount(account);
		String accountSubjectCode = account.getAccountSubjectCode();
		reAttr.addAttribute("accountSubjectCode", accountSubjectCode);
		
		return "redirect:/adminpage/profitAndLoss/accountList";
		
	}
	
	//손익 계정과목 수정
	@GetMapping("/modifyAccount")
	public String modifyAccount(@RequestParam(value="accountSubjectCode", required= false)String accountSubjectCode
			,Model model) {
		
		Account account = profitAndLossService.getModifyAccountSubjectCode(accountSubjectCode);

		model.addAttribute("account", account);
		model.addAttribute("accountSubjectCode", accountSubjectCode);
		
		return "adminpage/profitAndLoss/modifyAccount";
		
	}
	
	//손익 계정과목 리스트
	@GetMapping("/accountList")
	public String getAccountList(Model model) {
		
		List<Account> accountList = profitAndLossService.getAccountList();
		String str = "";
		model.addAttribute("accountList", accountList);
		model.addAttribute("str", str);
		
		return "adminpage/profitAndLoss/accountList";
		
	}
	
	//손익 계정과목 등록
	@PostMapping("/addAccount")
	public String addAccount(HttpSession session
							,Account account
							,HttpServletRequest request) {
		
		String sessionId = (String) session.getAttribute("UID");
		
		profitAndLossService.addAccount(sessionId, account);
		
		return "redirect:/adminpage/profitAndLoss/accountList";
		
	}
	
	//손익 계정과목 등록
	@GetMapping("/addAccount")
	public String addAccount(Model model) {
		
		List<Account> accountList = profitAndLossService.getAccountList();
		
		model.addAttribute("accountList", accountList);
		
		return "adminpage/profitAndLoss/addAccount";
		
	}

	public static Logger getLog() {
		return log;
	}
	
}