package com.ploydev.gerenciadorfinanceiro.controller;

import com.ploydev.gerenciadorfinanceiro.model.Usuario;
import com.ploydev.gerenciadorfinanceiro.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService ;
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @PostMapping
    public ResponseEntity<Usuario> novoUsuario(@RequestBody Usuario usuario){
        Usuario novoUsuario = usuarioService.novoUsuario(usuario);
        return ResponseEntity.ok(novoUsuario);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(usuarioService.buscarPorId(id));
    }
    @GetMapping
    public ResponseEntity<List<Usuario>> buscarTodosUsuarios(){
        return ResponseEntity.ok(usuarioService.buscarTodosUsuario());
    }
}
