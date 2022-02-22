// lp.js
import React, { Component } from "react";
import ItemCard from "./MainItemCard";
import Slider from "react-slick"; 
import "slick-carousel/slick/slick.css"; 
import "slick-carousel/slick/slick-theme.css";

class Listpage extends Component {
    id = 1;
    state = {};

    sliders(){
        const { Itemcard } = this.props;
        return Itemcard.map((itemdata, insertIndex) => {
            return (
            <ItemCard
                key={insertIndex}
                title={itemdata.title}
                image_url={itemdata.image_url}
                year={itemdata.year}
                country={itemdata.country}
                imdb={itemdata.imdb}
            />
            );
        });
    }

    render() {
        const settings = { 
            dots: true, 
            infinite: false, 
            speed: 700, 
            slidesToShow: 6, 
            slidesToScroll: 2,
            centerPadding: '0px',
            initialSlide: 0,
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
            <div className="container">
                <Slider {...settings}> 
                    {this.sliders()}
                </Slider>
            </div>
            
        );
    }
}
export default Listpage;