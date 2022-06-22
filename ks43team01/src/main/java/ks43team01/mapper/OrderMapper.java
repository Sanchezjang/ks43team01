package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.Board;
import ks43team01.dto.Order;
import ks43team01.dto.OrderStatusStandard;

@Mapper
public interface OrderMapper {
	
	//상품 주문
	public int addOrder(Order order);
	
	//주문 현황 기준 조회
	public List<OrderStatusStandard> getOrderStatusStandardList();
}
