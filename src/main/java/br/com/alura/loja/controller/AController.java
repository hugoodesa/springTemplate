package br.com.alura.loja.controller;

import br.com.alura.loja.entities.AEntity;
import br.com.alura.loja.service.AService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public abstract class AController<Entity extends AEntity,Service extends AService> implements IController<Entity> {

    AService service;

    @Override
    public ResponseEntity<Entity> post(Entity entity) {
        return this.service.post(entity);
    }

    @Override
    public ResponseEntity<Entity> delete(Long id) {
        return this.service.delete(id);
    }

    @Override
    public ResponseEntity<Entity> find(Long id) {
        return this.service.selectOne(id);
    }

    @Override
    public Page<Entity> findAll(Pageable pageable) {
        return this.service.findAll(pageable);
    }

    @Override
    public ResponseEntity<Entity> put(Long id, Entity entity) {
        return this.service.update(id,entity);
    }
}
