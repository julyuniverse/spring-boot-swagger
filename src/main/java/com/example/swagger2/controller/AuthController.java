package com.example.swagger2.controller;

import com.example.swagger2.dto.LoginRequest;
import com.example.swagger2.dto.LoginResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lee Taesung
 * @since 2022/10/12
 */
@Tag(name = "인증", description = "인증 관련 api 입니다.")
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Operation(summary = "로그인 메서드", description = "로그인 메서드입니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = LoginResponse.class))),
            @ApiResponse(responseCode = "400", description = "bad request operation", content = @Content(schema = @Schema(implementation = LoginResponse.class)))
    })

    @PostMapping(value = "login")
    public ResponseEntity<LoginResponse> login(LoginRequest loginRequest) {
        LoginResponse loginResponse = new LoginResponse("accessTokenValue", "refreshTokenValue");
        return ResponseEntity.ok().body(loginResponse);
    }
}

