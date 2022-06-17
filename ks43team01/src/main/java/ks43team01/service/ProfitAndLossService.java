package ks43team01.service;

import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.Account;
import ks43team01.dto.Sales;
import ks43team01.dto.Spending;
import ks43team01.mapper.ProfitAndLossMapper;

@Service
@Transactional
public class ProfitAndLossService {
	
	// DI (의존성 주입) 
	// 1. 필드주입방식
	/* 
		@Autowired
		private MemberMapper memberMapper;
	 */
	
	// 2. setter 메서드 주입방식 
	/*
		@Autowired
		private MemberMapper memberMapper;
		
		public void setMemberMapper(MemberMapper memberMapper) {
			this.memberMapper = memberMapper;
		}
	 */
	
	// 3. 생성자 메서드 주입방식 
	private final ProfitAndLossMapper profitAndLossMapper;
	
	public ProfitAndLossService(ProfitAndLossMapper profitAndLossMapper) {
		this.profitAndLossMapper = profitAndLossMapper;
	}
	
	public List<Spending> getSearchSpendingList(String searchKey, String searchValue){
		List<Spending> searchSpendingList = profitAndLossMapper.getSearchSpendingList(searchKey, searchValue);
		return searchSpendingList;
	}
	
	public List<Sales> getSearchSalesList(String searchKey, String searchValue){
		List<Sales> searchSalesList = profitAndLossMapper.getSearchSalesList(searchKey, searchValue);
		return searchSalesList;
	}
	
	/*
	 * 매출 등록
	 * */
	public int addSales(Sales sales) {
		
		int result = profitAndLossMapper.addSales(sales);
		
		return result;
		
	}
	
	/*
	 * 지출 등록
	 * */
	public int addSpending(Spending spending) {
		
		int result = profitAndLossMapper.addSpending(spending);
		
		return result;
	}
	
	/*
	 * 매출내역조회
	 * */
	public List<Sales> getSalesList(){
		
		List<Sales> salesList = profitAndLossMapper.getSalesList();
		
		return salesList;
	}
	
	/*
	 * 지출내역조회
	 * */
	public List<Spending> getSpendingList(){
		
		List<Spending> spendingList = profitAndLossMapper.getSpendingList();
		
		return spendingList;
	}
	
	/*
	 * //손익 계정과목 리스트
	 * */
	public List<Account> getAccountList(){
		
		List<Account> accountList = profitAndLossMapper.getAccountList();
		
		return accountList;
	}
}
