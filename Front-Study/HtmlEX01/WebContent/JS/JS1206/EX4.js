//익명함수 생성하기
    const f1 = function(){
        console.log('함수 내부 코드임....1');
        console.log('함수 내부 코드임....2');
        console.log('함수 내부 코드임....3');
        console.log('함수 내부 코드임....4');
        console.log('함수 내부 코드임....5');
    }
    f1(); //함수 호출, 함수 사용하기 
    f1(); //함수 호출
    //자료형의 타입보기
    console.log(typeof(f1) );
    console.log(f1);//함수의 내용보기

    console.log(alert);//내장함수 연결하지 않아도 사용할 수 있는 함수 
    console.log(prompt);//자바스크립트 내장함수는 소스가 안보인다. 
    console.log(console.log);
