package com.tengfei.Controller;

import com.tengfei.domain.ActiveMember;
import com.tengfei.service.ActiveMember.ActiveMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;


@RequestMapping("/activeMember")
@Controller
public class ActiveMemberController {

    @Autowired
    private ActiveMemberService activeMemberService;

    @RequestMapping("findAll")
    public ModelAndView findAll(ModelAndView modelAndView) {
        modelAndView.setViewName("admin-activeMember-datalist");
        modelAndView.addObject("members", activeMemberService.findAll());
        return modelAndView;
    }

    @RequestMapping("delete")
    @ResponseBody
    //1删除成功，0删除失败
    public String delete(int id) {
        return activeMemberService.deleteOne(id) + "";
    }

    @RequestMapping("OverWrite")
    //1删除成功，0删除失败
    public ModelAndView OverWrite(int id, ModelAndView modelAndView) {
        ActiveMember activeMember = activeMemberService.findActiveMemberById(id);
        modelAndView.addObject("activeMember", activeMember);
        modelAndView.setViewName("admin-activeMember-dataform");
        return modelAndView;
    }

    //上传照片实现，点击上传照片，就发送一个ajax请求，存储进img下，用一个隐藏input存储路径，提交后即可生效
    @RequestMapping(value = "save", produces = "application/json;charset=utf-8")
    public String save(ActiveMember activeMember) {
        activeMemberService.update(activeMember);
        return "redirect:/activeMember/findAll";
    }

    @RequestMapping(value = "addActiveMember", produces = "application/json;charset=utf-8")
    public String addActiveMember(ActiveMember activeMember) {
        activeMemberService.addActiveMember(activeMember);
        int[] a = {1,2,3};
        return "redirect:/activeMember/findAll";
    }

    @RequestMapping("findActiveMemberByKeyword")
    public ModelAndView findActiveMemberByKeyword(ModelAndView modelAndView, String keyword) throws UnsupportedEncodingException {
        modelAndView.setViewName("admin-activeMember-datalist");
        String key = URLDecoder.decode(keyword, "UTF-8");
        modelAndView.addObject("members", activeMemberService.findActiveMemberByKeyword(key));
        modelAndView.addObject("searchText", key);
        return modelAndView;
    }

    @RequestMapping("changeStatus")
    @ResponseBody
    public String changeStatus(int status, int id) {
        activeMemberService.changeStatus(status, id);
        return null;
    }

    @RequestMapping("saveErrorCase")
    @ResponseBody
    public String saveErrorCase(int id, String errorCase) throws UnsupportedEncodingException {
        String decode = URLDecoder.decode(errorCase, "UTF-8");
        activeMemberService.saveErrorCase(id, decode);
        return null;
    }
}
