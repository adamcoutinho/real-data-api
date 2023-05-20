package com.main.real.data.service.authpass.v1.endpoint.login

import com.main.real.data.service.authpass.v1.service.ServiceLogin
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth")
class LoginEndpoint(private val serviceLogin: ServiceLogin) {

    @PostMapping
    fun post(@RequestBody @Valid request: LoginFormRequest): ResponseEntity<Any> {
       val code = this.serviceLogin.authentic(request.userNameOrEmail!!,request.password!!)
        return ResponseEntity.ok(code)
    }

}