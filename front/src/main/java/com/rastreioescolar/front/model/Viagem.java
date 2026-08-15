package com.rastreioescolar.front.model;

import java.time.DateTimeException;

@Entity
@Table(name="viagem")
public class Viagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Id
    private Long id_transportadora;

    @Id
    private Long id_instituicao;

    @Id
    private Long id_veiculo;

    private DateTimeException horario;

    private Long endereco;

    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_transportadora() {
        return id_transportadora;
    }

    public void setId_transportadora(Long id_transportadora) {
        this.id_transportadora = id_transportadora;
    }

    public Long getId_instituicao() {
        return id_instituicao;
    }

    public void setId_instituicao(Long id_instituicao) {
        this.id_instituicao = id_instituicao;
    }

    public Long getId_veiculo() {
        return id_veiculo;
    }

    public void setId_veiculo(Long id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public DateTimeException getHorario() {
        return horario;
    }

    public void setHorario(DateTimeException horario) {
        this.horario = horario;
    }

    public Long getEndereco() {
        return endereco;
    }

    public void setEndereco(Long endereco) {
        this.endereco = endereco;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
