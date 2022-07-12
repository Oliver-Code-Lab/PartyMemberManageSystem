package com.tengfei.Controller;

import com.tengfei.domain.Manager;
import com.tengfei.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/manager")
@Controller
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    //根据账号密码登录
    @RequestMapping("loginByAccountAndPassword")
    public String loginByAccountAndPassword(String workNum,
                                            String password,
                                            Model model,
                                            HttpServletRequest request) {

        System.out.println(workNum);
        System.out.println(password);

        Manager manager = managerService.loginByAccountAndPassword(workNum, password);
        if(manager == null) {
            model.addAttribute("errorMsg", "账号密码错误!");
        } else {
            request.getSession().setAttribute("manager", manager);
            return "admin-index";
        }
        return "admin-login";
    }

    @RequestMapping("findExamineMembers")
    public ModelAndView findExamineMembers(ModelAndView modelAndView) {
        // 2表示提交但未审批通过状态
        modelAndView.addObject("members", managerService.findExamineMembers(2));
        modelAndView.setViewName("admin-examineMember-datalist");
        return modelAndView;
    }
}
