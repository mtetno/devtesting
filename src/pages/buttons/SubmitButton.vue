<template>
  <button @click="onLogin" class="a-submitButton">
    <slot></slot>
  </button>
</template>

<style lang="scss" scoped>
@import "../../scss/components/buttons/_submitButton.scss";

</style>

<script>
 
export default {
  methods: {
      onLogin() {
        this.$parent.onLogin()
      }
  }
};
</script>
