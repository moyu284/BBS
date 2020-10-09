package com.chen.controller;

import com.chen.pojo.Threads;
import com.chen.pojo.Topic;
import com.chen.pojo.User;
import com.chen.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 28444
 */
@Controller
public class TopicController {

    @Autowired
    @Qualifier("topicServiceImpl")
    private TopicService topicService;

    @RequestMapping("/bbs/topic")
    public String toTopic(int fid, Model model){
        List<Topic> topicList = topicService.getTopicListByFid(fid);
        model.addAttribute("topicList",topicList);
        return "/WEB-INF/bbs/viewTopic";
    }

    @RequestMapping("/bbs/post")
    public String postTopic(int fid, String subject, String content, Model model, HttpServletRequest req){
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        Topic topic = new Topic();
        Threads threads = new Threads();

        topic.setFid(fid);
        topic.setAuthorid(user.getId());
        topic.setAuthor(user.getUserName());
        topic.setSubject(subject);

        threads.setFid(fid);
        threads.setFtype(0);
        threads.setAuthor(user.getUserName());
        threads.setAuthorid(user.getId());
        threads.setSubject(subject);
        threads.setContent(content);

        topicService.saveTopic(topic,threads);

        List<Topic> topicList = topicService.getTopicListByFid(fid);
        model.addAttribute("topic",topicList);
        return "redirect:/bbs/topic?fid="+fid;
    }
}
