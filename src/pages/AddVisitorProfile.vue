<template>
<card class="card" title="Add Visitor" style="background-color:#EEE">
    <div class="row" >
      <div class="col-xl-12 col-lg-12 col-md-6">
      <div>
        <form @submit.prevent>
          <div class="row">
          <div class="col-md-4">
            <fg-input type="text"
                      label="Name"
                      v-model="user.name">
            </fg-input>
          </div>
            <div class="col-md-4">
              <fg-input type="text"
                        label="Gender"
                        v-model="user.gender">
              </fg-input>
            </div>
            <div class="col-md-4">
              <fg-input type="text"
                        label="Mobile No"
                        v-model="user.mobileNo">
              </fg-input>
            </div>
          </div>

          <div class="row">
          <div class="col-md-4">
            <fg-input type="text"
                      label="House No"
                      v-model="user.houseNo">
            </fg-input>
          </div>
            <div class="col-md-4">
              <fg-input type="text"
                        label="Assembly Constituency"
                        v-model="user.assembly">
              </fg-input>
            </div>
            <div class="col-md-4">
              <fg-input type="text"
                        label="Ward"
                        v-model="user.ward">
              </fg-input>
            </div>
          </div>



          <div class="row">
          <div class="col-md-4">
            <fg-input type="text"
                      label="Booth"
                      v-model="user.booth">
            </fg-input>
          </div>
            <div class="col-md-4">
              <fg-input type="text"
                        label="Locality"
                        v-model="user.locality">
              </fg-input>
            </div>
            <div class="col-md-4">
              <fg-input type="text"
                        label="Sub-Locality"
                          v-model="user.sublocality">
              </fg-input>
            </div>
          </div>

          <div class="text-center">
            <p-button type="info"
                      round
                      @click.native.prevent="updateProfile">
              Add Visitor
            </p-button>
          </div>


        </form>
      </div>
      </div>
    </div>
</card>
</template>
<script>

export default {
  components: {

  },
  data() {
    return {
    user: {
        name: "Ram Chandra",
        gender: "Male",
        mobileNo: "8308668549",
        houseNo: "B541",
        assembly: "Timarpur",
        ward: "A",
        booth: "AC",
        locality: "Pune",
        sublocality: `Kondhwa`
      }
    };
  },
};
</script>
<style>

.inputBackground{
background-color: "#EEE"
}

</style>
