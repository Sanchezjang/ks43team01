package ks43team01.dto;

public class QnaBoardReply {

	private String boardQuestionReplyCode;
	private String userIdCode;
	private String boardQuestionCode;
	private String boardAnswerCode;
	private String boardQuestionReplyTitle;
	private String boardQuestionReplyContent;
	private String boardQuestionReplyName;
	private String boardQuestionReplyLock;
	private String boardQuestionReplyRegDate;
	private String boardQuestionReplyUpdateDate;
	private String boardQuestionReplyUse;
	
	public String getBoardQuestionReplyCode() {
		return boardQuestionReplyCode;
	}
	public void setBoardQuestionReplyCode(String boardQuestionReplyCode) {
		this.boardQuestionReplyCode = boardQuestionReplyCode;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getBoardQuestionCode() {
		return boardQuestionCode;
	}
	public void setBoardQuestionCode(String boardQuestionCode) {
		this.boardQuestionCode = boardQuestionCode;
	}
	public String getBoardAnswerCode() {
		return boardAnswerCode;
	}
	public void setBoardAnswerCode(String boardAnswerCode) {
		this.boardAnswerCode = boardAnswerCode;
	}
	public String getBoardQuestionReplyTitle() {
		return boardQuestionReplyTitle;
	}
	public void setBoardQuestionReplyTitle(String boardQuestionReplyTitle) {
		this.boardQuestionReplyTitle = boardQuestionReplyTitle;
	}
	public String getBoardQuestionReplyContent() {
		return boardQuestionReplyContent;
	}
	public void setBoardQuestionReplyContent(String boardQuestionReplyContent) {
		this.boardQuestionReplyContent = boardQuestionReplyContent;
	}
	public String getBoardQuestionReplyName() {
		return boardQuestionReplyName;
	}
	public void setBoardQuestionReplyName(String boardQuestionReplyName) {
		this.boardQuestionReplyName = boardQuestionReplyName;
	}
	public String getBoardQuestionReplyLock() {
		return boardQuestionReplyLock;
	}
	public void setBoardQuestionReplyLock(String boardQuestionReplyLock) {
		this.boardQuestionReplyLock = boardQuestionReplyLock;
	}
	public String getBoardQuestionReplyRegDate() {
		return boardQuestionReplyRegDate;
	}
	public void setBoardQuestionReplyRegDate(String boardQuestionReplyRegDate) {
		this.boardQuestionReplyRegDate = boardQuestionReplyRegDate;
	}
	public String getBoardQuestionReplyUpdateDate() {
		return boardQuestionReplyUpdateDate;
	}
	public void setBoardQuestionReplyUpdateDate(String boardQuestionReplyUpdateDate) {
		this.boardQuestionReplyUpdateDate = boardQuestionReplyUpdateDate;
	}
	public String getBoardQuestionReplyUse() {
		return boardQuestionReplyUse;
	}
	public void setBoardQuestionReplyUse(String boardQuestionReplyUse) {
		this.boardQuestionReplyUse = boardQuestionReplyUse;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("QnaBoardReply [boardQuestionReplyCode=");
		builder.append(boardQuestionReplyCode);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", boardQuestionCode=");
		builder.append(boardQuestionCode);
		builder.append(", boardAnswerCode=");
		builder.append(boardAnswerCode);
		builder.append(", boardQuestionReplyTitle=");
		builder.append(boardQuestionReplyTitle);
		builder.append(", boardQuestionReplyContent=");
		builder.append(boardQuestionReplyContent);
		builder.append(", boardQuestionReplyName=");
		builder.append(boardQuestionReplyName);
		builder.append(", boardQuestionReplyLock=");
		builder.append(boardQuestionReplyLock);
		builder.append(", boardQuestionReplyRegDate=");
		builder.append(boardQuestionReplyRegDate);
		builder.append(", boardQuestionReplyUpdateDate=");
		builder.append(boardQuestionReplyUpdateDate);
		builder.append(", boardQuestionReplyUse=");
		builder.append(boardQuestionReplyUse);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
