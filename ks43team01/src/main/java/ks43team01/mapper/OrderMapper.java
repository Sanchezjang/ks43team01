package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.Board;
import ks43team01.dto.OrderCurrentStatus;
import ks43team01.dto.OrderStatusStandard;
import ks43team01.dto.Payment;

@Mapper
public interface OrderMapper {
	
	
	//현재 주문 상태 등록
	public int addOrderCurrentStatus(OrderCurrentStatus orderCurrentStatus);
	
	//현재 주문 상태 상세보기
	public OrderCurrentStatus getOrderCurrentStatusInfoCode(String orderCode);
	
	//현재 주문 상태 조회
	public List<OrderCurrentStatus> getOrderCurrentStatusList();
	
	
	//상품 주문 현황 기준 등록
	public int addOrderStatusStandard(OrderStatusStandard orderStatusStandard);
	
	//상품 주문 현황 기준 조회
	public List<OrderStatusStandard> getOrderStatusStandardList();
}
