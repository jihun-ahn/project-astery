package astery.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ChangeProfileCommandValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return ChangeProfileCommandValidator.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nickname", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required");
	}

}
