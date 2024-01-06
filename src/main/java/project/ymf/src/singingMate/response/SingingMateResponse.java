package project.ymf.src.singingMate.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import project.ymf.common.result.ResultCode;
import project.ymf.src.singingMate.dto.SingingMateDTO;

@Getter
@ApiModel(description = "노래방 메이트 게시글 응답 모델")
public class SingingMateResponse {

    @ApiModelProperty(value = "Http 상태 코드")
    private final int status;
    @ApiModelProperty(value = "Business 상태 코드")
    private final String code;
    @ApiModelProperty(value = "응답 메세지")
    private final String message;
    @ApiModelProperty(value = "응답 데이터")
    private final SingingMateDTO data;


    public SingingMateResponse(ResultCode resultCode, SingingMateDTO data) {
        this.status = resultCode.getStatus();
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.data = data;
    }

    public static SingingMateResponse of(ResultCode resultCode, SingingMateDTO data) {
        return new SingingMateResponse(resultCode, data);
    }
}
