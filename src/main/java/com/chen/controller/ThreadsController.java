package com.chen.controller;

import com.chen.pojo.Threads;
import com.chen.pojo.User;
import com.chen.service.ThreadsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ThreadsController {

    @Autowired
    @Qualifier("threadsServiceImpl")
    private ThreadsService threadsService;

    @RequestMapping("/bbs/thread")
    public String toThread(int pid, int fid, Model model){
        List<Threads> threadsList = threadsService.getThreadsList(pid);
        model.addAttribute("threadsList",threadsList);
        return "/WEB-INF/bbs/thread";
    }

    @RequestMapping("/bbs/message")
    public String message(Threads threads, HttpServletRequest req){
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");

        threads.setFtype(1);
        threads.setAuthor(user.getUserName());
        threads.setAuthorid(user.getId());

        threadsService.saveThread(threads);

        return "redirect:/bbs/thread?fid="+threads.getFid()+"&pid="+threads.getPid();
    }
}
