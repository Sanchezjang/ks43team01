package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.Board;
import ks43team01.dto.Goods;
@Mapper
public interface GoodsMapper {
	
		//03. design 카테고리 상품 리스트 조회
		public List<Goods> getDesignBoardList();
	
		//02. 상품 기본 정보
		public List<Goods> getGoodsBasicInfo();
		
		//01. 등록된 상품 정보 보기
		public List<Goods> getGoodsList();
		
		
}
