package com.rastreioescolar.front.model;

@Entity
@Table(name="estudante")
public class Estudante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Id
    private Long id_instituicao;
    @Id
    private Long id_veiculo;

    @OneToMany
    @JoinColumn (name = "nome_insituicao")
    private String nome_instituicao;

    private String nome;
    private String endereco;
    private String email;
    private String telefone;

    private String condicao;

    @Enumerated(EnumType.STRING) //enum salvo como texto
    @Column(name="statusAtual")
    private String status_saude;

    private String status;

    public enum Status_saude{
        SAUDAVEL,
        DOENTE
    }

    public String getNome_instituicao() {
        return nome_instituicao;
    }

    public void setNome_instituicao(String nome_instituicao) {
        this.nome_instituicao = nome_instituicao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public String getStatus_saude() {
        return status_saude;
    }

    public void setStatus_saude(String status_saude) {
        this.status_saude = status_saude;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
