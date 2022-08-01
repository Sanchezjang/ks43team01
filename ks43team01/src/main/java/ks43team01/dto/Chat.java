package ks43team01.dto;

import java.util.List;
import java.util.Map;

public class Chat {

	private String chatRoomCode;
	private String userIdCode;
	private String chatRoomTitle;
	private String chatRoomContent;
	private int chatRoomParticipant;
	private int chatRoomLimit;
	private String chatRoomRegDate;
	private String chatRoomUpdate;
	private String chatRoomNickName;
	
	private List<Map<String, String>> 	relFileWithChat;
	private List<File> 				file;
	
	public List<Map<String, String>> getRelFileWithChat() {
		return relFileWithChat;
	}
	public void setRelFileWithChat(List<Map<String, String>> relFileWithChat) {
		this.relFileWithChat = relFileWithChat;
	}
	public List<File> getFile() {
		return file;
	}
	public void setFile(List<File> file) {
		this.file = file;
	}
	public String getChatRoomCode() {
		return chatRoomCode;
	}
	public void setChatRoomCode(String chatRoomCode) {
		this.chatRoomCode = chatRoomCode;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getChatRoomTitle() {
		return chatRoomTitle;
	}
	public void setChatRoomTitle(String chatRoomTitle) {
		this.chatRoomTitle = chatRoomTitle;
	}
	public String getChatRoomContent() {
		return chatRoomContent;
	}
	public void setChatRoomContent(String chatRoomContent) {
		this.chatRoomContent = chatRoomContent;
	}
	public int getChatRoomParticipant() {
		return chatRoomParticipant;
	}
	public void setChatRoomParticipant(int chatRoomParticipant) {
		this.chatRoomParticipant = chatRoomParticipant;
	}
	public int getChatRoomLimit() {
		return chatRoomLimit;
	}
	public void setChatRoomLimit(int chatRoomLimit) {
		this.chatRoomLimit = chatRoomLimit;
	}
	public String getChatRoomRegDate() {
		return chatRoomRegDate;
	}
	public void setChatRoomRegDate(String chatRoomRegDate) {
		this.chatRoomRegDate = chatRoomRegDate;
	}
	public String getChatRoomUpdate() {
		return chatRoomUpdate;
	}
	public void setChatRoomUpdate(String chatRoomUpdate) {
		this.chatRoomUpdate = chatRoomUpdate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Chat [chatRoomCode=");
		builder.append(chatRoomCode);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", chatRoomTitle=");
		builder.append(chatRoomTitle);
		builder.append(", chatRoomContent=");
		builder.append(chatRoomContent);
		builder.append(", chatRoomParticipant=");
		builder.append(chatRoomParticipant);
		builder.append(", chatRoomLimit=");
		builder.append(chatRoomLimit);
		builder.append(", chatRoomRegDate=");
		builder.append(chatRoomRegDate);
		builder.append(", chatRoomUpdate=");
		builder.append(chatRoomUpdate);
		builder.append(", chatRoomNickName=");
		builder.append(chatRoomNickName);
		builder.append(", relFileWithChat=");
		builder.append(relFileWithChat);
		builder.append(", file=");
		builder.append(file);
		builder.append("]");
		return builder.toString();
	}
	public String getChatRoomNickName() {
		return chatRoomNickName;
	}
	public void setChatRoomNickName(String chatRoomNickName) {
		this.chatRoomNickName = chatRoomNickName;
	}
}