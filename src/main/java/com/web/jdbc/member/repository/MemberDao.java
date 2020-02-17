package com.web.jdbc.member.repository;

import com.web.jdbc.member.beans.Member;
import java.util.List;

public interface MemberDao {
    List<Member> query(); // 查詢所有資料
    Member getMember(Integer id); // 查詢單筆資料 by Id
    String getUsername(String username); // username 是否已存在
    Boolean verifyEmail(String username, String code); // email 驗證
    Boolean passEmail(String username); // 修改 pass 欄位
    Member login(String username, String password); // 登入
    Boolean save(Member member); // 新增存檔
    Boolean update(Member member); // 修改存檔
    Boolean delete(Integer id); // 刪除 by Id
}
