# Webflux_InfoServer
since : 22-04-20
Hello Server에서 요청이 들어오면 직업 정보(jobInfo)를 응답한다
## Goals : Rest Call With WebFlux (Not MVC)
Spec : Spring5+, Java 8+, WebFlux, Functional Endpoint
- Test Case 01
  - Request 
    - (GET) http://localhost:8099/jobinfo?name=$name
  - Response
    - application/json { "job" : "developer"}

### Test Result (Case 01)
![image](https://user-images.githubusercontent.com/33744934/164193904-a267c78f-b888-459e-8c7f-1b11ca2cc6e4.png)


