
import axios from 'axios';
const  Client_API_BASE_URL = "http://localhost:8087/SpringMVC/candidat/candidats";
class ClientService {
    getclients(){
        return axios.get(Client_API_BASE_URL);
    }
  //  createClient(client){
        //return axios.post(CANDIDATCREATE_API_BASE_URL, candidat);
   // }
}

export default ClientService;