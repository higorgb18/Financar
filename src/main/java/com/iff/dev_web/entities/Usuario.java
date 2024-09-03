package com.iff.dev_web.entities;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "cdTipoUsuario", discriminatorType = DiscriminatorType.STRING)
@Table(name = "TbUsuarios")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cdUsuario;
    @Column(name = "nome", nullable = false)
    private String usuario;
    @Column(unique = true)
    private String email;
    @Column(unique = true, nullable = false)
    private String nuDocumento;
    @Column
    private String nuTelefone;
    @Column
    private String endereco;
    @Column
    private LocalDate dataNascimento;

    public Usuario() {

    }

    public Usuario(Long cdUsuario, String usuario, String email, String nuDocumento, String nuTelefone, String endereco, LocalDate dataNascimento) {
        this.cdUsuario = cdUsuario;
        this.usuario = usuario;
        this.email = email;
        this.nuDocumento = nuDocumento;
        this.nuTelefone = nuTelefone;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public Long getCdUsuario() {
        return cdUsuario;
    }

    public void setCdUsuario(Long cdUsuario) {
        this.cdUsuario = cdUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNuDocumento() {
        return nuDocumento;
    }

    public void setNuDocumento(String nuDocumento) {
        this.nuDocumento = nuDocumento;
    }

    public String getNuTelefone() {
        return nuTelefone;
    }

    public void setNuTelefone(String nuTelefone) {
        this.nuTelefone = nuTelefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}