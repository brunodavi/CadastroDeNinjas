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

    @GetMapping
    public NinjaModel obterNinja(long id) {
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
    public NinjaModel removerNinja(long id) {
        return new NinjaModel();
    }

    @PostMapping
    public MissaoModel atribuirMissao(long ninjaId, long missaoId) {
        return new MissaoModel();
    }
}