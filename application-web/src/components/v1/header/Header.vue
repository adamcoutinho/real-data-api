<template>
<div class="header">
    <ul>
        <li class="header-title">Real Data</li>
        <li>teste 2</li>
        <li>teste 3</li>
    </ul>
</div>
</template>

<script lang="ts">
import {defineComponent} from "vue";

export default defineComponent({
    name: "HeaderPage",
    data: ()=> {
        return  {

        }
    }
});
</script>

<style>
.header {
    border: 1px solid black;
    display: flex;
    justify-content: space-between;
    height: 45px;
    align-items: center;
    background: #f5f5f5;
}
ul{
    list-style: none;
}
li {
    display: inline;
    padding: 2px;
}
input[type="search"] {
    height: 20px;
}
.header-title {
    color: deepskyblue;
}
</style>