package project.ymf.src.purchaseMate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import project.ymf.common.entity.BaseState;
import project.ymf.src.member.entity.Member;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PurchaseMateApply")
public class PurchaseMateApply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "purchase_mate_apply_id", nullable = false)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Column(name = "state", nullable = false)
    private BaseState state;
}
