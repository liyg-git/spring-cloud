package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author 李永刚
 * @Param
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${info.profile:error}")
    private String profile;

    @GetMapping("/config")
    public Mono<String> config() {
        return Mono.justOrEmpty(profile);
    }
}
