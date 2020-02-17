package com.web.jdbc.member.controller;

import com.web.jdbc.member.beans.Member;
import com.web.jdbc.member.repository.MemberDao;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * /jdbc/member/input 預設頁
 * /jdbc/member/save 新增
 * /jdbc/member/query 查詢全部
 * /jdbc/member/get/{id} 查詢單筆
 * /jdbc/member/update/{id} 修改單筆
 * /jdbc/member/delete/{id} 刪除單筆
 */
@Controller
@RequestMapping("/jdbc/member")
public class MemberController {

    @Autowired
    private MemberDao dao;
    
    @RequestMapping("/input")
    public String input(Model model) {
        Member member = new Member();
        model.addAttribute("member", member);
        model.addAttribute("action", "save");
        return "jdbc/member/input";
    }
    
    @RequestMapping("/save")
    @ResponseBody
    public String save(@ModelAttribute Member member) {
        // 已傳入 username, password, email
        String code = Integer.toHexString(member.hashCode());
        member.setCode(code);
        member.setPass(Boolean.FALSE);
        member.setPriority(1);
        dao.save(member);
        return member + " saved.";
    }
    
    @RequestMapping("/query")
    @ResponseBody
    public String query() {
        List<Member> members = dao.query();
        return members.toString();
    }
    
    @RequestMapping("/get/{id}")
    @ResponseBody
    public String get(@PathVariable("id") Integer id) {
        Member member = dao.getMember(id);
        return member.toString();
    }
    
    @RequestMapping("/update/{id}")
    @ResponseBody
    public String update(@PathVariable("id") Integer id, @ModelAttribute Member member) {
        //return id + ", " + member.toString();
        Member o_member = dao.getMember(id);
        o_member.setPassword(member.getPassword());
        o_member.setEmail(member.getEmail());
        o_member.setPass(member.getPass());
        o_member.setPriority(member.getPriority());
        dao.update(member);
        return member + " updated.";
    }
    
    @RequestMapping("/delete/{id}")
    @ResponseBody
    public String update(@PathVariable("id") Integer id) {
        dao.delete(id);
        return id + " deleted.";
    }
    
}
