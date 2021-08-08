package com.example.elasticserach_test;

import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.common.settings.Settings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class IndexApiTest {

    @Autowired
    private RestHighLevelClient restHighLevelClient;

    @Test
    public void restHighLevelClientIsNotNull() {
        assertThat(restHighLevelClient).isNotNull();
    }

    @Test
    public void createIndexTest() {
        CreateIndexRequest request = new CreateIndexRequest("cctv");

        
    }

}
