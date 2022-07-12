package ks43team01.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.Point;
import ks43team01.dto.ReviewContentsReg;

@Mapper
public interface ReviewMapper {

	
	/* 리뷰등록 후 포인트 내역에 추가 */ 
	public int accumReviewPoint(Point point);
	
	/* 관리자페이지 리뷰 삭제 처리 */
	public int removeAdminReview(String reviewCode);

	/* 유저페이지 리뷰 수정 처리 */
	public int modifyReview(ReviewContentsReg reviewContentsReg);

	/* 유저페이지 리뷰 삭제 처리 */
	public int removeReview(String reviewCode);

	/* 리뷰 등록시 회원 테이블에 포인트 적립 */
	public int userSavePoint(String userIdCode);

	/* 리뷰 등록 시 포인트 내역에 포인트 적립 */
	public int reviewSavePoint(String userIdCode);

	/* 리뷰 등록 */
	public int addReview(ReviewContentsReg reviewContentsReg);

	/* 유저페이지 회원 리뷰 조회 */
	public ReviewContentsReg getReviewByCode(String reviewCode);

	/* 유저페이지 회원 리뷰 목록 조회 */
	public List<ReviewContentsReg> getReviewUserList();

	/* 관리자페이지 회원 리뷰 목록 조회 */
	public List<ReviewContentsReg> getReviewAdminList();

}
