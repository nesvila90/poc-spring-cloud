package com.example.integraciones.config;

import com.example.integraciones.commons.constants.core.DeployType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.sql.DataSource;

/**
 * The type Persistence config.
 */
@Log4j2
@Configuration
@EnableJpaAuditing
@EnableConfigurationProperties
public class PersistenceConfig {


    /**
     * Data source properties data source config properties.
     *
     * @return the data source config properties
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSourceConfigProperties dataSourceProperties() {
        log.info("Ejecutando Datasource develop");
        return new DataSourceConfigProperties();
    }

    /**
     * Data source data source.
     *
     * @return the data source
     */
    @Bean
    @Profile({DeployType.DEVELOP, DeployType.TEST, DeployType.QA, DeployType.PRODUCTION})
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url(dataSourceProperties().getUrl())
                .driverClassName(dataSourceProperties().getDriverClassName())
                .username(dataSourceProperties().getUsername())
                .password(dataSourceProperties().getPassword())
                .build();
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    private class DataSourceConfigProperties {
        private String url;
        private String username;
        private String password;
        private String driver;
        private String driverClassName;
        private String maxActive;
        private String maxIdle;
        private String minIdle;
        private String initialSize;
        private String removeAbandoned;
        private String schema;
    }


}
