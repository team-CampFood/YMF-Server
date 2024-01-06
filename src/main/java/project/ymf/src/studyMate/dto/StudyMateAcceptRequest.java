package project.ymf.src.studyMate.dto;

import lombok.Getter;
import project.ymf.common.entity.BaseState;
import project.ymf.src.singingMate.dto.SingingMateApplies;

import java.util.List;

@Getter
public class StudyMateAcceptRequest {
    Long studyMateApplyId;
    BaseState state;

}
