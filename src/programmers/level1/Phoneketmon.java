package programmers.level1;

//폰켓몬
class Phoneketmon {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i<nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    nums[j] = 0;
                }
            }
        }
        int cnt = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=0){
                cnt++;
            }
        }
        if(cnt>(nums.length/2)){
            answer = (nums.length/2);
        }else{
            answer = cnt;
        }
        return answer;
    }
}