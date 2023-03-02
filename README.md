### SemiProject_SMTW
[Show Me The Way](https://gd1class.iptime.org:8844/GDJ56_smtw_semi/)
> 워킹홀리데이를 준비하는 사람들을 위한 정보 공유 및 커뮤니티 사이트  :  Show Me The Way

![메인화면](https://user-images.githubusercontent.com/39483946/217709122-83918fcc-3779-4114-8d16-53b6721861f6.JPG)

##### 국비수업 - 세미프로젝트

## 목차
- [들어가며](#들어가며)
  - [프로젝트 소개](#1-프로젝트-소개)    
  - [프로젝트 정보](#2-프로젝트-정보)
  - [프로젝트 기능](#3-프로젝트-기능)
  - [사용 기술](#4-사용-기술)   
     - [백엔드](#4-1-백엔드)
     - [프론트엔드](#4-2-프론트엔드)
  - [실행 화면](#5-실행-화면)   


- [설계](#설계)
  - [DB 설계](#-DB-설계)
  - [기능정의서 설계](#-기능정의서-설계)

- [개발 내용](#개발-내용)

- [마치며](#마치며)
  - [프로젝트 보완사항](#1-프로젝트-보완사항)
  - [후기](#2-후기)


## 들어가며
### 1. 프로젝트 소개

<aside>
💡 현재 총 24개국이 가능한 워킹홀리데이, 나라마다 다른 워킹홀리데이 신청과 준비의 고민을 해결해 주기 위한 다양한 기능을 제공

💡 나라별 정보, 사용자 성향에 적합한 워홀 나라 찾기, 출국일지 관리 나아가 워홀러들과의 소통, 꼭 알아야 할 공지사항 및 궁금한 걸 물어볼 수 있는 QnA 등의 기능을 제공
</aside>

### 2. 프로젝트 정보
프로젝트 인원 : 6명

프로젝트 기간 : 2022.10.17 ~ 2022.12.23

### 3. 프로젝트 기능
- **[ 팝업창 ]** Cookie를 생성하여 팝업창이 하루동안 열리지 않음

- **[ 회원 관리 ]** 비밀번호 찾기 / 재설정

- **[ 출국일지 관리 ]** 등록 / 수정 / 삭제 / 알림서비스 / 체크리스트

- **[ 나에게 맞는 나라찾기 ]**

### 4. 사용 기술

#### 4-1 백엔드

##### 개발 환경 및 라이브러리
- Java 11
- jQuery 3.6.1
- WAS : Tomcat 9.0

##### Build Tool
- Eclipse IDE 2022-09
- Oracle Sql Developer

##### DataBase
- Orcale DB

#### 4-2 프론트엔드
- Visual Studio Code (HTML / CSS)

### 5. 실행 화면
  <details>
    <summary>[ 메인페이지 - 팝업창 ]</summary>   
  
![메인화면 팝업창](https://user-images.githubusercontent.com/39483946/218351823-be2969f0-8b04-425b-a0a4-79da37f428e3.JPG)

-> 하루동안 이 창 열지 않음 체크 후 닫을 시 쿠키가 생성되어 1일간 해당 팝업이 열리지 않음
  </details>  <br/>
  
  <details>
    <summary>[ 회원 관리 ]</summary>   
       
    
  **1. 비밀번호 찾기**   
 ![비밀번호찾기-이메일인증성공](https://user-images.githubusercontent.com/39483946/218007468-c91e16e3-c3ef-4656-b879-9aeb2a584d23.JPG)
  
-> 가입시 임력했던 이메일 인증을 통해 비밀번호 찾기를 이용할 수 있다.
  <br/>    
  
  **2. 재설정**   
![비밀번호재설정](https://user-images.githubusercontent.com/39483946/218007234-2150aa6d-1f13-47aa-8521-fff8bc79ffdf.JPG)
  
-> 이메일인증에 성공시 비밀번호를 재설정 할 수 있다. 
 </details>  <br/>
 <details>
    <summary>[ 출국일지 관리 ]</summary>   

  **1. 출국일지 등록 / 수정**   
![출국일지 등록](https://user-images.githubusercontent.com/39483946/218007847-3513f205-d74f-4460-9c4b-fcaa82e4d199.JPG)

-> 출국일은 오늘 날짜 이후로만 선택 가능하게 제한
-> 출국 10일전 알림서비스 체크 가능
 <br> <br>
  **2. 출국일지에 따른 화면처리 및 Ajax를 통한 체크리스트 저장**
![출국일남은사람](https://user-images.githubusercontent.com/39483946/218007816-64af3a59-b335-4839-99c2-ac32e71e0dd9.JPG)
  
-> 출국일 남은사람
    <br> <br>
![출국일지 디데이](https://user-images.githubusercontent.com/39483946/218007894-8ed3540d-6a22-414e-9709-c40019216339.JPG)

-> 출국일 디데이
  <br> <br>
![출국일지난사람](https://user-images.githubusercontent.com/39483946/218007923-58c86368-6888-4071-84ee-dda5b0f603b2.JPG)
  
-> 출국일 지난사람 / 삭제가능
 <br> <br>
**3. 출국일 알림서비스**
![알림서비스동의시출국10일전알림팝업](https://user-images.githubusercontent.com/39483946/218007749-27b6697c-d37c-4b6e-afd1-020aca3bbd6a.JPG)
  
-> 10일전 알림서비스 체크하면 로그인시 알림팝업을 띄워줌
  <br> <br>
![10일전단체메일전송](https://user-images.githubusercontent.com/39483946/218007572-0a1d412f-b965-4587-9d5e-2e3289654d10.JPG)

![출국10일전메일수신](https://user-images.githubusercontent.com/39483946/218007788-57219bb5-b208-4011-b4fc-001f2752f3ee.JPG)
  
-> 회원가입시 메일수신동의를 체크 한 회원은 출국10일전에 메일로도 알림서비스를 받을 수 있음 

</details>     <br/>
 <details>
    <summary>[ 나에게 맞는 나라찾기 ]</summary> 
  
![나에게맞는나라찾기전체](https://user-images.githubusercontent.com/39483946/218349719-23c9d0c3-6888-4a65-84a3-beb3f6236b91.jpg)

-> 4가지 항목을 체크
 <br> <br>
![나에게맞는나라찾기결과](https://user-images.githubusercontent.com/39483946/218007690-5feb0795-07ca-449c-9ba6-d8556e037fb5.JPG)

-> 체크한 항목에 맞는 나라 결과를 보여줌

 </details>  <br/>
 
 ## 설계   
 
 
 ### DB 설계
 
[테이블 정의서 12.22.pdf](https://github.com/JIHEE0616/semi/files/10717986/12.22.pdf)
 
![세미ERD](https://user-images.githubusercontent.com/39483946/218352904-57b20302-bf53-4efb-9b83-a6115b135ef9.JPG)
  <br/>
![ERD테이블명](https://user-images.githubusercontent.com/39483946/218379008-16f5809f-7d9f-4ae1-bfbb-8decb07bbe80.JPG)

 ### 기능정의서 설계
[SMTW -기능정의서](https://docs.google.com/spreadsheets/d/1kyg4FwIMaeKX7fXy-HNRVtXHTSIidtTpHw4VzavHF1Y/edit#gid=1911760)
 ## 개발 내용
 - **[ 팝업창 ]**
1) 홈페이지 방문시 팝업창 뜸 -> 나에게 맞는 나라찾기로 이동 가능
2) '하루동안 이 창을 열지않음' 체크 후 닫을 시 1일 기간의 Cookie를 생성하여 팝업창이 하루동안 열리지 않음


- **[ 회원 관리 ]**
1) 비밀번호 찾기
2) 비밀번호 재설정 (정규화)


- **[ 출국일지 관리 ]**
1) 회원당 1개의 출국일지 소유가능
2) 출국일지 등록
-> 출국일은 오늘 날짜 이후로만 선택 가능하게 제한
-> 출국 10일전 알림서비스 체크 가능
3) 출국일지 수정
-> 등록시 입력했던 값들을 불러와 새로 설정 할 수 있게 함
4) 출국일지 삭제
-> 출국일이 지난 사용자에게 제공되는 기능으로 해당 출국일지를 삭제 할 수 있음
5) 출국 10일 전 알림서비스 기능

-> 홈페이지 로그인시 Ajax를 이용하여 사용자가 출국 10일 전이고, 알림 서비스를 체크 하였는지 확인 후 10일 전 알림 팝업을 띄워줌

-> 회원가입시 이메일 마케팅 수신 동의 한 사용자는 메일로도 동일한 알림서비스를 받을 수 있음(단체메일전송 - SMTP)
6) 체크리스트 관리
-> 체크리스트를 저장하면 현재 진행도를 Ajax를 이용하여 보여줌


- **[ 나에게 맞는 나라찾기 ]**
1) 사용자가 직접 원하는 언어/여행지/날씨/성향을 선택하여 적합한 워킹홀리데이 나라를 매칭 해주는 기능
-> 나라정보 페이지로 이동 가능
  <br/>
  
## 마치며

### 1. 프로젝트 보완사항   
 
<details>
  <summary>보완하고 싶은 사항</summary>
     

- 페이지 Ajax처리
- 10일전 메일 알림서비스 자동 전송
  
</details>  


### 2. 후기   

학원에서 국비수업을 들으며 처음 진행했던 프로젝트여서 주제선정부터 ERD(DB설계), 기능정의서, 화면구현, 기능구현까지 쉬운게 하나 없었던 것 같습니다.
하지만 혼자가 아닌 여러사람들과 함께 하는 팀플이였기에 어려웠던 것도 하나하나 잘 헤쳐나갈 수 있었던 것 같습니다.
가장 최적화된 DB를 설계 할 수 있도록 노력하였고, 기능정의서와 테이블정의서는 추후 팀원들과 코딩을 할 때 한눈에 알아 볼 수 있게 정리하고자 하였습니다.
또한 각자 기능을 나누고 본격적으로 코딩을 시작하고 나서는 같은 결과더라도 좀 더 효율적으로 코드를 짜려고 노력하였으며, 다른 팀원이 보았을때에도 이해하기 쉽게 주석처리를 꼼꼼하게 하려고 했던 것 같습니다.
아직 많은 부분에서 부족하나 어떠한 문제를 마주했을때 스스로 이해하고 해결하고자 하였습니다.
물론 몇번의 좌절을 맛보기도 했지만 저는 어떤 것이든 해결할 수 있다는 생각을 항상 가지고 있어서 고난을 이겨내는 과정조차 재밌었던 것 같습니다.
팀 프로젝트를 통해 같은 문제여도 다 다르게 해석하고 또 다 다르게 풀어나갈 수 있었음에 신기하였고, 또 그로 인해 새로운 시각으로 바라보는 자세가 생긴 것 같습니다.
앞으로 마주할 많은 문제들에 큰 도움이 될 것이라는 생각이 들었고, 한층 성장할 수 있었던 시간이었습니다.

감사합니다.
