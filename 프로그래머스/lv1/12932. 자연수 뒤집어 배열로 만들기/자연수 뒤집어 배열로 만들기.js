function solution(n) {
    let arr = n.toString().split('');
    let answer = [];

    for(let i=arr.length-1; i>=0; i--){
        answer.push(parseInt(arr[i]));
    }

    return answer;
}