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
@ApiModel(description = "공동구매 메이트 게시글 정보")
public class PurchaseMateDTO {
    @ApiModelProperty(value = "게시물 id", position = 1)
    private Long purchaseId;

    @ApiModelProperty(value = "게시물 제목", position = 2)
    private String title;

    @ApiModelProperty(value = "최대인원", position = 3)
    private int maximumPeople;

    @ApiModelProperty(value = "현재인원", position = 4)
    private int currentPeople;

    @ApiModelProperty(value = "장소", position = 5)
    private String location;

    @ApiModelProperty(value = "상품", position = 6)
    private String product;

    @ApiModelProperty(value = "신청상태", position = 7)
    private BaseState state;
}
