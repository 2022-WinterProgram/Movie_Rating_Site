import React, { Component } from 'react';
import '../css/modal.css';


export class JoinModal extends Component {

    state = {
        name: "",
        email:"",
        password: "",
    };

    loginHandler = (e) => {
        const { name, value } = e.target;
        this.setState({ [name]: value });
    };   ////계산된 속성명 사용

    loginClickHandler = () => {
        const { name, email, password } = this.state;
        fetch("http://localhost:8080/register", {
            mode: "no-cors",
            method: "POST",
            cache: "no-cache",
            headers: {
                //    "Content-Type": "multipart/form-data",
                "Content-Type" : "application/x-www-form-urlencoded"
            },
            body: new URLSearchParams({
                name: name,
                email: email,
                password: password,
            }),

        })
            .then((res) => res.json())
            .then((res) => console.log(res));
        this.setState(this.props.close);
    };

    render() {
        const { open, close, header } = this.props;

        return (
            <div className={open ? 'openModal modal' : 'modal'}>
                {open ? (
                    <section>
                        <header>
                            {header}

                            <button className="close" onClick={close}>
                                &times;
                            </button>
                        </header>
                        <form action="http://localhost:8080/member" method="POST">
                            <main>
                                {this.props.children}
                                <p><input
                                    id="name"
                                    name="name"
                                    className="loginId"
                                    type="text"
                                    placeholder="username"
                                    onChange={this.loginHandler}
                                /></p>
                                <p><input
                                    id="email"
                                    name="email"
                                    className="loginId"
                                    type="email"
                                    placeholder="e-mail"
                                    onChange={this.loginHandler}
                                /></p>
                                <input
                                    id="password"
                                    name="password"
                                    className="loginPw"
                                    type="password"
                                    placeholder="password"
                                    onChange={this.loginHandler}
                                />

                            </main>
                            <footer>
                                <input className="loginBtn" type="submit" value="Join" />
                                &nbsp;
                                <button className="close" onClick={close}>
                                    close
                                </button>
                            </footer>
                        </form>
                    </section>
                ) : null}
            </div>
        );
    }
}



export default JoinModal;