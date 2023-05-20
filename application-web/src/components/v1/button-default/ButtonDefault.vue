<template>
    <button class="button-default">
        {{ buttonName }}
    </button>
</template>

<script>
import { defineComponent } from "vue";
export default defineComponent({
    name: "ButtonDefault",
    props: {
        buttonName:String
    }
});
</script>

<style>
.button-default {
    outline: none;
    border: 1px solid rgb(197, 197, 197);
    height: 30px;
    width: 212px;
    border: 0;
    background: #e9e7e7;
    margin-top: 5px;
}

.button-default:hover {
    border: 1px solid rgb(177, 177, 177);
    outline: none;
    height: 30px;
    width: 212px;
    background: #e9e7e7;
    margin-top: 5px;
}
</style>