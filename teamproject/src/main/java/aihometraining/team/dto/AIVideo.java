package aihometraining.team.dto;

import java.util.List;

public class AIVideo {
	
	private String fileIdx;
	private String memberEmail;
	private String AIeVideoRegDate;
	private String memberUpdateEmail;
	private String AIeVideoUpdateDate;
	private String AIeVideoTitle;
	
	private List<FileDto> fileList;

	
	
	public String getFileIdx() {
		return fileIdx;
	}

	public void setFileIdx(String fileIdx) {
		this.fileIdx = fileIdx;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getAIeVideoRegDate() {
		return AIeVideoRegDate;
	}

	public void setAIeVideoRegDate(String aIeVideoRegDate) {
		AIeVideoRegDate = aIeVideoRegDate;
	}

	public String getMemberUpdateEmail() {
		return memberUpdateEmail;
	}

	public void setMemberUpdateEmail(String memberUpdateEmail) {
		this.memberUpdateEmail = memberUpdateEmail;
	}

	public String getAIeVideoUpdateDate() {
		return AIeVideoUpdateDate;
	}

	public void setAIeVideoUpdateDate(String aIeVideoUpdateDate) {
		AIeVideoUpdateDate = aIeVideoUpdateDate;
	}

	public String getAIeVideoTitle() {
		return AIeVideoTitle;
	}

	public void setAIeVideoTitle(String aIeVideoTitle) {
		AIeVideoTitle = aIeVideoTitle;
	}

	public List<FileDto> getFileList() {
		return fileList;
	}

	public void setFileList(List<FileDto> fileList) {
		this.fileList = fileList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aivideo [fileIdx=");
		builder.append(fileIdx);
		builder.append(", memberEmail=");
		builder.append(memberEmail);
		builder.append(", AIeVideoRegDate=");
		builder.append(AIeVideoRegDate);
		builder.append(", memberUpdateEmail=");
		builder.append(memberUpdateEmail);
		builder.append(", AIeVideoUpdateDate=");
		builder.append(AIeVideoUpdateDate);
		builder.append(", AIeVideoTitle=");
		builder.append(AIeVideoTitle);
		builder.append(", fileList=");
		builder.append(fileList);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
