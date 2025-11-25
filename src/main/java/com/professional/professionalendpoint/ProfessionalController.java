package com.professional.professionalendpoint;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/api/prof")
public class ProfessionalController {
    private final List<Professional> profissionais = new ArrayList<>();
    private long nextId = 1;
    @GetMapping
    public List<Professional> lsTodosProfissionais() {
        return profissionais;
    }

    @GetMapping("/{id}")
    public Professional buscarPorId(@PathVariable Long id) {
        // loop tradicional em vez de stream()
        for (Professional prof : profissionais) {
            if (prof.getId().equals(id)) {
                return prof;
            }
        }
        return null;            // ou lance exceção, se preferir
    }

    @PostMapping
    public Professional criarProf(@RequestBody Professional novoProf) {
        novoProf.setId(nextId++);
        profissionais.add(novoProf);
        return novoProf;
    }
    @PutMapping("/{id}")
    public Professional atualizarProf(@PathVariable Long id,
                              @RequestBody Professional atualizado) {

        Professional existente = buscarPorId(id);
        if (existente != null) {
            existente.setNome(atualizado.getNome());
            existente.setCep(atualizado.getCep());
            existente.setPassword(atualizado.getPassword());
            existente.setHabilidades(atualizado.getHabilidades());
            existente.setServicosBacklog(atualizado.getServicosBacklog());
            existente.setServicosAndamento(atualizado.getServicosAndamento());
            existente.setDisponibilidade(atualizado.getDisponibilidade());
            existente.setAgenda(atualizado.getAgenda());
            existente.setOrcamento(atualizado.getOrcamento());
        }
        return existente;       // pode devolver 404 se for null
    }
    @DeleteMapping("/{id}")
    public void removerProf(@PathVariable Long id) {
        // iterator clássico para remover sem usar removeIf/lambda
        for (Iterator<Professional> prof = profissionais.iterator(); prof.hasNext(); ) {
            if (prof.next().getId().equals(id)) {
                prof.remove();
                break;
            }
        }
    }
}
