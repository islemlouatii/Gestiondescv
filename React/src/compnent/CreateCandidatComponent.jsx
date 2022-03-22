import React, {Component} from 'react';
import CandidatService from "../Service/CandidatService";

class CreateCandidatComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            // step 2
            id: this.props.match.params.id,
            fullName: '',
            date: '',
            tel: '',
            adresse:''
        }
        this.changeFullNameHandler = this.changeFullNameHandler.bind(this)
        this.saveOrUpdateCandidat = this.saveOrUpdateCandidat.bind(this);
    }
    componentDidMount(){

        // step 4
        if(this.state.id === '_add'){
            return
        }else{
            CandidatService.getcandidats(this.state.id).then( (res) =>{
                let candidat = res.data;
                this.setState({fullName: candidat.fullName,
                    date: candidat.date,
                    tel: candidat.tel,
                    adresse: candidat.adresse
                });
            });
        }
    }
    saveOrUpdateCandidat = (e) => {
        e.preventDefault();
        let candidat = {fullName: this.state.fullName, date: this.state.date,tel:this.state.tel,adresse: this.state.adresse};
        console.log('candidat => ' + JSON.stringify(candidat));

        // step 5

            CandidatService.createCandidat(candidat).then(res =>{
                this.props.history.push('/candidat');
            });

    }

    changeFullNameHandler= (event) => {
        this.setState({fullName: event.target.value});
    }

    changedateHandler= (event) => {
        this.setState({date: event.target.value});
    }



    changetelHandler= (event) => {
        this.setState({tel: event.target.value});
    }
    changeadresseHandler= (event) => {
        this.setState({adresse: event.target.value});
    }

    cancel(){
        this.props.history.push('/employees');
    }

    getTitle(){
        if(this.state.id === '_add'){
            return <h3 className="text-center">Add Candidat</h3>
        }else{
            return <h3 className="text-center">Update Candidat</h3>
        }
    }
    render() {
        return (
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
                                        <input placeholder="date " name="date" type="date" className="form-control"
                                               value={this.state.date} onChange={this.changedateHandler}/>
                                    </div>
                                    <div className = "form-group">
                                        <label> tel: </label>
                                        <input placeholder="tel" name="tel" type="Number" className="form-control"
                                               value={this.state.tel} onChange={this.changetelHandler}/>
                                    </div>
                                    <div className = "form-group">
                                        <label> adresse: </label>
                                        <input placeholder="adresse" name="adresse" className="form-control"
                                               value={this.state.adresse} onChange={this.changeadresseHandler}/>
                                    </div>
                                    <div className="form-group">
                                        <li>
                                            <a href="/uploadFile" className="active">importer cv </a>
                                        </li>
                                    </div>


                                    <button className="btn btn-success" onClick={this.saveOrUpdateCandidat}>Save</button>
                                    <button className="btn btn-danger" onClick={this.cancel.bind(this)} style={{marginLeft: "10px"}}>Cancel</button>

                                </form>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        )
    }
}

export default CreateCandidatComponent;