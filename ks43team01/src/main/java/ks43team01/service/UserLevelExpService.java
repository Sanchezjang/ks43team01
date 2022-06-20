package ks43team01.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.UserLevelExp;
import ks43team01.mapper.UserLevelExpMapper;
import ks43team01.mapper.UserMapper;

@Service
@Transactional
public class UserLevelExpService {

	private final UserLevelExpMapper userLevelExpMapper;
	
	public UserLevelExpService(UserLevelExpMapper userLevelExpMapper) {

		this.userLevelExpMapper = userLevelExpMapper;
	}
	
	public int addUserLevelExp(UserLevelExp userLevelExp) {
		
		int result = userLevelExpMapper.addUserLevelExp(userLevelExp);
		
		return result;
	}
	
}
