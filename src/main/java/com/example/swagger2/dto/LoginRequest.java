package com.example.swagger2.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Lee Taesung
 * @since 2022/10/12
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {

    @Schema(description = "email")
    private String email;

    @Schema(description = "비밀번호")
    private String password;
}