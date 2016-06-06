package com.jacademy.a02mvc.valid;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.jacademy.a02mvc.model.Login;

public class LoginValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Login.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		/*
		 * 타겟인 Login객체의 id를 체크한다.
		 * 비어있다면 login.properties에 required.id라는 키로 등록된 문자열을 표시한다.
		 * 등록된 키가 없다면 디폴트 값을 표시한다. "아이디가 필요합니다."
		 */
		ValidationUtils.rejectIfEmptyOrWhitespace(
				errors, "id", "required.id", "[아이디가 필요합니다.]");
		ValidationUtils.rejectIfEmptyOrWhitespace(
				errors, "pw", "required.pw", "[패스워드가 필요합니다.]");
		
		Login login = (Login) target;
		
		if(login.getId().length() < 5){
			errors.rejectValue("id", "short.id", "#아이디 길이가 너무 짧습니다.#");
		}
		
		if(!(login.getId().equals("admin"))){
			errors.rejectValue("id", "notmatch.id", "#아이디가 일치하지 않습니다.#");
		}
		
		if(!(login.getPw().equals("1234"))){
			errors.rejectValue("pw", "notmatch.pw", "#패스워드가 일치하지 않습니다.#");
		}
		
	}

}
