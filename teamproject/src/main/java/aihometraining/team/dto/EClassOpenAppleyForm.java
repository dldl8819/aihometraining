package aihometraining.team.dto;

import java.sql.Date;

public class EClassOpenAppleyForm {
	private String 	eClassOpenAppleyCode;
	private String 	eClassOpenAppleyMemberEmail;
	private String 	eClassOpenAppleyName;
	private int 	eClassOpenAppleyPrice;
	private String	eClassIntroduceCode;
	private String	eClassSectionTitleCode;
	private String	eClassSectionCurriculumCode;
	private String	eClassQuestionCode;
	private String	eClassAnswerCode;
	private int		eClassOpenAppleySetDate;
	private Date	eClassOpenAppleyStratDate;
	private Date	eClassOpenAppleyEndDate;
	private int		eClassOpenAppleyStudent;
	private int		eClassOpenAppleyMaxStudent;
	private Date	eClassOpenAppleyDate;
	private int 	eClassOpenAppleyApproveState;
	private String	eClassCategorySmallCode;
	
	private EClassIntroduce eClassIntroduce;
	private EClassSectionTitle eClassSectionTitle;
	private EClassSectionCurriculum eClassSectionCurriculum;
	private EClassQuestion eClassQuestion;
	private EClassAnswer eClassAnswer;
	
	public String geteClassOpenAppleyCode() {
		return eClassOpenAppleyCode;
	}
	public void seteClassOpenAppleyCode(String eClassOpenAppleyCode) {
		this.eClassOpenAppleyCode = eClassOpenAppleyCode;
	}
	public String geteClassOpenAppleyMemberEmail() {
		return eClassOpenAppleyMemberEmail;
	}
	public void seteClassOpenAppleyMemberEmail(String eClassOpenAppleyMemberEmail) {
		this.eClassOpenAppleyMemberEmail = eClassOpenAppleyMemberEmail;
	}
	public String geteClassOpenAppleyName() {
		return eClassOpenAppleyName;
	}
	public void seteClassOpenAppleyName(String eClassOpenAppleyName) {
		this.eClassOpenAppleyName = eClassOpenAppleyName;
	}
	public int geteClassOpenAppleyPrice() {
		return eClassOpenAppleyPrice;
	}
	public void seteClassOpenAppleyPrice(int eClassOpenAppleyPrice) {
		this.eClassOpenAppleyPrice = eClassOpenAppleyPrice;
	}
	public String geteClassIntroduceCode() {
		return eClassIntroduceCode;
	}
	public void seteClassIntroduceCode(String eClassIntroduceCode) {
		this.eClassIntroduceCode = eClassIntroduceCode;
	}
	public String geteClassSectionTitleCode() {
		return eClassSectionTitleCode;
	}
	public void seteClassSectionTitleCode(String eClassSectionTitleCode) {
		this.eClassSectionTitleCode = eClassSectionTitleCode;
	}
	public String geteClassSectionCurriculumCode() {
		return eClassSectionCurriculumCode;
	}
	public void seteClassSectionCurriculumCode(String eClassSectionCurriculumCode) {
		this.eClassSectionCurriculumCode = eClassSectionCurriculumCode;
	}
	public String geteClassQuestionCode() {
		return eClassQuestionCode;
	}
	public void seteClassQuestionCode(String eClassQuestionCode) {
		this.eClassQuestionCode = eClassQuestionCode;
	}
	public String geteClassAnswerCode() {
		return eClassAnswerCode;
	}
	public void seteClassAnswerCode(String eClassAnswerCode) {
		this.eClassAnswerCode = eClassAnswerCode;
	}
	public int geteClassOpenAppleySetDate() {
		return eClassOpenAppleySetDate;
	}
	public void seteClassOpenAppleySetDate(int eClassOpenAppleySetDate) {
		this.eClassOpenAppleySetDate = eClassOpenAppleySetDate;
	}
	public Date geteClassOpenAppleyStratDate() {
		return eClassOpenAppleyStratDate;
	}
	public void seteClassOpenAppleyStratDate(Date eClassOpenAppleyStratDate) {
		this.eClassOpenAppleyStratDate = eClassOpenAppleyStratDate;
	}
	public Date geteClassOpenAppleyEndDate() {
		return eClassOpenAppleyEndDate;
	}
	public void seteClassOpenAppleyEndDate(Date eClassOpenAppleyEndDate) {
		this.eClassOpenAppleyEndDate = eClassOpenAppleyEndDate;
	}
	public int geteClassOpenAppleyStudent() {
		return eClassOpenAppleyStudent;
	}
	public void seteClassOpenAppleyStudent(int eClassOpenAppleyStudent) {
		this.eClassOpenAppleyStudent = eClassOpenAppleyStudent;
	}
	public int geteClassOpenAppleyMaxStudent() {
		return eClassOpenAppleyMaxStudent;
	}
	public void seteClassOpenAppleyMaxStudent(int eClassOpenAppleyMaxStudent) {
		this.eClassOpenAppleyMaxStudent = eClassOpenAppleyMaxStudent;
	}
	public Date geteClassOpenAppleyDate() {
		return eClassOpenAppleyDate;
	}
	public void seteClassOpenAppleyDate(Date eClassOpenAppleyDate) {
		this.eClassOpenAppleyDate = eClassOpenAppleyDate;
	}
	public int geteClassOpenAppleyApproveState() {
		return eClassOpenAppleyApproveState;
	}
	public void seteClassOpenAppleyApproveState(int eClassOpenAppleyApproveState) {
		this.eClassOpenAppleyApproveState = eClassOpenAppleyApproveState;
	}
	public String geteClassCategorySmallCode() {
		return eClassCategorySmallCode;
	}
	public void seteClassCategorySmallCode(String eClassCategorySmallCode) {
		this.eClassCategorySmallCode = eClassCategorySmallCode;
	}
	public EClassIntroduce geteClassIntroduce() {
		return eClassIntroduce;
	}
	public void seteClassIntroduce(EClassIntroduce eClassIntroduce) {
		this.eClassIntroduce = eClassIntroduce;
	}
	public EClassSectionTitle geteClassSectionTitle() {
		return eClassSectionTitle;
	}
	public void seteClassSectionTitle(EClassSectionTitle eClassSectionTitle) {
		this.eClassSectionTitle = eClassSectionTitle;
	}
	public EClassSectionCurriculum geteClassSectionCurriculum() {
		return eClassSectionCurriculum;
	}
	public void seteClassSectionCurriculum(EClassSectionCurriculum eClassSectionCurriculum) {
		this.eClassSectionCurriculum = eClassSectionCurriculum;
	}
	public EClassQuestion geteClassQuestion() {
		return eClassQuestion;
	}
	public void seteClassQuestion(EClassQuestion eClassQuestion) {
		this.eClassQuestion = eClassQuestion;
	}
	public EClassAnswer geteClassAnswer() {
		return eClassAnswer;
	}
	public void seteClassAnswer(EClassAnswer eClassAnswer) {
		this.eClassAnswer = eClassAnswer;
	}
	@Override
	public String toString() {
		return "EClassOpenAppleyForm [eClassOpenAppleyCode=" + eClassOpenAppleyCode + ", eClassOpenAppleyMemberEmail="
				+ eClassOpenAppleyMemberEmail + ", eClassOpenAppleyName=" + eClassOpenAppleyName
				+ ", eClassOpenAppleyPrice=" + eClassOpenAppleyPrice + ", eClassIntroduceCode=" + eClassIntroduceCode
				+ ", eClassSectionTitleCode=" + eClassSectionTitleCode + ", eClassSectionCurriculumCode="
				+ eClassSectionCurriculumCode + ", eClassQuestionCode=" + eClassQuestionCode + ", eClassAnswerCode="
				+ eClassAnswerCode + ", eClassOpenAppleySetDate=" + eClassOpenAppleySetDate
				+ ", eClassOpenAppleyStratDate=" + eClassOpenAppleyStratDate + ", eClassOpenAppleyEndDate="
				+ eClassOpenAppleyEndDate + ", eClassOpenAppleyStudent=" + eClassOpenAppleyStudent
				+ ", eClassOpenAppleyMaxStudent=" + eClassOpenAppleyMaxStudent + ", eClassOpenAppleyDate="
				+ eClassOpenAppleyDate + ", eClassOpenAppleyApproveState=" + eClassOpenAppleyApproveState
				+ ", eClassCategorySmallCode=" + eClassCategorySmallCode + ", eClassIntroduce=" + eClassIntroduce
				+ ", eClassSectionTitle=" + eClassSectionTitle + ", eClassSectionCurriculum=" + eClassSectionCurriculum
				+ ", eClassQuestion=" + eClassQuestion + ", eClassAnswer=" + eClassAnswer + "]";
	}
	
	
}
