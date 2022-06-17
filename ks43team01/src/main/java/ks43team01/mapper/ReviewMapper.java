package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.GoodsBasicInfo;
import ks43team01.dto.ReviewByScore;
import ks43team01.dto.ReviewContentsReg;
import ks43team01.dto.User;

@Mapper
public interface ReviewMapper {
	
	
	
	
	
	/* 리뷰 등록 */
	public int addReview(ReviewContentsReg reviewContentsReg);
	
	/* 리뷰 목록 조회 */
	public List<ReviewContentsReg> getReviewAdminList();
	
	/* 리뷰 별점 기준 코드 */
	public ReviewByScore getReviewByScore();
	
	/* 상품 기본 정보 코드 */
	public GoodsBasicInfo getGoodsBasicInfo();
}
