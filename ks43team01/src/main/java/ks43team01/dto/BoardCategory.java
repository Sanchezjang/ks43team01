package ks43team01.dto;

public class BoardCategory {
	private String boardCategoryCode;
	private String userIdCode;
	private String boardCategoryName;
	private String boardCategoryRegDate;
	private String boardCategoryUse;
	
	public String getBoardCategoryCode() {
		return boardCategoryCode;
	}
	public void setBoardCategoryCode(String boardCategoryCode) {
		this.boardCategoryCode = boardCategoryCode;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getBoardCategoryName() {
		return boardCategoryName;
	}
	public void setBoardCategoryName(String boardCategoryName) {
		this.boardCategoryName = boardCategoryName;
	}
	public String getBoardCategoryRegDate() {
		return boardCategoryRegDate;
	}
	public void setBoardCategoryRegDate(String boardCategoryRegDate) {
		this.boardCategoryRegDate = boardCategoryRegDate;
	}
	public String getBoardCategoryUse() {
		return boardCategoryUse;
	}
	public void setBoardCategoryUse(String boardCategoryUse) {
		this.boardCategoryUse = boardCategoryUse;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BoardCategory [boardCategoryCode=");
		builder.append(boardCategoryCode);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", boardCategoryName=");
		builder.append(boardCategoryName);
		builder.append(", boardCategoryRegDate=");
		builder.append(boardCategoryRegDate);
		builder.append(", boardCategoryUse=");
		builder.append(boardCategoryUse);
		builder.append("]");
		return builder.toString();
	}
	
	
}
