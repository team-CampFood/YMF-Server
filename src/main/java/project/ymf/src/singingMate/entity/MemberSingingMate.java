package project.ymf.src.singingMate.entity;

import jakarta.persistence.*;
import project.ymf.common.entity.BaseEntity;
import project.ymf.common.entity.BaseState;
import project.ymf.common.entity.Role;
import project.ymf.src.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Member_SingingMate")
public class MemberSingingMate extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_singing_mate_id", nullable = false)
    private Long id;

    @Column(name = "role", nullable = false)
    private Role role;

    @Column(name = "status", nullable = false)
    private BaseState status;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "singing_mate_id", nullable = false)
    private SingingMate singingMate;
}
