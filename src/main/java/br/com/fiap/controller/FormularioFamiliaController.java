package br.com.fiap.controller;

import br.com.fiap.entity.FormularioFamilia;
import br.com.fiap.service.FormularioFamiliaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/familias")
public class FormularioFamiliaController {

    @Autowired
    private FormularioFamiliaService service;

    @GetMapping
    public List<FormularioFamilia> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public FormularioFamilia buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public FormularioFamilia salvar(@RequestBody FormularioFamilia familia) {
        return service.salvar(familia);
    }

    @PutMapping("/{id}")
    public FormularioFamilia atualizar(@PathVariable Long id, @RequestBody FormularioFamilia familiaAtualizada) {
        return service.atualizar(id, familiaAtualizada);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
