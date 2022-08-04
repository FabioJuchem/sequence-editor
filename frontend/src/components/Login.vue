<template>
  <v-container id="container d-flex">    
    <div class="login">

      <v-card class="personal-data" style="background-color:#676258; width: 300px; height: 230px;">
        
        <v-row class="login-box">
          <v-col>
            <v-text-field
              id="user"
              class="field"
              v-model="inputValue"
              label="Usuario"
              background-color="white"
            ></v-text-field>
            <v-text-field
              id="password"
              class="field"
              v-model="inputValue"
              label="Senha"
              background-color="white"
            ></v-text-field>
          </v-col>
        </v-row>
        <v-row class="button-box">
          <v-spacer></v-spacer>
          <v-btn class="login-button"
            v-on:click="convert(selectedMethod)"
            >Acessar
          </v-btn>
        </v-row>
      </v-card>
    </div>
  </v-container>
</template>

<script>
  // import axios from 'axios';

  export default {
    methods: {
         
      },
    
    data () {
      return {
      }
    },
  }

</script>

<style scoped>

.container {
  margin-top: 100px;
  display: flex;
  align-items: center;
  justify-content: center;
}
.v-card {
  margin-left: 52px;
  margin-right: 46px;
  margin-bottom: 25px;
  padding: 21px 20px 16px 20px;
}

.login-box {
  display: flex;
  justify-content: center !important;
  align-items: center !important;
  
}

.button-box {
  display: flex
}

.login-button {
  background-color: #263758  !important;
  color: ivory !important;
  align-self: flex-end;
}
</style>
