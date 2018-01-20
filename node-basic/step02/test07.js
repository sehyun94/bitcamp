"use strict"

function generator(op) {
    if (op == "+") {
        return function(a, b) {return a + b};
    } else if (op == "-") {
        return function(a, b) {return a - b};
    }
}

var plus = generator("+")
console.log(plus(20, 10))

var minus = generator("-")
console.log(minus(50, 40))

