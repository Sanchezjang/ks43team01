package ks43team01.service;

import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.Goods;
import ks43team01.dto.GoodsAll;
import ks43team01.dto.GoodsSubCategory;
import ks43team01.dto.GoodsTopCategory;
import ks43team01.mapper.GoodsAllMapper;

@Service
@Transactional
public class GoodsAllService {

	private final GoodsAllMapper goodsAllMapper;
	
	public GoodsAllService(GoodsAllMapper goodsAllMapper) {
		this.goodsAllMapper = goodsAllMapper;
	}
	
	/*
	 * 사용자 화면
	 * */
	// 상품리스트조회
	public List<Goods> getUserGoodsList(){
		
		List<Goods> userGoodsList = goodsAllMapper.getUserGoodsList();
		
		return userGoodsList;
	}
	
	// 상품 등록
	public int addGoods(String sessionId, Goods goods) {
		
		goods.setUserIdCode(sessionId);
		
		int result = goodsAllMapper.addGoods(goods);
		
		return result;
	}
	
	/*
	 * 관리자 화면
	 * */
	// 상품 삭제
	public int removeAdminGoods(String goodsCode) {
	      
		int result = goodsAllMapper.removeAdminGoods(goodsCode);
		return result;
	}
	
	// 상품리스트
	public List<GoodsAll> getAdminGoodsList(){
		
		List<GoodsAll> adminGoodsList = goodsAllMapper.getAdminGoodsList();
		
		return adminGoodsList;
	}
	
	//상품 하위 카테고리 삭제
	public int removeGoodsSubCategory(String goodsSubCategoryCode) {
	      
		int result = goodsAllMapper.removeGoodsSubCategory(goodsSubCategoryCode);
		return result;
	}
	
	// 상품 하위 카테고리 리스트
	public List<GoodsSubCategory> getGoodsSubCategoryList(){
		
		List<GoodsSubCategory> goodsSubCategoryList = goodsAllMapper.getGoodsSubCategoryList();
		
		return goodsSubCategoryList;
	}
	
	// 상품 상위 카테고리 리스트
	public List<GoodsTopCategory> getGoodsTopCategoryList(){
		
		List<GoodsTopCategory> goodsTopCategoryList = goodsAllMapper.getGoodsTopCategoryList();
		
		return goodsTopCategoryList;
	}
	
	// 상품 하위 카테고리 등록
	public int addGoodsSubCategory(String sessionId, GoodsSubCategory goodsSubCategory) {
		
		goodsSubCategory.setUserIdCode(sessionId);
		
		int result = goodsAllMapper.addGoodsSubCategory(goodsSubCategory);
		
		return result;
	}
	
	// 상품 상위 카테고리 등록
	public int addGoodsTopCategory(String sessionId, GoodsTopCategory goodsTopCategory) {
		
		goodsTopCategory.setUserIdCode(sessionId);
		
		int result = goodsAllMapper.addGoodsTopCategory(goodsTopCategory);
		
		return result;
	}
	
}
