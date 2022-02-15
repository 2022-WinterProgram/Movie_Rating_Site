package com.winter.ott.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

//import com.winter.ott.dto


@RestController
@RequestMapping("/movies/{movie-id}")
@Log4j2
@RequiredArgsConstructor
public class detailCotroller {

    // ��ȭ �⺻ ���� ��ȯ
    @GetMapping("/")
    public String index() {
        return "/movies/{movie-id}";
    }

    // ��ȭ �� ����
    @GetMapping("/details")
    public void details(){log.info("details get...");}

    /// ���ϱ� ��������
    // ����Ʈ ��� ����
    @GetMapping("/reviews/{review-id}/post")
    public void review(){log.info("review post.........................................");}

    // �������� �ϰ� ���� ��������
    @PostMapping("/reviews/{review-id}/post")
    public String postReview(){
        log.info("review post.........................................");
        return "redirect:/movies/{movie-id}/reviews";
    }


    /// �� ������ ��������
    // ���â ����
    @GetMapping("/tips")
    public void Tip(){ log.info("�� post");
    }
    //�� �ۼ�
    @PostMapping("/tips")
    public String postTip(){

        log.info("�� post");
        //
        // �ڵ��ۼ�
        //
        String text="";
        return "/movies/{movie-id}";
    }

/* �� �����ϱ�

    @PutMapping("/tips/modify")
    public String modifyTip(){

        log.info("�� modify");
        //
        // �ڵ��ۼ�
        //
        String text="";
        return text;

    }

*/



}
