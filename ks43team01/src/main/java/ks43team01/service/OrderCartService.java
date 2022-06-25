package ks43team01.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.OrderCart;
import ks43team01.mapper.OrderCartMapper;

@Service
@Transactional
public class OrderCartService {
	
	///DI////
	private final OrderCartMapper orderCartMapper;
	public OrderCartService(OrderCartMapper orderCartMapper) {
		this.orderCartMapper = orderCartMapper;
	}
	

	public List<OrderCart> getOrderCartList(OrderCart orderCart){
		
		List<OrderCart> result = orderCartMapper.getOrderCartList(orderCart);
		
		return result;
		
	}
	
	
}