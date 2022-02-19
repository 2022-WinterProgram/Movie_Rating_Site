package com.winter.ott.dto;

import com.winter.ott.entity.Member;
import com.winter.ott.entity.Tip;
import lombok.Data;


@Data
public class TipDto {

    private String member_tip;
    private String m_name;
    private Member member;


    public TipDto(Tip tip) {
        this.member_tip = tip.getMemberTip();
        this.m_name = tip.getMovieName();
        this.member = tip.getMember();
    }


}
