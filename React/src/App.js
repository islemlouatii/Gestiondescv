import React, { Component } from "react";
import { BrowserRouter, Switch, Route } from 'react-router-dom';
import "bootstrap/dist/css/bootstrap.min.css";
import "./App.css";


import ListCandidatComponent from "./compnent/ListCandidatComponent";
import BoardAdminComponent from "./compnent/BoardAdminComponent";
import BoardUserComponent from "./compnent/BoardUserComponent";
import LoginComponent from "./compnent/loginComponent";
import registreComponent from "./compnent/registreComponent";
import ProfileComponent from "./compnent/profileComponent";
import CreateCandidatComponent from "./compnent/CreateCandidatComponent";
import CreateFileComponent from "./compnent/CreateFileComponent";
import DBFileComponent from "./compnent/DBFileComponent";





class App extends Component {



    render() {


        return (
            <div>


                    <div className="container">
                        <BrowserRouter>
                            <Switch>
                                <Route path= "/user" component={ListCandidatComponent}/>
                                <Route path= "/admin" component={BoardAdminComponent}/>
                                <Route path="/login" component={LoginComponent}/>
                                <Route path="/registre" component={registreComponent}/>
                                <Route path="/profile" component={ProfileComponent}/>
                                <Route path="/candidat" component={ListCandidatComponent}/>
                                <Route path="/add" component={CreateCandidatComponent}/>
                                <Route path="/addFile" component={DBFileComponent}/>
                            </Switch>
                        </BrowserRouter>


                    </div>





            </div>

        );
    }
}

export default App;
