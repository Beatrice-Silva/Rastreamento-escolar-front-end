package com.rastreioescolar.front.model;

@Entity
@Table(name="transportadora")
public class Transportadora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome_estabelecimento;
    private String email;
    private String endereco;

    @Enumerated(EnumType.STRING) //enum salvo como texto
    private ativo ativo;

    public enum ativo{
        ATIVO,
        INATIVO

    }

    public ativo getAtivo() {
        return ativo;
    }

    public void setAtivo(ativo ativo) {
        this.ativo = ativo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome_estabelecimento() {
        return nome_estabelecimento;
    }

    public void setNome_estabelecimento(String nome_estabelecimento) {
        this.nome_estabelecimento = nome_estabelecimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
