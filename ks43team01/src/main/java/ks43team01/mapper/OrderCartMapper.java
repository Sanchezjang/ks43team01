package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.OrderCart;
import ks43team01.dto.OrderCurrent;
import ks43team01.dto.OrderStatusComplete;
import ks43team01.dto.PaymentGoods;

@Mapper
public interface OrderCartMapper {

	/* 사용자화면 장바구니 리스트 출력 */
	public List<OrderCart> getOrderCartList(OrderCart orderCart);
	/* 사용자화면 장바구니 삭제로직 */
	public int removeOrderCart(String ocCode);
	/* 사용자화면 장바구니 전체삭제(비우기) */
	public int removeAllOrderCart(String userIdCode);
	/*주문>결제시 13번 테이블로 인썰트되는정보*/
	public int addOrderCurrent(OrderCurrent orderCurrent);
	/*주문>결제완료시 15번 테이블로 인썰트되는정보*/
	public int addOrderStatusComplete(OrderStatusComplete orderStatusComplete);
	/*주문>결제완료시 셀렉터 13번 테이블정보꺼내*/
	public List<OrderCurrent> getOrderCurrent(OrderCurrent orderCurrent);
	/*주문>결제완료시 페이먼트 테이블로 인썰트되는정보*/
	public int addPaymentGoods(PaymentGoods paymentGoods);
	
	public List<OrderCurrent> getOrderCurrent(String oCcode);
}
