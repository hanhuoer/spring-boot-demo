package com.code;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RandomPortTestRestTemplateExampleTests {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void exampleTest() {
        String body = this.testRestTemplate.getForObject("/", String.class);
        Assert.assertNotNull(body);
    }

}
