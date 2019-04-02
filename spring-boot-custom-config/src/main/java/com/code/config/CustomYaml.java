package com.code.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = {"classpath:application-custom.yml"})
@ConfigurationProperties(prefix = "com.code.custom.yaml")
public class CustomYaml {

    @Value("${name}")
    private String name;

    @Value("${description}")
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CustomProperties{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
