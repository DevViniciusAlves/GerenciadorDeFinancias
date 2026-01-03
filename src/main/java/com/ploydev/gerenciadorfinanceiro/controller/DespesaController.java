package com.ploydev.gerenciadorfinanceiro.controller;


import com.ploydev.gerenciadorfinanceiro.model.Despesa;
import com.ploydev.gerenciadorfinanceiro.service.DespesaService;
import com.ploydev.gerenciadorfinanceiro.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/despesas")
public class DespesaController {

    private final DespesaService despesaService;
    private final UsuarioService usuarioService;

    public DespesaController(DespesaService despesaService,
                             UsuarioService usuarioService) {
        this.despesaService = despesaService;
        this.usuarioService = usuarioService;
    }
    @PostMapping
    public ResponseEntity<Despesa> novaDespesa
            (@RequestParam Long idUsuario,
             @RequestBody Despesa despesa){

        Despesa novaDespesa = despesaService.novaDespesa(idUsuario, despesa);
        return ResponseEntity.ok(novaDespesa);

    }

}
