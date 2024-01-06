package project.ymf.src.singingMate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import project.ymf.common.entity.BaseEntity;
import project.ymf.common.entity.BaseState;
import project.ymf.src.member.entity.Member;

import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SingingMateApply")
public class SingingMateApply extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "singing_mate_apply_id", nullable = false)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Column(name = "state", nullable = false)
    private BaseState state;

}
