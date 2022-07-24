package ks43team01.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import ks43team01.common.FileUtils;
import ks43team01.dto.Goods;
import ks43team01.dto.GoodsSubCategory;
import ks43team01.dto.GoodsTopCategory;
import ks43team01.mapper.FileMapper;
import ks43team01.mapper.GoodsMapper;

@Service
@Transactional
public class GoodsService {

	
	private static final Logger log = LoggerFactory.getLogger(GoodsService.class);

	private final GoodsMapper goodsMapper;
	private final FileMapper fileMapper;
	
	public GoodsService(GoodsMapper goodsMapper, FileMapper fileMapper) {
		this.goodsMapper = goodsMapper;
		this.fileMapper = fileMapper;
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
	
	// 상위 카테고리별 상품리스트조회
	public List<Goods> getUserGoodsListByTopCategoryCode(String goodsTopCategoryCode){
		
		List<Goods> userGoodsList = goodsMapper.getUserGoodsListByTopCategoryCode(goodsTopCategoryCode);
		
		return userGoodsList;
	}
	
	// 하위 카테고리별 상품리스트조회
	public List<Goods> getUserGoodsListBySubCategoryCode(String goodsSubCategoryCode){
		
		List<Goods> userGoodsList = goodsMapper.getUserGoodsListBySubCategoryCode(goodsSubCategoryCode);
		
		return userGoodsList;
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
	public int addGoods(String sessionId, Goods goods, MultipartFile[] goodsImageReg, String fileRealPath) {
		
		goods.setUserIdCode(sessionId);
		
		FileUtils fu = new FileUtils(goodsImageReg, goods.getUserIdCode(), fileRealPath);
		List<Map<String, String>> dtoFileList = fu.parseFileInfo();
		
		fileMapper.uploadFile(dtoFileList);

		int result = goodsMapper.addGoods(goods);
		String goodsCode = goods.getGoodsCode();
		
		List<Map<String, String>> relationFileList = new ArrayList<>();
		for(Map<String, String> m : dtoFileList) {
			m.put("goodsCode", goodsCode);
			relationFileList.add(m);
		}

		fileMapper.uploadRelationFileWithGoods(relationFileList);
		
		
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
	public int removeGoodsTopCategory(String goodsTopCategoryCode) {
		int result;
		try {
			result = goodsMapper.removeGoodsTopCategory(goodsTopCategoryCode);
		} catch (Exception e) {
			result = 0;
		}
		return result;
	}	
	
	// 상품 상위 카테고리 수정
	public int modifyGoodsTopCategory(GoodsTopCategory goodsTopCategory) {

		int result = goodsMapper.modifyGoodsTopCategory(goodsTopCategory);
		
		return result;
	}
	
	//상품 상위 카테고리 수정 화면 기존 데이터 불러오기
	public GoodsTopCategory getModifyGoodsTopCategoryCode(String goodsTopCategoryCode) {
		
		GoodsTopCategory goodsTopCategory = goodsMapper.getModifyGoodsTopCategoryCode(goodsTopCategoryCode);
		
		return goodsTopCategory;
		
	}	

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
