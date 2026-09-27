package io.github.cursodsousa.produtosapi.controler;

import io.github.cursodsousa.produtosapi.model.Produto;
import io.github.cursodsousa.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {


    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody  Produto Produto){
        System.out.println("Produto salvo: " + Produto);

      var id =  UUID.randomUUID().toString();
        Produto.setId(id);

        produtoRepository.save(Produto);
        return Produto;
    }
    @GetMapping("/{id}")
    public Produto obterPorId(@PathVariable ("id") String id) {
        return produtoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable ("id") String id) {
        produtoRepository.deleteById(id);
    }
}
