package com.aluraChallenge.ForoHub.infra.service;

import com.aluraChallenge.ForoHub.domain.reply.ReplyAddDTO;
import com.aluraChallenge.ForoHub.domain.reply.ReplyDTO;
import com.aluraChallenge.ForoHub.domain.reply.ReplyUpdateDTO;
import com.aluraChallenge.ForoHub.domain.topico.TopicoAddDTO;
import com.aluraChallenge.ForoHub.domain.topico.TopicoDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TopicoService {
    Page<TopicoDTO> getAllTopicos(Pageable pageable);
    TopicoDTO getTopico(Long id);
    TopicoDTO createTopico(TopicoAddDTO topicoAddDTO);
    TopicoDTO updateTopico(Long id, TopicoAddDTO topicoAddDTO);
    void deleteTopico(Long id);
    Page<ReplyDTO> getReplies(Long topicoId, Pageable pageable);
    ReplyDTO addReply(Long topicoId, ReplyAddDTO replyAddDTO);
    ReplyDTO updateReply(Long topicoId, Long replyId, ReplyUpdateDTO replyUpdateDTO);
    void removeReply(Long topicoId, Long replyId);
}
