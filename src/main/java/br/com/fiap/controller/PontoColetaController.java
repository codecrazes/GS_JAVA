package br.com.fiap.controller;

import br.com.fiap.entity.PontoColeta;
import br.com.fiap.service.PontoColetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pontos-coleta")
public class PontoColetaController {

    @Autowired
    private PontoColetaService service;

    @GetMapping
    public List<PontoColeta> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public PontoColeta buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public PontoColeta salvar(@RequestBody PontoColeta ponto) {
        return service.salvar(ponto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
