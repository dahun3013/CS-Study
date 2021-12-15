//각 변수의 자료가 그대로 남음 비파괴적 처리 
       const a='안녕';
       const b='하세요';
       const c=a + b;
       console.log(c);
       console.log(a); 
       console.log(b);

       //원래는 3개 요소의 배열인데 push()로 4개요소 배열로 바뀜 
       //원래 3개요소는 파괴해 버리고 파괴적 처리 
       const arr=[ '사과','배','바나나' ];
       arr.push('귤');
       console.log(arr);
