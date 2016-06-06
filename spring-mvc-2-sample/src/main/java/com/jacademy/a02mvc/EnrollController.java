package com.jacademy.a02mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.jacademy.a02mvc.model.Member;

@Controller
@RequestMapping("/enroll")

/*
 * 모델 오브젝트를 세션에 저장했다가 사용한다.
 * @ModelAttribute("member")에서 사용하는 VO의 키값을 사용한다.
 */
@SessionAttributes("member")
public class EnrollController {
	
	//다음을 선언하지 않으면 org.springframework.web.HttpSessionRequiredException
	//예외가 발생한다.
	@ModelAttribute("member")
	public Member makeForm(){
		return new Member();
	}

	@RequestMapping(params="action=one")
	public String one(){
		return "enroll/enroll_one";
	}
	
	/*
	 * 뷰의 폼에서 넘긴 name의 값을 member객체를 대상으로 이름이 일치하는 경우 필드변수에 넣는다.
	 */
	@RequestMapping(params="action=two")
	public String two(@ModelAttribute("member") Member member){
		return "enroll/enroll_two";
	}
	
	/*
	 * address값을 member 객체의 address 필드변수에 넣는다.
	 * 이전에 넣었던 name 값은 존재하지 않는다. 
	 * --> @SessionAttributes("member")로 설정하여 값을 유지 시킬 수 있다.
	 * 설정 되었다면 세션으로부터 값을 가져와 member객체에 넣은 후 뷰의 폼으로부터 넘어 온
	 * 값을 넣게 된다.
	 */
	@RequestMapping(params="action=three")
	public String three(
			@ModelAttribute("member") Member member,
			SessionStatus sessionStatus){
		
		/*
		 * 세션 내에 모델 오브젝트를 저장할 필요가 없을 경우 작업 완료 메소드를 호출해서 
		 * 세션안에 저장된 오브젝트를 제거한다.
		 * member객체의 값을 DAO에 넘겨 디비에 저장한 후(쓸모가 더 없으므로)
		 * 세션에 저장하여 사용했던 member객체 정보를 파기한다.
		 */
		sessionStatus.setComplete();
		
		return "enroll/enroll_result";
	}
}
