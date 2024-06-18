package com.example.test.product;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    private Long id;
    private String category;
    private String paroductionRuler;//линейка товаров
    private String title;
    private String serialNumber;//серийный номер
    private String description;
    private int marketPrice;//рыночная цена
    private int purchasePrice;//закупоная цена
    private String comment;
}
