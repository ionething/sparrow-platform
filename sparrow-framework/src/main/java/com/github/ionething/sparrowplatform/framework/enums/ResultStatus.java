package com.github.ionething.sparrowplatform.framework.enums;

import lombok.Getter;
import lombok.ToString;

/**
 * @author Vincent
 */

@ToString
public enum ResultStatus {

    SUCCESS(200, "处理成功"),
    DOING(300, "处理中"),
    FAILURE(400, "处理失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "无权访问"),
    VALIDATE_FAILED(406, "参数验证不通过"),
    ERROR(500, "内部异常")
    ;

    @Getter
    private final Integer code;

    @Getter
    private final String message;

    ResultStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
