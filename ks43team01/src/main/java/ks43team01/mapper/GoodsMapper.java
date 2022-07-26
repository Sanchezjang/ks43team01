package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.Goods;
import ks43team01.dto.GoodsSubCategory;
import ks43team01.dto.GoodsTopCategory;

@Mapper
public interface GoodsMapper {
	/*
	 * 사용자 화면
	 * */
	//메인 화면 상품 카테고리
	public List<GoodsTopCategory> getGoodsMenuCategory();

	//상품 삭제
	public int removeUserGoods(String goodsCode);
	
	//상품 수정
	public int modifyGoods(Goods goods);
	
	//상품 수정 화면에서 기존 데이터 불러오기
	public Goods getModifyGoodsInfoCode(String goodsCode);
	
	//개별 상품 상세내역 보기
	public Goods getGoodsInfoCode(String goodsCode);
	
	//상위 카테고리별 상품리스트조회
	public List<Goods> getUserGoodsListByTopCategoryCode(String goodsTopCategoryCode);
	
	//하위 카테고리별 상품리스트조회
	public List<Goods> getUserGoodsListBySubCategoryCode(String goodsSubCategoryCode);
	
	//상품 리스트 
	public List<Goods> getUserGoodsList();
	
	//상품 상위 카테고리(등록화면)
	public List<GoodsSubCategory> getGoodsSubCategory(String goodsTopCategory);
	
	//상품 하위 카테고리(등록화면)
	public List<GoodsTopCategory> getGoodsTopCategory();
	
	//상품 등록
	public int addGoods(Goods goods);
	
	/*
	 * 관리자 화면
	 * */
	//상품 삭제
	public int removeAdminGoods(String goodsCode);
	
	//상품 리스트
	public List<Goods> getAdminGoodsList();
	
	//상품 하위 카테고리 삭제
	public int removeGoodsSubCategory(String goodsSubCategoryCode);
	
	//상품 하위 카테고리 수정
	public int modifyGoodsSubCategory(GoodsSubCategory goodsSubCategory);
	
	//상품 하위 카테고리 수정 화면 기존 데이터 불러오기
	public GoodsSubCategory getModifyGoodsSubCategoryCode(String goodsSubCategoryCode);
	
	//상품 하위 카테고리 리스트
	public List<GoodsSubCategory> getGoodsSubCategoryList();
	
	//상품 하위 카테고리 등록
	public int addGoodsSubCategory(GoodsSubCategory goodsSubCategory);
	
	//상품 상위 카테고리 삭제
	public int removeGoodsTopCategory(String goodsTopCategoryCode);
	
	//상품 상위 카테고리 수정
	public int modifyGoodsTopCategory(GoodsTopCategory goodsTopCategory);
	
	//상품 상위 카테고리 수정 화면 기존 데이터 불러오기
	public GoodsTopCategory getModifyGoodsTopCategoryCode(String goodsTopCategoryCode);	
	
	//상품 상위 카테고리 리스트
	public List<GoodsTopCategory> getGoodsTopCategoryList();
	
	//상품 상위 카테고리 등록
	public int addGoodsTopCategory(GoodsTopCategory goodsTopCategory);
}