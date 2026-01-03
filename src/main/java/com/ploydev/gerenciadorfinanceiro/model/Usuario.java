package com.ploydev.gerenciadorfinanceiro.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
@NoArgsConstructor
@Getter
@Setter

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    @JsonIgnore
    private String senha;
    private LocalDateTime dataCriacao = LocalDateTime.now(); // Retorna o momento atual do sistema.

    // Um usuario pode ter varias receitas
    @OneToMany(mappedBy = "usuario")
    private List<Receita> receitas;

    // Um usuario pode ter varias despesas
    @OneToMany(mappedBy = "usuario")
    @JsonIgnore
    private List<Despesa> despesas;
}