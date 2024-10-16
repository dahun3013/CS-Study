# Front_End 면접준비
<br/><br/>
## 1. JSP(JavaServer Pages)
HTML 코드에 JAVA 코드를 넣어 동적우베페이지를 생성하는 웹어플리케이션 도구이다.
JSP가 실행되면 자바 서블릿(Servlet)으로 변환되고 클래스로 컴파일된 후 응답하게 된다. 이변환 과정에서 _jspService()메서드가 생성되는데, 변환된 코드의 위치는 스크립트 요소에 따라 메서드 내부 혹은 외부에 놓인다.
웹 어플리케이션 서버에서 동작되며 필요한 기능을 수행하고 그렇게 생성된 데이터를  웹페이지와 함께 클라이언트로 응답한다.
한번 서블릿으로 컴파일된JSP 파일은 캐시됨으로 실질적 성능 저하 없이 사용가능하다
클라이언트 단은 JSP로 서버 단은 서블릿 요소가 주로 사용된다.

### JSP와 Servlet
JSP는 HTML 내부에 JAVA소스가 들어감으로인해 HTML 코드를 작성하기 간편하다.
Servlet은 자바코드내에 HTML 코드가 있어서 읽고 쓰기가 굉장히 불편하다.

### JSP의 구조
지시어(Directive)
스크립트 요소(Script Element)
    1.선언부(Declaration)<%! 선언부 %> _jspService() 외부
    2.스크립틀릿(Scriptlet)<% 스크립틀릿 %>_jspService() 내부
    3.표현식(Expression)<%= 표현식 내용 %>

### 지시어
JSP를 Sevlet으로 변환하는데 필요한 정보를 JSP 엔진에게 알려주는 부분
주로 스크립트 언어나 인코딩 방식 등을 설정한다.
page: JSP 페이지에 대한 정보를 설정하는 지시어(<%@ page 속성명 = "값" %>
include: 외부 파일을 현재 JSP 파일에 포함시키는 지시어(<%@ page file="경로" %>
taglib: 표현 언어에서 사용할 자바 클래스나 JSTl을 선언하는 지시어


## 2. 이벤트 루프
CALL STACK -> WEB API -> QUEUE -> EVENTLOOP -> CALL STACK

CALLBACK QUEUE의 종류로는 TASK QUEUE, MICROTASK QUEUE 가 있다.
MICROTASTK QUEUE는 그 어떤 곳 보다 가장 먼저 우선으로 콜백이 처리되게 된다.

## 3. HTTPS란
OSI7 계층         TCP/IP             
1.Application       Application                    HTTP FTP SMTP
2.Presentation     ""                                   DNS RIP SNMP
3.Session             ""
4.Transport          Transport                      TCP UDP
5.Network            Internet                        ARR IP IGMP ICMP
6.Data-Link          NetworkAccess
7.Physical                                                    Ethernet TokenRing FramRelay ATM

## 4. TCP
인터넷상에서 데이터를 메세지의 형태로 보내기 위해 IP와 함께 사용하는 프로토콜
애플리케이션에게 신뢰적이고 연결지향성 서비스를 제공한다.
TCP와 IP는 함께 사용되며 IP는 배달을, TCP는 패킷의 추적 및 관리를 하게된다.

3-way handshaking 과정을 통해 연결을 설정하고 4-way handshaking을 통해 해제한다.
흐름 제어 및 혼잡 제어.
높은 신뢰성을 보장한다.
UDP보다 속도가 느리다.
전이중(Full-Duplex), 점대점(PointtoPoint)방식

## 5. UDP
데이터를 독립적인 관계를 지니는 패킷(데이터그램)으로 처리하는 프로토콜
비연결형 프로토콜으로 할당되는 논리적인 경로가 없고 각각의 패킷이 다른 경로로 전송되며 이 각각의 패킷은 독립적인 관계를 지니게 된다.
연결을 설정하고 해제하는 과정이 존재하지 않는다.
연속성이 중요한 실시간 서비스(스트리밍)에 좋다.

비연결형 서비스로 데이터그램 방식을 제공한다.
정보를 주고 받을 때 정보를 보내거나 받는다는 신호절차를 거치지 않는다.
UDP헤더의 CheckSum 필드를 통해 최소한의 오류만 검출한다.
신뢰성이 낮다
TCP보다 속도가 빠르다

## 6. CheckSum
중복 검사의 한 형태로 송신된 자료의 무결성을 보호하는 단순한 방법이다.
통신에서 CRC 즉 순환 중복 검사를 체크섬이라 한다.

### 단순 합계 체크섬
가장 간단한 형태의 체크섬, 데이터의 모든 바이트를 더한 후 그 결과를 사용
단순하고 빠르지만, 간단한 오류만 검출
사용되는 데이터 값은 프로토콜 별로 다르며
데이터를 모두 더한 값을 이진수로 나타내어 2의 보수를 취한 뒤 1을 더한다
기존 데이터와 합산하여 값이 0이면 오류가 없다는 뜻이다.

### 오버플로우 회피
단순 합계 체크섬에서 발생할 수 있는 오버플로우를 회피하기 위해 추가적인 조치를 취한것
캐리 니블을 버리는 방식으로 최상위 4bit를 버리고 단순 합계 체크섬과 동일한 동작을 취한다.

## 7. CORS(Cross-Origin Resource Sharing)
보안정책 SOP(같은 출처만 리소스를 공유할 수 있다)을 지키기위한 정책이다.
교차 출처 리소스 공유는 브라우저가 자신의 출처가 아닌 다른 어떤 출처(도메인, 스킴 혹 포트)로부터 자원을 로딩하는 것을 허용하도록 서버가 허가 해주는 HTTP 헤더 반 메커니즘 이다.
브라우저 단에서 구현된 정책으로 브라우저를 통하지 않은 서버 간 통신에선 정상 작동한다.

일반적인 요청에 대해서는 CORS 정책검사를 하지 않는다
1. 요청 메소드가 GET,HEAD,POST 인경우
2. Request Header 속성이 Accept, Accept-Language, Content-Language, Content-Type, DPR, Downlink, Save-Data, Viewport-Width, Width
3. Content-Type 속성이 application/x-www-form-urlencoded, multipart/form-data, text/plain
4. 요청에 사용된 XMLHttpRequestUpload 객체에 이벤트 리스너가 등록되어 있지않는 경우
5. 요청에 ReadableStream 객체가 사용되지 않는 경우

### Preflight Request
예비 요청과 본 요청으로나누어서 서버로 전송하는 요청방식
예비 요청에는 HTTP메소드 중 OPTIONS 메소드가 사용된다.
브라우저 스스로  요청을 보내는 것이 안전한지 확인하는 것
많은 리소스가 사용된다
Max-Age 헤더 정보를 통해 캐싱하여 효율을 높일 수 있다.
응답은 무조건 200 이여야 한다.

아래 response header 를 설정하여 CORS 정책을 지킬 수 있다.
Access-Control-Allow-Origin : 허가된 Origin
Access-Control-Allow-Methods : 허가된 메소드
Access-Control-Allow-Headers : 허가된 헤더
Access-Control-Max-Age : 응답 캐시가 유효 시간
 
### Credential Request
헤더에 인증과 관련된 정보(쿠키, 토큰 등)를 담아서 보내는 방법이다.
다른출처 간 통신에서 좀 더 보안을 강화하고 싶을 때 사용한다.

fetch API, Axios, Ajax 등 서버로 쿠키를 함께 전송해야 하는 경우
요청에 쿠키가 담기게 되면 Credential Request 허용이 되어 있어야한다.
CORS 처리를 위한 Filter는 반드시 인증을 처리하는 Filter 이전에 있어야 한다.

same-origin (기본값)	같은 출처 간 요청에만 인증 정보를 담을 수 있다
include	모든 요청에 인증 정보를 담을 수 있다
omit	모든 요청에 인증 정보를 담지 않는다

omit 가 아닌 옵션을 사용하여 리소스 요청에  인증정보가 포함 된다면,
Acees-Control-Allow-Origin 는 *(와일드카드)를 사용할 수 없으며 명시적 URL이여야한다.
Access-Control-Allow-Credentials: true 헤더 정보가 들어가야 한다.

## 8. XSS
클라이언트의 브라우저를 타켓
웹사이트에서 의도치 않은 스크립트를 넣어서 실행시키는 기법

### XSS 공격을 위한 3가지 조건
1. 취약점을 찾아 세션 쿠키를 탈취하는 스크립트를 사이트에 삽입
2. 사용자가 웹 사이트에 접근할때 마다 스크립트가 작동
3. 작동된 스크립트를 통해 사용자의 세션 쿠키를 탈취

### 방어방법
중요 정보는 쿠키 대신 서버에 저장한다.
정보를 암호화한다.
httpOnly 옵션을 설정한다 (document.cookie를 이용해 쿠키에 직접 접근하는 것을 방지)
Url encoding이나 문자열을 치환한다.

## 9. CSRF 
해당 사이트의 서버를 타켓
사용자가 자신의 의지와는 무관하게 침입자가 의도한 행위를 서버에 요청하게 만드는 공격

### CSRF 공격을 위한 3가지 조건
1. 사용자는 보안이 취약한 서버로부터 이미 로그인되어 있는 상태
2. 쿠키 기반의 서버 세션 정보를 획득할 수 있다.
3. 요청 방법에 대한 파악, 예상하지 못한 요청 매개변수가 없어야함.

### 방어방법
1.Referer check (리퍼러 체크)
2.CAPTCHA 도입
3.CSRF 토큰사용

### XSS와 CSRF 비교

![XSS 와 CSRF 비교](https://github.com/user-attachments/assets/9565dee9-d82f-4c84-8877-ebe126f30ef1)

