package com.jacademy.a02mvc;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jacademy.a02mvc.exception.OneException;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(value={OneException.class})
	@ResponseBody
	public String one(){
		return "OneException occured!";
	}
}
