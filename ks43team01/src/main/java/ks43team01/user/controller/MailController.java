package ks43team01.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ks43team01.dto.MailTO;
import ks43team01.service.MailService;


	@RestController
	@RequestMapping("/mail")
	public class MailController {

	    @Autowired
	    private MailService mailService;

	    @GetMapping("/email")
	    public MailTO sendTestMail(String email) {
	        MailTO mailTO = new MailTO();
	        String email1 = "anjdi1004@gmail.com";
	        mailTO.setAddress(email1);
	        mailTO.setTitle("산체스님이 발송한 이메일입니다.");
	        mailTO.setMessage("안녕하세요. 반가워요!하하하하");

	        mailService.sendMail(mailTO);

	        return mailTO;
	    }
	}

