package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titulo;
    private String descricao;
    private boolean missaoConcluida;
    private MissaoNivelEnum missaoNivelEnum;

    // Uma missão para muitos ninjas
    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninjasAtribuidos;

    public MissaoModel() {
    }

    public MissaoModel(String titulo, String descricao, MissaoNivelEnum missaoNivelEnum) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.missaoNivelEnum = missaoNivelEnum;
    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isMissaoConcluida() {
        return missaoConcluida;
    }

    public void setMissaoConcluida(boolean missaoConcluida) {
        this.missaoConcluida = missaoConcluida;
    }

    public MissaoNivelEnum getMissaoNivelEnum() {
        return missaoNivelEnum;
    }

    public void setMissaoNivelEnum(MissaoNivelEnum missaoNivelEnum) {
        this.missaoNivelEnum = missaoNivelEnum;
    }

    public List<NinjaModel> getNinjasAtribuidos() {
        return ninjasAtribuidos;
    }

    public void setNinjasAtribuidos(List<NinjaModel> ninjasAtribuidos) {
        this.ninjasAtribuidos = ninjasAtribuidos;
    }
}
