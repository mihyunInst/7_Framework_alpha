package edu.kh.comm.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.google.gson.Gson;

import edu.kh.comm.mail.model.service.EmailService;
import edu.kh.comm.member.model.vo.Member;

@Controller
@SessionAttributes({"loginMember"})
public class EmailController {
	
	  @Autowired
	  private EmailService service;	

	  @ResponseBody
	  @PostMapping("/sendEmail")
	  public String sendEmail(@RequestParam String mailContent,
		  					@ModelAttribute("loginMember") Member loginMember
			  				) { 
		  
		  System.out.println(mailContent);
		  
		  int result = service.sendEmail(mailContent, loginMember);
		  
		  System.out.println("요청 드러옴");
		  
		  if(result > 0) {
			  return new Gson().toJson("메일 전송 성공!");
		  } else {
			  return new Gson().toJson("메일 전송 실패 ㅠㅠ");
		  }
		  
		  
	  }
}
