package project.ymf.src.purchaseMate.dto;

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
@ApiModel(description = "공동구매 메이트 신청자 정보")
public class PurchaseMateApplyDTO {
    @ApiModelProperty(value = "신청 id", position = 1)
    private Long purchaseMateApplyId;

    @ApiModelProperty(value = "신청자 id", position = 2)
    private Long memberId;

    @ApiModelProperty(value = "신청상태", position = 3)
    private BaseState state;
}
