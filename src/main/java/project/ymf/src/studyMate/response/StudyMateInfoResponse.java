package project.ymf.src.studyMate.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import project.ymf.common.result.ResultCode;
import project.ymf.src.singingMate.dto.SingingMateInfoDTO;
import project.ymf.src.singingMate.response.SingingMateInfoResponse;
import project.ymf.src.studyMate.dto.StudyMateInfoDTO;


@Getter
@ApiModel(description = "스터디 메이트 상세정보 응답 모델")
public class StudyMateInfoResponse {

    @ApiModelProperty(value = "Http 상태 코드")
    private final int status;
    @ApiModelProperty(value = "Business 상태 코드")
    private final String code;
    @ApiModelProperty(value = "응답 메세지")
    private final String message;
    @ApiModelProperty(value = "응답 데이터")
    private final StudyMateInfoDTO data;


    public StudyMateInfoResponse(ResultCode resultCode, StudyMateInfoDTO data) {
        this.status = resultCode.getStatus();
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.data = data;
    }

    public static StudyMateInfoResponse of(ResultCode resultCode, StudyMateInfoDTO data) {
        return new StudyMateInfoResponse(resultCode, data);
    }
}
