package br.com.alura.loja.service;

import br.com.alura.loja.entities.Item;
import br.com.alura.loja.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService extends AService<Item, ItemRepository> {

    @Autowired
    ItemRepository repository;

    public ItemService(ItemRepository repository) {
        super.repository = repository;
    }
}
