package com.frutiya.backend.frutiya_back_end.dto.auth;

import com.frutiya.backend.frutiya_back_end.domain.RolUsuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    private String token;
    private String email;
    private String name;
    private RolUsuario role;
}
