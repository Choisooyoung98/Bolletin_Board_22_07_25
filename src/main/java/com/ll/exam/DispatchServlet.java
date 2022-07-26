package com.ll.exam;

import com.ll.exam.article.ArticleController;
import com.ll.exam.member.MemberController;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/usr/*")
public class DispatchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Rq rq = new Rq(request, response);
        MemberController memberController = new MemberController();
        ArticleController articleController = new ArticleController();

        String url = request.getRequestURI();

        switch (url) {
            case "/usr/article/list/free":
                articleController.showList(rq);
                break;
            case "/usr/member/login":
                memberController.showLogin(rq);
                break;
        }
    }
}
