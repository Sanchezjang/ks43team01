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
	//상품 삭제
	public int removeUserGoods(String goodsCode);
	
	//상품 수정
	
	
	//개별 상품 보기
	public Goods getGoodsInfoCode(String goodsCode);
	
	//상품 리스트 
	public List<Goods> getUserGoodsList();
	
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
	
	
	//상품 하위 카테고리 리스트
	public List<GoodsSubCategory> getGoodsSubCategoryList();
	
	//상품 하위 카테고리 등록
	public int addGoodsSubCategory(GoodsSubCategory goodsSubCategory);
	
	//상품 상위 카테고리 삭제
	
	
	//상품 상위 카테고리 수정
	
	
	//상품 상위 카테고리 리스트
	public List<GoodsTopCategory> getGoodsTopCategoryList();
	
	//상품 상위 카테고리 등록
	public int addGoodsTopCategory(GoodsTopCategory goodsTopCategory);

}