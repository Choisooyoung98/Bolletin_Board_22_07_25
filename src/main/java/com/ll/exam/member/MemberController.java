package com.ll.exam.member;

import com.ll.exam.Rq;

public class MemberController {
    public String showLogin(Rq rq) {
        rq.appendBody("로그인");
        return "로그인 폼";
    }
}
