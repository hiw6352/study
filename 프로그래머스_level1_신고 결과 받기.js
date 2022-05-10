function solution(id_list, report, k) {
    var answer = [];
    let reportFromUser = new Map();
    let reportCnt = new Map();
    let reportToUser = new Map();
    let reports = [... new Set(report)].map(a=>{return a.split(' ')})
    
    for(const fromUser of reports){
        reportFromUser.set(fromUser[1],reportFromUser.get(fromUser[1])+1||1)
    }
    for(const count of reports){
        if(reportFromUser.get(count[1]) >= k){
            reportToUser.set(count[0],reportToUser.get(count[0])+1||1)
        }
    }
    answer = [...id_list].map(a=>{return reportToUser.get(a)||0})
    return answer;
}
