package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.GoodsReg;

@Mapper
public interface GoodsRegMapper {

	//취소시에 세션아이디와, 상품코드 받아오는 로직
	public List<GoodsReg> orderCancle();
	
}
