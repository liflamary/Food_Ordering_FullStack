package com.zosh.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
    @ManyToOne
        private String customer;
    @JsonIgnore
    @ManyToOne
        private Restaurant restaurant;
        private Long totalAmount;
        private String orderStatus;
        @ManyToOne
        private Address deliveryAddress;
        @OneToMany
        private List<OrderItem> items;
        private int totalItem;
        private int totalPrice;

}
