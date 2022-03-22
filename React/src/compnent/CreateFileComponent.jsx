import React, {Component} from 'react';

import DBFileService from "../Service/DBFileService";



// eslint-disable-next-line react-hooks/rules-of-hooks

class CreateFileComponent extends Component {

    constructor(props) {
        super(props)

        this.state = {
            // step 2
            id: this.props.match.params.id,
            fileName: '',
            fileType: '',
            data: ''
        }
        this.changeFullNameHandler = this.changeFullNameHandler.bind(this)
        this.saveFile = this.saveFile.bind(this);
    }

    componentDidMount(){

        // step 4
        if(this.state.id === '_add'){
            return
        }
    }
    saveFile = (e) => {
        e.preventDefault();
        let dbfile = {fullName: this.state.fullName, fileType: this.state.fileType,data:this.state.data};
        console.log('file => ' + JSON.stringify(dbfile));

        // step 5

        DBFileService.createFile(dbfile).then(res =>{
            this.props.history.push('/candidat');
        });

    }

    changeFullNameHandler= (event) => {
        this.setState({fullName: event.target.value});
    }

    changefileTypeHandler= (event) => {
        this.setState({fileType: event.target.value});
    }
    changedataHandler= (event) => {
        this.setState({data: event.target.value});
    }
    getTitle(){
        if(this.state.id === '_add'){
            return <h3 className="text-center">importer File</h3>
        }

    }
    render() {
        // eslint-disable-next-line react-hooks/rules-of-hooks
        return(
        <div>
            <br></br>
            <div className = "container">
                <div className = "row">
                    <div className = "card col-md-6 offset-md-3 offset-md-3">
                        {
                            this.getTitle()
                        }
                        <div className = "card-body">
                            <form>
                                <div className = "form-group">
                                    <label> First Name: </label>
                                    <input placeholder="First Name" name="firstName" className="form-control"
                                           value={this.state.fullName} onChange={this.changeFullNameHandler}/>
                                </div>
                                <div className = "form-group">
                                    <label> date: </label>
                                    <input placeholder="fileType " name="fileType"  className="form-control"
                                           value={this.state.fileType} onChange={this.changefileTypeHandler}/>
                                </div>
                                <div>
                                    <input

                                        onChange={this.changedataHandler}
                                        type="file"
                                        style={{ display: "none" }}
                                        // multiple={false}
                                    />
                                    <button onClick={() => this.state.data.click()}>Upload File</button>
                                </div>
                                <button className="btn btn-success" onClick={this.saveOrUpdateCandidat}>Save</button>

                            </form>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    )
    }
}

export default CreateFileComponent;