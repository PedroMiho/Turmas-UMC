package com.dmgmodels.lojaRoupas.controller;

import com.dmgmodels.lojaRoupas.dto.DadosAtualizarRoupa;
import com.dmgmodels.lojaRoupas.dto.DadosCadastroRoupa;
import com.dmgmodels.lojaRoupas.model.Roupa;
import com.dmgmodels.lojaRoupas.repository.RoupaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins =  "*")
@RestController
@RequestMapping("/roupa")
public class ControllerProduto {

    @Autowired
    private RoupaRepository roupaRepository;

    @PostMapping
    @Transactional
    public void cadastrarProduto(@RequestBody DadosCadastroRoupa dados){
        roupaRepository.save(new Roupa(dados));
    }

    @GetMapping
    public List<Roupa> listarProdutos(){
        return roupaRepository.findAll();
    }

    @GetMapping("/nomeProduto/{nomeProduto}")
    public List<Roupa> listarProdutosPorNome(@PathVariable String nomeProduto){
        return roupaRepository.findByNomeProduto(nomeProduto);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deleteProduto(@PathVariable Long id){
        roupaRepository.deleteById(id);
    }

    @PutMapping
    @Transactional
    public void atualizarProduto(@RequestBody DadosAtualizarRoupa novosDados){
        var roupa = roupaRepository.getReferenceById(novosDados.id());
        roupa.atualizarRoupa(novosDados);
        System.out.println(roupa.toString());

    }



}
