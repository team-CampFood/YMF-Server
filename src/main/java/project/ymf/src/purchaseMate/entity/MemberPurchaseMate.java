package project.ymf.src.purchaseMate.entity;

import project.ymf.common.entity.BaseEntity;
import project.ymf.common.entity.BaseState;
import project.ymf.common.entity.Role;
import project.ymf.src.member.entity.Member;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Member_PurchaseMate")
public class MemberPurchaseMate extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_purchase_mate_id", nullable = false)
    private Long id;

    @Column(name = "role", nullable = false)
    private Role role;

    @Column(name = "status", nullable = false)
    private BaseState status;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "purchase_mate_id", nullable = false)
    private PurchaseMate purchaseMate;
}
