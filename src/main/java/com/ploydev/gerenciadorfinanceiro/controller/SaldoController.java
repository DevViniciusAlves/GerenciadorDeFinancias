package com.ploydev.gerenciadorfinanceiro.controller;


import com.ploydev.gerenciadorfinanceiro.service.SaldoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class SaldoController {

    private final SaldoService saldoService;

    public SaldoController(SaldoService saldoService) {
        this.saldoService = saldoService;

    }
    @GetMapping("/{idUsuario}/saldo")
    public ResponseEntity<Double> buscarSaldoDoUsuario(@PathVariable Long idUsuario){
       double saldo = saldoService.calcularTotal(idUsuario);
        return ResponseEntity.ok(saldo);
    }
}
