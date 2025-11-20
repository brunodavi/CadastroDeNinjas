package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missao")
public class MissaoController {

    @GetMapping
    public List<MissaoModel> listarMissoes() {
        return List.of();
    }

    @GetMapping("{id}")
    public MissaoModel obterMissao(Long id) {
        return new MissaoModel();
    }

    @PostMapping
    public MissaoModel criarMissao(MissaoModel missaoModel) {
        return missaoModel;
    }

    @PutMapping
    public MissaoModel atualizarMissao(Long id, MissaoModel missaoModel) {
        return missaoModel;
    }

    @DeleteMapping
    public MissaoModel removerMissao(Long id) {
        return new MissaoModel();
    }

    @PostMapping("{missaoId}")
    public List<NinjaModel> atribuirNinjas(Long missaoId, Long[] ninjaId) {
        return List.of();
    }
}
