//variables

//var let const

// let msg; //declaration and initialization
// msg = "Hello World";  // assignment
// console.log(msg);

// let a= 12;
// let b = 13;
// let c = 34;
// console.log(a,b,c);

// const user = "Bulbul";
// // user = "rahul"; //will show error because you cannot reassign const again
// console.log(user)

// let address = "Bangalore";
// address = "banaras";
// console.log(address);

if(5>3){
    console.log("5 is greater than 3");
    let add = "Goa"; 
    var city = "lucknow";
    // console.log(add); //scope of let is only inside if
    // console.log(city);
} 

// console.log(add); // will throw error because its outside function block scope
//var is global, can be defined and called anywhere, not restrained to any block scope
console.log(city);

