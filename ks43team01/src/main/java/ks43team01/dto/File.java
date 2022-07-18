package ks43team01.dto;

public class File {

	private String fileCode;
	private String userIdCode;
	private String fileOriginalName;
	private String fileReName;
	private String fileMainImage;
	private String fileLocation;
	private int fileSize;
	private String fileRegDate;
	private String fileUpdateDate;
	private String fileUse;
	public String getFileCode() {
		return fileCode;
	}
	public void setFileCode(String fileCode) {
		this.fileCode = fileCode;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getFileOriginalName() {
		return fileOriginalName;
	}
	public void setFileOriginalName(String fileOriginalName) {
		this.fileOriginalName = fileOriginalName;
	}
	public String getFileReName() {
		return fileReName;
	}
	public void setFileReName(String fileReName) {
		this.fileReName = fileReName;
	}
	public String getFileMainImage() {
		return fileMainImage;
	}
	public void setFileMainImage(String fileMainImage) {
		this.fileMainImage = fileMainImage;
	}
	public String getFileLocation() {
		return fileLocation;
	}
	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}
	public int getFileSize() {
		return fileSize;
	}
	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileRegDate() {
		return fileRegDate;
	}
	public void setFileRegDate(String fileRegDate) {
		this.fileRegDate = fileRegDate;
	}
	public String getFileUpdateDate() {
		return fileUpdateDate;
	}
	public void setFileUpdateDate(String fileUpdateDate) {
		this.fileUpdateDate = fileUpdateDate;
	}
	public String getFileUse() {
		return fileUse;
	}
	public void setFileUse(String fileUse) {
		this.fileUse = fileUse;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("File [fileCode=");
		builder.append(fileCode);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", fileOriginalName=");
		builder.append(fileOriginalName);
		builder.append(", fileReName=");
		builder.append(fileReName);
		builder.append(", fileMainImage=");
		builder.append(fileMainImage);
		builder.append(", fileLocation=");
		builder.append(fileLocation);
		builder.append(", fileSize=");
		builder.append(fileSize);
		builder.append(", fileRegDate=");
		builder.append(fileRegDate);
		builder.append(", fileUpdateDate=");
		builder.append(fileUpdateDate);
		builder.append(", fileUse=");
		builder.append(fileUse);
		builder.append("]");
		return builder.toString();
	}
	
	
}
