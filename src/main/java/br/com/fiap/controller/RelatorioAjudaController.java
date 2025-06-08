package br.com.fiap.controller;

import br.com.fiap.entity.RelatorioAjuda;
import br.com.fiap.service.RelatorioAjudaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/relatorios")
public class RelatorioAjudaController {

    @Autowired
    private RelatorioAjudaService service;

    @GetMapping
    public List<RelatorioAjuda> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public RelatorioAjuda buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public RelatorioAjuda salvar(@RequestBody RelatorioAjuda relatorio) {
        return service.salvar(relatorio);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
