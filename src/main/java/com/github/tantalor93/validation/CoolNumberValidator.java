package com.github.tantalor93.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CoolNumberValidator implements ConstraintValidator<CoolNumber, Object> {

	@Override
	public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
		boolean assignableFrom = Number.class.isAssignableFrom(o.getClass());
		if (!assignableFrom) {
			return false;
		}
		Number number = (Number) o;
		long val = number.longValue();
		return val > 0 && val < 5;
	}
}
