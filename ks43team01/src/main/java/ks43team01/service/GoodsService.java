package ks43team01.service;

import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.Goods;
import ks43team01.dto.GoodsSubCategory;
import ks43team01.dto.GoodsTopCategory;
import ks43team01.mapper.GoodsMapper;

@Service
@Transactional
public class GoodsService {

	private final GoodsMapper goodsMapper;
	
	public GoodsService(GoodsMapper goodsMapper) {
		this.goodsMapper = goodsMapper;
	}
	
	/*
	 * 사용자 화면
	 * */
	
	// 상품 삭제
	public int removeUserGoods(String goodsCode) {
	      
		int result = goodsMapper.removeUserGoods(goodsCode);
		return result;
	}
	
	// 상품 수정
	public int modifyGoods(Goods goods) {
		
		int result = goodsMapper.modifyGoods(goods);
		
		return result;
	}
	
	// 개별 상품 보기
	public Goods getGoodsInfoCode(String goodsCode) {
		return goodsMapper.getGoodsInfoCode(goodsCode);
		
	}
	
	// 상품리스트조회
	public List<Goods> getUserGoodsList(){
		
		List<Goods> userGoodsList = goodsMapper.getUserGoodsList();
		
		return userGoodsList;
	}
	
	// 상품 상위 카테고리 해당 상품 하위 카테고리
	public List<GoodsSubCategory> getaddGoodsSubCategory(String addGoodsTopCategory) {
		
		List<GoodsSubCategory> addGoodsSubCategory = goodsMapper.getaddGoodsSubCategory(addGoodsTopCategory);
		
		return addGoodsSubCategory;
	}
	
	// 상품 등록
	public int addGoods(String sessionId, Goods goods) {
		
		goods.setUserIdCode(sessionId);
		
		int result = goodsMapper.addGoods(goods);
		
		return result;
	}
	
	/*
	 * 관리자 화면
	 * */
	
	// 상품 삭제
	public int removeAdminGoods(String goodsCode) {
	      
		int result = goodsMapper.removeAdminGoods(goodsCode);
		return result;
	}
	
	// 상품리스트
	public List<Goods> getAdminGoodsList(){
		
		List<Goods> adminGoodsList = goodsMapper.getAdminGoodsList();
		
		return adminGoodsList;
	}
	
	//상품 하위 카테고리 삭제
	public int removeGoodsSubCategory(String goodsSubCategoryCode) {
	      
		int result = goodsMapper.removeGoodsSubCategory(goodsSubCategoryCode);
		return result;
	}
	
	// 상품 하위 카테고리 수정
	
	
	// 상품 하위 카테고리 리스트
	public List<GoodsSubCategory> getGoodsSubCategoryList(){
		
		List<GoodsSubCategory> goodsSubCategoryList = goodsMapper.getGoodsSubCategoryList();
		
		return goodsSubCategoryList;
	}
	
	// 상품 하위 카테고리 등록
	public int addGoodsSubCategory(String sessionId, GoodsSubCategory goodsSubCategory) {
		
		goodsSubCategory.setUserIdCode(sessionId);
		
		int result = goodsMapper.addGoodsSubCategory(goodsSubCategory);
		
		return result;
	}
	
	// 상품 상위 카테고리 삭제
	
	
	// 상품 상위 카테고리 수정
	

	// 상품 상위 카테고리 리스트
	public List<GoodsTopCategory> getGoodsTopCategoryList(){
		
		List<GoodsTopCategory> goodsTopCategoryList = goodsMapper.getGoodsTopCategoryList();
		
		return goodsTopCategoryList;
	}
	
	// 상품 상위 카테고리 등록
	public int addGoodsTopCategory(String sessionId, GoodsTopCategory goodsTopCategory) {
		
		goodsTopCategory.setUserIdCode(sessionId);
		
		int result = goodsMapper.addGoodsTopCategory(goodsTopCategory);
		
		return result;
	}
	
}
