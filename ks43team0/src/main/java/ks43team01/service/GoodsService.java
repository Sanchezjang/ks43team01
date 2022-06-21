package ks43team01.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.Board;
import ks43team01.dto.Goods;
import ks43team01.mapper.GoodsMapper;

@Service
@Transactional
public class GoodsService {
	private final GoodsMapper goodsMapper;
	public GoodsService(GoodsMapper goodsMapper) {
		this.goodsMapper = goodsMapper;
	}
	
	
	
	//상품기본정보 조회
	public List<Goods> getGoodsBasicInfo(){
		List<Goods> goodsBasicInfo = goodsMapper.getGoodsBasicInfo();
		return goodsBasicInfo;
	}
	
	//관리자페이지 상품정보보기
	public List<Goods> getGoodsList(){
		List<Goods> goodsList = goodsMapper.getGoodsList();
		return goodsList;
	}
	
	//design카테고리 상품 리스트 조회
	public List<Goods> getDesignBoardList(){
		List<Goods> designBoardList = goodsMapper.getDesignBoardList();
		return designBoardList;
	}
}
