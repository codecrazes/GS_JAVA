package br.com.fiap.service;

import br.com.fiap.entity.FormularioFamilia;
import br.com.fiap.repository.FormularioFamiliaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormularioFamiliaService {

    @Autowired
    private FormularioFamiliaRepository repository;

    public List<FormularioFamilia> listar() {
        return repository.findAll();
    }

    public FormularioFamilia buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public FormularioFamilia salvar(FormularioFamilia formulario) {
        return repository.save(formulario);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public FormularioFamilia atualizar(Long id, FormularioFamilia familia) {
        familia.setId(id);
        return repository.save(familia);
    }
}
