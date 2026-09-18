package com.urbanvibe.lojaRoupa.controller;

import com.urbanvibe.lojaRoupa.dto.DadosAtualizarRoupa;
import com.urbanvibe.lojaRoupa.dto.DadosCadastroRoupa;
import com.urbanvibe.lojaRoupa.model.Roupa;
import com.urbanvibe.lojaRoupa.repository.RoupaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roupa")
public class ControllerRoupa {

    @Autowired
    private RoupaRepository roupaRepository;

    @PostMapping
    public void cadastrarRoupa(@RequestBody DadosCadastroRoupa dados) {
        System.out.println(dados);
        roupaRepository.save(new Roupa(dados));
    }

    //Paginação
    @GetMapping
    public List<Roupa> listarRoupas() {
        return roupaRepository.findAll();
    }

    @GetMapping("/tipo/{tipo}")
    public List<Roupa> listarRoupasPorTipo(@PathVariable String tipo) {
        return roupaRepository.findByNomeProduto(tipo);
    }

    @GetMapping("/marca/{marca}")
    public List<Roupa> listarRoupasPorMarca(@PathVariable String marca) {
        return roupaRepository.findByMarca(marca);
    }

    @PutMapping
    @Transactional
    public void atualizarRoupa(@RequestBody DadosAtualizarRoupa dadosAtualizados) {
        var roupa = roupaRepository.getReferenceById(dadosAtualizados.id());
        roupa.atualizarDados(dadosAtualizados);
    }

    @DeleteMapping ("/{id}")
    @Transactional
    public void deletarRoupa(@PathVariable Long id) {
        roupaRepository.deleteById(id);
    }

    @GetMapping("/busca")
    public List<Roupa> listarRoupasPorBusca(@RequestParam (required = false) String tipo,
                                            @RequestParam (required = false) String marca) {
        return roupaRepository.findByNomeProdutoAndMarca(tipo, marca);
    }


}
