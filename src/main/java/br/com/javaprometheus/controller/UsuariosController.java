package br.com.javaprometheus.controller;

import br.com.javaprometheus.domain.model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuariosController {

    @GetMapping
    public ResponseEntity<Set<Usuario>> buscarTodos() {
        Usuario usuarioLucas = new Usuario.Builder().id(1L).nome("Lucas").login("lucasbref82").senha("root").build();
        Usuario usuarioLarissa = new Usuario.Builder().id(2L).nome("Larissa").login("larissamurta").senha("1234").build();
        Set<Usuario> usuarios = new HashSet<>(List.of(usuarioLucas, usuarioLarissa));
        return ResponseEntity.ok(usuarios);
    }

    @GetMapping("/{nome}")
    public ResponseEntity<Usuario> buscarPorNome(@PathVariable() String nome) {
        return ResponseEntity.ok(new Usuario.Builder().id(1L).nome(nome).login("root").senha("root").build());
    }

}
