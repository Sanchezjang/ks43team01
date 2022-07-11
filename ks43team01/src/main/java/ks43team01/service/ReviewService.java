package ks43team01.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.Point;
import ks43team01.dto.ReviewContentsReg;
import ks43team01.mapper.PointMapper;
import ks43team01.mapper.ReviewMapper;


@Service
@Transactional
public class ReviewService {
		private final ReviewMapper reviewMapper;
		
		public ReviewService(ReviewMapper reviewMapper) {
			this.reviewMapper = reviewMapper;
		}	
			
		private static final Logger log = LoggerFactory.getLogger(ReviewService.class);
		
		
		/* 리뷰등록 후 포인트 내역에 추가 */
		public List<Point> accumReviewPoint(Point point) {
			
			List<Point> pointList = reviewMapper.accumReviewPoint(point);
			log.info("point:{}", pointList);
			return pointList;
		}
		
		/* 관리자페이지 리뷰 삭제 */
		public int removeAdminReview(String reviewCode) {
			
			int result = reviewMapper.removeAdminReview(reviewCode);
			
			return result;
		}
		
		/* 유저페이지 리뷰 수정 */
		public int modifyReview(ReviewContentsReg reviewContentsReg) {
			
			int result = reviewMapper.modifyReview(reviewContentsReg);
			
			return result;
		}
		
		/* 유저페이지 리뷰 삭제 */
		public int removeReview(String reviewCode) {
			
			int result = reviewMapper.removeReview(reviewCode);
			
			return result;
		}
		
		/* 리뷰 등록시 회원 테이블에 포인트 적립*/
		public int userSavePoint(String userIdCode) {
			
			int result = reviewMapper.userSavePoint(userIdCode);
			
			return result;
		}
		
		
		
		/* 리뷰 등록 시 포인트 내역에 포인트 적립*/
		public int reviewSavePoint(String userIdCode) {
			
			int result = reviewMapper.reviewSavePoint(userIdCode);
			
			return result;
		}
		
		
		/* 회원페이지 리뷰 등록 */
		public int addReview(ReviewContentsReg reviewContentsReg) {
			
			int result = reviewMapper.addReview(reviewContentsReg);
			
			return result;
		}
		
		/* 회원페이지 회원 상세 리뷰 조회 */
		public ReviewContentsReg getReviewByCode(String reviewCode) {
			System.out.println("___________getReviewByCode_________");
			return  reviewMapper.getReviewByCode(reviewCode);
			
		}
		
		
		/* 회원 페이지 회원 리뷰 목록 조회 */
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
