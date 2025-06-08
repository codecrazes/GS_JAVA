package br.com.fiap.service;

import br.com.fiap.entity.RelatorioAjuda;
import br.com.fiap.repository.RelatorioAjudaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelatorioAjudaService {

    @Autowired
    private RelatorioAjudaRepository repository;

    public List<RelatorioAjuda> listar() {
        return repository.findAll();
    }

    public RelatorioAjuda buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public RelatorioAjuda salvar(RelatorioAjuda relatorio) {
        return repository.save(relatorio);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
