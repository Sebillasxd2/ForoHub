package com.aluraChallenge.ForoHub.domain.reply;

import jakarta.validation.constraints.NotBlank;

public record ReplyUpdateDTO(@NotBlank String message) {}
