package br.com.javaprometheus.domain.service;

import br.com.javaprometheus.domain.exceptions.NaoEncontradoException;
import br.com.javaprometheus.domain.model.Usuario;
import br.com.javaprometheus.domain.model.repository.UsuarioRepository;
import br.com.javaprometheus.utils.Utils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    UsuarioService(UsuarioRepository usuarioReposory) {
        this.usuarioRepository = usuarioReposory;
    }


    public List<Usuario> buscarTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new NaoEncontradoException(Utils.format("Usuário de id {} não encontrado.", id)));
    }
}
