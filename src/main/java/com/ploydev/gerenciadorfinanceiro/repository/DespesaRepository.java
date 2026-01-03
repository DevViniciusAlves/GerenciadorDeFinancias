package com.ploydev.gerenciadorfinanceiro.repository;

import com.ploydev.gerenciadorfinanceiro.model.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DespesaRepository extends JpaRepository<Despesa, Long> {
    List<Despesa> findByUsuarioId(Long idUsuario);
}
