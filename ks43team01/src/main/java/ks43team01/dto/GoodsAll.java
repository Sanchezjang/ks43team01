package ks43team01.dto;

public class GoodsAll {
	
	private Goods goods;
	private GoodsTopCategory goodsTopCategory;
	private GoodsSubCategory goodsSubCategory;
	
	@Override
	public String toString() {
		return "GoodsAll [goods=" + goods + ", goodsTopCategory=" + goodsTopCategory + ", goodsSubCategory="
				+ goodsSubCategory + "]";
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public GoodsTopCategory getGoodsTopCategory() {
		return goodsTopCategory;
	}
	public void setGoodsTopCategory(GoodsTopCategory goodsTopCategory) {
		this.goodsTopCategory = goodsTopCategory;
	}
	public GoodsSubCategory getGoodsSubCategory() {
		return goodsSubCategory;
	}
	public void setGoodsSubCategory(GoodsSubCategory goodsSubCategory) {
		this.goodsSubCategory = goodsSubCategory;
	}
}
