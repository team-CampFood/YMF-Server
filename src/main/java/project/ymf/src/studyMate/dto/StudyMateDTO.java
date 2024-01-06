package project.ymf.src.studyMate.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import project.ymf.common.entity.BaseState;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(description = "스터디 메이트 게시글 정보")
public class StudyMateDTO {
    @ApiModelProperty(value = "게시물 id", position = 1)
    private Long studyId;

    @ApiModelProperty(value = "게시물 제목", position = 2)
    private String title;

    @ApiModelProperty(value = "최대인원", position = 3)
    private int maximumPeople;

    @ApiModelProperty(value = "현재인원", position = 3)
    private int currentPeople;

    @ApiModelProperty(value = "목적", position = 6)
    private String purpose;

    @ApiModelProperty(value = "기간", position = 7)
    private String period;

    @ApiModelProperty(value = "신청상태", position = 7)
    private BaseState state;

}
