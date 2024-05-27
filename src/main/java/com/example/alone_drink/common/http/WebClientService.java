package com.example.alone_drink.common.http;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Service
@RequiredArgsConstructor
public class WebClientService {

    private final WebClient webClient;

    public Mono<ApiResponseVo> webClientGetReq(String url, HttpHeaders headers){
        return webClient
                .get()
                .uri(url)
                .headers(httpHeaders -> httpHeaders.addAll(headers))
                .retrieve()
                .bodyToMono(ApiResponseVo.class);
    }

    public Mono<ApiResponseVo> webClientPostReq(String url, HttpHeaders headers){
        return webClient
                .post()
                .uri(url)
                .headers(httpHeaders -> httpHeaders.addAll(headers))
                .retrieve()
                .bodyToMono(ApiResponseVo.class);
    }

    public Mono<ApiResponseVo> webClientPutReq(String url, HttpHeaders headers){
        return webClient
                .put()
                .uri(url)
                .headers(httpHeaders -> httpHeaders.addAll(headers))
                .retrieve()
                .bodyToMono(ApiResponseVo.class);
    }

    public Mono<ApiResponseVo> webClientDeleteReq(String url, HttpHeaders headers){
        return webClient
                .delete()
                .uri(url)
                .headers(httpHeaders -> httpHeaders.addAll(headers))
                .retrieve()
                .bodyToMono(ApiResponseVo.class);
    }

    public Mono<ApiResponseVo> webClientPatchReq(String url, HttpHeaders headers){
        return webClient
                .patch()
                .uri(url)
                .headers(httpHeaders -> httpHeaders.addAll(headers))
                .retrieve()
                .bodyToMono(ApiResponseVo.class);
    }

    public Mono<ApiResponseVo> webClientHeadReq(String url, HttpHeaders headers){
        return webClient
                .head()
                .uri(url)
                .headers(httpHeaders -> httpHeaders.addAll(headers))
                .retrieve()
                .bodyToMono(ApiResponseVo.class);
    }

    public Mono<ApiResponseVo> webClientOptionsReq(String url, HttpHeaders headers){
        return webClient
                .options()
                .uri(url)
                .headers(httpHeaders -> httpHeaders.addAll(headers))
                .retrieve()
                .bodyToMono(ApiResponseVo.class);
    }

}
