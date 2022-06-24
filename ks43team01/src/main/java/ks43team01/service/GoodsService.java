package ks43team01.service;

import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.Goods;
import ks43team01.mapper.GoodsMapper;

@Service
@Transactional
public class GoodsService {
	
	// DI (의존성 주입) 

	private final GoodsMapper goodsMapper;
	
	public GoodsService(GoodsMapper goodsMapper) {
		this.goodsMapper = goodsMapper;
	}

	/*
	 * 상품리스트조회
	 * */
	public List<Goods> getUserGoodsList(){
		
		List<Goods> userGoodsList = goodsMapper.getUserGoodsList();
		
		return userGoodsList;
	}
	
	/*
	 * 상품 등록
	 * */
	public int addGoods(String sessionId, Goods goods) {
		
		goods.setUserIdCode(sessionId);
		
		int result = goodsMapper.addGoods(goods);
		
		return result;
	}

}
