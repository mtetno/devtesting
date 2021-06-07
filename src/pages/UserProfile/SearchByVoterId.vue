<template>
  <card class="card" title="Search by Voter ID">
    <div>
      <form @submit.prevent>


        <div class="row">
          <div class="col-md-12">
            <fg-input type="text"
                      label="Enter voter-id:"
                      placeholder="EDFXXXXXXX"
                      v-model="user.address">
            </fg-input>
          </div>
        </div>

        <div class="text-center">
          <p-button type="info"
                    round
                    @click.native.prevent="updateProfile">
            Search
          </p-button>
        </div>
        <div class="clearfix"></div>
      </form>
    </div>
  </card>
</template>
<script>
export default {
  data() {
    return {
      user: {
        company: "Paper Dashboard",
        username: "michael23",
        email: "",
        firstName: "Chet",
        lastName: "Faker",
        address: "",
        city: "Melbourne",
        postalCode: "",
        aboutMe: `We must accept finite disappointment, but hold on to infinite hope.`
      }
    };
  },
  methods: {
    updateProfile() {
      this.$router.push({path: '/voterList'});
    }
  }
};
</script>
<style>
</style>
