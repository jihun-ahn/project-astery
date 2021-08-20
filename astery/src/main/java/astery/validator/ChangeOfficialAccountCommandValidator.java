package astery.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ChangeOfficialAccountCommandValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return ChangeOfficialAccountCommandValidator.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "official", "required");

	}

}
