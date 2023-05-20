import {Controller, Get} from "@nestjs/common";

@Controller("/")
export class HomeController {

    @Get()
    get():string {
        return "43a0406f-9f5e-42d1-93ee-a3b68c1f5748"
    }
}