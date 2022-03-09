//하샤드 수
function solution(x) {
    var answer = true;
    let cpx = x;
    let sum = 0;
    while(cpx!=0){
        sum += cpx%10;
        cpx = +(c(px/10).toFixed(0));
    }
    if(x%sum!=0){
        answer = false
    }
    return answer;
}