// var a = document.getElementById("main");
// console.log(a);
// console.dir(a);

// var b = document.getElementsByClassName("list-items");
// console.log(b);

// var b = document.querySelectorAll(".list-items");
// console.log(b);

//modifying dom elements
// var a = document.getElementById("main");
// a.innerHTML = "<h2>Employees Names</h2>";
// // a.innerText = "<h2>Employees Names</h2>";
// // a.style.color = "pink";
// // a.style.backgroundColor = "green";
// console.log(a);

//creating DOM Elements
var a1 = document.querySelector("ul");
var a2 = document.createElement("li");

a1.append(a2);
a2.innerHTML = "Rajeev";
a2.style.color = "blue";
a2.setAttribute("class", "list-items");
a2.getAttribute("class");
a2.className = "list1";
a2.id = "id1";
// // a2.removeAttribute("class");

//replacing element
// n1 = document.querySelector('h3');
// n1.id = "id2";
// n1.className = "class2";
// n2 = document.createTextNode(" Saeem");
// n1.appendChild(n2);

// n3 = document.createTextNode(" Sushmita");
// n2.replaceWith(n3);


// console.log(n3);

//removing dom element
a2.remove();






