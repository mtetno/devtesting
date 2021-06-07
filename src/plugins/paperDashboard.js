import Notify from "vue-notifyjs";
import Dropdown from 'bp-vuejs-dropdown';
import SideBar from "@/components/SidebarPlugin";
import GlobalComponents from "./globalComponents";
import GlobalDirectives from "./globalDirectives";
import VueFileAgent from 'vue-file-agent';
import "es6-promise/auto";

//css assets
import "vue-file-agent/dist/vue-file-agent.css";
import "bootstrap/dist/css/bootstrap.css";
import "@/assets/sass/paper-dashboard.scss";
import "@/assets/css/themify-icons.css";

export default {
  install(Vue) {
    Vue.use(GlobalComponents);
    Vue.use(GlobalDirectives);
    Vue.use(SideBar);
    Vue.use(Notify);
    Vue.use(Dropdown);
    Vue.use(VueFileAgent);
  }
}
