package project.ymf.src.purchaseMate.dto;

import lombok.Getter;

@Getter
public class PurchaseMateRequest {

    private String title;
    private int maximumPeople;
    private String productName;
    private int price;
    private String productUrl;
    private String description;
    private String location;
}
