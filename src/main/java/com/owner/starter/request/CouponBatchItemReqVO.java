package com.owner.starter.request;

import com.owner.starter.annotation.CheckMinMax;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CouponBatchItemReqVO {

    @NotNull(message = "用户范围类型不允许为空")
    @CheckMinMax(min = "1", max = "2", message = "用户范围类型不支持")
    private Integer userRangeType;


}
