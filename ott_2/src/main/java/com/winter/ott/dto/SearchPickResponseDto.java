package com.winter.ott.dto;

import com.winter.ott.entity.PickMemberMovie;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SearchPickResponseDto {
    private String title;
    private String username;

    public SearchPickResponseDto(PickMemberMovie pick) {
        this.title = pick.getTitle();
        this.username=pick.getUsername();
    }
}
