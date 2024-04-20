package com.owner.starter.aspect;

import com.owner.starter.annotation.CheckMinMax;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * 参数范围校验
 * 校验CheckMinMax注解的值
 */
public class CheckMinMaxValidation implements ConstraintValidator<CheckMinMax, Integer> {

    private String min;

    private String max;

    @Override
    public void initialize(CheckMinMax constraintAnnotation) {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        long pass = Long.parseLong(value.toString());
        long minValue = Long.parseLong(min);
        long maxValue = Long.parseLong(max);
        return maxValue >= pass && pass >= minValue;
    }
}
