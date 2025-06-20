package br.com.javaprometheus.controller;

import br.com.javaprometheus.domain.model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuario")
public class IndexController {

    @GetMapping
    public ResponseEntity<String> init() {
        return ResponseEntity.ok("Requisição feita com sucesso !");
    }

    @GetMapping("/{nome}")
    public ResponseEntity<Usuario> retornaUsuario(@PathVariable String nome) {
        return ResponseEntity.ok(new Usuario.Builder().id(1L).nome(nome).login("root").senha("root").build());
    }
}
