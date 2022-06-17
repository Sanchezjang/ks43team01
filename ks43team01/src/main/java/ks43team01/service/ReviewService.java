package ks43team01.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.GoodsBasicInfo;
import ks43team01.dto.ReviewByScore;
import ks43team01.dto.ReviewContentsReg;
import ks43team01.dto.User;
import ks43team01.mapper.ReviewMapper;


@Service
@Transactional
public class ReviewService {
		private final ReviewMapper reviewMapper ;
			
		public ReviewService(ReviewMapper reviewMapper) {
			this.reviewMapper = reviewMapper;
		}
		
		
	
		private static final Logger log = LoggerFactory.getLogger(ReviewService.class);
		
		
		/* 리뷰 등록 */
		public int addReview(ReviewContentsReg reviewContentsReg) {
			
			int result = reviewMapper.addReview(reviewContentsReg);
			
			return result;
		}
		
		/* 리뷰 목록 조회 */
	
		public List<ReviewContentsReg> getReviewAdminList(){
			log.info("리뷰 목록 조회:{}","test");
			List<ReviewContentsReg> reviewList = reviewMapper.getReviewAdminList();
			
			return reviewList;
		}
		
		/* 리뷰 별점 기준 코드 */
		public ReviewByScore getReviewByScore() {
			
			ReviewByScore reviewByScore = reviewMapper.getReviewByScore();
			
			return reviewByScore;
			
		}
		
		/* 상품 기본 정보 코드 */
	
		public GoodsBasicInfo getGoodsBasicInfo() {
			
			GoodsBasicInfo goodsBasicInfo = reviewMapper.getGoodsBasicInfo();
			
			return goodsBasicInfo;
			
		}
		
		
		
}
