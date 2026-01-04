package com.ploydev.gerenciadorfinanceiro.service;


import com.ploydev.gerenciadorfinanceiro.model.Usuario;
import com.ploydev.gerenciadorfinanceiro.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository; // DECLARANDO UMA DEPEDENCIA
    //privado → só pode ser acessado dentro da classe.
    //
    //final → será inicializado uma vez e não muda depois.

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    // Criação de usuario
    public Usuario novoUsuario(Usuario usuario) {
        // Validação para ver se o email ja existe
        usuarioRepository.findByEmail(usuario.getEmail())
                .ifPresent(u -> {              // Se tiver presente executa
                    throw new RuntimeException("Esse email já existe!");
                });
        return usuarioRepository.save(usuario);
    }
    public Usuario buscarPorId(Long id){
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Esse usuario não existe"));
    }
    public List<Usuario> buscarTodosUsuario(){
        return usuarioRepository.findAll();
    }
}
