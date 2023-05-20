<template>
<div class="alert-info">
    <h3>Teste</h3>
</div>
</template>

<script lang="ts">
import {defineComponent} from "vue";

export default defineComponent ({
    name:"AlertInfo",
    data:()=> {

    }
})
</script>

<style>
.alert-info {
    border: 1px solid black;
    height: 300px;
    width: 300px;
}
</style>