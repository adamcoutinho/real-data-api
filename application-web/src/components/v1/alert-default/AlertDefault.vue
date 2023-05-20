<template>

     <div class="alert-default" >

         <div class="image-loader">
             <img src="@/assets/ld2.gif" style="width: 40px; height:40px;" />
         </div>
         <div class="alert-default-message">
             {{ message }}
         </div>
     </div>

</template>

<script lang="ts">
import { defineComponent } from "vue";

export default defineComponent({
    name: "AlertDefault",
    props: {
        message: String
    },
    methods: {
        loader1() {
            return './assets/ld1.gif'
        }
    }
})
</script>

<style>
.alert-default {
    border: 1px solid rgb(202, 202, 202);
    background: rgb(236, 233, 233);
    height: 60px;
    width: 300px;
    /* margin-left:20%; */
    z-index: 1000;
    display: flex;
    align-items: center;
    justify-content: center;

    box-shadow: 1px 1px 1px 1px rgb(233, 233, 233);

    /* background: rgba(0,0,0,.95)!important; */
    /* position: absolute; */
}

.image-loader {
    margin-left: 5px;
    margin-top:5px;
}

.alert-default-message {
    margin-left: 20px;
}

.v-enter-active,
.v-leave-active {
    transition: opacity 0.9s ease;
}

.v-enter-from,
.v-leave-to {
    opacity: 0;
}
</style>