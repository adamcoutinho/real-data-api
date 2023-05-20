import {Body, Controller, Post} from '@nestjs/common';
import {UserFormRequest} from "./dto/UserFormRequest";
import { AnyRecord } from 'dns';


@Controller("/login")
export class UserController {


    @Post()
    getUser(@Body() request:UserFormRequest): any {

        console.log(JSON.stringify(request))

       const data = {
            path:"/home"
        }

        return data
    }
}
