package ks43team01.dto;

public class BoardLargeCategory {
	private String boardLargeCategoryCode;
	private String userIdCode;
	private String boardLargeCategoryName;
	private String boardLargeCategoryRegDate;
	private String boardLargeCategoryUpdateDate;
	private String boardLargeCategoryUse;
	
	public String getBoardLargeCategoryCode() {
		return boardLargeCategoryCode;
	}
	public void setBoardLargeCategoryCode(String boardLargeCategoryCode) {
		this.boardLargeCategoryCode = boardLargeCategoryCode;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getBoardLargeCategoryName() {
		return boardLargeCategoryName;
	}
	public void setBoardLargeCategoryName(String boardLargeCategoryName) {
		this.boardLargeCategoryName = boardLargeCategoryName;
	}
	public String getBoardLargeCategoryRegDate() {
		return boardLargeCategoryRegDate;
	}
	public void setBoardLargeCategoryRegDate(String boardLargeCategoryRegDate) {
		this.boardLargeCategoryRegDate = boardLargeCategoryRegDate;
	}
	public String getBoardLargeCategoryUpdateDate() {
		return boardLargeCategoryUpdateDate;
	}
	public void setBoardLargeCategoryUpdateDate(String boardLargeCategoryUpdateDate) {
		this.boardLargeCategoryUpdateDate = boardLargeCategoryUpdateDate;
	}
	public String getBoardLargeCategoryUse() {
		return boardLargeCategoryUse;
	}
	public void setBoardLargeCategoryUse(String boardLargeCategoryUse) {
		this.boardLargeCategoryUse = boardLargeCategoryUse;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BoardLargeCategory [boardLargeCategoryCode=");
		builder.append(boardLargeCategoryCode);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", boardLargeCategoryName=");
		builder.append(boardLargeCategoryName);
		builder.append(", boardLargeCategoryRegDate=");
		builder.append(boardLargeCategoryRegDate);
		builder.append(", boardLargeCategoryUpdateDate=");
		builder.append(boardLargeCategoryUpdateDate);
		builder.append(", boardLargeCategoryUse=");
		builder.append(boardLargeCategoryUse);
		builder.append("]");
		return builder.toString();
	}
	
}
