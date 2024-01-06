package project.ymf.src.purchaseMate.entity;

import jakarta.persistence.*;
import project.ymf.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PurchaseMate")
public class PurchaseMate extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "purchase_mate_id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "total_price", nullable = false)
    private int totalPrice;

    @Column(name = "my_price", nullable = false)
    private int myPrice;

    @Column(name = "product_url", nullable = false)
    private String productUrl;

    @Column(name = "product_description", nullable = false)
    private String productDescription;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "open_kakao_url", nullable = false)
    private String openKakaoUrl;
}
