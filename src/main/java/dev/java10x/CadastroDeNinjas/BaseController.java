package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BaseController {

    @GetMapping("/")
    public String rotaInicial() {
        return "Seja bem vindo a minha aplicação";
    }
}
