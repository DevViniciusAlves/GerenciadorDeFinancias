package com.ploydev.gerenciadorfinanceiro.service;

import com.ploydev.gerenciadorfinanceiro.model.Despesa;
import com.ploydev.gerenciadorfinanceiro.model.Usuario;
import com.ploydev.gerenciadorfinanceiro.repository.DespesaRepository;
import com.ploydev.gerenciadorfinanceiro.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesaService {
    private final DespesaRepository despesaRepository;
    private final UsuarioRepository usuarioRepository;
    public DespesaService(DespesaRepository despesaRepository,
                          UsuarioRepository usuarioRepository) {
        this.despesaRepository = despesaRepository;
        this.usuarioRepository = usuarioRepository;
    }
    // Criando despesa
    public Despesa novaDespesa(Long idUsuario, Despesa despesa){
        Usuario usuario = usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado"));


        despesa.setUsuario(usuario);
        return despesaRepository.save(despesa);
    }
    // Listar despesa por usuario
    public List<Despesa> listaDespesasPorUsuario(Long idUsuario){
        return despesaRepository.findByUsuarioId(idUsuario);
    }
}
