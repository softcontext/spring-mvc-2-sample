package com.jacademy.a02mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/board")
public class BoardController {

	/*
	 * 클래스 상단에 매핑 그룹이름을 board라 두고
	 * 각 액션마다의 처리구분은 파라미터를 사용한다.
	 */
	//게시판 첫 화면, 리스트화면
	@RequestMapping(params="action=list")
	public String list(){
		return "board/list";
	}
	
	//글 작성화면
	@RequestMapping(params="action=write")
	public String write(){
		return "board/write";
	}
	
	//글 작성완료 시: 폼으로 받은 정보를 파라미터로 받고 디비에 저장을 요청하는 로직이 위치한다.
	@RequestMapping(params="action=writeup")
	public String writeup(HttpServletRequest request,
			RedirectAttributes redirectAttr){
		
		String title = request.getParameter("title");
		System.out.println("title: " + title);
		
		redirectAttr.addFlashAttribute("title", title);
		
		//뷰(jsp)를 지정하는 것이 아니라 접근 URL패턴으로 처리한다.
		return "redirect:board?action=view";
	}
	
	@RequestMapping(params="action=view")
	public String view(){
		return "board/view";
	}
}
