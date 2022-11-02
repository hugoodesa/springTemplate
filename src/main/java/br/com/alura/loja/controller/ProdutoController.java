package br.com.alura.loja.controller;

import br.com.alura.loja.entities.Produto;
import br.com.alura.loja.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
public class ProdutoController extends AController<Produto, ProdutoService> {

    @Autowired
    ProdutoService service;

    public ProdutoController(ProdutoService service) {
        super.service = service;
    }

    @Override
    @PostMapping
    public ResponseEntity<Produto> post(@RequestBody Produto entity) {
        return super.post(entity);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Produto> delete(@PathVariable Long id) {
        return super.delete(id);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Produto> put(@PathVariable Long id,@RequestBody Produto entity) {
        return super.put(id, entity);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Produto> find(@PathVariable Long id) {
        return super.find(id);
    }

    @Override
    @GetMapping("/all")
    public Page<Produto> findAll(@PageableDefault Pageable pageable) {
        return super.findAll(pageable);
    }
}
