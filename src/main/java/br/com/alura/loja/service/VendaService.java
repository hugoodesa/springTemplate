package br.com.alura.loja.service;

import br.com.alura.loja.entities.Venda;
import br.com.alura.loja.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaService extends AService<Venda,VendaRepository> {

    @Autowired
    VendaRepository repository;

    public VendaService(VendaRepository repository) {
        super.repository = repository;
    }
}
