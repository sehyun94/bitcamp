"use strict"
// 함수 - arrow function

//) 1) 일반 함수
function f1() {
    console.log("f1()........................")
};

// 2) 익명함수
var f2 = function() {
    console.log("f2().........")
} 

// 3) 애로우 함수 = 람다 함수
var f3 = () => {
    console.log("f3().....................")
};

f1()
f2()
f3()
console.log("-----------------------------")


function play(a, b, fn) {
    fn(a, b); 
}

play(10, 20, (a, b) => {
    console.log(a, '+', b, '=', a + b)
});

play(200 , 150, (a, b) => {
    console.log(a, '-', b, '=', a - b)
});


 