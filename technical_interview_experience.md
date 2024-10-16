넥사크로
프론트엔드 개발용 프레임워크이다.
자바스크립트 기반 라이브러리를 묶은 프레임워크와 넥사크로 스튜디오라는 IDE를 제공한다.
GUI를 드래그앤드랍으로 구성할 수 있으며 각종 이벤트를 자바스크립트로 코딩할 수 있다.
개발한 프로그램은 배포가능한 형태로 자동 빌드된다.
Window OS만 지원하나
개발된 화면은 플랫폼을 가리지 않는다.
SQL을 다루지 않아 데이터의 처리작업은 불가능하다.
화면관련 생산성이 높다
공정단계등의 특징으로 실제 화면 개발 기간이 짧고 끝에 자주 수정되는 프로젝트에 잘맞는다.
백엔드 프로그램과 X-API라는 모듈로 통신한다.
X-API는 투비소프트과 프론트와 백엔드의 통신을 위해 자체적으로 정의한 자료 구조와 통신 방식이다.

X-Trace
포트 미러링을 통해 받아낸 패킷을 읽어
개인정보를 추출하고 양식에 맞게 개인정보조회 이력을 작성해주는 제품입니다.
WBS-Analyzer 제품과 함께 사용되며
사용자가 선택한 파일형식으로 변환됩니다.

스프링 시큐리티
스프링 기반 애플리케이션의 보안을 담당하는 스프링 하위 프레임워크이다
CSRF공격, 세션고정 공격을 방어해주고, 요청 헤더도 보안 처리를 해준다.
스프링 시큐리티는 필터 기반으로 동작한다.
각 필터에서 인증, 인가와 관련된 작업을 처리
기본적으로 세션 & 쿠키 방식으로 인증 처리

인증은 보호된 리소스에 접근하는 것을 허용
하기 이전에 등록된 사용자의 신원을 입증하는 과정
인가는 특정 부분에 접근할 수 있는지에 확인하는 작업.

1.HTTP요청
2.AuthenticationFilter -> UsernamePasswordAuthentication Token
3.AuthenticationManager<<interface>> ->
ProviderManager(구현)
4.AuthenticationProvider(s)
5.UserDetailsService
6.UserDetails<<interface>> ->
User(구현)
7.UserDetailsService ->
AuthenticationProvider(s)
8.ProviderManager
9.AuthenticationFilter
10.SecurityContextHolder
SecurityContext
Authentication


