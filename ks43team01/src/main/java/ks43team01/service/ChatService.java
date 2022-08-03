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
import ks43team01.dto.Chat;
import ks43team01.mapper.ChatMapper;
import ks43team01.mapper.FileMapper;

@Service
@Transactional
public class ChatService {

	private final ChatMapper chatMapper;
	private final FileMapper fileMapper;

	public ChatService(ChatMapper chatMapper, FileMapper fileMapper) {
		this.chatMapper = chatMapper;
		this.fileMapper = fileMapper;

	}

	private static final Logger log = LoggerFactory.getLogger(ChatService.class);

	/*
	 * 채팅방 상세 조회 public Chat getChatRoomByCode(String chatRoomCode) {
	 * System.out.println("___________getChatRoomByCode___________");
	 * 
	 * return chatMapper.getChatRoomByCode(chatRoomCode); }
	 */

	/* 채팅방 생성 */
	public String addChatRoom(String sessionId, Chat chat, MultipartFile[] chatImgFile, String fileRealPath) {
		chat.setUserIdCode(sessionId);
		// 1. 채팅방 메인 이미지 파일 업로드
		// 2. 파일 업로드 시 파일 DB insert
		// 3. 게시글 insert
		// 4. 결과값 return

		/* 첨부파일을 포함하지 않을 때 조건문 실행 */
		boolean fileCheck = true;

		for (MultipartFile multipartFile : chatImgFile) {
			if (!multipartFile.isEmpty()) {
				fileCheck = false;
			}
		}

		if (!fileCheck) {

			// 파일 업로드 객체 생성
			FileUtils fu = new FileUtils(chatImgFile, chat.getUserIdCode(), fileRealPath);
			List<Map<String, String>> dtoFileList = fu.parseFileInfo();

			// t_file 테이블에 삽입
			System.out.println(dtoFileList + "<<<dtoFileList입니다.");
			fileMapper.uploadFile(dtoFileList);

			chatMapper.addChatRoom(chat);
			String chatRoomCode = chat.getChatRoomCode();

			// 릴레이션 테이블에 삽입
			List<Map<String, String>> relationFileList = new ArrayList<>();
			for (Map<String, String> m : dtoFileList) {
				m.put("chatRoomCode", chatRoomCode);
				relationFileList.add(m);
			}
			System.out.println(relationFileList + "<<<relationFileList입니다.");
			fileMapper.uploadRelationFileWithChat(relationFileList);

			System.out.println("-----------------------채팅방 등록 서비스 끝------------------------------");

			return chatRoomCode;

		} else {

			int result = chatMapper.addChatRoom(chat);

			return Integer.toString(result);
		}
	}

	/* 채팅방 목록 조회 */
	public List<Chat> getChatRoomList() {
		List<Chat> chatRoomList = chatMapper.getChatRoomList();

		return chatRoomList;
	}

}
