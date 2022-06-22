package ks43team01.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.OrderStatusStandard;
import ks43team01.mapper.OrderMapper;

@Service
@Transactional
public class OrderService {
	private final OrderMapper orderMapper;
	
	public OrderService(OrderMapper orderMapper) {
			this.orderMapper = orderMapper;
	}
	/* 상품 주문 목록 조회 */
	public List<OrderStatusStandard> getOrderStatusStandardList(){
		List<OrderStatusStandard> orderStatusStandardList = orderMapper.getOrderStatusStandardList();
		
		return orderStatusStandardList;
	}
}
