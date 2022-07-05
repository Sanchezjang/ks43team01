package ks43team01.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	
	private static final Logger log = LoggerFactory.getLogger(GoodsService.class);

	
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
	
	// 상품 수정화면에서 기존 데이터 불러오기
	public Goods getModifyGoodsInfoCode(String goodsCode) {
		
		Goods goods = goodsMapper.getModifyGoodsInfoCode(goodsCode);
		
		return goods;
		
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
	
	// 상품 상위 카테고리(등록화면)
	public List<GoodsTopCategory> getGoodsTopCategory() {
		
		List<GoodsTopCategory> goodsTopCategory = goodsMapper.getGoodsTopCategory();
		
		return goodsTopCategory;
	}
	
	// 상품 하위 카테고리(등록화면)
	public List<GoodsSubCategory> getGoodsSubCategory(String goodsTopCategory) {
		
		List<GoodsSubCategory> goodsSubCategory = goodsMapper.getGoodsSubCategory(goodsTopCategory);
		
		return goodsSubCategory;
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
	public int modifyGoodsSubCategory(GoodsSubCategory goodsSubCategory) {
		log.info("goodsSubCategory:{}",goodsSubCategory);
		int result = goodsMapper.modifyGoodsSubCategory(goodsSubCategory);
		
		return result;
	}
	
	//상품 하위 카테고리 수정 화면 기존 데이터 불러오기
	public GoodsSubCategory getModifyGoodsSubCategoryCode(String goodsSubCategoryCode) {
		
		GoodsSubCategory goodsSubCategory = goodsMapper.getModifyGoodsSubCategoryCode(goodsSubCategoryCode);
		
		return goodsSubCategory;
		
	}
	
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
