package com.iff.dev_web.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.hateoas.RepresentationModel;

@Entity
@Table(name = "TbVeiculo")
public class Veiculo extends RepresentationModel<Veiculo> implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cdVeiculo;

    @Column(nullable = false)
    private Integer cdTipoVeiculo;

    @Column(nullable = false)
    private String placa;

    @Column(nullable = false)
    private String chassi;

    @Positive
    @Column(nullable = false)
    private BigDecimal valor;

    @Column(nullable = false)
    private String marca;

    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false)
    private Integer anoModelo;

    @Column(nullable = false)
    private CdTipoCombustivelEnum tipoCombustivel;

    @Column(nullable = false)
    private Long cdTabelaFipe;

    @Column(nullable = false)
    private Integer quilometragem;

    public Veiculo() {

    }

    public Veiculo(Long cdVeiculo, Integer cdTipoVeiculo, String placa, String chassi, BigDecimal valor, String marca, String modelo, Integer anoModelo, CdTipoCombustivelEnum tipoCombustivel, Long cdTabelaFipe, Integer quilometragem) {
        this.cdVeiculo = cdVeiculo;
        this.cdTipoVeiculo = cdTipoVeiculo;
        this.placa = placa;
        this.chassi = chassi;
        this.valor = valor;
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.tipoCombustivel = tipoCombustivel;
        this.cdTabelaFipe = cdTabelaFipe;
        this.quilometragem = quilometragem;
    }

    public Long getCdVeiculo() {
        return cdVeiculo;
    }

    public void setCdVeiculo(Long cdVeiculo) {
        this.cdVeiculo = cdVeiculo;
    }

    public Integer getCdTipoVeiculo() {
        return cdTipoVeiculo;
    }

    public void setCdTipoVeiculo(Integer cdTipoVeiculo) {
        this.cdTipoVeiculo = cdTipoVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Integer anoModelo) {
        this.anoModelo = anoModelo;
    }

    public CdTipoCombustivelEnum getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(CdTipoCombustivelEnum tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Long getCdTabelaFipe() {
        return cdTabelaFipe;
    }

    public void setCdTabelaFipe(Long cdTabelaFipe) {
        this.cdTabelaFipe = cdTabelaFipe;
    }

    public Integer getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Integer quilometragem) {
        this.quilometragem = quilometragem;
    }
}
