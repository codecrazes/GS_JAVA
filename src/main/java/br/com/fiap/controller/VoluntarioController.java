package br.com.fiap.controller;

import br.com.fiap.entity.Voluntario;
import br.com.fiap.service.VoluntarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voluntarios")
public class VoluntarioController {

    @Autowired
    private VoluntarioService service;

    @GetMapping
    public List<Voluntario> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Voluntario buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Voluntario salvar(@RequestBody Voluntario voluntario) {
        return service.salvar(voluntario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
