var date = new Date();
console.log(date.getFullYear()+"년"+date.getMonth()+"월"+date.getDate()
+"일 지금 시간은"+ date.getHours()+"시"+date.getMinutes()+"분"+date.getSeconds()+"초 입니다.");
if(12 > date.getHours())
console.log("오전입니다");
else
console.log("오후입니다");

