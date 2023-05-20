import { appConfig } from '@/config/AppConfig';
import axios from 'axios';

class UserService {

    post(credendialUser:any) {
        console.log(JSON.stringify(credendialUser))
        // process.env.INTEGRATION_API_PORT
        // alert(JSON.stringify(this.formRequest))
        // try {


        //     axios.post("http://localhost:8083/auth", JSON.stringify(credentialAuthentic), {
        //         headers: {
        //             'Content-Type': 'application/json',
        //             Accept: 'application/json',
        //         }
        //     }).then(resp=> {
        //                 alert(JSON.stringify(resp.data))
        //                 this.$router.push("/home");
        //     })


        // } catch (error) {

        //     if (axios.isAxiosError(error)) {
        //         alert(error.message)
        //         return error.message
        //     } else {
        //         alert(error)
        //         return 'An unexpected error occurred'
        //     }

        // }

        //    alert(process.env.INTEGRATION_API_PORT)                
                // alert(appConfig.getUrl())
                const urlTest= "http://localhost:3000"
            return axios.post(urlTest+"/login", JSON.stringify(credendialUser))
    }
}

export const userService = new UserService();