package com.iff.dev_web.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "TbLojaFilial")
public class LojaFilial {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cdLojaFilial;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String endereco;
    @Column(nullable = false)
    private String nuTelefone;

    @OneToMany(mappedBy = "lojaFilial", cascade = CascadeType.ALL)
    private List<Funcionario> funcionarios;

    public LojaFilial() {}

    public LojaFilial(Long cdLojaFilial, String nome, String endereco, String nuTelefone) {
        this.cdLojaFilial = cdLojaFilial;
        this.nome = nome;
        this.endereco = endereco;
        this.nuTelefone = nuTelefone;
    }

    public Long getCdLojaFilial() {
        return cdLojaFilial;
    }

    public void setCdLojaFilial(Long cdLojaFilial) {
        this.cdLojaFilial = cdLojaFilial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNuTelefone() {
        return nuTelefone;
    }

    public void setNuTelefone(String nuTelefone) {
        this.nuTelefone = nuTelefone;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}