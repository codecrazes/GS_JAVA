package br.com.fiap.service;

import br.com.fiap.entity.PontoColeta;
import br.com.fiap.repository.PontoColetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PontoColetaService {

    @Autowired
    private PontoColetaRepository repository;

    public List<PontoColeta> listar() {
        return repository.findAll();
    }

    public PontoColeta buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public PontoColeta salvar(PontoColeta ponto) {
        return repository.save(ponto);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public PontoColeta atualizar(Long id, PontoColeta ponto) {
        ponto.setId(id);
        return repository.save(ponto);
    }
}
