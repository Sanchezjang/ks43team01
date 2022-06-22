package ks43team01.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
		
		
		/* 리뷰 수정 */
		public int modifyReview(ReviewContentsReg reviewContentsReg) {
			
			int result = reviewMapper.modifyReview(reviewContentsReg);
			
			return result;
		}
		
		/* 리뷰 삭제 */
		public int removeReview(String reviewCode) {
			
			int result = reviewMapper.removeReview(reviewCode);
			
			return result;
		}
		
		
		
		/* 리뷰 등록 */
		public int addReview( ReviewContentsReg reviewContentsReg) {
			
			int result = reviewMapper.addReview(reviewContentsReg);
			
			return result;
		}
		
		/* 유저 페이지 회원 리뷰 목록 조회 */
		public List<ReviewContentsReg> getReviewUserList(){
			//log.info("리뷰 목록 조회:{}", "test");
			List<ReviewContentsReg> reviewUserList = reviewMapper.getReviewUserList();
			
			return reviewUserList;
		}
		
		/* 관리자 페이지  회원 리뷰 목록 조회 */
	
		public List<ReviewContentsReg> getReviewAdminList(){
			log.info("리뷰 목록 조회:{}","test");
			List<ReviewContentsReg> reviewAdminList = reviewMapper.getReviewAdminList();
			
			return reviewAdminList;
		}
		
		
		
		
		
}
