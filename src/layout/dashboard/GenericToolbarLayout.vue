<template>
  <div class="wrapper">
    <side-bar>
      <template slot="links">
        <sidebar-link to="/registrationDesk" name="Registration Desk" icon="ti-user"/>
        <sidebar-link to="/resolutionDesk" name="Resolution Desk" icon="ti-headphone"/>
        <sidebar-link to="/MLARepresentative" name="MLA Representative" icon="ti-panel"/>
      </template>

    </side-bar>
    <div class="main-panel">
      <top-navbar-with-control></top-navbar-with-control>

      <dashboard-content @click.native="toggleSidebar">

      </dashboard-content>
    </div>
  </div>
</template>
<style lang="scss">
</style>
<script>
import TopNavbarWithControl from "./TopNavbarWithControl.vue";
import ContentFooter from "./ContentFooter.vue";
import DashboardContent from "./Content.vue";
import MobileMenu from "./MobileMenu";
export default {
  components: {
    TopNavbarWithControl,
    ContentFooter,
    DashboardContent,
    MobileMenu
  },
  methods: {
    toggleSidebar() {
      if (this.$sidebar.showSidebar) {
        this.$sidebar.displaySidebar(false);
      }
    }
  }
};
</script>
