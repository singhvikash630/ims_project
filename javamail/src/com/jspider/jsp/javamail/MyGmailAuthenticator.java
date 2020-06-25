package com.jspider.jsp.javamail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;


public class MyGmailAuthenticator extends Authenticator 
{
	protected PasswordAuthentication getPasswordAuthentication()
	{
	return new PasswordAuthentication("singh.vikash630@gmail.com","vikashsingh1");
	}

}
