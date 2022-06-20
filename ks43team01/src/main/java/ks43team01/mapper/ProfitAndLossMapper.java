package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.Account;
import ks43team01.dto.Sales;
import ks43team01.dto.Spending;

@Mapper
public interface ProfitAndLossMapper {
	//지출 내역 삭제
	public int removeSpending(String spendingGroupCode);
	
	//매출 검색
	public List<Sales> getSearchSalesList(String searchKey, String searchValue);
	
	//지출 검색
	public List<Spending> getSearchSpendingList(String searchKey, String searchValue);
	
	//지출 등록
	public int addSales(Sales sales);
	
	//지출 등록
	public int addSpending(Spending spending);
	
	//매출 내역 조회
	public List<Sales> getSalesList();
	
	//지출 내역 조회
	public List<Spending> getSpendingList();
	
	//계정과목 등록
	public int addAccount(Account account);
	
	//손익 계정과목 리스트
	public List<Account> getAccountList();	
}
