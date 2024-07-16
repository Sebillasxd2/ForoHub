package com.aluraChallenge.ForoHub.domain.reply;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ReplyAddDTO(@NotBlank
                          String message,
                          @NotNull
                          Long userId,
                          @NotNull
                          Long topicoId,
                          Long repliesTo
) {}