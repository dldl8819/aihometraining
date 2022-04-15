package aihometraining.team.dto;

import java.util.List;

public class EClassCategoryLarge {
	
	/*
	 *  eClassCategoryLargeCode
	 *  , eClassCategoryLargeName
	 *  , eClassCategoryLargeRegEmail
	 *  , eClassCategoryLargeRegDate
	 *  , eClassCategoryLargeUpdateDate
	 *  , eClassCategoryLargeUpdateEmail
	 * */
	private String eClassCategoryLargeCode;
	private String eClassCategoryLargeName;
	private String eClassCategoryLargeRegEmail;
	private String eClassCategoryLargeRegDate;
	private String eClassCategoryLargeUpdateDate;
	private String eClassCategoryLargeUpdateEmail;
	
	private List<EClassCategoryMedium> eClassCategoryMediumList;
	
	public String geteClassCategoryLargeCode() {
		return eClassCategoryLargeCode;
	}

	public void seteClassCategoryLargeCode(String eClassCategoryLargeCode) {
		this.eClassCategoryLargeCode = eClassCategoryLargeCode;
	}

	public String geteClassCategoryLargeName() {
		return eClassCategoryLargeName;
	}

	public void seteClassCategoryLargeName(String eClassCategoryLargeName) {
		this.eClassCategoryLargeName = eClassCategoryLargeName;
	}

	public String geteClassCategoryLargeRegEmail() {
		return eClassCategoryLargeRegEmail;
	}

	public void seteClassCategoryLargeRegEmail(String eClassCategoryLargeRegEmail) {
		this.eClassCategoryLargeRegEmail = eClassCategoryLargeRegEmail;
	}

	public String geteClassCategoryLargeRegDate() {
		return eClassCategoryLargeRegDate;
	}

	public void seteClassCategoryLargeRegDate(String eClassCategoryLargeRegDate) {
		this.eClassCategoryLargeRegDate = eClassCategoryLargeRegDate;
	}

	public String geteClassCategoryLargeUpdateDate() {
		return eClassCategoryLargeUpdateDate;
	}

	public void seteClassCategoryLargeUpdateDate(String eClassCategoryLargeUpdateDate) {
		this.eClassCategoryLargeUpdateDate = eClassCategoryLargeUpdateDate;
	}

	public String geteClassCategoryLargeUpdateEmail() {
		return eClassCategoryLargeUpdateEmail;
	}

	public void seteClassCategoryLargeUpdateEmail(String eClassCategoryLargeUpdateEmail) {
		this.eClassCategoryLargeUpdateEmail = eClassCategoryLargeUpdateEmail;
	}

	public List<EClassCategoryMedium> geteClassCategoryMediumList() {
		return eClassCategoryMediumList;
	}

	public void seteClassCategoryMediumList(List<EClassCategoryMedium> eClassCategoryMediumList) {
		this.eClassCategoryMediumList = eClassCategoryMediumList;
	}



	@Override
	public String toString() {
		return "EClassCategoryLarge [eClassCategoryLargeCode=" + eClassCategoryLargeCode + ", eClassCategoryLargeName="
				+ eClassCategoryLargeName + ", eClassCategoryLargeRegEmail=" + eClassCategoryLargeRegEmail
				+ ", eClassCategoryLargeRegDate=" + eClassCategoryLargeRegDate + ", eClassCategoryLargeUpdateDate="
				+ eClassCategoryLargeUpdateDate + ", eClassCategoryLargeUpdateEmail=" + eClassCategoryLargeUpdateEmail
				+ ", eClassCategoryMediumList=" + eClassCategoryMediumList + "]";
	}
	
	
	
}
