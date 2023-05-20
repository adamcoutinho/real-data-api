<template>
    <input type="text" class="input-text" :placeholder="placeholder" :value="text" @input="onInput" />
</template>

<script lang="ts">
import { defineComponent } from "vue";

export default defineComponent({
    name: "InputText",
    props: {
        text: {
            type: String,
            value: ''
        },
        placeholder: String
    },
    methods: {
        onInput(event:any) {
            this.$emit('update:text', event.target.value)
        }
    }

})
</script>
<style>
.input-text {
    height: 20px;
    width: 200px;
    border: 1px solid #e7e7e7;
    padding: 5px;
    font-size: 10px;
    margin-top: 5px;
    outline: 0;
}

.input-text:hover {
    height: 20px;
    width: 200px;
    border: 1px solid #41cdef;
    padding: 5px;
    font-size: 10px;
    margin-top: 5px;
    /* outline: 0; */
}
</style>