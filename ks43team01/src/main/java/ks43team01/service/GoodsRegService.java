package ks43team01.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.GoodsReg;
import ks43team01.mapper.GoodsRegMapper;


@Service
@Transactional
public class GoodsRegService {
	
	private static final Logger log = LoggerFactory.getLogger(GoodsRegService.class);

	
	private final GoodsRegMapper goodsRegMapper;
	public  GoodsRegService(GoodsRegMapper goodsRegMapper) {
		this.goodsRegMapper = goodsRegMapper;
	}
	
	//취소시에 세션아이디와, 상품코드 받아오는 로직
	public List<GoodsReg> orderCancle(){
		
		List<GoodsReg> goodsReg = goodsRegMapper.orderCancle();
		
		return goodsReg;
	}
	
}
