package ks43team01.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import ks43team01.common.FileUtils;
import ks43team01.dto.Point;
import ks43team01.dto.ReviewContentsReg;
import ks43team01.mapper.FileMapper;
import ks43team01.mapper.ReviewMapper;

@Service
@Transactional
public class ReviewService {
	private final ReviewMapper reviewMapper;
	private final FileMapper fileMapper;
	public ReviewService(ReviewMapper reviewMapper, FileMapper fileMapper) {
		this.reviewMapper = reviewMapper;
		this.fileMapper = fileMapper;
	}

	
	private static final Logger log = LoggerFactory.getLogger(ReviewService.class);


	
	/* 리뷰등록 후 포인트 내역에 등록 */
	  
	  public int accumReviewPoint(Point point) {
		  log.info("point:{}", point);
	  int result = reviewMapper.accumReviewPoint(point);
	  log.info("point:{}", point);
	  
	  return result; 
	  
	  }
	 

	/* 관리자페이지 리뷰 삭제 */
	public int removeAdminReview(String reviewCode) {

		int result = reviewMapper.removeAdminReview(reviewCode);

		return result;
	}

	/* 회원페이지 리뷰 수정 */
	public int modifyReview(ReviewContentsReg reviewContentsReg) {

		int result = reviewMapper.modifyReview(reviewContentsReg);
		
		return result;
	}
	/* 회원페이지 리뷰 이미지 삭제  */
	public int removeImageReview(String reviewCode) {
		
		int result = reviewMapper.removeImageReview(reviewCode);
		
		return result;
		
	}
	
	/* 회원페이지 리뷰 삭제 */
	public int removeReview(String reviewCode) {

		int result = reviewMapper.removeReview(reviewCode);

		return result;
	}

	/* 리뷰 등록시 회원 테이블에 포인트 적립 */
	public int userSavePoint(String userIdCode) {

		int result = reviewMapper.userSavePoint(userIdCode);

		return result;
	}


	/* 회원페이지 리뷰 등록 */
	public String addReview(ReviewContentsReg reviewContentsReg, MultipartFile[] reviewImageReg, String fileRealPath) {
		
		boolean fileCheck = true;
				
				for (MultipartFile multipartFile : reviewImageReg){
					if(!multipartFile.isEmpty()) {
						fileCheck = false;
					}
				}
				
				if (!fileCheck) {
			
		
		FileUtils fu = new FileUtils(reviewImageReg, reviewContentsReg.getUserIdCode(), fileRealPath);
		List<Map<String, String>> dtoFileList = fu.parseFileInfo();
		
		fileMapper.uploadFile(dtoFileList);
		
		int result = reviewMapper.addReview(reviewContentsReg);
		String reviewCode = reviewContentsReg.getReviewCode();
		
		log.info(reviewCode);
		List<Map<String, String>> relationFileList = new ArrayList<>();
		for(Map<String, String> m : dtoFileList) {
			m.put("reviewCode", reviewCode);
			relationFileList.add(m);
		}

		fileMapper.uploadRelationFileWithReview(relationFileList);
		return reviewCode;
		
		}else {
			
			int result = reviewMapper.addReview(reviewContentsReg);
			
			return Integer.toString(result);
		}
	}

	/* 회원페이지 회원 상세 리뷰 조회 */
	public ReviewContentsReg getReviewByCode(String reviewCode) {
		System.out.println("___________getReviewByCode_________");
		return reviewMapper.getReviewByCode(reviewCode);

	}
	
	/* 회원 페이지 회원 리뷰 상품코드로 조회 */
	public List<ReviewContentsReg> getReviewByGoodsCode(String goodsCode){
		
		List<ReviewContentsReg> reviewByGoodsCode = reviewMapper.getReviewByGoodsCode(goodsCode);
		
		return reviewByGoodsCode;
	}
	
	/* 회원 페이지 회원 리뷰 목록 조회 */
	public List<ReviewContentsReg> getReviewUserList() {
		 log.info("들어오는 값:{}", "test");
		
		List<ReviewContentsReg> reviewUserList = reviewMapper.getReviewUserList();

		return reviewUserList;
	}

	/* 관리자 페이지 회원 리뷰 목록 조회 */

	public List<ReviewContentsReg> getReviewAdminList() {
		log.info("리뷰 목록 조회:{}", "test");
		List<ReviewContentsReg> reviewAdminList = reviewMapper.getReviewAdminList();

		return reviewAdminList;
	}

}
