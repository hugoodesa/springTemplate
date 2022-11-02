package br.com.alura.loja.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface IService<Entity> {

    ResponseEntity<Entity> post(Entity entities);

    ResponseEntity<Entity> delete(Long id);

    ResponseEntity<Entity> selectOne(Long id);

    ResponseEntity<Entity> update(Long id,Entity entity);

    Page<Entity> findAll(Pageable pageable);

}
