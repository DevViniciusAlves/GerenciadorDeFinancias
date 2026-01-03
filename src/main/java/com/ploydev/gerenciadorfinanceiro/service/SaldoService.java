package com.ploydev.gerenciadorfinanceiro.service;


import com.ploydev.gerenciadorfinanceiro.repository.DespesaRepository;
import com.ploydev.gerenciadorfinanceiro.repository.ReceitaRepository;
import org.springframework.stereotype.Service;

@Service
public class SaldoService {

    private final DespesaRepository despesaRepository;
    private final ReceitaRepository receitaRepository;

    public SaldoService(DespesaRepository despesaRepository,
                        ReceitaRepository receitaRepository) {
        this.despesaRepository = despesaRepository;
        this.receitaRepository = receitaRepository;

    }
}
