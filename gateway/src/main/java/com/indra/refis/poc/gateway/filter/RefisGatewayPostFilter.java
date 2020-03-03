package com.indra.refis.poc.gateway.filter;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.function.BiConsumer;

/**
 * The type Refis gateway post filter.
 */
@Slf4j
@Component
public class RefisGatewayPostFilter extends AbstractGatewayFilterFactory<RefisGatewayPostFilter.GlobalFilterConfig> {

    /**
     * The constant MULTIPLIER_RANDOM.
     */
    private static final Integer MULTIPLIER_RANDOM = 10;
    /**
     * The constant REFIS_GLOBAL_HEADER.
     */
    private static final String REFIS_GLOBAL_HEADER = "refis-global-header";

    @Override
    public GatewayFilter apply(GlobalFilterConfig config) {
        return (exchange, chain) -> chain.filter(exchange).then(Mono.fromRunnable(() -> {
            ServerHttpResponse response = exchange.getResponse();
            HttpHeaders headers = response.getHeaders();
            if (log.isDebugEnabled()) {
                headers.forEach(showHeaders());
            }
        }));
    }


    private BiConsumer<String, List<String>> showHeaders() {
        return (k, v) -> log.info("Header Content: Key: {} : - value: {}", k, v);
    }

    /**
     * The type Global filter config.
     */
    @Data
    public static class GlobalFilterConfig {
        private String name;
    }

}
