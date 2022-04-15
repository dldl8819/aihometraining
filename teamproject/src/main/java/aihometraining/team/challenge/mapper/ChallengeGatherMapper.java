package aihometraining.team.challenge.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.ChallengeCategory;
import aihometraining.team.dto.ChallengeGather;
import aihometraining.team.dto.ChallengeGatherPlan;
import aihometraining.team.dto.ChallengeSetting;

@Mapper
public interface ChallengeGatherMapper {
	//모집 챌린지 조회
	public List<ChallengeGather> getChallengeGatherList();
	
	//모집 챌린지 세부내용 조회(모집챌린지와 모집챌린지계획 조회)
	public List<ChallengeGatherPlan> getGatherDatail(String challengeGatherCode);
	
	//챌린지 카테고리 조회
	public List<ChallengeCategory> getChallengeCate();
	
	//챌린지 세팅 조회
	public List<ChallengeSetting> getChallengeSetting();
	
	//챌린지 모집 등록처리
	public int challengeGatherInsert(ChallengeGather challengeGather);
		
	//챌린지 모집 계획 등록처리
	public void challengeGatherPlanInsert(ChallengeGatherPlan challengeGatherPlan);
	
	////챌린지 개설자 가져오기
	public String getChallengeMaker(String memberEmail);
}
