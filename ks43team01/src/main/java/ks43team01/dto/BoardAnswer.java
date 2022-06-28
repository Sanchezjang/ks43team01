package ks43team01.dto;

public class BoardAnswer {

	private String boardAnswerCode;
	private String userIdCode;
	private String boardLargerCategoryCode;
	private String boardMediumCategoryCode;
	private String boardAnswerWord;
	private String boardAnswerContent;
	private String boardAnswerRegDate;
	private String boardAnswerUpdateDate;
	public String getBoardAnswerCode() {
		return boardAnswerCode;
	}
	public void setBoardAnswerCode(String boardAnswerCode) {
		this.boardAnswerCode = boardAnswerCode;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getBoardLargerCategoryCode() {
		return boardLargerCategoryCode;
	}
	public void setBoardLargerCategoryCode(String boardLargerCategoryCode) {
		this.boardLargerCategoryCode = boardLargerCategoryCode;
	}
	public String getBoardMediumCategoryCode() {
		return boardMediumCategoryCode;
	}
	public void setBoardMediumCategoryCode(String boardMediumCategoryCode) {
		this.boardMediumCategoryCode = boardMediumCategoryCode;
	}
	public String getBoardAnswerWord() {
		return boardAnswerWord;
	}
	public void setBoardAnswerWord(String boardAnswerWord) {
		this.boardAnswerWord = boardAnswerWord;
	}
	public String getBoardAnswerContent() {
		return boardAnswerContent;
	}
	public void setBoardAnswerContent(String boardAnswerContent) {
		this.boardAnswerContent = boardAnswerContent;
	}
	public String getBoardAnswerRegDate() {
		return boardAnswerRegDate;
	}
	public void setBoardAnswerRegDate(String boardAnswerRegDate) {
		this.boardAnswerRegDate = boardAnswerRegDate;
	}
	public String getBoardAnswerUpdateDate() {
		return boardAnswerUpdateDate;
	}
	public void setBoardAnswerUpdateDate(String boardAnswerUpdateDate) {
		this.boardAnswerUpdateDate = boardAnswerUpdateDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BoardAnswer [boardAnswerCode=");
		builder.append(boardAnswerCode);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", boardLargerCategoryCode=");
		builder.append(boardLargerCategoryCode);
		builder.append(", boardMediumCategoryCode=");
		builder.append(boardMediumCategoryCode);
		builder.append(", boardAnswerWord=");
		builder.append(boardAnswerWord);
		builder.append(", boardAnswerContent=");
		builder.append(boardAnswerContent);
		builder.append(", boardAnswerRegDate=");
		builder.append(boardAnswerRegDate);
		builder.append(", boardAnswerUpdateDate=");
		builder.append(boardAnswerUpdateDate);
		builder.append("]");
		return builder.toString();
	}
	
	
}
