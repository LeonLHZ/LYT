package cn.lhz.lyt;

import cn.lhz.lyt.dao.UserMapper;
import cn.lhz.lyt.pojo.User;
import cn.lhz.lyt.service.MailService;
import freemarker.template.Template;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;


import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LytApplicationTests
{

    @Autowired
    private MailService mailService;

    @Autowired
       private FreeMarkerConfigurer configurer;

    @Autowired
    private UserMapper mapper;

    /*@Test
    public void testSql()
    {
        User user = new User();
        user.setUserId("qwewqe");
        mapper.insert(user);
    }

    @Test
    public void testSimpleMail() throws Exception
    {
        mailService.sendSimpleMail("760843690@qq.com", "这是一封简单邮件", "大家好，这是我的第一封邮件！");
    }

    @Test
    public void testHtmlMail() throws Exception
    {
        String content = "<html>" +
                "<body>" +
                "hello world ! 这是一封html邮件!" +
                "</body>" +
                "</html>";
        String me = "<a href='www.baidu.com'>点击</a>";
        mailService.sendHtmlMail("760843690@qq.com", "这是一封HTML邮件", me);
    }

    @Test
    public void sendAttachmentsMail()
    {
        String filePath = "G:\\timg.jpg";
        mailService.sendAttachmentsMail("1306891240@qq.com", "主题：missing u baby！", "小蓝我的心来了！", filePath);
    }


    @Test
    public void sendInlineResourceMail()
    {
        String rscId = "neo006";
        String content = "<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ></body></html>";
        String imgPath = "C:\\bqs\\分期还打包目录\\test\\login-bg.jpg";

        mailService.sendInlineResourceMail("760843690@qq.com", "主题：这是有图片的邮件", content, imgPath, rscId);
    }


    *//**
     * 按照模板发送邮件
     *//*
    @Test
    public void sendTemplateMail()throws Exception
    {

        Map<String, Object> model = new HashMap<>();
             model.put("userId", "123");
        //创建邮件正文

        Template template = configurer.getConfiguration().getTemplate("emailTemplate.ftl");
        String text = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);

        mailService.sendHtmlMail("760843690@qq.com", "主题：这是模板邮件",text);
    }

    @Test
    public void insert()
    {
        User user=new User();
        user.setUserId("b2016481-dc6d-11e9-aa9d-0242ac110002");

        user.setUserState("0");

        System.out.println(mapper.updateByUser(user));
    }*/


}
