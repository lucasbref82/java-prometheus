package br.com.javaprometheus.controller;

import br.com.javaprometheus.domain.dto.MensagemRetornoDTO;
import br.com.javaprometheus.domain.exceptions.NaoEncontradoException;
import br.com.javaprometheus.domain.model.Usuario;
import br.com.javaprometheus.domain.service.UsuarioService;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<MensagemRetornoDTO> buscarTodos() {
        try {
            List<Usuario> usuarios = usuarioService.buscarTodos();
            return ResponseEntity.ok(
                    MensagemRetornoDTO.sucesso(usuarios)
            );
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(MensagemRetornoDTO.erro(e.getMessage()));
        }


    }

    @GetMapping("/{id}")
    public ResponseEntity<MensagemRetornoDTO> buscarPorId(Long id) {
        try {
            Usuario usuario  = usuarioService.buscarPorId(id);
            return ResponseEntity.ok(MensagemRetornoDTO.sucesso(usuario));
        } catch (NaoEncontradoException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(MensagemRetornoDTO.erro(e.getMessage()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(MensagemRetornoDTO.erro(e.getMessage()));
        }
    }
}
