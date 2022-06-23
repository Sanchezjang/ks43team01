package ks43team01.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.OrderCurrentStatus;
import ks43team01.dto.OrderStatusStandard;
import ks43team01.dto.QnaBoard;
import ks43team01.mapper.OrderMapper;

@Service
@Transactional
public class OrderService {
	private final OrderMapper orderMapper;
	
	public OrderService(OrderMapper orderMapper) {
			this.orderMapper = orderMapper;
	}
	/* 현재 주문 상태 조회 */
	public List<OrderCurrentStatus> getOrderCurrnetStatusList(){
		List<OrderCurrentStatus> orderCurrentStatusList = orderMapper.getOrderCurrentStatusList();
		return orderCurrentStatusList;
	}
	

	/* 상품 주문 기준 목록 등록 */
	public int addOrderStatusStandard(String sessionId, OrderStatusStandard orderStatusStandard) {
		orderStatusStandard.setUserIdCode(sessionId);
		int result = orderMapper.addOrderStatusStandard(orderStatusStandard);
		
		return result;
	}
	
	/* 상품 주문 기준 목록 조회 */
	public List<OrderStatusStandard> getOrderStatusStandardList(){
		List<OrderStatusStandard> orderStatusStandardList = orderMapper.getOrderStatusStandardList();
		
		return orderStatusStandardList;
	}
}
