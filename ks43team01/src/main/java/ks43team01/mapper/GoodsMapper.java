package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.Goods;

@Mapper
public interface GoodsMapper {

	//사용자화면 상품 리스트 
	public List<Goods> getUserGoodsList();
	
	//상품 등록
	public int addGoods(Goods goods);
}
