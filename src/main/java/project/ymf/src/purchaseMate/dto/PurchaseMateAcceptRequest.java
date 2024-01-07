package project.ymf.src.purchaseMate.dto;

import lombok.Getter;
import project.ymf.common.entity.BaseState;

@Getter
public class PurchaseMateAcceptRequest {
    Long purchaseMateApplyId;
    BaseState state;
}
