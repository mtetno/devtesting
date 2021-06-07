<template>
    <div class="row">
      <div class="col-xl-6 col-lg-6 col-md-6">
        <search-by-field>

        </search-by-field>
      </div>
      <div class="col-xl-6 col-lg-6 col-md-6">
        <search-by-voter-id>

        </search-by-voter-id>
      </div>
    </div>
</template>
<script>

import SearchByField from "./UserProfile/SearchByField.vue";
import SearchByVoterId from "./UserProfile/SearchByVoterId.vue";
import UserCard from "./UserProfile/UserCard.vue";
import MembersCard from "./UserProfile/MembersCard.vue";
export default {
  components: {
    SearchByField,
    SearchByVoterId,
    UserCard,
    MembersCard
  }
};
</script>
<style>
</style>
