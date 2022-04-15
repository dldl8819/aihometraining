package aihometraining.team.dto;

import java.sql.Date;

public class EClassSectionCurriculum {
	private String eClassSectionCurriculumCode;
	private String memberEmail;
	private String eClassSectionTitleCode;
	private String eClassSectionCurriculumTitle;
	private String eClassSectionCurriculumAddFile;
	private String eClassSectionCurriculumRunningTime;
	private Date eClassSectionCurriculumRegDate;
	private Date eClassSectionCurriculumUpdateDate;
	private String memberUpdateEmail;
	private String eClassSectionCurriculumState;
	
	private EClassSectionTitle eClassSectionTitle;
	
	public EClassSectionTitle geteClassSectionTitle() {
		return eClassSectionTitle;
	}
	public void seteClassSectionTitle(EClassSectionTitle eClassSectionTitle) {
		this.eClassSectionTitle = eClassSectionTitle;
	}
	
	public String geteClassSectionCurriculumCode() {
		return eClassSectionCurriculumCode;
	}
	public void seteClassSectionCurriculumCode(String eClassSectionCurriculumCode) {
		this.eClassSectionCurriculumCode = eClassSectionCurriculumCode;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String geteClassSectionTitleCode() {
		return eClassSectionTitleCode;
	}
	public void seteClassSectionTitleCode(String eClassSectionTitleCode) {
		this.eClassSectionTitleCode = eClassSectionTitleCode;
	}
	public String geteClassSectionCurriculumTitle() {
		return eClassSectionCurriculumTitle;
	}
	public void seteClassSectionCurriculumTitle(String eClassSectionCurriculumTitle) {
		this.eClassSectionCurriculumTitle = eClassSectionCurriculumTitle;
	}
	public String geteClassSectionCurriculumAddFile() {
		return eClassSectionCurriculumAddFile;
	}
	public void seteClassSectionCurriculumAddFile(String eClassSectionCurriculumAddFile) {
		this.eClassSectionCurriculumAddFile = eClassSectionCurriculumAddFile;
	}
	public String geteClassSectionCurriculumRunningTime() {
		return eClassSectionCurriculumRunningTime;
	}
	public void seteClassSectionCurriculumRunningTime(String eClassSectionCurriculumRunningTime) {
		this.eClassSectionCurriculumRunningTime = eClassSectionCurriculumRunningTime;
	}
	public Date geteClassSectionCurriculumRegDate() {
		return eClassSectionCurriculumRegDate;
	}
	public void seteClassSectionCurriculumRegDate(Date eClassSectionCurriculumRegDate) {
		this.eClassSectionCurriculumRegDate = eClassSectionCurriculumRegDate;
	}
	public Date geteClassSectionCurriculumUpdateDate() {
		return eClassSectionCurriculumUpdateDate;
	}
	public void seteClassSectionCurriculumUpdateDate(Date eClassSectionCurriculumUpdateDate) {
		this.eClassSectionCurriculumUpdateDate = eClassSectionCurriculumUpdateDate;
	}
	public String getMemberUpdateEmail() {
		return memberUpdateEmail;
	}
	public void setMemberUpdateEmail(String memberUpdateEmail) {
		this.memberUpdateEmail = memberUpdateEmail;
	}
	public String geteClassSectionCurriculumState() {
		return eClassSectionCurriculumState;
	}
	public void seteClassSectionCurriculumState(String eClassSectionCurriculumState) {
		this.eClassSectionCurriculumState = eClassSectionCurriculumState;
	}
	@Override
	public String toString() {
		return "EClassSectionCurriculum [eClassSectionCurriculumCode=" + eClassSectionCurriculumCode + ", memberEmail="
				+ memberEmail + ", eClassSectionTitleCode=" + eClassSectionTitleCode + ", eClassSectionCurriculumTitle="
				+ eClassSectionCurriculumTitle + ", eClassSectionCurriculumAddFile=" + eClassSectionCurriculumAddFile
				+ ", eClassSectionCurriculumRunningTime=" + eClassSectionCurriculumRunningTime
				+ ", eClassSectionCurriculumRegDate=" + eClassSectionCurriculumRegDate
				+ ", eClassSectionCurriculumUpdateDate=" + eClassSectionCurriculumUpdateDate + ", memberUpdateEmail="
				+ memberUpdateEmail + ", eClassSectionCurriculumState=" + eClassSectionCurriculumState + "]";
	}

}
