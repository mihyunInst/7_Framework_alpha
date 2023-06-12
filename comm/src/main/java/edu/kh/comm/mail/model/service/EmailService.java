package edu.kh.comm.mail.model.service;

import edu.kh.comm.member.model.vo.Member;

public interface EmailService {

	int sendEmail(String mailContent, Member loginMember);

}
