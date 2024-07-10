//if else if------------------------------------------
function assignGrade(score){
    if (score < 0 || score > 100){
        return "invalid score";   
    }  else if (score >= 90){
        return "Grade A";
    } else if (score >= 80){
        return "Grade B";
    } else if (score >= 70){
        return "Grade C";
    } else if (score >= 60){
        return "Grade D";
    } else if (score >= 50){
        return "Grade E";
    } else {
        return "Grade F";
    }
}

console.log(assignGrade(90));
console.log(assignGrade(80));
console.log(assignGrade(70));       
console.log(assignGrade(60));
console.log(assignGrade(50));
console.log(assignGrade(40));
console.log(assignGrade(-10));
console.log(assignGrade(110));

