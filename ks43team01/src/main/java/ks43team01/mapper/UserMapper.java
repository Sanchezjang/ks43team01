package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ks43team01.dto.SellerBusiness;
import ks43team01.dto.User;
import ks43team01.dto.UserAgree;
import ks43team01.dto.UserAgreeDetails;
import ks43team01.dto.UserLevelExp;
import ks43team01.dto.UserLog;
import ks43team01.dto.GoodsSubCategory;
import ks43team01.dto.GoodsTopCategory;
import ks43team01.dto.SellerCareer;
import ks43team01.dto.SellerEducation;



@Mapper
public interface UserMapper {
	/*회원총리스트에서 삭제 */
	public int deleteUserList(String userIdCode);
	//admin로그이력삭제//	
	public int removeLoginList(String loginNum);
	///판매자 비지니스수정처리///
	public int modifyBusiness(SellerBusiness sellerBusiness);
	///회원정보수정 고통회원 부분!!!//
	public int modifyUser(User user); 
	
	//판매자 정보 입력시에 등급 3에서 2로 업데이트!!!//
	public int modifyUserLevel(User user);
	
	//로그인시에 경험치 누석 구매자회원//
	public int addUserLevelExp(UserLevelExp userLevelExp);
		
	//회원가입//	
	public int addUserInsert(User user);
	
	//admin회원총리스트 가져오기//
	public List<User> getAdminUserList(); 
	
	//admin로그인이력 가져오기//
	public List<UserLog> getLogDate();

	//판매자 비지니스 탑카테고리//
	public List<GoodsTopCategory> getTopCategory();
	
	//판매자 비지니스 서브카테고리//
	public List<GoodsSubCategory> getSubCategory(String topCategory);
	
	//로그인을위한아이디조회///
	public User getUserInfoById(String userId);
	
	//판매자으 기술분야, 스킬 , 자기소개 입력///
	public int addSellerBusiness(SellerBusiness sellerBusiness);
	
	//판매자의 근무경력사항을 증빙함//
	public int addSellerCareer(SellerCareer sellerCareer);
	/**
	 *판매자 근무경력 nu11처리
	 * @param sellerCareer
	 * @return
	 */
	public int nullSellerCareer(SellerCareer sellerCareer);
		
	
	//판매자의 학력증명사항//
	public int addSellerEducation(SellerEducation sellerEducation);
	
	//판매자의 학력없음을 누를경우//
	public int NullSellerEducation(SellerEducation sellerEducation);
	
	//로그인하는 모든 유저의 로그 테이블 쌓기
	public int addUserLog(UserLog userLog);

	/*동의항목동의상세테이블*/
	public List<UserAgreeDetails> getUserAgreeDetails();
	
	/*동의한회원별 동의로그남김*/
	public List<UserAgree> getUserAgreeCheck();
}
