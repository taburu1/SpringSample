package com.sample.springboot.config.auth.dto;

import com.sample.springboot.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

/**
 * packageName    : com.sample.springboot.config.auth.dto
 * fileName       : SessionUser
 * author         : H2110258
 * date           : 2022-12-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-23        H2110258       최초 생성
 */
@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
