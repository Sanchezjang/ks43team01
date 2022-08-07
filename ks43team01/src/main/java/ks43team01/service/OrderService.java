package ks43team01.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.OrderCurrentStatus;
import ks43team01.dto.OrderStatusStandard;
import ks43team01.dto.Payment;
import ks43team01.dto.QnaBoard;
import ks43team01.mapper.BoardMapper;
import ks43team01.mapper.OrderMapper;

@Service
@Transactional
public class OrderService {
	private final OrderMapper orderMapper;
	
	public OrderService(OrderMapper orderMapper) {
			this.orderMapper = orderMapper;
	}
	
	/*현재 주문 상태 삭제*/
	public int removeOrderCurrentStatus(String orderCode) {
		
		int result = orderMapper.removeOrderCurrentStatus(orderCode);
		
		return result;
	}
	
	
	/* 현재 주문 상태 상세 내역 */
	public OrderCurrentStatus getOrderCurrentStatusInfoCode(String orderCode) {
		
		return  orderMapper.getOrderCurrentStatusInfoCode(orderCode);
	
	}
	
	/* 현재 주문 상태 조회 */
	public List<OrderCurrentStatus> getOrderCurrentStatusList(){
		List<OrderCurrentStatus> orderCurrentStatusList = orderMapper.getOrderCurrentStatusList();
		return orderCurrentStatusList;
	}
	
	/* 상품 주문 기준 목록 삭제 */
	public int removeOrderStatusStandard(String orderStatusStandardCode) {
		
		int result = orderMapper.removeOrderStatusStandard(orderStatusStandardCode);
		
		return result;
	}
	
	
	/*상품 주문 현황 기준 수정*/
	public int modifyOrderStatusStandard(OrderStatusStandard orderStatusStandard) {
		
		int result = orderMapper.modifyOrderStatusStandard(orderStatusStandard);
		
		return result;
	}

	/* 상품 주문 현황 기준 상세 조회*/
	public OrderStatusStandard getOrderStatusStandardByCode(String orderStatusStandardCode) {
		
		System.out.println("___________getOrderStatusStandardByCode____________");
		
		return orderMapper.getOrderStatusStandardByCode(orderStatusStandardCode);
	}
	
	/* 상품 주문 현황 기준  등록 */
	public int addOrderStatusStandard(String sessionId, OrderStatusStandard orderStatusStandard) {
		orderStatusStandard.setUserIdCode(sessionId);
		int result = orderMapper.addOrderStatusStandard(orderStatusStandard);
		
		return result;
	}
	
	/* 상품 주문 현황 기준 조회 */
	public List<OrderStatusStandard> getOrderStatusStandardList(){
		List<OrderStatusStandard> orderStatusStandardList = orderMapper.getOrderStatusStandardList();
		
		return orderStatusStandardList;
	}
}
