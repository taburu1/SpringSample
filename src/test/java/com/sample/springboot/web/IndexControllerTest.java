package com.sample.springboot.web;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * packageName    : com.sample.springboot.web
 * fileName       : IndexControllerTest
 * author         : H2110258
 * date           : 2022-12-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-21        H2110258       최초 생성
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IndexControllerTest extends TestCase {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void indexTest() {
        // when
        String body = this.restTemplate.getForObject("/", String.class);

        assertThat(body).contains("머스테치 웹페이지");
    }
}