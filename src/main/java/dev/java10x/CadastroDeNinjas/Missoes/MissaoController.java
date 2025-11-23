package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/missao")
public class MissaoController {
    private MissaoService missaoService;

    public MissaoController(MissaoService missaoService) {
        this.missaoService = missaoService;
    }

    @GetMapping
    public List<MissaoModel> listarMissoes() {
        return missaoService.listarMissoes();
    }

    @GetMapping("/{id}")
    public MissaoModel obterMissao(@PathVariable Long id) {
        MissaoModel missao = missaoService.obterMissao(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Missão não encontrada"));

        return missao;
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

    @PostMapping("/{missaoId}")
    public List<NinjaModel> atribuirNinjas(@PathVariable Long missaoId, Long[] ninjaId) {
        return List.of();
    }
}
