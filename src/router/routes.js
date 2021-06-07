import DashboardLayout from "@/layout/dashboard/DashboardLayout.vue";
import GenericToolbarLayout from "@/layout/dashboard/GenericToolbarLayout.vue";
import LoginLayout from "@/layout/dashboard/LoginLayout.vue";

// GeneralViews
import NotFound from "@/pages/NotFoundPage.vue";

// Admin pages
import Dashboard from "@/pages/Dashboard.vue";
import Login from "@/pages/Login.vue";
import UserProfile from "@/pages/UserProfile.vue";
import SearchResults from "@/pages/SearchResults.vue";
import VoterListResult from "@/pages/VoterListResult.vue";
import VisitorDetails from "@/pages/VisitorDetails.vue";
import EditVisitorProfile from "@/pages/EditVisitorProfile.vue";
import AddVisitorProfile from "@/pages/AddVisitorProfile.vue";
import ResolutionDesk from "@/pages/ResolutionDesk.vue";
import GenerateToken from "@/pages/GenerateToken.vue";
import TokenDetials from "@/pages/TokenDetials.vue";

const routes = [
  {
  path: "/",
  component: LoginLayout,
  redirect: "/login",
  children: [
    {
      path: "login",
      name: "Login",
      component: Login
    }
  ]
},
{ path: "*", component: NotFound }
];

export default routes;
