## react-spring-restApi-graphql
spring에 rest controller가 rest api를 생성하여 그것을 react apollo에서 graphql로 감싸주어 

데이터를 받는 구조이다. 카테고리 데이터의 컬럼 및 자세한 설명은 아래 링크에 자세히 설명해놓음. 

[Reference Link: https://github.com/dksxoghl/apollo_graphql_category_manager](https://github.com/dksxoghl/apollo_graphql_category_manager)

### Technology Stack

|Component|Technology|
|----|---|
|Frontend|React 16+|
|Backend|Spring Boot 2.2+, Java 8+|
|Database|H2 Database|
|Persistence|JPA|
|Client Build|npm,yarn,webpack,graphql|
|Server Build|Maven|

### Getting Started

#### Prerequisites
  (java와 node.js 다운 후 git clone)
- Install Java 8 from the OpenJDK
- Install Node.js from the Node.js website
- Clone the repo git clone https://github.com/dksxoghl/react-spring-restApi-graphql.git

####Backend
(spring boot run클릭하거나 터미널에서 아래명령어 입력하여 실행)
- Run DemoApplication(spring-boot)

or
- Go to your project folder from your terminal
- cd blog-backend
- Run: mvnw spring-boot:run
####Frontend
(터미널에서 아래명령어 입력하여 실행, 오류발생시 하단의 라이브러리 수동입력하여 추가)
- Go to your project folder from your terminal
- cd restapi-apollo-category
- Run: npm install or yarn install
- After install, run: npm run start or yarn start
- It will open your browser(http://localhost:3000)
- if error occur do 'yarn add(npm install) @apollo/react-hooks apollo-cache-inmemory apollo-client apollo-link-http apollo-link-rest graphql graphql-tag graphql-anywhere typescript styled-components'
####H2 Database
- http://localhost:8090/console/
####CORS Issue Resolve
- In package.json,  "proxy": "http://localhost:8090/"
###Screenshots
<img src="https://user-images.githubusercontent.com/45805470/75224285-91024e80-57eb-11ea-9040-c361c6fbd23a.PNG" width="70%"></img>
<img src="https://user-images.githubusercontent.com/45805470/75224330-a37c8800-57eb-11ea-9a6b-b35c59cc9f6c.PNG" width="70%"></img>