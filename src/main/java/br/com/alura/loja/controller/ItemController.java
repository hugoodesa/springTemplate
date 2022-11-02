package br.com.alura.loja.controller;

import br.com.alura.loja.entities.Item;
import br.com.alura.loja.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/itens")
public class ItemController extends AController<Item, ItemService>  {

    @Autowired
    ItemService service;

    public ItemController(ItemService service) {
        super.service = service;
    }

    @Override
    @PostMapping
    public ResponseEntity<Item> post(@RequestBody Item entity) {
        return super.post(entity);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Item> delete(@PathVariable Long id) {
        return super.delete(id);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Item> put(@PathVariable Long id,@RequestBody Item entity) {
        return super.put(id, entity);
    }

    @Override
    @GetMapping("/all")
    public Page<Item> findAll(@PageableDefault Pageable pageable) {
        return super.findAll(pageable);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Item> find(@PathVariable Long id) {
        return super.find(id);
    }
}
