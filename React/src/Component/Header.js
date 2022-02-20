import React, { Fragment} from 'react';
import MovieCard from '../Component/MovieCard';
import { Row, Col } from 'antd';
import { useEffect,  useState } from 'react';
import axios from 'axios';
import NoResult from '../Component/NoResult';
import {ReactComponent as Search_Icon} from "../Icon/Property 1=search 1.svg";
import {ReactComponent as User} from "../Icon/Property 1=user_big.svg";
import "./Header.css";
import inputChange from "../Container/MovieSearchContainer";
import handleButton from "../Container/MovieSearchContainer";
import result from "../Container/MovieSearchContainer";
import {items, setItems} from "../Container/MovieSearchContainer";
const searchStyle={
    border:'solid',
    borderRadius:'10px',
    height:'8vh',
    width:'70vh',
  }
  const searchButtonStyle={
    marginTop:'2vh',
    marginLeft:'2vh'
  }



const Header=()=>{
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
          const len=data.length;
          setLen(len);
          <Row>
          {items&&items.map((item) => {
              return (
              <Col xs={24} sm={12} md={6} lg={4} xl={4}>
                  <MovieCard item={item} ></MovieCard>;
              </Col>
              );
          })}
          </Row>
        }
      } catch (e) {
        console.log("error ", e);
      }
    };


//header
return(
    <div className='header'>
        {/*logo position */}
        <div className='logo'>
        Diflixpedia
      </div>
      <div className='search_bar'
        style={{ display: 'flex', justifyContent: 'center', padding: '2rem' }}>
        {/* <div className='search_bar'> */}
          <input type="text" id=""  placeholder="검색어를 입력해주세요" style={searchStyle} onChange={inputChange} />
          <Search_Icon className='icon' width={35} height={35}  style={searchButtonStyle} fill="white" onClick={()=>handleButton(result)}/>
       {/* </div> */}
       </div>
        <div className='login'>
            <h1 className='log'>Login</h1>
            <h1 className='log'>|</h1>
            <h1 className='log'>Join</h1>
            <User className='icon' width={40} height={40} fill="white" />
        </div>


        <div className='Result'>
            {/* <Row>
            {items&&items.map((item) => {
                return (
                <Col xs={24} sm={12} md={6} lg={4} xl={4}>
                    <MovieCard item={item} ></MovieCard>;
                </Col>
                );
            })}
            </Row> */}
      </div>
    </div>
);
};
export default Header;