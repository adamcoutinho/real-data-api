import { Module } from '@nestjs/common';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import {UserController} from "./controllers/user/UserController";

@Module({
  imports: [],
  controllers: [
      AppController,
      UserController
  ],
  providers: [AppService],
})
export class AppModule {}
