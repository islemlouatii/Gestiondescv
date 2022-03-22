import axios from 'axios';


const  CANDIDAT_API_BASE_URL = "http://localhost:8087/SpringMVC/candidat/candidats";
const  CANDIDATCREATE_API_BASE_URL = "http://localhost:8087/SpringMVC/candidats/create";
    class CandidatService{
        getcandidats(){
            return axios.get(CANDIDAT_API_BASE_URL);
        }
        createCandidat(candidat){
            return axios.post(CANDIDATCREATE_API_BASE_URL, candidat);
        }



}
export default new CandidatService()