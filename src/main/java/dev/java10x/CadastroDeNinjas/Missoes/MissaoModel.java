package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
}
