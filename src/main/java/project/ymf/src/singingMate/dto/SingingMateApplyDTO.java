package project.ymf.src.singingMate.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import project.ymf.common.entity.BaseState;
import project.ymf.src.singingMate.entity.SingingMateApply;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(description = "노래방 메이트 신청자 정보")
public class SingingMateApplyDTO {
    @ApiModelProperty(value = "신청 id", position = 1)
    private Long singingMateApplyId;

    @ApiModelProperty(value = "신청자 id", position = 2)
    private Long memberId;

    @ApiModelProperty(value = "신청상태", position = 3)
    private BaseState state;

}
