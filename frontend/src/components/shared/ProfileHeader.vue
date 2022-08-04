<template>
  <v-card class="header">
    <v-row class="row" v-if="!isLogged"> 
      <v-btn class="login-button"
        v-on:click="login"
        outlined>Login
      </v-btn>
    </v-row>
    <v-row class="row" v-else> 
      <span class="main-title">Olá, Fábio!</span>
      <v-avatar
        size="25px">
          <v-img
            :src="require('../../assets/pic-user.jpg')"
            />
        </v-avatar>
    </v-row>
  </v-card>
</template>

<script>
  export default {
    name: 'ProfileHeader',

    components: {
    },

    methods: {
      login: function() {
        this.$emit('login')
      }
    },

    data () {
      return {
        isLogged: false
      }
    }
  }

</script>

<style scoped>

.row {
  justify-content: flex-end !important;
  align-content: flex-end !important;
}

.main-title {
  margin: 0px 10px 0px 15px;
  font-style: normal;
  font-weight: bold;
  font-size: 18px;
  line-height: 25px;
}

</style>
