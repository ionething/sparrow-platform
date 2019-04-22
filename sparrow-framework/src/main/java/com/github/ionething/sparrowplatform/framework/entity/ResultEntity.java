package com.github.ionething.sparrowplatform.framework.entity;


import com.github.ionething.sparrowplatform.framework.enums.ResultStatus;
import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class ResultEntity<T> {

    @NonNull
    private Integer code;

    @NonNull
    private String message;

    private T data;

    public ResultEntity(T data) {
        this.code = ResultStatus.SUCCESS.getCode();
        this.message = ResultStatus.SUCCESS.getMessage();
        this.data = data;
    }

    public static ResultEntity statusToEntity(ResultStatus status) {
        return new ResultEntity(status.getCode(), status.getMessage());
    }

    public static ResultEntity ok() {
        return new ResultEntity(ResultStatus.SUCCESS.getCode(), ResultStatus.SUCCESS.getMessage());
    }

}
