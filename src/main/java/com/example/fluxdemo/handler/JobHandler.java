package com.example.fluxdemo.handler;

import com.example.fluxdemo.dto.JobMessage;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 *  handler : 요청을 처리하고 응답을 생성한다.
 */
@Component
public class JobHandler {

    public Mono<ServerResponse> jobInfo(ServerRequest request) {

//        String name = request.queryParam("name").get();
        String jobName = "developer";

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(new JobMessage(jobName)));
    }
}
