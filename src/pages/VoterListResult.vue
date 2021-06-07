<template>
    <div class="row">
      <div class="col-12">
        <card :title="table1.title" :subTitle="table1.subTitle">
          <div slot="raw-content" class="table-responsive">
            <voter-list-table :data="table1.data" :columns="table1.columns" :route="table1.columnsActions" :type="table1.columnsType">

            </voter-list-table>
          </div>
        </card>
      </div>

    </div>
</template>
<script>
import { VoterListTable } from "@/components";
const tableColumns = ["UserId", "Name", "VoterId", "Mobile", "Action"];
const tableColumnsType = ["text", "text", "text", "text","button"];
const tableColumnsAction = [ "/" , "/dashboard", "/" , "/", "/" ];
const tableData = [
  {
    userid: 485,
    name: "Ram chandra",
    voterid: "ESC457896",
    mobile: "8321454521",
    action: ""
  },
  {
  userid: 485,
  name: "Sumit Bhatia",
  voterid: "KJS457896",
  mobile: "77458963210",
  action: ""
  },
  {
  userid: 485,
  name: "Aanshu T",
  voterid: "KJS457896",
  mobile: "9987451478",
  action: ""
  },
  {
  userid: 485,
  name: "Seema ramchandani",
  voterid: "GAHS457855",
  mobile: "75841598745",
  action: ""
  },
  {
  userid: 485,
  name: "Varun Agarwal",
  voterid: "WJS457892",
  mobile: "7845123690",
  action: ""
  }
];

export default {
  components: {
    VoterListTable
  },
  data() {
    return {
      table1: {
        title: "",
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
  }
};
</script>
<style>
</style>
