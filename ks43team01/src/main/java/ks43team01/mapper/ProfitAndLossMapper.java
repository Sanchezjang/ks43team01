package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.Account;
import ks43team01.dto.Sales;
import ks43team01.dto.Spending;

@Mapper
public interface ProfitAndLossMapper {
	//@지출
	//지출 내역 삭제
	public int removeSpending(String spendingGroupCode);
	
	//지출 내역 조회
	public List<Spending> getSpendingList();
	
	//지출 등록
	public int addSpending(Spending spending);

	
	//@매출
	//매출 내역 삭제
	public int removeSales(String salesGroupCode);
	
	//매출 내역 조회
	public List<Sales> getSalesList();

	//매출 등록
	public int addSales(Sales sales);
	
	
	//@계정과목
	//계정과목 삭제
	public int removeAccount(String accountSubjectCode);
	
	//계정과목 수정
	public int modifyAccount(Account account);
	
	//계정과목 수정 기존 데이터 불러오기
	public Account getModifyAccountSubjectCode(String accountSubjectCode);
	
	//손익 계정과목 리스트
	public List<Account> getAccountList();	
	
	//계정과목 등록
	public int addAccount(Account account);
}
