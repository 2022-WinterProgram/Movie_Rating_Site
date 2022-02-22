import React, { Component} from 'react';
import MovieCard from '../component/MovieCard';
import { Input, Row, Col } from 'antd';
import { useEffect,  useState } from 'react';
//import styles from "./SerachBar.module.css";
import axios from 'axios';
import SearchResultPage from '../component/SearchResultPage'
import NoResult from '../component/NoResult';
import {ReactComponent as X_img} from "../Icon/bi_x-square.svg";
import {ReactComponent as Ab} from "../Icon/akar-icons_circle-chevron-up.svg";
import {ReactComponent as BB} from "../Icon/Property 1=Frame 45.svg";
import {ReactComponent as Cc} from "../Icon/bi_x-square.svg";
import {ReactComponent as Search_Icon} from "../Icon/Property 1=search 1.svg";
import {ReactComponent as User} from "../Icon/Property 1=user_big.svg";
import Header from '../component/Header';
import { Components } from 'antd/lib/date-picker/generatePicker';
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
class MovieSearchContainer extends Component {

  inputChange=(e)=>{
      const value=e.target.value;
      setResult(value);
  }


  handleButton = async (value) => {
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

  render(){
    const getUrl=new URL(window.location.href);
    const urlParams=getUrl.searchParams;
    const keyword=urlParams.get("keyword")
    const [result, setResult]=useState('');
    const [search, setSearch]=useState('');
    const [items, setItems] = useState();
    const [len, setLen]=useState();
    console.log(items);

    return(
      <SearchResultPage />
    )
  }
};
export default MovieSearchContainer;
