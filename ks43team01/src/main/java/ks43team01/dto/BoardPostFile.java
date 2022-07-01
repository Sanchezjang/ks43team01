package ks43team01.dto;

public class BoardPostFile {
	private String boardPostFileCode;
	private String userIdCode;
	private String boardQuestionCode;
	private String boardPostFileName;
	private String boardPostFileExtension;
	private String boardPostFileSize;
	private String boardPostFileRegDate;
	private String boardPostFileUse;
	public String getBoardPostFileCode() {
		return boardPostFileCode;
	}
	public void setBoardPostFileCode(String boardPostFileCode) {
		this.boardPostFileCode = boardPostFileCode;
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
	public String getBoardPostFileName() {
		return boardPostFileName;
	}
	public void setBoardPostFileName(String boardPostFileName) {
		this.boardPostFileName = boardPostFileName;
	}
	public String getBoardPostFileExtension() {
		return boardPostFileExtension;
	}
	public void setBoardPostFileExtension(String boardPostFileExtension) {
		this.boardPostFileExtension = boardPostFileExtension;
	}
	public String getBoardPostFileSize() {
		return boardPostFileSize;
	}
	public void setBoardPostFileSize(String boardPostFileSize) {
		this.boardPostFileSize = boardPostFileSize;
	}
	public String getBoardPostFileRegDate() {
		return boardPostFileRegDate;
	}
	public void setBoardPostFileRegDate(String boardPostFileRegDate) {
		this.boardPostFileRegDate = boardPostFileRegDate;
	}
	public String getBoardPostFileUse() {
		return boardPostFileUse;
	}
	public void setBoardPostFileUse(String boardPostFileUse) {
		this.boardPostFileUse = boardPostFileUse;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BoardPostFile [boardPostFileCode=");
		builder.append(boardPostFileCode);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", boardQuestionCode=");
		builder.append(boardQuestionCode);
		builder.append(", boardPostFileName=");
		builder.append(boardPostFileName);
		builder.append(", boardPostFileExtension=");
		builder.append(boardPostFileExtension);
		builder.append(", boardPostFileSize=");
		builder.append(boardPostFileSize);
		builder.append(", boardPostFileRegDate=");
		builder.append(boardPostFileRegDate);
		builder.append(", boardPostFileUse=");
		builder.append(boardPostFileUse);
		builder.append("]");
		return builder.toString();
	}

}
