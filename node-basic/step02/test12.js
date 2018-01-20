"use strict"
// 함수 - 내장변수 arguments

function play(a, b, fn) {
    fn(a, b); 
}

play(10, 20, function plus(a, b) {console.log(a, '+', b, '=', a + b)})

play(200 , 150, function minus(a, b) {console.log(a, '-', b, '=', a - b)})

try {
plus(15, 25) 

} catch (err) {
    console.log(err)
}

play(10, 20, function plus(a, b) {
    console.log(a, '+', b, '=', a + b)
});

play(200 , 150, function minus(a, b) {
    console.log(a, '-', b, '=', a - b)
});