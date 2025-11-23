package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissaoModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/ninja")
public class NinjaController {
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinja();
    }

    @GetMapping("/{id}")
    public NinjaModel obterNinja(@PathVariable Long id) {
        NinjaModel ninja = ninjaService.obterNinja(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Ninja não encontrado"));

        return ninja;
    }

    @PostMapping
    public NinjaModel criarNinja(NinjaModel ninjaModel) {
        return ninjaModel;
    }

    @PutMapping
    public NinjaModel atualizarNinja(NinjaModel ninjaModel) {
        return ninjaModel;
    }

    @DeleteMapping("/{id}")
    public NinjaModel removerNinja(@PathVariable Long id) {
        return new NinjaModel();
    }

    @PostMapping("/{ninjaId}")
    public MissaoModel atribuirMissao(@PathVariable Long ninjaId, Long missaoId) {
        return new MissaoModel();
    }
}