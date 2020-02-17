package com.web.jdbc.member.controller;

import com.web.jdbc.member.beans.Member;
import com.web.jdbc.member.repository.MemberDao;
import java.util.LinkedHashMap;
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
}
