package com.aluraChallenge.ForoHub.domain.curso;

import jakarta.validation.constraints.NotBlank;

public record CursoAddDTO(@NotBlank
                          String name,
                          @NotBlank
                          String category
) {}