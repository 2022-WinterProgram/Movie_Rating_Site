import React, { Fragment} from 'react';
import MovieCard from '../component/MovieCard';
import { Input, Row, Col } from 'antd';
import { useEffect,  useState } from 'react';
//import styles from "./SerachBar.module.css";
import axios from 'axios';
import NoResult from '../component/NoResult';
import {ReactComponent as X_img} from "../Icon/bi_x-square.svg";
import {ReactComponent as Ab} from "../Icon/akar-icons_circle-chevron-up.svg";
import {ReactComponent as BB} from "../Icon/Property 1=Frame 45.svg";
import {ReactComponent as Cc} from "../Icon/bi_x-square.svg";
import {ReactComponent as Search_Icon} from "../Icon/Property 1=search 1.svg";
import {ReactComponent as User} from "../Icon/Property 1=user_big.svg";
import Header from '../component/Header';
const searchStyle={
  border:'solid',
  borderRadius:'10px',
  height:'5vh',
  width:'40vh',
  marginTop:'1vh'
}
const searchButtonStyle={
  marginTop:'1vh',
  marginLeft:'2vh'
}
const LoginStyle={
  float:'right'
  
}
const MovieSearchContainer = () => {
  const getUrl=new URL(window.location.href);
  const urlParams=getUrl.searchParams;
  const keyword=urlParams.get("keyword")
  const [result, setResult]=useState('');
  const [search, setSearch]=useState('');
  const [items, setItems] = useState();
  const [len, setLen]=useState();
  
  const inputChange=(e)=>{
         const value=e.target.value;
         setResult(value);
     }


  const handleButton = async (value) => {
        try {
         const res = await axios.get('http://localhost:8080/search/'+value);
       
          if (res && res.status === 200) {
            const { data } = res;
            console.log(data);

            setItems(data);
            setLen(items.length);
            
          }
        } catch (e) {
          console.log("error ", e);
        }
      };
  return (
    <Fragment>
  
      {/* <div className='logo'>
        로고자리
      </div>
      <div
        style={{ display: 'flex', justifyContent: 'center', padding: '2rem' }}>
        <div className='search_bar'>
          <input type="text" id=""  placeholder="검색어를 입력해주세요" style={searchStyle} onChange={inputChange} />
          <Search_Icon className='icon' width={35} height={35}  style={searchButtonStyle} fill="white" onClick={()=>handleButton(result)}/>
        </div>
        <div className='login'>
        <User width={40} height={40} fill="white" />
        </div>
      </div> */}
      <Header/>
      
     
      
      {/* <div>
        <Row>
          {items&&items.map((item) => {
            return (

              <Col xs={24} sm={12} md={6} lg={4} xl={4}>
                <MovieCard item={item} ></MovieCard>;
              </Col>
            );
          })}
        </Row>
      </div> */}
    </Fragment>
  );
};
export default MovieSearchContainer;