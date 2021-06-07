<template>
<card class="card" title="GENERATE TOKEN" style="background-color:#EEE">
    <div class="row" >
      <div class="col-xl-12 col-lg-12 col-md-6">
      <div>
        <form @submit.prevent>
          <div class="row">
            <div class="col-md-4">
            <slot name="label">
              <label class="control-label">
                Purpose
              </label>
            </slot>
            </br
            <slot name="label">
                <select v-model="selectedValue" class="custom-select">
                   <option disabled value="">Please select one</option>
                   <option v-for="item in purpose" :value="item">{{item}}</option>
               </select>
            </slot>
            </div>
          </div>

          <div class="row">
            <div class="col-md-4">
            <slot name="label">
              <label class="control-label">
                Issue title
              </label>
            </slot>
            </br
            <slot name="label">
                <select v-model="selectedValue" class="custom-select">
                   <option disabled value="">Please select one</option>
                   <option v-for="item in title" :value="item">{{item}}</option>
               </select>
            </slot>
            </div>
          </div>

          <div class="row">
            <div class="col-md-4">
            <slot name="label">
              <label class="control-label">
                Issue Details
              </label>
            </slot>
            </br
            <slot name="label">
            <input
              :value="value"
              @input="$emit('input',$event.target.value)"
              v-bind="$attrs"
              class="form-control"
              aria-describedby="addon-right addon-left">
            </slot>
            </div>
          </div>

          <div class="text-center">
            <p-button type="info"
                      round
                      @click.native.prevent="updateProfile">
              Issue Token
            </p-button>
          </div>

        </form>
      </div>
      </div>
    </div>
</card>
</template>
<script>
import Dropdown from 'bp-vuejs-dropdown';

export default {
  components: {
    Dropdown
  },
  data() {
    return {
    purpose: ["General","Grievance"],
    selectedValue: null,
    title: ["Aadhar","Electricity","Water"],
    object: {
      name: '3',
    },
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
  methods: {
    methodToRunOnSelect(payload) {
      this.object = payload;
    }
  }
};
</script>
<style scoped>
.my-dropdown-toggle {
  border-radius: 5px;

  ::v-deep .dropdown-toggle {
    color: tomato;
    font-size: 25px;
    font-weight: 800;
  }

  ::v-deep .dropdown-toggle-placeholder {
    color: #c4c4c4;
  }
}

.inputBackground{
background-color: "#EEE"
}

.custom-select{
width: 310px;
height: 40px;
}

</style>
