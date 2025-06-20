package br.com.javaprometheus.domain.service;

import br.com.javaprometheus.domain.exceptions.NaoEncontradoException;
import br.com.javaprometheus.domain.model.Usuario;
import br.com.javaprometheus.domain.model.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    UsuarioService(UsuarioRepository usuarioReposory) {
        this.usuarioRepository = usuarioReposory;
    }

    public Usuario buscarPorNome(String nome) throws NaoEncontradoException {
        return usuarioRepository.findByNome(nome)
                .orElseThrow(() -> new NaoEncontradoException("Usuário de nome " + nome + " não encontrado."));
    }

    public List<Usuario> buscarTodos() {
        return usuarioRepository.findAll();
    }
}
