package aihometraining.team.dto;

import java.sql.Date;

public class EClassAnswer {
	private String eClassAnswerCode;
	private String eClassQuestionCode;
	private String memberEmail;
	private String eClassAnsweTitle;
	private Date eClassAnswerRegDate;
	private String memberUpdateEmail;
	private Date eClassAnswerUpdateDate;
	
	private EClassQuestion eClassQuestion;
	
	public EClassQuestion geteClassQuestion() {
		return eClassQuestion;
	}
	public void seteClassQuestion(EClassQuestion eClassQuestion) {
		this.eClassQuestion = eClassQuestion;
	}
	
	public String geteClassAnswerCode() {
		return eClassAnswerCode;
	}
	public void seteClassAnswerCode(String eClassAnswerCode) {
		this.eClassAnswerCode = eClassAnswerCode;
	}
	public String geteClassQuestionCode() {
		return eClassQuestionCode;
	}
	public void seteClassQuestionCode(String eClassQuestionCode) {
		this.eClassQuestionCode = eClassQuestionCode;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String geteClassAnsweTitle() {
		return eClassAnsweTitle;
	}
	public void seteClassAnsweTitle(String eClassAnsweTitle) {
		this.eClassAnsweTitle = eClassAnsweTitle;
	}
	public Date geteClassAnswerRegDate() {
		return eClassAnswerRegDate;
	}
	public void seteClassAnswerRegDate(Date eClassAnswerRegDate) {
		this.eClassAnswerRegDate = eClassAnswerRegDate;
	}
	public String getMemberUpdateEmail() {
		return memberUpdateEmail;
	}
	public void setMemberUpdateEmail(String memberUpdateEmail) {
		this.memberUpdateEmail = memberUpdateEmail;
	}
	public Date geteClassAnswerUpdateDate() {
		return eClassAnswerUpdateDate;
	}
	public void seteClassAnswerUpdateDate(Date eClassAnswerUpdateDate) {
		this.eClassAnswerUpdateDate = eClassAnswerUpdateDate;
	}
	@Override
	public String toString() {
		return "EClassAnswer [eClassAnswerCode=" + eClassAnswerCode + ", eClassQuestionCode=" + eClassQuestionCode
				+ ", memberEmail=" + memberEmail + ", eClassAnsweTitle=" + eClassAnsweTitle + ", eClassAnswerRegDate="
				+ eClassAnswerRegDate + ", memberUpdateEmail=" + memberUpdateEmail + ", eClassAnswerUpdateDate="
				+ eClassAnswerUpdateDate + "]";
	}
	
}
