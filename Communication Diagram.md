커뮤니케이션다이어그램(CommunicationDiagram)
========================

:pushpin:UML다이어그램종류
|구조|행위|
|:---:|:---:|
|클래스|유스케이스|
객체|활동
패키지|상태
컴포넌트|순서
배치다이어그램|커뮤니케이션


### 1. 개념
* 정의: 시스템이나 객체들이 메시지를 주고 받으며 상호작용하는 과정과 객체들 간의 연관을 그림으로 표현한 것
* 목적: 동작에 참여하는 객체들 사이의 관계를 파악하는데 사용하거나 클래스 다이어그램에서 관계가 제대로 표현됐는지 점검하는 용도로도 사용
* 시퀀스 다이어그램과 차이 : 시퀀스 다이어 그램에서는 시간에 따른 메시지의 순서 지정에 초점을 맞추지만, 커뮤니케이션 다이어그램에서는 상호작용의 오브젝트간에 전달하는 메시지 구조를 주로 다룬다.

### 2. 구성

:pushpin:UML다이어그램종류
|구성요소|내용|
|:---:|:---:|
|액터|- 시스템으로부터 서비스를 요청하는 외부요소, 사람이나 외부 시스템을 의미|
|객체|- 메시지를 주고 받는 객체, 콜론(:)을 기준으로 앞쪽에는 객체명을 뒤쪽에는 클래스명을 기술|
|링크|- 객체들 간의 관계를 표현하는데 사용 <br> 액터와 객체, 객체와 객체 간에 실선을 그어 표현|
|메시지|- 객체가 상호 작용을 위해 주고받는 메시지 <br> - 화살표의 방향은 메시지를 받는 쪽으로 향한다. <br> - 일정한 순서에 의해 처리되는 메시지의 경우 숫자로 순서를 표시 <br> - 메시지의 종류는 시퀀스 다이어그램에서 표현하는 방법과 동일|

### 3. 작성법

  1. 해당 사용 사례를 위해 협력하는 모든 객체를 찾는다.

  2. 객체 사이에 교환되는 메시지를 시간순으로 나열한다.

  3. 중심이 되는 객체를 찾아 중앙에 놓는다.

  4. 중심 객체와 직접 연결되어 상호작용하는 객체를 주위에 놓는다.

  5. 메시지가 호출되는 순서에 따라 연관된 객체를 하나씩 그리고 메세지를 화살표로 표시한다

  6. 만일 시스템이 여러 층으로 나뉘어 있다면 각 측의 모든 메시지가 다이어그램에 표시될때까지 다음 층에 대해 처음부터 반복한다.

### 4. 예시
![Alt text](https://www.ibm.com/docs/ko/SS8PJ7_9.6.1/com.ibm.xtools.sequence.doc/images/example_communication_diagram.gif)
![Alt text](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbiMa1S%2Fbtq3cymmWwj%2FUtJQFkIkjFmUXelihnCKDk%2Fimg.png)
![Alt text](![Alt text](https://support.content.office.net/ko-kr/media/58c4729d-b4b8-4e32-90d1-8721a43c436c.png)

