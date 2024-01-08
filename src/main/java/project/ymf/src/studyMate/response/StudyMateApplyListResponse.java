package project.ymf.src.studyMate.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import project.ymf.common.result.ResultCode;
import project.ymf.src.studyMate.dto.StudyMateApplyDTO;

import java.util.List;

@Getter
@ApiModel(description = "스터디 메이트 신청자 리스트 응답 모델")
public class StudyMateApplyListResponse {

    @ApiModelProperty(value = "Http 상태 코드")
    private final int status;
    @ApiModelProperty(value = "Business 상태 코드")
    private final String code;
    @ApiModelProperty(value = "응답 메세지")
    private final String message;
    @ApiModelProperty(value = "응답 데이터")
    private final List<StudyMateApplyDTO> data;


    public StudyMateApplyListResponse(ResultCode resultCode, List<StudyMateApplyDTO> data) {
        this.status = resultCode.getStatus();
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.data = data;
    }

    public static StudyMateApplyListResponse of(ResultCode resultCode, List<StudyMateApplyDTO> data) {
        return new StudyMateApplyListResponse(resultCode, data);
    }

}
