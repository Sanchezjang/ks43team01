package ks43team01.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.SellerBusiness;
import ks43team01.dto.SellerCareer;
import ks43team01.dto.SellerEducation;
import ks43team01.dto.User;
import ks43team01.dto.UserAgree;
import ks43team01.dto.UserAgreeDetails;
import ks43team01.dto.UserLevelExp;
import ks43team01.dto.UserLog;
import ks43team01.dto.GoodsSubCategory;
import ks43team01.dto.GoodsTopCategory;
import ks43team01.mapper.UserMapper;

@Service
@Transactional
public class UserService {
	
	private static final Logger log = LoggerFactory.getLogger(UserService.class);

	//DI//	
	private final UserMapper userMapper;
	public  UserService(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	/*판매자 비지니스수정처리*/
	public int modifyBusiness(SellerBusiness sellerBusiness) {
		int result = userMapper.modifyBusiness(sellerBusiness);
		return result; 
	}
	///회원정보수정 고통회원 부분!!!//
	public int modifyUser(User user) {
		
	   int result = userMapper.modifyUser(user);
		
		return result;
	}
	
	/*판매자 정보 입력시에 등급 3에서 2로 업데이트!!!*/
	public int modifyUserLevel(User user) {
		
		int result = userMapper.modifyUserLevel(user);
		
		return result;
	}
	
	/*로그인시에 구매자회원 경험치 누적!!!*/
	public int addUserLevelExp(UserLevelExp userLevelExp) {
		
		int result = userMapper.addUserLevelExp(userLevelExp);
		
		return result;
	}
	
	
	public int addUserInsert(User user) { //회원가입//
		
		int result = userMapper.addUserInsert(user);
		
		return result;
	}
	////admin회원총리스트 가져오기//
	public List<User> getAdminUserList(){
		List<User> userList = userMapper.getAdminUserList();
		log.info("회원리스트 잘들어왓는지 확인  :   {}", userList);
		return userList;
	}
	///admin로그인이력 테이블 출력
	public List<UserLog> getLogDate() {
		
		List<UserLog> userLogDate= userMapper.getLogDate();
		
		return userLogDate;
	}
	
	//비지니스 선택 탑카테고리 만들기
	public List<GoodsTopCategory> getTopCategory() {
		
		List<GoodsTopCategory> Tcategory = userMapper.getTopCategory();
		
		return Tcategory;
	}
	//비지니스 서브카테고리만들기
	public List<GoodsSubCategory> getSubCategory(String topCategory) {
		List<GoodsSubCategory> Scategory = userMapper.getSubCategory(topCategory);
		return Scategory;
	}
	
	//로그인을 위한 조회//
	public User getUserInfoById(String userId) {
		
		User user = userMapper.getUserInfoById(userId);
		
		if(user != null) {
			String userLevel = user.getUserLevel();
			if("1".equals(userLevel)) {
				user.setUserLevel("관리자");
			}else if("2".equals(userLevel)) {
				user.setUserLevel("판매회원");
			}else if("3".equals(userLevel)) {
				user.setUserLevel("일반회원");
			}
		}
		return user;
	}
	//판매자 기술분야, 스킬, 자기소개 입력//
	public int addSellerBusiness(SellerBusiness sellerBusiness) {
		
		int result = userMapper.addSellerBusiness(sellerBusiness);
	
		return result;
	}
	//판매자근무경력
		public int addSellerCareer(SellerCareer sellerCareer) {
			
			int result = userMapper.addSellerCareer(sellerCareer);
			
			return result;
	}
		//경력없을시 null처리로
		public int nullSellerCareer(SellerCareer sellerCareer) {
			
			int result = userMapper.nullSellerCareer(sellerCareer);
	
			return result;
		}
	//판매자의 학력증명사항//
		public int SellerEducation(SellerEducation sellerEducation) {
		
			int result = userMapper.addSellerEducation(sellerEducation);
			
			return result;
	}
	//학력없을시에 nul처리///
		public int NullSellerEducation(SellerEducation sellerEducation) {
			
			int result = userMapper.NullSellerEducation(sellerEducation);
			
			return result; 
		}
		
		//로그인하는 모든 유저의 로그 테이블 쌓기//
		public int addUserLog(UserLog userLog,HttpServletRequest request) {
			String OS = System.getProperty("os.name");
			userLog.setUserOS(OS);
			log.info("OS값 받아오는지 확인   :  {}",OS);
			String userAgent = request.getHeader("User-Agent");
			String userBrowser = "";
			if(userAgent.indexOf("Chrome") > -1) {
				userBrowser = "크롬";
			}else if(userAgent.indexOf("Firefox") > -1) {
				userBrowser = "파이어폭스";
			}else {
				userBrowser = "기타등등";
			}userLog.setUserBrowser(userBrowser);
			log.info("userBrowser  :   {}",userBrowser);
			int result = userMapper.addUserLog(userLog);
			
			return result;
		}
		/*동의항목동의상세테이블*/
		public List<UserAgreeDetails> getUserAgreeDetails(){
			List<UserAgreeDetails> agreeDetailsList = userMapper.getUserAgreeDetails();
			return agreeDetailsList;
		}
		/*동의한회원별 동의로그남김*/
		public List<UserAgree> getUserAgreeCheck(){
			List<UserAgree> AgreeCheckList = userMapper.getUserAgreeCheck();
			return AgreeCheckList;
		}
}
















