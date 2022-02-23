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
    };

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
                        <form action="http://localhost:8080/login" method="POST">
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
                            <input className="loginBtn" type="submit" value="Login" />
                            &nbsp;
                            <button className="loginBtn" onClick="location.href='http://localhost:8080/logout';">Logout</button>
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



export default LoginModal;