package com.jacademy.a02mvc.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;
import com.jacademy.a02mvc.jsonview.Views;

public class AjaxResponseBody {

	@JsonView(Views.Public.class)
	private String msg;

	@JsonView(Views.Public.class)
	private String code;

	@JsonView(Views.Public.class)
	private List<User> result;

	public AjaxResponseBody() {}

	public AjaxResponseBody(String msg, String code, List<User> result) {
		this.msg = msg;
		this.code = code;
		this.result = result;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<User> getResult() {
		return result;
	}

	public void setResult(List<User> result) {
		this.result = result;
	}
}
