package project.ymf.src.purchaseMate.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(description = "공동구매 메이트 게시글 자세히보기 정보")
public class PurchaseMateInfoDTO {

    @ApiModelProperty(value = "게시물 id", position = 1)
    private Long purchaseId;

    @ApiModelProperty(value = "게시물 제목", position = 2)
    private String title;

    @ApiModelProperty(value = "최대인원", position = 3)
    private int maximumPeople;

    @ApiModelProperty(value = "현재인원", position = 3)
    private int currentPeople;

    @ApiModelProperty(value = "가격", position = 4)
    private int price;

    @ApiModelProperty(value = "구매링크", position = 2)
    private String productUrl;

    @ApiModelProperty(value = "상세정보", position = 5)
    private String description;

    @ApiModelProperty(value = "장소", position = 6)
    private String location;
}
