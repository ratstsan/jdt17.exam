package com.indivaragroup.jdt17.exam.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "store")
@Getter
@Setter
public class StoreProperties {
    private String name;
    private String city;
    private String currency;
    private Integer maxDailyOrder;
    private Boolean active;
}