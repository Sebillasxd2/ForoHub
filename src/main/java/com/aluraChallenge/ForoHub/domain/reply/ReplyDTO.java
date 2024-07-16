package com.aluraChallenge.ForoHub.domain.reply;

import com.aluraChallenge.ForoHub.domain.reply.Reply;

import java.time.LocalDateTime;

public record ReplyDTO(Long Id, String message, LocalDateTime createdAt, Long repliesTo, String User) {

    public ReplyDTO(Reply reply) {
        this(reply.getId(),
             reply.getMessage(),
             reply.getCreatedAt(),
             reply.getRepliesTo(),
             reply.getUser().getUsername());
    }

}
