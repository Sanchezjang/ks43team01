package ks43team01.dto;

public class BoardComment {

	private String boardCommentCode;
	private String userIdCode;
	private String boardPostCode;
	private String boardCommentContent;
	private String boardCommentRegDate;
	private String boardCommentUse;
	private String userName;
	private String boardCommentUpdateDate;
	public String getBoardCommentCode() {
		return boardCommentCode;
	}
	public void setBoardCommentCode(String boardCommentCode) {
		this.boardCommentCode = boardCommentCode;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getBoardPostCode() {
		return boardPostCode;
	}
	public void setBoardPostCode(String boardPostCode) {
		this.boardPostCode = boardPostCode;
	}
	public String getBoardCommentContent() {
		return boardCommentContent;
	}
	public void setBoardCommentContent(String boardCommentContent) {
		this.boardCommentContent = boardCommentContent;
	}
	public String getBoardCommentRegDate() {
		return boardCommentRegDate;
	}
	public void setBoardCommentRegDate(String boardCommentRegDate) {
		this.boardCommentRegDate = boardCommentRegDate;
	}
	public String getBoardCommentUse() {
		return boardCommentUse;
	}
	public void setBoardCommentUse(String boardCommentUse) {
		this.boardCommentUse = boardCommentUse;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getBoardCommentUpdateDate() {
		return boardCommentUpdateDate;
	}
	public void setBoardCommentUpdateDate(String boardCommentUpdateDate) {
		this.boardCommentUpdateDate = boardCommentUpdateDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BoardComment [boardCommentCode=");
		builder.append(boardCommentCode);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", boardPostCode=");
		builder.append(boardPostCode);
		builder.append(", boardCommentContent=");
		builder.append(boardCommentContent);
		builder.append(", boardCommentRegDate=");
		builder.append(boardCommentRegDate);
		builder.append(", boardCommentUse=");
		builder.append(boardCommentUse);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", boardCommentUpdateDate=");
		builder.append(boardCommentUpdateDate);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
