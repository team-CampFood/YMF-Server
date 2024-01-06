package project.ymf.src.singingMate.entity;

import jakarta.persistence.*;
import project.ymf.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SingingMate")
public class SingingMate extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "singing_mate_id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "max_recruited", nullable = false)
    private int maxRecruited;

    @Column(name = "cur_recruited", nullable = false)
    private int curRecruited;

    @Column(name = "meet_time")
    private LocalDateTime meetTime;

    @Column(name = "explanation", nullable = false)
    private String explanation;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "open_kakao_url", nullable = false)
    private String openKakaoUrl;


}
