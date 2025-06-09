package br.com.fiap.service;

import br.com.fiap.entity.PontoApoio;
import br.com.fiap.repository.PontoApoioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PontoApoioService {

    @Autowired
    private PontoApoioRepository repository;

    public List<PontoApoio> listar() {
        return repository.findAll();
    }

    public PontoApoio buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public PontoApoio salvar(PontoApoio ponto) {
        return repository.save(ponto);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public PontoApoio atualizar(Long id, PontoApoio ponto) {
        ponto.setId(id);
        return repository.save(ponto);
    }
}
