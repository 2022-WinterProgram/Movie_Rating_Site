package com.winter.ott.service;


import com.winter.ott.dto.MovieDto;
import com.winter.ott.dto.TipDto;
import com.winter.ott.entity.Movie;
import com.winter.ott.entity.Tip;
import com.winter.ott.repository.TipRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class TipService {

    private final TipRepository tipRepository;
    public List<TipDto> showTip(String movieName) {

        List<Tip> tips = tipRepository.findTipByMovieName(movieName);
        List<TipDto> resultList = new ArrayList<>();

        for (Tip t : tips) {
            Tip tip = new Tip(t.getMemberTip(),t.getMovieName());
            resultList.add(new TipDto(tip));
        }
        return resultList;
    }

}
