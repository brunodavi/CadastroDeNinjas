package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissaoModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
public class NinjaController {
    @GetMapping
    public List<NinjaModel> listarNinjas() {
        return List.of();
    }

    @GetMapping("{id}")
    public NinjaModel obterNinja(Long id) {
        return new NinjaModel();
    }

    @PostMapping
    public NinjaModel criarNinja(NinjaModel ninjaModel) {
        return ninjaModel;
    }

    @PutMapping
    public NinjaModel atualizarNinja(NinjaModel ninjaModel) {
        return ninjaModel;
    }

    @DeleteMapping
    public NinjaModel removerNinja(Long id) {
        return new NinjaModel();
    }

    @PostMapping("{ninjaId}")
    public MissaoModel atribuirMissao(Long ninjaId, Long missaoId) {
        return new MissaoModel();
    }
}