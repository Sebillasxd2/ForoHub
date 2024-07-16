package com.aluraChallenge.ForoHub.domain.user;

import jakarta.validation.constraints.NotBlank;

public record UserUpdatePasswordDTO(
        @NotBlank
        Long Id,
        @NotBlank
        String password
) {}