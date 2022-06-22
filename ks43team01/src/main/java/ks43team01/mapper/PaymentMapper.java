package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.Account;
import ks43team01.dto.Payment;
import ks43team01.dto.Sales;
import ks43team01.dto.Spending;

@Mapper
public interface PaymentMapper {

	//손익 계정과목 리스트
	public List<Payment> getPaymentList();
	
}
