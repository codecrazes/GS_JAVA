package br.com.fiap.service;

import br.com.fiap.entity.Voluntario;
import br.com.fiap.repository.VoluntarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoluntarioService {

    @Autowired
    private VoluntarioRepository repository;

    public List<Voluntario> listar() {
        return repository.findAll();
    }

    public Voluntario buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Voluntario salvar(Voluntario voluntario) {
        return repository.save(voluntario);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
