<template>
<div>
<card class="card" title="TOKEN DETAILS">
      <div class="row">
      <div class="col-md-4" style="pointer-events:none;">
        <fg-input type="text"
                  label="Token No"
                  v-model="user.token">
        </fg-input>
      </div>
        <div class="col-md-4" style="pointer-events:none;">
          <fg-input type="text"
                    label="Date"
                    v-model="user.date">
          </fg-input>
        </div>
        <div class="col-md-4" style="pointer-events:none;">
          <fg-input type="text"
                    label="Desk"
                    v-model="user.desk">
          </fg-input>
        </div>
      </div>

      <div class="row">
      <div class="col-md-4" style="pointer-events:none;">
        <fg-input type="text"
                  label="Purpose"
                  v-model="user.purpose">
        </fg-input>
      </div>
        <div class="col-md-4" style="pointer-events:none;">
          <fg-input type="text"
                    label="Issue Title"
                    v-model="user.title">
          </fg-input>
        </div>
        <div class="col-md-4" style="pointer-events:none;">
          <fg-input type="text"
                    label="Description"
                    v-model="user.description">
          </fg-input>
        </div>

      </div>
</card>

<card class="card" title="Documents">
<div>
      <div class="row" style="margin-left:16px;">
        <VueFileAgent :uploadUrl="uploadUrl" v-model="fileRecords"></VueFileAgent>
      </div>

      <div style="margin-left:16px;margin-top:16px;">
        <label>Documents Required: (Address proof)</label>
      </div>
</div>
</card>

<card class="card" title="Notes">
      <div class="row" style="margin-left:16px;background:#EEE;margin-right:16px;">
        <fg-input type="text"
                  label="Notes"
                  style="margin-left:8px;width:100%;margin-right:8px;"
                  v-model="user.notes">
        </fg-input>
      </div>
      <p-button style="margin-top:16px;float: right;margin-right:16px;">POST</p-button>
</card>


<card class="card" title="Activities">
    <div class="alert alert-info">
      <span>Visitor raised query on #TOK123 regarding elecricity issue & ticket in progress</span>
    </div>

    <div class="alert alert-success">
      <span>Visitor walkin for followup with token #REF546</span>
    </div>

    <div class="alert alert-warning">
      <span>Generated token #TOK123</span>
    </div>

    <div class="alert alert-danger">
      <span>Visitor raised query on #TOK853 regarding water issue & ticket in completed</span>
    </div>
</card>

<card class="card" title="Ticket Status" style="background-color:#EEE">
    <div class="row" >
      <div class="col-xl-12 col-lg-12 col-md-6">
      <div>
        <form @submit.prevent>
          <div class="row">
            <div class="col-md-4">
            <slot name="label">
              <label class="control-label">
                Status
              </label>
            </slot>
            </br
            <slot name="label">
                <select v-model="selectedValue" class="custom-select">
                   <option disabled value="">Please select one</option>
                   <option v-for="item in status" :value="item">{{item}}</option>
               </select>
            </slot>
            </div>
          </div>


          <div class="text-center">
            <p-button type="info" style="width:150px;float:left;margin-top:16px;">
              Update
            </p-button>
          </div>

        </form>
      </div>
      </div>
    </div>
</card>


<card class="card" title="Forward Ticket" style="background-color:#EEE">
    <div class="row" >
      <div class="col-xl-12 col-lg-12 col-md-6">
      <div>
        <form @submit.prevent>
          <div class="row">
            <div class="col-md-4">
            <slot name="label">
              <label class="control-label">
                Forward to:
              </label>
            </slot>
            </br
            <slot name="label">
                <select v-model="selectedValue" class="custom-select">
                   <option disabled value="">Please select one</option>
                   <option v-for="item in forward" :value="item">{{item}}</option>
               </select>
            </slot>
            </div>
          </div>


          <div class="text-center">
            <p-button type="info" style="width:150px;float:left;margin-top:16px;">
              Save
            </p-button>
          </div>

        </form>
      </div>
      </div>
    </div>
</card>


</div>

</template>
<script>
import VueFileAgentPlugin  from 'vue-file-agent';
const VueFileAgent = VueFileAgentPlugin.VueFileAgent;
import VueFileAgentStyles from 'vue-file-agent/dist/vue-file-agent.css';

export default {
  components: {
    VueFileAgent
  },
  data() {
    return {
    fileRecords: [],
    uploadUrl: 'https://example.com',
    purpose: ["General","Grievance"],
    status: ["Resolved","Forwarded to MLA","Complaint raised to Govt Authority","Completed"],
    forward: ["MLA Level 1","MLA Level 2"],
    selectedValue: null,
    title: ["Aadhar","Electricity","Water"],
    object: {
      name: '3',
    },
    user: {
        token: "#TOK4512",
        date: "02-04-2021",
        desk: "D025",
        purpose: "Grievance",
        title: "Electricity",
        description: "Issue with Electricity connections",
        booth: "AC",
        locality: "Pune",
        sublocality: `Kondhwa`,
        notes: ""

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
