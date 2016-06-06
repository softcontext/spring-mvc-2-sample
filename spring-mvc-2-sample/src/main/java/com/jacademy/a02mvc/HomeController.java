package com.jacademy.a02mvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jacademy.a02mvc.exception.CustomGenericException;
import com.jacademy.a02mvc.exception.OneException;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value={"/lazy"})
	public void lazyMapping(){
		/*
		 * 리턴자료형이 void인 경우 접근 url패턴을 뷰를 가리키는 값으로 사용한다.
		 * return "lazy"; 한 결과와 같다.
		 */
	}
	
	/*
	 * @ExceptionHandler is only apply to a single controller, 
	 * to apply it globally (all controllers), 
	 * annotate a class with @ControllerAdvice.
	 */
	// 3을 0으로 나누려고 시도할 때 발생하는 예외는 ArithmeticException이고, errorArithmetic.jsp 뷰가 연결된다.
	@ExceptionHandler({ArithmeticException.class})
	public ModelAndView error404(Exception ex){
		ModelAndView mav = new ModelAndView("error/errorArithmetic");
		mav.addObject("errMsg", ex.getMessage());
		return mav;
	}
	
	@RequestMapping("/divide")
	public String divide(){
		int number = 3/0;
		return "error/divide";
	}
	
	@RequestMapping("/throw")
	public String doThrow() throws Exception{
		throw new Exception("직접 발생시킨 예외");
	}
	
	@RequestMapping("/custom_exception")
	public String doThrowCustomGenericException() throws Exception{
		throw new CustomGenericException("1004", "개발자가 만든 예외가 발생");
	}
	
	@RequestMapping("/one_exception")
	public String doThrowOneException() throws Exception{
		throw new OneException("예외를 던지자!");
	}
	
	@RequestMapping(path={"/ajax"}, params="sample")
	public String start(){
		return "welcome";
	}
}
