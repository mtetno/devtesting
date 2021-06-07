<template>
  <div class="m-loginForm">
    <Header title="Grievance Management" />

    <div class="m-loginForm__group">
      <animated-input placeholder="Email" name="email" :input="email" animateBorder />
    </div>

    <div class="m-loginForm__group">
      <animated-input
        placeholder="Password"
        animateBorder
        :input="password"
        name="password"
        inputType="password"
      />
    </div>
 
    <submit-button>Login</submit-button>
  </div>
</template>

<script>
import axios from 'axios';
import Header from "./inputs/Header.vue";
import AnimatedInput from "./inputs/AnimatedInput.vue";
import CustomCheckbox from "./inputs/CustomCheckbox.vue";
import LinkButton from "./buttons/LinkButton.vue";
import SubmitButton from "./buttons/SubmitButton.vue";
import {LOGIN_API} from '../utils/contants';
export default {
  data() {
    return {
      email: "",
      password: "",
      rememberMe: false
    };
  },
  components: {
    Header,
    AnimatedInput,
    CustomCheckbox,
    LinkButton,
    SubmitButton
  },
  methods: {
      onLogin() {
      const params = { username: "admin", password : "password" };
      axios.post(LOGIN_API, params)
      .then(response => 
      console.log(response.data.id)
      );
      },
      updateValue(input,value) {
        this[input]=value;
      }
  },
  props: {
    title: String
  }
};
</script>

<style lang="scss" scoped>
@import "..//scss/components/forms/_loginForm.scss";
</style>
