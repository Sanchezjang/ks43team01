package ks43team01.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.SellerBusiness;
import ks43team01.dto.SellerCareer;
import ks43team01.dto.SellerEducation;
import ks43team01.dto.User;
import ks43team01.dto.goodsSubCategory;
import ks43team01.dto.goodsTopCategory;
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
	
	//비지니스 선택 탑카테고리 만들기
	public List<goodsTopCategory> getTopCategory() {
		
		List<goodsTopCategory> Tcategory = userMapper.getTopCategory();
		
		return Tcategory;
	}
	//비지니스 서브카테고리만들기
	public List<goodsSubCategory> getSubCategory(String topCategory) {
		List<goodsSubCategory> Scategory = userMapper.getSubCategory(topCategory);
		return Scategory;
	}
	
	//로그인을 위한 조회//
	public User getUserInfoById(String userId) {
		
		User user = userMapper.getUserInfoById(userId);
		
		return user;
	}
	//판매자 기술분야, 스킬, 자기소개 입력//
	public int addSellerBusiness(SellerBusiness sellerBusiness) {
		
		int result = userMapper.addSellerBusiness(sellerBusiness);
		return result;
	}
	//판매자 기술분야, 스킬, 자기소개 입력//
		public int addSellerCareer(SellerCareer sellerCareer) {
			
			int result = userMapper.addSellerCareer(sellerCareer);
			return result;
	}
	//판매자의 학력증명사항//
		public int SellerEducation(SellerEducation sellerEducation) {
		
			int result = userMapper.addSellerEducation(sellerEducation);
			
			return result;
		}
}