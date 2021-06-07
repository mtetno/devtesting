<template>
  <div>

    <!--Stats cards-->
    <div class="row">
      <div class="col-md-6 col-xl-3" v-for="stats in statsCards" :key="stats.title">
        <stats-card>
          <div class="icon-medium text-center" :class="`icon-${stats.type}`" slot="header">
            <i :class="stats.icon"></i>
          </div>
          <div class="numbers" slot="content">
            <p>{{stats.title}}</p>
            {{stats.value}}
          </div>
          <div class="stats" slot="footer">
            <i :class="stats.footerIcon"></i> {{stats.footerText}}
          </div>
        </stats-card>
      </div>
    </div>

    <div class="row">
      <div class="col-12">
        <card :title="table1.title" :subTitle="table1.subTitle">
          <div slot="raw-content" class="table-responsive">
            <visitor-results-table :data="table1.data" :columns="table1.columns" :columnsActions="table1.columnsActions" :type="table1.columnsType">

            </visitor-results-table>
          </div>
        </card>
       </div>
      </div>

  </div>
</template>
<script>
import { StatsCard, ChartCard } from "@/components/index";
import Chartist from 'chartist';

import { VisitorResultsTable } from "@/components";
const tableColumns = ["TokenId", "Purpose", "Date", "Status"];
const tableColumnsType = ["link", "text", "text", "text"];
const tableColumnsAction = [ "tokenDetails" , "/", "/" , "/" ];
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
    StatsCard,
    ChartCard,
    VisitorResultsTable
  },
  /**
   * Chart data used to render stats, charts. Should be replaced with server data
   */
  data() {
    return {
      statsCards: [
        {
          type: "info",
          icon: "ti-bookmark-alt",
          title: "Total Grievances",
          value: "1520",
          footerText: "Solved (Till Date)",
          footerIcon: ""
        },
        {
          type: "warning",
          icon: "ti-reload",
          title: "Pending Grievances",
          value: "354",
          footerText: "Including present day",
          footerIcon: ""
        },
        {
          type: "danger",
          icon: "ti-pencil-alt",
          title: "New Grievances",
          value: "56",
          footerText: "Received <today>",
          footerIcon: ""
        },
        {
          type: "success",
          icon: "ti-wallet",
          title: "Closed Grievances",
          value: "700",
          footerText: "Updated now",
          footerIcon: ""
        }
      ],
      usersChart: {
        data: {
          labels: [
            "9:00AM",
            "12:00AM",
            "3:00PM",
            "6:00PM",
            "9:00PM",
            "12:00PM",
            "3:00AM",
            "6:00AM"
          ],
          series: [
            [287, 385, 490, 562, 594, 626, 698, 895, 952],
            [67, 152, 193, 240, 387, 435, 535, 642, 744],
            [23, 113, 67, 108, 190, 239, 307, 410, 410]
          ]
        },
        options: {
          low: 0,
          high: 1000,
          showArea: true,
          height: "245px",
          axisX: {
            showGrid: false
          },
          lineSmooth: Chartist.Interpolation.simple({
            divisor: 3
          }),
          showLine: true,
          showPoint: false
        }
      },
      activityChart: {
        data: {
          labels: [
            "Jan",
            "Feb",
            "Mar",
            "Apr",
            "Mai",
            "Jun",
            "Jul",
            "Aug",
            "Sep",
            "Oct",
            "Nov",
            "Dec"
          ],
          series: [
            [542, 543, 520, 680, 653, 753, 326, 434, 568, 610, 756, 895],
            [230, 293, 380, 480, 503, 553, 600, 664, 698, 710, 736, 795]
          ]
        },
        options: {
          seriesBarDistance: 10,
          axisX: {
            showGrid: false
          },
          height: "245px"
        }
      },
      preferencesChart: {
        data: {
          labels: ["62%", "32%", "6%"],
          series: [62, 32, 6]
        },
        options: {}
      },
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
