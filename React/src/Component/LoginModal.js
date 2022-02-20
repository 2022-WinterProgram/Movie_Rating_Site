import React, { Component } from 'react';
import '../css/modal.css';


export class LoginModal extends Component {

    state = {
        email: "",
        password: "",
    };

    loginHandler = (e) => {
        const { name, value } = e.target;
        this.setState({ [name]: value });
    };   ////계산된 속성명 사용

    loginClickHandler = () => {
        const { username, password } = this.state;
        fetch("http://localhost:8080/login", {
            mode: "no-cors",
            method: "POST",
            cache: "no-cache",
            headers: {
            //    "Content-Type": "multipart/form-data",
                   "Content-Type" : "application/x-www-form-urlencoded"
            },
            body: new URLSearchParams({
                username: username,
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
                        <main>
                            {this.props.children}
                            <p><input
                                name="username"
                                className="loginId"
                                type="text"
                                placeholder="e-mail"
                                onChange={this.loginHandler}
                            /></p>
                            <input
                                name="password"
                                className="loginPw"
                                type="password"
                                placeholder="password"
                                onChange={this.loginHandler}
                            />
                        </main>
                        <footer>
                            <button className="loginBtn" onClick={this.loginClickHandler}>
                                {" "}
                                Login{" "}
                            </button>
                            &nbsp;
                            <button className="close" onClick={close}>
                                close
                            </button>
                        </footer>
                    </section>
                ) : null}
            </div>
        );
    }
}



export default LoginModal;