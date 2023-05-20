<template>
    <HeaderPage></HeaderPage>
    <MenuVertical></MenuVertical>
</template>
<script lang="ts">
import HeaderPage from "../components/v1/header/Header.vue";
import MenuVertical from "../components/v1/menu-vertical/MenuVertical.vue";

export default {
    name: "HomePage",
    components: {
        MenuVertical,
        HeaderPage
    }
}
</script>

<style></style>