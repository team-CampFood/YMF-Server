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
@ApiModel(description = "스터디 메이트 신청자 정보")
public class StudyMateApplyDTO {
    @ApiModelProperty(value = "신청 id", position = 1)
    private Long studyMateApplyId;

    @ApiModelProperty(value = "신청자 id", position = 2)
    private Long memberId;

    @ApiModelProperty(value = "신청상태", position = 3)
    private BaseState state;
}
