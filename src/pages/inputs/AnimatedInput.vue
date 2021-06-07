<template>
  <div class="a-textInput">
    <input
      class="a-textInput__element"
      :class="{ '-animate': animateBorder }"
      placeholder=" "
      v-bind:value="input"
      v-on:input="updateValue($event.target.name,$event.target.value)"
      v-bind:name="name"
      :type="inputType"
    />

    <div class="a-textInput__placeholder">{{ placeholder }}</div>

    <span class="a-textInput__pcAnimation" v-if="animateBorder"></span>
  </div>
</template>

<script>
export default {
  props: {
    inputType: {
      type: String,
      required: false,
      default: "text"
    },
    input: {
      type: String,
      required: true
    },
    name : {
      type: String,
      required: true
    },
    placeholder: {
      type: String,
      required: true
    },
    animateBorder: {
      type: Boolean,
      required: false,
      default: false
    }
  },
   methods: {
    updateValue: function (input,value) {
      this.$parent.updateValue(input,value);
    }
  }
};
</script>

<style lang="scss" scoped>
@import "../../scss/components/inputs/_animatedInput.scss";

</style>