package com.ll.exam.article;

import com.ll.exam.Rq;

public class ArticleController {
     public String showList(Rq rq) {
         rq.appendBody("게시물 리스트");
         return "게시물 리스트";
     }
}
