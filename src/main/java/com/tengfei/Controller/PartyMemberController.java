package com.tengfei.Controller;

import com.tengfei.domain.PartyMember;
import com.tengfei.service.PartyMember.PartyMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@RequestMapping("/partyMember")
@Controller
public class PartyMemberController {

    @Autowired
    private PartyMemberService partyMemberService;

    @RequestMapping("findAll")
    public ModelAndView findAll(ModelAndView modelAndView) {
        modelAndView.setViewName("admin-partyMember-datalist");
        modelAndView.addObject("members", partyMemberService.findAll());
        return modelAndView;
    }

    @RequestMapping("delete")
    @ResponseBody
    //1删除成功，0删除失败
    public String delete(int id) {
        return partyMemberService.deleteOne(id) + "";
    }

    @RequestMapping("OverWrite")
    //1删除成功，0删除失败
    public ModelAndView OverWrite(int id, ModelAndView modelAndView) {
        PartyMember partyMember = partyMemberService.findPartyMemberById(id);
        modelAndView.addObject("partyMember", partyMember);
        modelAndView.setViewName("admin-dataform");
        return modelAndView;
    }

    //上传照片实现，点击上传照片，就发送一个ajax请求，存储进img下，用一个隐藏input存储路径，提交后即可生效
    @RequestMapping(value = "save", produces = "application/json;charset=utf-8")
    public String save(PartyMember partyMember) {
        partyMemberService.update(partyMember);
        return "redirect:/partyMember/findAll";
    }

    @RequestMapping(value = "addPartyMember", produces = "application/json;charset=utf-8")
    public String addPartyMember(PartyMember partyMember) {
        partyMemberService.addPartyMember(partyMember);
        return "redirect:/partyMember/findAll";
    }

    @RequestMapping("findPartyMemberByKeyword")
    public ModelAndView findPartyMemberByKeyword(ModelAndView modelAndView, String keyword) throws UnsupportedEncodingException {
        modelAndView.setViewName("admin-partyMember-datalist");
        String key = URLDecoder.decode(keyword, "UTF-8");
        modelAndView.addObject("members", partyMemberService.findPartyMemberByKeyword(key));
        modelAndView.addObject("searchText", key);
        return modelAndView;
    }
}
