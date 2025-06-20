package br.com.javaprometheus.domain.service;

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

    public Usuario buscarPorNome(String nome) {
        return usuarioRepository.findByNome(nome);
    }

    public List<Usuario> buscarTodos(){
        return usuarioRepository.findAll();
    }
}
