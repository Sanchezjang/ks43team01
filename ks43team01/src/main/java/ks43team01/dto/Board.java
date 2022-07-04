package ks43team01.dto;

public class Board {
	private String boardPostCode;
	private String userIdCode;
	private String boardCategoryCode;
	private String boardPostTitle;
	private String boardUserName;
	private String boardPostContent;
	private String boardPostRegDate;
	private String boardPostUpdateDate;
	private int boardPostView;
	private String boardPostUse;
	
	private BoardComment boardComment;
	private BoardCategory boardCategory;
	
	public String getBoardPostCode() {
		return boardPostCode;
	}
	public void setBoardPostCode(String boardPostCode) {
		this.boardPostCode = boardPostCode;
	}
	public BoardComment getBoardComment() {
		return boardComment;
	}
	public void setBoardComment(BoardComment boardComment) {
		this.boardComment = boardComment;
	}
	public BoardCategory getBoardCategory() {
		return boardCategory;
	}
	public void setBoardCategory(BoardCategory boardCategory) {
		this.boardCategory = boardCategory;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getBoardCategoryCode() {
		return boardCategoryCode;
	}
	public void setBoardCategoryCode(String boardCategoryCode) {
		this.boardCategoryCode = boardCategoryCode;
	}
	public String getBoardPostTitle() {
		return boardPostTitle;
	}
	public void setBoardPostTitle(String boardPostTitle) {
		this.boardPostTitle = boardPostTitle;
	}
	public String getBoardUserName() {
		return boardUserName;
	}
	public void setBoardUserName(String boardUserName) {
		this.boardUserName = boardUserName;
	}
	public String getBoardPostContent() {
		return boardPostContent;
	}
	public void setBoardPostContent(String boardPostContent) {
		this.boardPostContent = boardPostContent;
	}
	public String getBoardPostRegDate() {
		return boardPostRegDate;
	}
	public void setBoardPostRegDate(String boardPostRegDate) {
		this.boardPostRegDate = boardPostRegDate;
	}
	public String getBoardPostUpdateDate() {
		return boardPostUpdateDate;
	}
	public void setBoardPostUpdateDate(String boardPostUpdateDate) {
		this.boardPostUpdateDate = boardPostUpdateDate;
	}
	public int getBoardPostView() {
		return boardPostView;
	}
	public void setBoardPostView(int boardPostView) {
		this.boardPostView = boardPostView;
	}
	public String getBoardPostUse() {
		return boardPostUse;
	}
	public void setBoardPostUse(String boardPostUse) {
		this.boardPostUse = boardPostUse;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Board [boardPostCode=");
		builder.append(boardPostCode);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", boardCategoryCode=");
		builder.append(boardCategoryCode);
		builder.append(", boardPostTitle=");
		builder.append(boardPostTitle);
		builder.append(", boardUserName=");
		builder.append(boardUserName);
		builder.append(", boardPostContent=");
		builder.append(boardPostContent);
		builder.append(", boardPostRegDate=");
		builder.append(boardPostRegDate);
		builder.append(", boardPostUpdateDate=");
		builder.append(boardPostUpdateDate);
		builder.append(", boardPostView=");
		builder.append(boardPostView);
		builder.append(", boardPostUse=");
		builder.append(boardPostUse);
		builder.append(", boardComment=");
		builder.append(boardComment);
		builder.append(", boardCategory=");
		builder.append(boardCategory);
		builder.append("]");
		return builder.toString();
	}

	
}