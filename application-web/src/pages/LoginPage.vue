<template>
    <div class="page">
        <div class="space-1">
            <h1 style="color: white;">Real Data WEB </h1>
            <h3 style="margin-top:10px; margin-left: 10px;">
                <small style="color:white;">0.0.1</small>
            </h3>
        </div>
        <div class="space-2">
            <div class="box" style="padding-bottom: 100px;">
                <InputText v-model:text="formRequest.userName" placeholder="User name" />
                <InputPassword v-model:text="formRequest.password" placeholder="password" />
                <ButtonDefault buttonName="log in" @click="submitForm" />
            </div>
           <transition>
               <AlertDefault message="Carregando..." style="margin-bottom: 900px; margin-left: 1280px; position: absolute;"  v-if="activeLoader" />
           </transition>
        </div>
    </div>
</template>
<script lang="ts">
import InputText from "@/components/v1/input-text/InputText.vue";
import InputPassword from "@/components/v1/input-password/InputPassword.vue";
import ButtonDefault from "@/components/v1/button-default/ButtonDefault.vue";
import AlertDefault from "@/components/v1/alert-default/AlertDefault.vue";
import { defineComponent } from "vue";
import {userService} from "../services/UserService";

export default defineComponent({
    name: "LoginPage",
    components: { InputPassword, InputText, ButtonDefault, AlertDefault},
    mounted() {
        // alert(JSON.stringify(process.env.INTEGRATION_API_PORT))
    },
    data: () => {
        return {
            formRequest: {
                userName: "",
                password: ""
            },
            messageAlert:"Carregando...",
            activeLoader: false
        }
    },
    methods: {
        submitForm() {

            const credentialAuthentic = {
                user_name: this.formRequest.userName,
                password: this.formRequest.password
            }

            // alert(JSON.stringify(credentialAuthentic)) 
            
            // console.log(JSON.stringify(process.env.INTEGRATION_API_PORT))            
            // this.activeLoader=true;
            //     this.userService.post();
            
            userService.post(credentialAuthentic).then(resp=> {
                // alert(JSON.stringify(resp.data))
                this.$router.push(resp.data.path)
            });
            
            

            // alert(JSON.stringify(process.env.INTEGRATION_API_PORT))
            
        }
    }
});
</script>
<style>
.page {
    display: flex;
    flex-direction: row;
    width: 100%;
    position: fixed;
    height: 100%;
    overflow: auto;
}

.space-1 {
    background: black;
    width: 60%;
    height: 100%;
    overflow: auto;
    display: flex;
    justify-content: center;
    align-items: center;
}

.space-2 {
    background: whitesmoke;
    width: 100%;
    height: 100%;
    overflow: auto;
    display: flex;
    align-items: center;
    justify-content: center;
}


.box {
    display: flex;
    flex-direction: column;
}


</style>