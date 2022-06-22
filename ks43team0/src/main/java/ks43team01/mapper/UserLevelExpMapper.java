package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.UserLevelExp;

@Mapper
public interface UserLevelExpMapper {

	//구입회원경험치 증가!!!//
	public int addUserLevelExp(UserLevelExp userLevelExp);
	
}
