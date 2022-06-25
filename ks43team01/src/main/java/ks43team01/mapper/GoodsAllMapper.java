package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.Account;
import ks43team01.dto.Goods;
import ks43team01.dto.GoodsSubCategory;
import ks43team01.dto.GoodsTopCategory;

@Mapper
public interface GoodsAllMapper {

	//사용자화면 상품 리스트 
	public List<Goods> getUserGoodsList();
	
	//상품 등록
	public int addGoods(Goods goods);
	
	//상품 하위 카테고리 리스트
	public List<GoodsSubCategory> getGoodsSubCategoryList();
	
	//상품 상위 카테고리 리스트
	public List<GoodsTopCategory> getGoodsTopCategoryList();
}
