package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.OrderCart;

@Mapper
public interface OrderCartMapper {


	public List<OrderCart> getOrderCartList(OrderCart orderCart);
	
}
