    "use strict"

var obj = new Object();

// 객체 생성과정
// 1) 빈 객체를 생성한다 .
obj.name = "홍길동";
obj.age = 20;
obj.plus =  function(a, b) {
    console.log(a + b)
};
obj.working = false;

if (obj.age) {
    console.log('age 있다!')
}
  
if (obj.working) {
    console.log('tel 있다!')
}

if (obj.plus) {
    obj.plus(10, 20)
}

if (obj.minus) {
    obj.minus(10,20)
}