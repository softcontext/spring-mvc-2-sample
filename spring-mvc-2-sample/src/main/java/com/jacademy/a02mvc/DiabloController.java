package com.jacademy.a02mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/diablo")
public class DiabloController {

	/*
	 * @PathVariable: url패턴의 일부 정보를 파라미터로 받아서 처리한다.
	 * @PathVariable(value="id") String id: value값과 파라미터 변수명이 같은면 value선언은 생략이 가능하다.
	 */
	@RequestMapping("/asia/{id}")
	public String getInfo(@PathVariable(value="id") String id,
			Model model){
		if (id != null && !id.equals("")) {
			if (findInfoById(id)) {
				/*
				 * 디비에서 정보를 가져왔다고 생각하고 작성한 테스트용 가짜 정보
				 */
				List<String> list = new ArrayList<String>();
				list.add(id);
				list.add("홍길동");
				list.add("55");
				
				model.addAttribute("infoList", list);
			}
		}
		return "diablo/asia/asia";
	}

	private boolean findInfoById(String id) {
		/*
		 * 디비 조회 결과 성공했다고 가정하자.
		 */
		return true;
	}
}
