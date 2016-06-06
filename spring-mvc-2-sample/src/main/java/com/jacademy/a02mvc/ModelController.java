package com.jacademy.a02mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/model")
public class ModelController {

	@RequestMapping("/ret_string")
	public String retString(Model model, ModelMap map){
		
		/*
		 * Interface를 선호하는 개발자는 Model을 사용하고 
		 * 구현 클래스의 다른 기능이 필요한 개발자라면 ModelMap을 사용하자.
		 */
		model.addAttribute("modelKey", "Model로 저장한 속성 값");
		map.addAttribute("mapKey", "ModelMap으로 저장한 속성 값");
		
		/*
		 * 폴더명/파일명
		 * 리턴된 문자열은 뷰리졸버에 의해 완성된 URL이 컨트롤러에게 전달된다.
		 */
		return "model/ret_string";
	}
	
	@RequestMapping("/ret_modelandview")
	public ModelAndView retModelAndView(){
		/*
		 * 보여 줄 뷰 문자열을 생성자의 파라미터로 알려준다.
		 */
		ModelAndView mav = new ModelAndView("model/ret_modelandview");
		mav.addObject("mavKey", "ModelAndView로 저장한 속성 값");
		//뷰의 이름을 디폴트 생성자 상용 후 별도로 세터메소드로 설정할 수 있다.
		//mav.setViewName("model/ret_modelandview");
		
		return mav;
	}
}
