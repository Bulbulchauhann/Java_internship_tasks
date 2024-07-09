{
let ownName;
} //curly braces defined its scope, can't be accessed out this block {}
function print() {
    var myName = "Bulbul";
    ownName = "Pooja";
    console.log(myName);
}

// console.log(myName); //cannot be called outside the function

console.log(ownName); //will be undefined because initialized outside the function, but declared inside the function.


export let nameNew = "Rahul";
export var nameNew1 = "Pooja";
//ES6 feature -  export and import
//type = "module" in src script
