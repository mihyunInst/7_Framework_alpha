package edu.kh.comm.mail.model.service;

import java.util.HashMap;
import java.util.Map;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import edu.kh.comm.mail.model.dao.EmailDAO;
import edu.kh.comm.member.model.vo.Member;

@Service
public class EmailServiceImpl implements EmailService{

	@Autowired
    private EmailDAO dao;
    
    @Autowired
    private JavaMailSender mailSender;
    
    private String fromEmail = "";
    private String fromUsername = "";
    private String toEmail = "cmhinst@gmail.com";
    
	@Override
	public int sendEmail(String mailContent, Member loginMember) {
		
		try {
			fromEmail= loginMember.getMemberEmail();

			fromUsername = loginMember.getMemberNickname();
			
			MimeMessage mail = mailSender.createMimeMessage();
            
            // 제목
            String subject = "test";
            
            // 문자 인코딩
            String charset = "UTF-8";
            
            // 메일 내용
            String mailCt = "<p>"+mailContent+"</p>";
     
            
            
            // 송신자(보내는 사람) 지정
            mail.setFrom(new InternetAddress(fromEmail, fromUsername));
            // 수신자(받는사람) 지정
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            

            // 이메일 제목 세팅
            mail.setSubject(subject, charset);
            
            // 내용 세팅
            mail.setText(mailContent, charset, "html"); //"html" 추가 시 HTML 태그가 해석됨
            
            mailSender.send(mail);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Map<String, String> map = new HashMap<String, String>();
        map.put("mailContent", mailContent);
        map.put("mailTo", toEmail);
        map.put("mailFrom", fromEmail);
        
        System.out.println(map);
        
        int result = dao.sendEmail(map);
		return result;
       

	}
    

    

}
