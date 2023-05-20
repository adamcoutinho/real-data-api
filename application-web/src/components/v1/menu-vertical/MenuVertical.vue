<template>
  <div class="menu-vertical">
    <h1>teste</h1>
  </div>
</template>

<script lang="ts">
import {defineComponent} from "vue";

export default defineComponent({
    name: "MenuVertical",
})
</script>

<style>
.menu-vertical{
    border: 1px solid #dcdbdb;
    list-style-type: none;
    margin: 0;
    padding: 0;
    width: 9%;
    background-color: #f1f1f1;
    position: fixed;
    height: 100%;
    overflow: auto;
}
ul  {
    display: inline;
}
li {
    list-style-type: none;
}
</style>