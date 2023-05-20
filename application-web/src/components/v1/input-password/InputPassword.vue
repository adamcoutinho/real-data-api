<template>
    <input type="password" class="input-password" :placeholder="placeholder" :value="text" @input="onInput"  />
</template>

<script lang="ts">
import { defineComponent, ref } from "vue";

export default defineComponent({
    name: "InputPassword",
    props: {
        text: {
            type: String,
            value: ''
        },
        placeholder: String,
        
    },
    methods: {
        onInput(event: any) {
            this.$emit('update:text', event.target.value)
        }
    }
});
</script>

<style >
.input-password {
    height: 20px;
    width: 200px;
    border: 1px solid #e7e7e7;
    padding: 5px;
    font-size: 10px;
    margin-top: 5px;
    outline: 0;
}

.input-password:hover {
    height: 20px;
    width: 200px;
    border: 1px solid #41cdef;
    padding: 5px;
    font-size: 10px;
    margin-top: 5px;

}
</style>