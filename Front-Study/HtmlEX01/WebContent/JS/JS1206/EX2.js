const itemE = ['사과','배','바나나','귤', '귤'];
      //filter()
      //귤이 아닌 것만 필터링 검색하기
      let f  =  itemE.filter(  ( item ) => item !== '귤' );
      //itemE  배열의 각 요소들을 1개씩 item변수에 넣어서 화살표함수로
      //item !== 귤과 비교해서 참이면 필터 f에 담고 false이면 필터f에 안 담아 준다.

      console.log( f );
      let f1  =  itemE.filter(  ( item ) => item === '귤' );
      console.log( f1 );

      //배열의 특정(중간) 위치에 요소 추가하기
       itemE.splice(2, 0,'딸기');//2번 인덱스에 0은 delete Counter 부분 아무것도 제거하지 않고 '딸기'를 삽입
       console.log(itemE);
      //귤 천혜향 귤 
       itemE.splice(5, 0,'천혜향');
       console.log(itemE);
