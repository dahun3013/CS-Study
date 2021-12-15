<script>
        const array=[273, 'String', true, function(){}, {}, [273,103] ];
        console.log(array);
        console.log(array[1]);//배열요소 접근
        console.log(array.length);//배열의 갯수 확인
        array.push(1000); //배열요소 뒷부분에 추가하기
        console.log(array);
        //배열요소에 인덱스를 사용해 배열 뒷부분에 요소 추가하기
        array[7]='문자추가';//인덱스요소에 값이 없으면 새롭게 들어가기
        console.log(array);
        array[3]='인덱스값 변경';//인덱스 요소에 값이 있으면 수정해서 들어가기
        console.log(array);
        array[10]='문자추가';//10번 인덱스에 값이 추가된다. 8,9인덱스는 empty로 만들어짐
        console.log(array);
        //삭제하기 1) 인덱스 제거하기 2) 값을 기반으로 제거하기
        array.splice(3, 2);//3번인덱스부터 2개만큼 제거하기 
        console.log(array);
        //indexOf(요소) - 해당하는 요소의 인덱스 값을 반환함
        console.log(array.indexOf('String'));
        //'String'요소를 삭제하기 
        array.splice( array.indexOf('String'), 1);
        console.log(array);

    </script>
