package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.OrderCart;

@Mapper
public interface OrderCartMapper {

	/* 사용자화면 장바구니 리스트 출력 */
	public List<OrderCart> getOrderCartList(OrderCart orderCart);
	/* 사용자화면 장바구니 삭제로직 */
	public int removeOrderCart(String ocCode);
	
}
