<template>
<div>

<card class="card" title="Visitor Profile">
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
            Edit Profile
          </p-button>
        </div>


      </form>
    </div>
  </card>



    <div class="row">
      <div class="col-12">
        <card :title="table1.title" :subTitle="table1.subTitle">
          <div slot="raw-content" class="table-responsive">
            <visitor-details-table :data="table1.data" :columns="table1.columns" :route="table1.columnsActions" :type="table1.columnsType">

            </visitor-details-table>
          </div>
        </card>
      </div>
    </div>

</div>
</template>
<script>
import { VisitorDetailsTable } from "@/components";
const tableColumns = ["TokenId", "Purpose", "Date", "Status"];
const tableColumnsType = ["link", "text", "text", "text"];
const tableColumnsAction = [ "/tokenDetails" , "/", "/" , "/" ];
const tableData = [
  {
    tokenid: "#TOK4512",
    purpose: "Electricity",
    date: "05-10-2008",
    status : "OPEN"
  },
  {
    tokenid: "#TOK7833",
    purpose: "Water",
    date: "18-01-2004",
    status : "OPEN"
  },
  {
    tokenid: "#TOK4512",
    purpose: "Aadhar",
    date: "25-12-2008",
    status : "CLOSED"
  },
  {
    tokenid: "#TOK4512",
    purpose: "Aadhar",
    date: "06-04-2020",
    status : "CLOSED"
  },
  {
    tokenid: "#TOK4512",
    purpose: "Water",
    date: "23-05-2015",
    status : "CLOSED"
  },
  {
    tokenid: "#TOK4512",
    purpose: "Aadhar",
    date: "15-01-2012",
    status : "CLOSED"
  }
];

export default {
  components: {
    VisitorDetailsTable
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
      },
      table1: {
        title: "Tickets",
        subTitle: "",
        columns: [...tableColumns],
        data: [...tableData],
        columnsActions: tableColumnsAction,
        columnsType: tableColumnsType
      },
      table2: {
        title: "Table on Plain Background",
        subTitle: "Here is a subtitle for this table",
        columns: [...tableColumns],
        data: [...tableData]
      }
    };
  },
  methods: {
    updateProfile(){
      this.$router.push('userProfile')
    }
  }
};
</script>
<style>
</style>
