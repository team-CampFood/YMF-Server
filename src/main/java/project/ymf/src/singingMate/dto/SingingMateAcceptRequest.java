package project.ymf.src.singingMate.dto;

import lombok.Getter;
import project.ymf.src.singingMate.entity.SingingMateApply;

import java.util.List;

@Getter
public class SingingMateAcceptRequest {
    List<SingingMateApplies> data;
}
