package project.ymf.src.studyMate.dto;

import lombok.Getter;
import project.ymf.common.entity.BaseState;

@Getter
public class StudyMateAcceptRequest {
    Long studyMateApplyId;
    BaseState state;

}
