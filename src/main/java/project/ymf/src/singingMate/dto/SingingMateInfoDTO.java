package project.ymf.src.singingMate.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import project.ymf.common.entity.BaseState;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(description = "노래방 메이트 게시글 자세히보기 정보")
public class SingingMateInfoDTO {

    @ApiModelProperty(value = "게시물 id", position = 1)
    private Long singingId;

    @ApiModelProperty(value = "게시물 제목", position = 2)
    private String title;

    @ApiModelProperty(value = "최대인원", position = 3)
    private int maximumPeople;

    @ApiModelProperty(value = "현재인원", position = 3)
    private int currentPeople;

    @ApiModelProperty(value = "시간", position = 4)
    private LocalDateTime time;

    @ApiModelProperty(value = "상세정보", position = 5)
    private String description;

    @ApiModelProperty(value = "장소", position = 6)
    private String location;

    @ApiModelProperty(value = "신청상태", position = 7)
    private BaseState state;
}
