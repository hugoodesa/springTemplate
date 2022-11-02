package br.com.alura.loja.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "produtos")
public class Produto extends AEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;
    private String nome;
    private BigDecimal preco;

}
