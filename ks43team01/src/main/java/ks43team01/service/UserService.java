package ks43team01.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.User;
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
	
	//로그인을 위한 조회//
	public User getUserInfoById(String userId) {
		
		User user = userMapper.getUserInfoById(userId);
		
		return user;
	}
}	
