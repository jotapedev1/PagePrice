package com.pageprice.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Document(collection = "Price")
public class PriceModel {
    @Id
    private String id;

    @Field(name="productId")
    private String productId;  //reference the product
    @Field(name="storeId")
    private String storeId; //reference the store

    private BigDecimal value;
    private String url;
    private boolean available;
    private LocalDateTime priceCollectedAt;

    public PriceModel() {
        priceCollectedAt = LocalDateTime.now();
    }

}
