package br.com.javaprometheus.controller;

import br.com.javaprometheus.domain.model.Usuario;
import br.com.javaprometheus.domain.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuariosController {

    private final UsuarioService usuarioService;

    UsuariosController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> buscarTodos() {
        List<Usuario> usuarios = usuarioService.buscarTodos();
        return ResponseEntity.ok(usuarios);
    }

    @GetMapping("/{nome}")
    public ResponseEntity<Usuario> buscarPorNome(@PathVariable() String nome) {
        return ResponseEntity.ok(new Usuario.Builder().id(1L).nome(nome).login("root").senha("root").build());
    }

}
