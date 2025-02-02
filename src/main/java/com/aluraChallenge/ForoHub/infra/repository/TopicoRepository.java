package com.aluraChallenge.ForoHub.infra.repository;
import com.aluraChallenge.ForoHub.domain.topico.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {
    boolean existsByTitle(String title);
}
