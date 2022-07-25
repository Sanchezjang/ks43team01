package ks43team01.dto;

import java.util.List;
import java.util.Map;


public class QnaBoard {
	private String boardQuestionCode;
	private String userIdCode;
	private String boardCategoryCode;
	private String boardLargeCategoryCode;
	private String boardMediumCategoryCode;
	private String boardQuestionTitle;
	private String userName;
	private String boardQuestionContent;
	private String boardQuestionRegDate;
	private String userEmail;
	private String boardQuestionAnswerMethod;
	private String boardQuestionLock;
	private String boardQuestionPw;
	private String boardQuestionUpdateDate;
	private int boardQuestionPageView;
	private String boardQuestionUse;
	
	/*계층형 게시판*/
	private int boardQuestionOriginNo;
	private int boardQuestionGroupOrd;
	
	private BoardCategory boardCategory;
	private BoardLargeCategory boardLargeCategory;
	private BoardMediumCategory boardMediumCategory;
	private BoardAnswer boardAnswer;
	
	private List<Map<String, String>> 	relFileWithQnaBoard;
	private List<File> 				file;
	
	public int getBoardQuestionOriginNo() {
		return boardQuestionOriginNo;
	}
	public void setBoardQuestionOriginNo(int boardQuestionOriginNo) {
		this.boardQuestionOriginNo = boardQuestionOriginNo;
	}
	public int getBoardQuestionGroupOrd() {
		return boardQuestionGroupOrd;
	}
	public void setBoardQuestionGroupOrd(int boardQuestionGroupOrd) {
		this.boardQuestionGroupOrd = boardQuestionGroupOrd;
	}
	public String getBoardQuestionCode() {
		return boardQuestionCode;
	}
	public void setBoardQuestionCode(String boardQuestionCode) {
		this.boardQuestionCode = boardQuestionCode;
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
	public String getBoardLargeCategoryCode() {
		return boardLargeCategoryCode;
	}
	public void setBoardLargeCategoryCode(String boardLargeCategoryCode) {
		this.boardLargeCategoryCode = boardLargeCategoryCode;
	}
	public String getBoardMediumCategoryCode() {
		return boardMediumCategoryCode;
	}
	public void setBoardMediumCategoryCode(String boardMediumCategoryCode) {
		this.boardMediumCategoryCode = boardMediumCategoryCode;
	}
	public String getBoardQuestionTitle() {
		return boardQuestionTitle;
	}
	public void setBoardQuestionTitle(String boardQuestionTitle) {
		this.boardQuestionTitle = boardQuestionTitle;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getBoardQuestionContent() {
		return boardQuestionContent;
	}
	public void setBoardQuestionContent(String boardQuestionContent) {
		this.boardQuestionContent = boardQuestionContent;
	}
	public String getBoardQuestionRegDate() {
		return boardQuestionRegDate;
	}
	public void setBoardQuestionRegDate(String boardQuestionRegDate) {
		this.boardQuestionRegDate = boardQuestionRegDate;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getBoardQuestionAnswerMethod() {
		return boardQuestionAnswerMethod;
	}
	public void setBoardQuestionAnswerMethod(String boardQuestionAnswerMethod) {
		this.boardQuestionAnswerMethod = boardQuestionAnswerMethod;
	}
	public String getBoardQuestionLock() {
		return boardQuestionLock;
	}
	public void setBoardQuestionLock(String boardQuestionLock) {
		this.boardQuestionLock = boardQuestionLock;
	}
	public String getBoardQuestionPw() {
		return boardQuestionPw;
	}
	public void setBoardQuestionPw(String boardQuestionPw) {
		this.boardQuestionPw = boardQuestionPw;
	}
	public String getBoardQuestionUpdateDate() {
		return boardQuestionUpdateDate;
	}
	public void setBoardQuestionUpdateDate(String boardQuestionUpdateDate) {
		this.boardQuestionUpdateDate = boardQuestionUpdateDate;
	}
	public int getBoardQuestionPageView() {
		return boardQuestionPageView;
	}
	public void setBoardQuestionPageView(int boardQuestionPageView) {
		this.boardQuestionPageView = boardQuestionPageView;
	}
	public String getBoardQuestionUse() {
		return boardQuestionUse;
	}
	public void setBoardQuestionUse(String boardQuestionUse) {
		this.boardQuestionUse = boardQuestionUse;
	}
	public BoardCategory getBoardCategory() {
		return boardCategory;
	}
	public void setBoardCategory(BoardCategory boardCategory) {
		this.boardCategory = boardCategory;
	}
	public BoardLargeCategory getBoardLargeCategory() {
		return boardLargeCategory;
	}
	public void setBoardLargeCategory(BoardLargeCategory boardLargeCategory) {
		this.boardLargeCategory = boardLargeCategory;
	}
	public BoardMediumCategory getBoardMediumCategory() {
		return boardMediumCategory;
	}
	public void setBoardMediumCategory(BoardMediumCategory boardMediumCategory) {
		this.boardMediumCategory = boardMediumCategory;
	}
	public BoardAnswer getBoardAnswer() {
		return boardAnswer;
	}
	public void setBoardAnswer(BoardAnswer boardAnswer) {
		this.boardAnswer = boardAnswer;
	}
	public List<Map<String, String>> getRelFileWithQnaBoard() {
		return relFileWithQnaBoard;
	}
	public void setRelFileWithQnaBoard(List<Map<String, String>> relFileWithQnaBoard) {
		this.relFileWithQnaBoard = relFileWithQnaBoard;
	}
	public List<File> getFile() {
		return file;
	}
	public void setFile(List<File> file) {
		this.file = file;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("QnaBoard [boardQuestionCode=");
		builder.append(boardQuestionCode);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", boardCategoryCode=");
		builder.append(boardCategoryCode);
		builder.append(", boardLargeCategoryCode=");
		builder.append(boardLargeCategoryCode);
		builder.append(", boardMediumCategoryCode=");
		builder.append(boardMediumCategoryCode);
		builder.append(", boardQuestionTitle=");
		builder.append(boardQuestionTitle);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", boardQuestionContent=");
		builder.append(boardQuestionContent);
		builder.append(", boardQuestionRegDate=");
		builder.append(boardQuestionRegDate);
		builder.append(", userEmail=");
		builder.append(userEmail);
		builder.append(", boardQuestionAnswerMethod=");
		builder.append(boardQuestionAnswerMethod);
		builder.append(", boardQuestionLock=");
		builder.append(boardQuestionLock);
		builder.append(", boardQuestionPw=");
		builder.append(boardQuestionPw);
		builder.append(", boardQuestionUpdateDate=");
		builder.append(boardQuestionUpdateDate);
		builder.append(", boardQuestionPageView=");
		builder.append(boardQuestionPageView);
		builder.append(", boardQuestionUse=");
		builder.append(boardQuestionUse);
		builder.append(", boardQuestionOriginNo=");
		builder.append(boardQuestionOriginNo);
		builder.append(", boardQuestionGroupOrd=");
		builder.append(boardQuestionGroupOrd);
		builder.append(", boardCategory=");
		builder.append(boardCategory);
		builder.append(", boardLargeCategory=");
		builder.append(boardLargeCategory);
		builder.append(", boardMediumCategory=");
		builder.append(boardMediumCategory);
		builder.append(", boardAnswer=");
		builder.append(boardAnswer);
		builder.append(", relFileWithQnaBoard=");
		builder.append(relFileWithQnaBoard);
		builder.append(", file=");
		builder.append(file);
		builder.append("]");
		return builder.toString();
	}
	

	
	

}
