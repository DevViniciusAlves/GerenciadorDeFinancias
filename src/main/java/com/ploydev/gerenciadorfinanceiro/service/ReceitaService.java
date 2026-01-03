package com.ploydev.gerenciadorfinanceiro.service;

import com.ploydev.gerenciadorfinanceiro.model.Receita;
import com.ploydev.gerenciadorfinanceiro.model.Usuario;
import com.ploydev.gerenciadorfinanceiro.repository.ReceitaRepository;
import com.ploydev.gerenciadorfinanceiro.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceitaService {
    private final ReceitaRepository receitaRepository;
    private final UsuarioRepository usuarioRepository;
    public ReceitaService(ReceitaRepository receitaRepository,
                          UsuarioRepository usuarioRepository) {
        this.receitaRepository = receitaRepository;
        this.usuarioRepository = usuarioRepository;
    }
    // Criando receita
    public Receita novaReceita(Long idUsuario, Receita receita){
        Usuario usuario = usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado"));

        receita.setUsuario(usuario);
        return receitaRepository.save(receita);
    }

    // Listando receitar por usuarios
    public List<Receita> listarReceitaPorUsuario(Long idUsuario) {
        return receitaRepository.findByUsuarioId(idUsuario);
    }
}
