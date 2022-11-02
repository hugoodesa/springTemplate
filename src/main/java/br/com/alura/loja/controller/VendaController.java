package br.com.alura.loja.controller;

import br.com.alura.loja.entities.Venda;
import br.com.alura.loja.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendas")
public class VendaController extends AController<Venda, VendaService> {

    @Autowired
    VendaService service;

    public VendaController(VendaService service) {
        super.service = service;
    }

    @Override
    @PostMapping
    public ResponseEntity<Venda> post(@RequestBody Venda entity) {
        return super.post(entity);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Venda> delete(@PathVariable Long id) {
        return super.delete(id);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Venda> put(@PathVariable Long id,@RequestBody Venda entity) {
        return super.put(id, entity);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Venda> find(@PathVariable Long id) {
        return super.find(id);
    }

    @Override
    @GetMapping("/all")
    public Page<Venda> findAll(@PageableDefault Pageable pageable) {
        return super.findAll(pageable);
    }
}
