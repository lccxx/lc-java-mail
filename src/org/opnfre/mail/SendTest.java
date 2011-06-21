package org.opnfre.mail;

import junit.framework.TestCase;

public class SendTest extends TestCase {
	public void testSend() {
		Send send = new Send("51pass.org");
		send.setSubject("Test sendmail by LcJavaMail，中文也没问题");
		send.setFrom("liuchong <liuchong@51pass.org>");
		send.addTo("刘冲", "liuchong14@gmail.com");
		send.addBcc("Liu Chong", "liuchong@opnfre.org");
		send.setMessage("<h2>Hi!</h2>\n\tTest，测试，中文");
		send.go();
	}
}