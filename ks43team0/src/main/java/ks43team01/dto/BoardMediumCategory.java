package ks43team01.dto;

public class BoardMediumCategory {
	private String boardMediumCategoryCode;
	private String userIdCode;
	private String boardLargeCategoryCode;
	private String boardMediumCategoryName;
	private String boardMediumCategoryRegDate;
	private String boardMediumCategoryUpdateDate;
	private String boardMediumCategoryUse;
	
	public String getBoardMediumCategoryCode() {
		return boardMediumCategoryCode;
	}
	public void setBoardMediumCategoryCode(String boardMediumCategoryCode) {
		this.boardMediumCategoryCode = boardMediumCategoryCode;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getBoardLargeCategoryCode() {
		return boardLargeCategoryCode;
	}
	public void setBoardLargeCategoryCode(String boardLargeCategoryCode) {
		this.boardLargeCategoryCode = boardLargeCategoryCode;
	}
	public String getBoardMediumCategoryName() {
		return boardMediumCategoryName;
	}
	public void setBoardMediumCategoryName(String boardMediumCategoryName) {
		this.boardMediumCategoryName = boardMediumCategoryName;
	}
	public String getBoardMediumCategoryRegDate() {
		return boardMediumCategoryRegDate;
	}
	public void setBoardMediumCategoryRegDate(String boardMediumCategoryRegDate) {
		this.boardMediumCategoryRegDate = boardMediumCategoryRegDate;
	}
	public String getBoardMediumCategoryUpdateDate() {
		return boardMediumCategoryUpdateDate;
	}
	public void setBoardMediumCategoryUpdateDate(String boardMediumCategoryUpdateDate) {
		this.boardMediumCategoryUpdateDate = boardMediumCategoryUpdateDate;
	}
	public String getBoardMediumCategoryUse() {
		return boardMediumCategoryUse;
	}
	public void setBoardMediumCategoryUse(String boardMediumCategoryUse) {
		this.boardMediumCategoryUse = boardMediumCategoryUse;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BoardMediumCategory [boardMediumCategoryCode=");
		builder.append(boardMediumCategoryCode);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", boardLargeCategoryCode=");
		builder.append(boardLargeCategoryCode);
		builder.append(", boardMediumCategoryName=");
		builder.append(boardMediumCategoryName);
		builder.append(", boardMediumCategoryRegDate=");
		builder.append(boardMediumCategoryRegDate);
		builder.append(", boardMediumCategoryUpdateDate=");
		builder.append(boardMediumCategoryUpdateDate);
		builder.append(", boardMediumCategoryUse=");
		builder.append(boardMediumCategoryUse);
		builder.append("]");
		return builder.toString();
	}

	
}
