import React, {Component} from 'react';
import CandidatService from "../Service/CandidatService";

class ListCandidatComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            candidats: []
        }
        this.addCandidat = this.addCandidat.bind(this);
    }

componentDidMount() {
        CandidatService.getcandidats().then((res) =>{
        this.setState(({candidats: res.data}));
        });
}
    addCandidat(){
        this.props.history.push('/create/_add');
    }
    render() {
        return (
            <div>
                <h2 className="text-center">Employees List</h2>
                <div className = "row">

                </div>
                <br></br>

                <div className = "row">
                    <table className = "table table-striped table-bordered">

                        <thead>
                        <tr>
                            <th> fullName</th>
                            <th> date</th>
                            <th> tel</th>
                            <th>actif</th>
                            <th>candidatId</th>
                            <th>adresse</th>

                        </tr>
                        </thead>
                        <tbody>
                        {
                            this.state.candidats.map(
                                candidat =>
                                    <tr key = {candidat.CandidatId}>
                                        <td> { candidat.fullName} </td>
                                        <td> {candidat.date}</td>
                                        <td> {candidat.Adresse}</td>
                                        <td> {candidat.tel}</td>
                                        <td>{candidat.etatc}</td>
                                        <td>

                                            <button style={{marginLeft: "10px"}} onClick={ () => this.viewCandidat(candidat.CandidatId)} className="btn btn-info">View </button>
                                        </td>
                                    </tr>
                            )
                        }
                        </tbody>
                    </table>
                </div>
            </div>
        );
    }


}

export default ListCandidatComponent;