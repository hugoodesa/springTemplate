package br.com.alura.loja.service;

import br.com.alura.loja.entities.AEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import java.util.Optional;

public abstract class AService<Entity extends AEntity,Repository extends JpaRepository<Entity,Long>> implements IService<Entity>  {

    Repository repository;

    ResponseEntity<Entity> badRequest () {
        return ResponseEntity.badRequest().build();
    }

    ResponseEntity<Entity> statusOK () {
        return ResponseEntity.ok().build();
    }

    ResponseEntity<Entity> statusOK (Entity entity) {
        return ResponseEntity.ok(entity);
    }

    @Override
    public ResponseEntity<Entity> post(Entity entity) {
        try {
            return statusOK(this.repository.save(entity));
        } catch (Exception e) {
            e.printStackTrace();
            return badRequest();
        }
    }

    @Override
    public ResponseEntity<Entity> delete(Long id) {
        try {
            this.repository.deleteById(id);
            return statusOK();
        } catch (Exception e) {
            e.printStackTrace();
            return badRequest();
        }
    }

    @Override
    public ResponseEntity<Entity> selectOne(Long id) {
        try {
            Optional<Entity> venda = this.repository.findById(id);

            if(venda.isPresent()) {
                return statusOK(venda.get());
            }
            return badRequest();

        } catch (Exception e) {
            e.printStackTrace();
            return badRequest();
        }
    }

    @Override
    public ResponseEntity<Entity> update(Long id, Entity venda) {

        Optional<Entity> vendaFinded = this.repository.findById(id);

        if(vendaFinded.isPresent()){
            venda.setId(id);
            this.repository.save(vendaFinded.get());

            return statusOK(vendaFinded.get());
        }

        return badRequest();
    }

    @Override
    public Page<Entity> findAll(Pageable pageable) {
        return this.repository.findAll(pageable);
    }

}
