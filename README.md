# CS-Study

# Spring MVC 동기화 문제
1. 낙관적 잠금
데이터 갱신 시 스레드로 인한 경합이 발생하지 않을 것으로 추정하고 데이터 잠금을 걸도록 하는 방식으로
데이터 처리가 많이 이루어지지 않는 곳에서 사용한다.

2. 비관적 잠금
무조건 데이터 경합이 발생할 것이라고 추정하고 데이터 잠금을 걸도록 하는 방식으로
많은 사람들이 동시에 작업을 요청하는 곳에서 사용한다.

# JPA 잠금 기법
1. 암시적 잠금
@Version 이 부여된 필드가 존재하거나
@OptimisticLocking 어노테이션이 부여되어 있다면 해당 Entity 조회 시 자동으로 잠금을 걸어주는 기법
잠금이 필요한 함수에 @Lock 어노테이션을 부여하여 잠금을 걸어주는 기법

2. 명시적 잠금
