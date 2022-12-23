package com.sample.springboot.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * packageName    : com.sample.springboot.domain.user
 * fileName       : Role
 * author         : H2110258
 * date           : 2022-12-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-22        H2110258       최초 생성
 */
@Getter
@RequiredArgsConstructor
public enum Role {
    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE_USER", "사용자");

    private final String key;
    private final String title;
}
