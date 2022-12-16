package com.sample.springboot.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void helloResponseDtoTest() {
        /* given */
        String name = "테스트";
        int amount = 1000;

        /* when */
        HelloResponseDto dto = HelloResponseDto.builder().name(name).amount(amount).build();

        // then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}