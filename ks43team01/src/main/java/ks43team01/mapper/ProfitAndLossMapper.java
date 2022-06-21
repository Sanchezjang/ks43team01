package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.Account;
import ks43team01.dto.Sales;
import ks43team01.dto.Spending;

@Mapper
public interface ProfitAndLossMapper {
	//지출 내역 삭제
	public int removeSpending(Spending spending);
	
	//지출 등록
	public int addSpending(Spending spending);
	
	//매출 등록
	public int addSales(Sales sales);
	
	//지출 내역 조회
	public List<Spending> getSpendingList();
	
	//매출 내역 조회
	public List<Sales> getSalesList();
	
	//계정과목 등록
	public int addAccount(Account account);
	
	//손익 계정과목 리스트
	public List<Account> getAccountList();	
}
