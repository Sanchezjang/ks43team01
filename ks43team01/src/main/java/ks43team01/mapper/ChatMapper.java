package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.Chat;

@Mapper
public interface ChatMapper {


	//채팅방 생성
	public int addChatRoom(Chat chat);
	
	//채팅방 목록 조회
	public List<Chat> getChatRoomList();
	
}
