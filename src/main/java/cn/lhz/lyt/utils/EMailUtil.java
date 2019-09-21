package cn.lhz.lyt.utils;

import cn.lhz.lyt.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.TemplateEngine;

/**
 * @author lhz
 * @date 2019/9/21 13:06
 */
public class EMailUtil
{
    @Autowired
    private static MailService mailService;

    @Autowired
    private static TemplateEngine templateEngine;

    public EMailUtil()
    {
    }

    public static void registerEmail(String address)
    {
        String content="<html>\n" +
       	                "<body>\n" +
       	                "    <h3>hello world ! 这是一封html邮件!</h3>\n" +
       	                "</body>\n" +
       	                "</html>";
       	        mailService.sendHtmlMail(address,"这是一封HTML邮件",content);
    }
}