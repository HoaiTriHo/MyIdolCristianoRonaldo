package com.example.demo.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shoppingcart_id")
    private Long id;

    private int quantity;

    @ManyToOne
    @JoinColumn(name = "fk_customer")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "fk_product")
    private Product product;
}
