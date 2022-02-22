import React, { Component } from "react"; 
import Slider from "react-slick"; 
import "slick-carousel/slick/slick.css"; 
import "slick-carousel/slick/slick-theme.css";
export default class SimpleSlider extends Component {
    render() {
        const settings = { 
            dots: true, 
            infinite: false, 
            speed: 700, 
            slidesToShow: 6, 
            slidesToScroll: 2,
            centerPadding: '0px',
            // prevArrow : "<button type='button' class='slick-prev'>Previous</button>",		// 이전 화살표 모양 설정
            // nextArrow : "<button type='button' class='slick-next'>Next</button>",

            responsive:[
                {
                    breakpoint: 1900,
                    settings:{
                        slidesToShow:4,
                        slidesToScroll: 1
                    }
                },
                {
                    breakpoint: 1500,
                    settings:{
                        slidesToShow:4,
                        slidesToScroll: 1
                    }
                },
                {
                    breakpoint: 1300,
                    settings:{
                        slidesToShow:3,
                        slidesToScroll: 1
                    }
                },
                {
                    breakpoint: 1000,
                    settings:{
                        slidesToShow:2,
                        slidesToScroll: 1
                    }
                },
                {
                    breakpoint: 700,
                    settings:{
                        slidesToShow:1,
                        slidesToScroll: 1
                    }
                }
            ]
        }; 
        return ( 
        <div> 
            <h2 className="listTitle"> Chris Evans 의 영화 </h2> 
            <Slider {...settings}> 
            </Slider> 
        </div> 
        ); 
    } 
}
