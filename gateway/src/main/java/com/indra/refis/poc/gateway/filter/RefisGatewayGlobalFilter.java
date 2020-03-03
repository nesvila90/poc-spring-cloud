package com.indra.refis.poc.gateway.filter;

import lombok.Data;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

/**
 * The type Refis gateway global filter.
 */
@Component
public class RefisGatewayGlobalFilter extends AbstractGatewayFilterFactory<RefisGatewayGlobalFilter.GlobalFilterConfig> {

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
        return (exchange, chain) -> {
            ServerHttpRequest request = exchange.getRequest().mutate()
                    .header(REFIS_GLOBAL_HEADER, String.valueOf(Math.random() * MULTIPLIER_RANDOM)).build();
            return chain.filter(exchange.mutate().request(request).build());
        };
    }

    /**
     * The type Global filter config.
     */
    @Data
    public static class GlobalFilterConfig {
        private String name;
    }

}
