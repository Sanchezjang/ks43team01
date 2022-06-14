package ks43team01.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.SellerBusiness;
import ks43team01.dto.User;
import ks43team01.dto.goodsSubCategory;
import ks43team01.dto.goodsTopCategory;
import ks43team01.mapper.UserMapper;

@Service
@Transactional
public class UserService {
	//DI//	
	private final UserMapper userMapper;
	public  UserService(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	public int addUserInsert(User user) { //회원가입//
		
		int result = userMapper.addUserInsert(user);
		
		return result;
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
}	
