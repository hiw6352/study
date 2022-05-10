function solution(id_list, report, k) {
    var answer = [];
    let reportFromUser = new Map();
    let reportToUser = new Map();
    report.forEach(item=>{
        let targetUser = item.split(' ')[1]
        let user = item.split(' ')[0]
        if(reportFromUser.has(targetUser)){
            reportFromUser.get(targetUser).add(user)
        }else{
            let set = new Set();
            set.add(user)
            reportFromUser.set(targetUser,set)
        }
        
        if(reportToUser.has(user)){
            reportToUser.get(user).add(targetUser)
        }else{
            let set = new Set();
            set.add(targetUser)
            reportToUser.set(user,set)
        }
    })
    id_list.forEach((item)=>{
        let mailCnt = 0;
        if(reportToUser.has(item)){
            reportToUser.get(item).forEach((el)=>{
                if(reportFromUser.get(el).size >= k){
                    mailCnt++;
                }
            })
        }
        answer.push(mailCnt)
    })
    return answer;
}
