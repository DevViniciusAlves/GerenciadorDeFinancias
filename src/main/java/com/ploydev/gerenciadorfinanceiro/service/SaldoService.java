package com.ploydev.gerenciadorfinanceiro.service;


import com.ploydev.gerenciadorfinanceiro.model.Despesa;
import com.ploydev.gerenciadorfinanceiro.model.Receita;
import com.ploydev.gerenciadorfinanceiro.model.Usuario;
import com.ploydev.gerenciadorfinanceiro.repository.DespesaRepository;
import com.ploydev.gerenciadorfinanceiro.repository.ReceitaRepository;
import com.ploydev.gerenciadorfinanceiro.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaldoService {

    private final UsuarioRepository usuarioRepository;
    private final DespesaRepository despesaRepository;
    private final ReceitaRepository receitaRepository;

    public SaldoService(DespesaRepository despesaRepository,
                        ReceitaRepository receitaRepository,
                        UsuarioRepository usuarioRepository) {
        this.despesaRepository = despesaRepository;
        this.receitaRepository = receitaRepository;
        this.usuarioRepository = usuarioRepository;
    }
    public double calcularTotal(Long idUsuario) {

        // Validar o usuario
        Usuario usuario = usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new RuntimeException("Usuario não existente"));

        // Buscar as receita e despesa
        List<Receita> receitas = receitaRepository.findByUsuarioId(idUsuario);
        List<Despesa> despesas = despesaRepository.findByUsuarioId(idUsuario);

        // Soma das receitas e despesas
        double totalReceitas = 0;
        for (Receita receita : receitas){
            totalReceitas += receita.getValor();
        }
        double totalDespesas = 0;
        for (Despesa despesa : despesas){
            totalDespesas += despesa.getValor();
        }
        return totalReceitas - totalDespesas;
    }
}
