package com.example.fluxdemo.router;

import com.example.fluxdemo.handler.JobHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.*;

/**
 *  라우터 : "/hello" 경로에서 트래픽을 수신하고, reactive handler 클래스에서 제공한 값을 리턴한다.
 */
@Configuration
public class JobInfoRouter {

    @Bean
    public RouterFunction<ServerResponse> route(JobHandler handler) {
        return RouterFunctions.route(RequestPredicates.GET("/jobinfo")
                .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), handler::jobInfo);
    }

}
