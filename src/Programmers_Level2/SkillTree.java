package Programmers_Level2;
//스킬트리
public class SkillTree {

	public static void main(String[] args) {
		String skill = "CBD";
		String skill_trees[] = {"BACDE", "CBADF", "AECB", "BDA"};
		int result= solution(skill, skill_trees);
		System.out.println("결과 : " + result);
	}

	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;
		int containIdx[] = new int[skill.length()];
		boolean flag[] = new boolean[skill_trees.length];
		
		for(int i = 0; i<flag.length; i++) {
			//-1로 초기화
			flag[i] = true;
		}
		
		for(int i = 0; i<skill_trees.length; i++) {
			for(int r = 0; r<containIdx.length; r++) {
				//-1로 초기화
				containIdx[r] = -1;
			}
			
			for(int j = 0; j<skill.length(); j++) {
				for(int k = 0; k<skill_trees[i].length(); k++) {
					if(skill_trees[i].charAt(k)==skill.charAt(j)) {
						containIdx[j] = k;
					}
				}
			}
			
			for(int l = 0; l<containIdx.length-1; l++) {
				if(containIdx[l]!=-1) {
					
					if(containIdx[l+1]==-1) {
						flag[i] = true;
					}
					else if(containIdx[l]>=containIdx[l+1]) {
						flag[i] = false;
					}
					
				}else {
					if(containIdx[l+1]!=-1) {
						flag[i] = false;
					}
				}
				
			}
			for(int q = 0; q<containIdx.length; q++) {
				System.out.print(containIdx[q] + " ");
			}
			System.out.println("\n-----");
		}
		
		for(int i = 0; i<flag.length; i++) {
			System.out.println(flag[i]);
			if(flag[i]==true) {
				answer++;
			}
		}
		return answer;
	}
}
