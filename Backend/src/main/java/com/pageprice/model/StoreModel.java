package com.pageprice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Store")
public class StoreModel {
    @Id
    private int id;
    private String name;
    private String url;
    private boolean active;


}
