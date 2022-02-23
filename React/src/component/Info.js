import React, {useState, useEffect} from "react";


function Info({index, title, image_url, year, language, netflex, watcha}){

    const netflexImg ='data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAOEAAADhCAMAAAAJbSJIAAAAilBMVEUAAACxBg/lCRS0Bg+PBQyuBg+sBg/pCRR7BAqpBg+hBQ+ZBA6lBQ/qCRSeBQ6GBAuDAg2QBQyaBA7wCRWLAw2FAg13BArgCRS7BhHVCBPOCBJ+AQ3CBxHIBxJjAgp2BQpbAwhsBAkjAQNPAwc/AwYWAQJHAwZgAglVAAg7AwUtAgQsAgQbAQI1AgTk8K1PAAAHf0lEQVR4nO2da3OqPBSFpYAUggg0WpVW6+nFntv//3tvElS8YBad90wnaybrs7vjM1mbzSLEjkZeXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXu5IhoFV0c3Kl6ld22+ksCl7SKya3Ky8X4RWVd9IYZO8s2tycynu7asf3l7971W0SqyEyeJWJQ1hYCe8u2lTFsIqfwSEzY1KGsL4Cdj0+UYlDWGYT+yL+PCjv5KHsEA2vfFVeQjzBbDpsr+ShzAWyKY/eytZCKMwEEtg07q3koWwCoMMjcTH3koiwrQChA+vfZVEhHGF7tzSvkoiwqBOwSLe9VUyEeYS2XTdU8lCqK6lQRo9A5uGPZUshHoNY5GBkdgXMKgIsxnow8nmupKJUDUiChhP15VUhKmo0Z3bdSUVYVyUKGCUV5UshJEhzCQKGNc5mIowyEX15RzMRZjWJQoYV48/uQjHhQQB4zoHcxHGeSWRTd8uKskIU1Eu7Ys4KS4quQiDtJDjL+ZgMsJxVpXIpp/nlWSEcS7KL+ZgOsJaokfDFzmYjTAtqgbt0ZznYDJC1YiiRAHjPAfTEeZCooBxnoPZCOO0jhrQh+c5mI+wqEoUMM5yMB2htikMGO8nlWyEqhGVTVEOnp5U0hEOsunqpJKQMBMSBoxfXSUfoWrEqPlCDp5bAR0kDMZpXZXx8Bw8D2IyQtWIQs6QTT+OlYyEqhEbEDAm2bGSkFDPixJttHU5WBHaEB0kVBOxqCQKGF0O3sR8hMamaKNtfKgkJIxTNS9KtNGWHCo38diG6CShasRqCgPG4YVTSkI9LxqUgw8vnG7G4zEZYTsvSvSK1CEHb8apbRHdJDQ2naOAMW8rtyklobbpwBysCS02dZTQ2HRgDt7muW0RnSTUE3GITdscTEloGlE24aAcbAhv29RVQpMvpoNy8DazLqKzhJmIpnOUg4Wu3GYZJaGx6aAcvC0ym03dJNzPixncaNM5eFsUNpu6TKhsinJwrirXdWGzqbOEel7IJh+Qg9d1bbOpu4S6EWcwB78oQrFfRC7CthGnMAfHmlDUFps6StjOC2XTAufgdSVsNnWZUNt0bgfUOXhXCWGxqcOE5mo6IAfvospmU2cJY01Y4Rz8MHrRhAUdoZ6IrU1hDv6UCvG2TR0mVI2or6YwB39IabOpy4StTSP0uGY9k5HFpu4SqkbU8wLaNIkbvYg3beosYduI2qYgB98t59OjTckIzbyQJcrBE1nabOo6obLpPcjByaKZWmzqMKFuxFotYgNfOJ3PLDZ1l9DMC7OIKAdPRGdTNkJj0ynaD06eWpv2N6LjhK1NUQ6+s9nUZcK2EQfk4ElhbEpIeLQpysHPFps6TNjZtIQ5uDnYlJJwQA5O8uamTZ0m7GyKcvCqsykTYTsvjE3hfnA5M7c1jIR7m6KAMT7Y9KoR3SdsbQpy8N3SXGv6bOo2YWdT9MLpZKpHIh1hZ1O40ZaE6lqjbcpIqG0KN9r2AaOnER0nPNp0tn4ANo3K/kYkIDQ2lR/w0XBrUzLCo00j+TkH1xpj055GdJ1wb9MqehkNyMHGpheNyECobRrtRvDRsLbpdSM6Tniwqah2oy06eNnalI9wb9P1aARzcKPnBR3hYREVIXr35Lm16UUKdp1wb9NaE76AkWhycH3ZiASE5lpT67O/KGCoHHzdiO4T7hdRE4JD3slqPo2MTfkI86LQ761/oDs3lYP5CPc2NYQj8JMZeqPtqhEJCI1NM0OIHmYstU0zSsK8JfyLbCq1TdkIW5vm7fkRtIMRGpvSEcYdIdotfZxP9bwgJnxHNq1KedGIBITGpun+lBPOwZfzgoIw7ghxDp5eNCIL4fjwUxgDcrA4a0QGQm3TIyHOwRfzgoMwHscHQpiDmwub0hHCHJyVkchTMkKF2BGCd09UDjbzgpjwE+ZgWal5QUcYzI+fRDk4LaPTRuQgDE4JwSHvZNWczQtCwjd052byBTMhzMFBqecFGWFwSohOzy4bNS+OjchCGN53H/0Nc/BpIzISwhy8KKuCmxDm4CbqGpGSEOdg2TUiJSHOwSc25STcwIAR1dyEMAfX2qbUhOi3CJ5KkXETruELp8dGJCUcgT6c5LLOuQnBj50lq1KQE6IcPCmrfSOyEsIcPJZFyk0IXm5PlqVoLzW0hDAHyyrnJoQ5OJTFmJsQ5uCyTrkJf8CAIXJuwhE6KrSQWcxNiI4lPpaFIXTlP49/nXCEbFqLlHsNYQ5+inJyQpiDZ7oRmQlhDs4EOyHKwc9RSk6IzmAkMue+lsIcnKQF+RqOwCHvZFXF5ISvyKZVSu5SmIODjJ0Q/VehpWAn/Anv3GJyQpiDFzk7IfoVqceCnRDmYPo1hDn4KWYnbJBNc3ZClIOTwN17mvCgxWIR3iZcJMnkQWmilShdEK4cIzwwhXFeR7P5dvf58fbrD6z+8/fjZTufijx8Xj5OWtwDq/yGbz9E1UKDxVlVbnevf99xgUXvb7t5lC9Wjxr1If9H3/D/arvZffz+53/198tGTPHHvLy8vLy8vLy8vLy8vLy8vLy8vLy8vLy8vLy+Tf8BzWq+kZygb/cAAAAASUVORK5CYII=';
    const watchaImg ='https://image.rocketpunch.com/company/126/watcha_logo_1611108610.png?s=400x400&t=inside';
    var isNetflex = true;
    var isWatcha = true;
    if(netflex==null) isNetflex=false;
    if(watcha==null) isWatcha=false;
    return (
        <li>
            <img src = {image_url} className='model' alt=""/>
            <div className='title'> title : {title}</div>
            <div className='year'> year : {year}</div>
            <div className='details'> language : {language}</div>
        <a>
            <h1>
                <img src={netflexImg} style={{borderRadius : 70,width :70, height:70}}/>
            </h1>
        </a>
        <h1>&nbsp; &nbsp;</h1>
        <a>
            <h1>
                <img src={watchaImg} style={{borderRadius : 70,width :70, height:70}}/>
            </h1>
        </a>
        </li>

    )
}

export default Info;