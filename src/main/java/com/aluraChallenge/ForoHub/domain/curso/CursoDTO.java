package com.aluraChallenge.ForoHub.domain.curso;

import com.aluraChallenge.ForoHub.domain.curso.Curso;

public record CursoDTO(Long Id, String name, String category) {

    public CursoDTO(Curso curso) {
        this(
            curso.getId(),
            curso.getName(),
            curso.getCategory());
    }

}