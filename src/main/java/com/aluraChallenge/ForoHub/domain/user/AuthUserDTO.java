package com.aluraChallenge.ForoHub.domain.user;

import jakarta.validation.constraints.NotBlank;

public record AuthUserDTO(
        @NotBlank String username,
        @NotBlank String password
) {}