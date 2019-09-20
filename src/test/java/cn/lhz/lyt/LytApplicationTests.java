package cn.lhz.lyt;

import cn.lhz.lyt.dao.UserMapper;
import cn.lhz.lyt.pojo.User;
import cn.lhz.lyt.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LytApplicationTests {

	@Autowired
	private MailService mailService;

	@Autowired
	private TemplateEngine templateEngine;

	@Autowired
	private UserMapper mapper;
	@Test
	public void testSql() {
		User user = new User();
		user.setUserId("qwewqe");
		mapper.insert(user);
	}

	@Test
	    public void testSimpleMail() throws Exception {
	        mailService.sendSimpleMail("760843690@qq.com","这是一封简单邮件","大家好，这是我的第一封邮件！");
	    }

	    @Test
	    public void testHtmlMail() throws Exception {
	        String content="<html>\n" +
	                "<body>\n" +
	                "    <h3>hello world ! 这是一封html邮件!</h3>\n" +
	                "</body>\n" +
	                "</html>";
	        mailService.sendHtmlMail("760843690@qq.com","这是一封HTML邮件",content);
	    }

	    @Test
	    public void sendAttachmentsMail() {
	        String filePath="G:\\timg.jpg";
	        mailService.sendAttachmentsMail("1306891240@qq.com", "主题：missing u baby！", "小蓝我的心来了！", filePath);
	    }


	    @Test
	    public void sendInlineResourceMail() {
	        String rscId = "neo006";
	        String content="<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ></body></html>";
	        String imgPath = "C:\\bqs\\分期还打包目录\\test\\login-bg.jpg";

	        mailService.sendInlineResourceMail("760843690@qq.com", "主题：这是有图片的邮件", content, imgPath, rscId);
	    }


	    /**
	     * 按照模板发送邮件
	     */
	    @Test
	    public void sendTemplateMail() {
	        //创建邮件正文
	        Context context = new Context();
	        context.setVariable("id", "006");
	        String emailContent = templateEngine.process("template1", context);

	        mailService.sendHtmlMail("760843690@qq.com","主题：这是模板邮件",emailContent);
	    }


}
