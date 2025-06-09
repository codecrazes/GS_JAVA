package br.com.fiap.controller;

import br.com.fiap.entity.PontoApoio;
import br.com.fiap.service.PontoApoioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pontos-apoio")
public class PontoApoioController {

    @Autowired
    private PontoApoioService service;

    @GetMapping
    public List<PontoApoio> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public PontoApoio buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public PontoApoio salvar(@RequestBody PontoApoio ponto) {
        return service.salvar(ponto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

    @PutMapping("/{id}")
    public PontoApoio atualizar(@PathVariable Long id, @RequestBody PontoApoio ponto) {
        return service.atualizar(id, ponto);
    }
}
