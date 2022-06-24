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
	// 1. 필드주입방식
	/* 
		@Autowired
		private MemberMapper memberMapper;
	 */
	
	// 2. setter 메서드 주입방식 
	/*
		@Autowired
		private MemberMapper memberMapper;
		
		public void setMemberMapper(MemberMapper memberMapper) {
			this.memberMapper = memberMapper;
		}
	 */
	
	// 3. 생성자 메서드 주입방식 
	private final GoodsMapper goodsMapper;
	
	public GoodsService(GoodsMapper goodsMapper) {
		this.goodsMapper = goodsMapper;
	}

	/*
	 * 지출내역조회
	 * */
	public List<Goods> getUserGoodsList(){
		
		List<Goods> userGoodsList = goodsMapper.getUserGoodsList();
		
		return userGoodsList;
	}

}
