package project.ymf.common.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode {


    //register
    Example(200,"예시", "예시");

    private final int status;
    private final String code;
    private final String message;
}
