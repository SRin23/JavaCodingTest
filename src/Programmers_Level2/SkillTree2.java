package Programmers_Level2;
//스킬트리

public class SkillTree2 {

	public static void main(String[] args) {
		String skill = "CBD";
		String skill_trees[] = {"BACDE", "CBADF", "AECB", "BDA"};
		int result= solution(skill, skill_trees);
		System.out.println("결과 : " + result);
	}

	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;
		boolean check;
		
		for(int i = 0; i<skill_trees.length; i++) {
			check = true;
			int skillNum = 0;
			int idx = 0;
			boolean has = false;
			for(int j = 0; j<(skill_trees[i]).length(); j++) {
				for(int k = 0; k<skill.length(); k++) {
					if(skill_trees[i].charAt(j)==skill.charAt(k)) {
						has = true;
					}
					
				}
				
			}
			if(check) {
				answer++;
			}
		}
		return answer;
	}
}
