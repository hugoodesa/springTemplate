package br.com.alura.loja.controller;

import br.com.alura.loja.entities.AEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface IController<Entity extends AEntity> {

    ResponseEntity<Entity> post (Entity entity);

    ResponseEntity<Entity> delete (Long id);

    ResponseEntity<Entity> find (Long id);

    Page<Entity> findAll (Pageable pageable);

    ResponseEntity<Entity> put (Long id,Entity entity);

}
