package ks43team01.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.OrderCart;
import ks43team01.dto.OrderCurrent;
import ks43team01.dto.OrderStatusComplete;
import ks43team01.dto.PaymentGoods;
import ks43team01.mapper.OrderCartMapper;

@Service
@Transactional
public class OrderCartService {
	
	private static final Logger log = LoggerFactory.getLogger(OrderCartService.class);

	///DI////
	private final OrderCartMapper orderCartMapper;
	public OrderCartService(OrderCartMapper orderCartMapper) {
		this.orderCartMapper = orderCartMapper;
	}
	
	/* 사용자화면 장바구니 리스트 출력 */
	public List<OrderCart> getOrderCartList(OrderCart orderCart){
		
		List<OrderCart> result = orderCartMapper.getOrderCartList(orderCart);
		
		return result;
		
	}
	/* 사용자화면 장바구니 삭제로직 */
	public int removeOrderCart(String ocCode) {
		
		int result = orderCartMapper.removeOrderCart(ocCode);
		
		return result;
	}
	/* 사용자화면 장바구니 전체삭제(비우기) */
	public int removeAllOrderCart(String userIdCode) {
		int result = orderCartMapper.removeAllOrderCart(userIdCode);
	 	return result;
	}
	/*주문>결제시 13번 테이블로 인썰트되는정보*/
	public int addOrderCurrent(OrderCurrent orderCurrent) {
		int result = orderCartMapper.addOrderCurrent(orderCurrent);
		return result;
	}
	/*주문>결제완료시 셀렉터 13번 테이블정보꺼내*/
	public List<OrderCurrent> getOrderCurrent(OrderCurrent orderCurrent){
		List<OrderCurrent> orderCurrent1 = orderCartMapper.getOrderCurrent(orderCurrent);
		return orderCurrent1;
	}
	/*주문>결제완료시 15번 테이블로 인썰트되는정보*/
	public int addOrderStatusComplete(OrderStatusComplete orderStatusComplete) {
		int result = orderCartMapper.addOrderStatusComplete(orderStatusComplete);
		return result;
	}
	/*주문>결제완료시 페이먼트 테이블로 인썰트되는정보*/
	public int addPaymentGoods(PaymentGoods paymentGoods) {
		int result = orderCartMapper.addPaymentGoods(paymentGoods);
		return result;
	}

		
	}
