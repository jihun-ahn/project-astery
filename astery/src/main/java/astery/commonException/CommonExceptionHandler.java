package astery.commonException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import astery.exception.AlreadyExistionMemberException;
import astery.exception.NotMatchingException;

@ControllerAdvice("spring")
public class CommonExceptionHandler {
	
	@ExceptionHandler(AlreadyExistionMemberException.class)
	public String handlerAlreadyExistionMemberException(AlreadyExistionMemberException e) {
		return "error/existion";
	}
	
	@ExceptionHandler(RuntimeException.class)
	public String handlerRuntimeException(RuntimeException e) {
		return "error/commonException";
	}
	
	@ExceptionHandler(NotMatchingException.class)
	public String handlerNotMatchingException(NotMatchingException e) {
		return "error/notmatching";
	}
	
}
