package br.com.alura.loja.service;

import br.com.alura.loja.entities.Produto;
import br.com.alura.loja.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService extends AService<Produto,ProdutoRepository>{

    @Autowired
    ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        super.repository = produtoRepository;
    }
}
