package com.ploydev.gerenciadorfinanceiro.controller;

import com.ploydev.gerenciadorfinanceiro.model.Receita;
import com.ploydev.gerenciadorfinanceiro.service.ReceitaService;
import com.ploydev.gerenciadorfinanceiro.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/receitas")
public class ReceitaController {

    private final ReceitaService receitaService;
    private final UsuarioService usuarioService;

    public ReceitaController(ReceitaService receitaService,
                             UsuarioService usuarioService) {
        this.receitaService = receitaService;
        this.usuarioService = usuarioService;
    }
    //Criando as receitas
    @PostMapping
    public ResponseEntity<Receita> novaReceita(
            @RequestParam Long idUsuario,
            @RequestBody Receita receita){
        Receita novaReceita = receitaService.novaReceita(idUsuario,  receita);
        return ResponseEntity.ok(novaReceita);
    }
}
