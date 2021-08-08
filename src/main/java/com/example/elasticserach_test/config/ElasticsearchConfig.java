package com.example.elasticserach_test.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticsearchConfig {

    @Value("${elasticsearch.host}")
    private String HOST;

    @Value("${elasticsearch.port}")
    private int PORT;

    @Bean
    public RestHighLevelClient getRestClient() {
        HttpHost host = new HttpHost(HOST, PORT, "http");

        RestClientBuilder builder = RestClient.builder(host);
        return new RestHighLevelClient(builder);
    }
}
