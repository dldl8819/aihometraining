package aihometraining.team.diet.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.DietBank;
import aihometraining.team.dto.DietMealLevelList;
import aihometraining.team.dto.DietNutrientList;
import aihometraining.team.dto.DietOnemealConnection;
import aihometraining.team.dto.DietPlan;



@Mapper
public interface DietMapper {
	//식단 은행 생성
	public int insertDietBankList2(String connectEClass, String insertEmail,String newCode);

	//식단 은행 새 코드 불러오기
	public String selectDietBankListNewCode(String tableName, String columName);
	
	//식단 은행 업데이트
	public int updateDietBank(DietOnemealConnection dietOnemealConnection);
	
	//식단 은행 리스트 불러오기
	public List<DietBank> getDietBankListAdmin();

	//식단 은행 리스트 코드로 불러오기
	public DietBank getDietBankListAdminByC(String newCode);

	//식단 은행 리스트 삭제
	public int deleteDietBankList(String dietBankCode);
	
	//식단 은행 리스트 삭제 전 요일별 식단 전부 삭제
	public int deleteDietOneMealConnectionAll(String dietBankCode);
	
	//음식 검색 대분류
	public List<DietMealLevelList> selectDietMealLevelList();
	
	//음식 검색 소분류
	public List<DietMealLevelList> selectDietMealListDetail(String mainMealSort);
	
	//음식 리스트 검색
	public List<DietNutrientList> selectDietNutrientList(String mainMealSort);
	
	//요일별 식단 삽입
	public int insertDietOneMealConnection(DietOnemealConnection dietOnemealConnection);
	
	//요일별 식단 조회
	public List<HashMap<String, Object>> selectDietOneMealConnectionByBankCode(DietOnemealConnection dietOnemealConnection);
	
	//요일별 식단 삭제
	public int deleteDietOneMealConnection(String dietOneMealConnectionCode);	
	
	//User 식단 계획 생성
	public int insertUserDietPlan(DietPlan dietplan);
	
	//User 식단 계획 조회
	public List<HashMap<String, Object>> selectUserDietPlan(DietPlan dietplan);
	
	//User 식단 계획 삭제
	public int deleteUserDietPlan(DietPlan dietplan);
	
	//User 식단 계획 실행(update)
	public int updateUserDietPlan(DietPlan dietplan);
	
}
