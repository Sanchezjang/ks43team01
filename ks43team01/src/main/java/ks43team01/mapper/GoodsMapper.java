package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.Goods;

@Mapper
public interface GoodsMapper {

	
	//손익 계정과목 리스트
	public List<Goods> getUserGoodsList();
}
