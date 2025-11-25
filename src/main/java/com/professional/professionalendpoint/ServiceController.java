package com.professional.professionalendpoint;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/api/serv")
public class ServiceController {
    private final List<Services> servicos = new ArrayList<>();
    private long nextId = 1;

    @GetMapping
    public List<Services> lsTodosServicos() {
        return servicos;
    }
    @GetMapping("/{id}")
    public Services buscarPorId(@PathVariable Long id) {
        // loop tradicional em vez de stream()
        for (Services serv : servicos) {
            if (serv.getId().equals(id)) {
                return serv;
            }
        }
        return null;            // ou lance exceção, se preferir
    }


    @PostMapping
    public Services criarServ(@RequestBody Services novoServ) {
        novoServ.setId(nextId++);
        servicos.add(novoServ);
        return novoServ;
    }
    @PutMapping("/{id}")
    public Services atualizarProf(@PathVariable Long id,
                                      @RequestBody Services atualizado) {

        Services existente = buscarPorId(id);
        if (existente != null) {
            existente.setNome(atualizado.getNome());
            existente.setDescricao(atualizado.getDescricao());
            existente.setLocalizacao(atualizado.getLocalizacao());
            existente.setData(atualizado.getData());
            existente.setPreco(atualizado.getPreco());
            existente.setPrazo(atualizado.getPrazo());
        }
        return existente;       // pode devolver 404 se for null
    }
    @DeleteMapping("/{id}")
    public void removerServ(@PathVariable Long id) {
        // iterator clássico para remover sem usar removeIf/lambda
        for (Iterator<Services> serv = servicos.iterator(); serv.hasNext(); ) {
            if (serv.next().getId().equals(id)) {
                serv.remove();
                break;
            }
        }
    }
}
