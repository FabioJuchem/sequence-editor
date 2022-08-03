<template>
  <v-container id="container d-flex">    
    <div class="profile">
      <profile-header></profile-header>

    <div class="profile">
      <v-card class="professional-experience">
        <v-row class="title-lines">
          <v-text> Conversor DNA/RNA </v-text>
        </v-row>
      </v-card>
    </div>

      <v-card class="personal-data">
        <v-row class="personal-row">
          <v-col>
            <v-textarea
              id="input"
              class="field"
              v-model="inputValue"
              label="Input"
              outlined
            ></v-textarea>
          </v-col>
        </v-row>
      </v-card>
    </div>

    <div class="profile">
      <v-card class="">
        <v-row class="title-lines">
          <v-text> Saída </v-text>
        </v-row>
         <v-row class="personal-row">
          <v-col>
            <v-textarea
              id="output"
              class="field"
              v-model="outputValue"
              label="Output"
              outlined
            ></v-textarea>
          </v-col>
        </v-row>
        <v-row class="footer">
          <v-btn class="edit-button">Editar</v-btn>
        </v-row>
      </v-card>
    </div> 
  </v-container>
</template>

<script>
  import ProfileHeader from '../components/shared/ProfileHeader.vue';

  export default {
    name: 'Converter',

    components: {
      'profile-header' : ProfileHeader
    },

    data () {
      return {
        companies: {
            company1: {
            name: 'DNA - RNA',
            role: '26/01/2022'
          },
          company2: {
            name: 'DNA - RNA',
            role: '10/12/2021'
          },
          company3: {
            name: 'DNA - Proteínas',
            role: '03/10/2021'
          },
          company4: {
            name: 'Cálculo de diluições',
            role: '15/03/2021'
          },
          company5: {
            name: 'DNA - RNA',
            role: '11/03/2021'
          },
          company6: {
            name: 'DNA - RNA',
            role: '05/01/2021'
          },
        },
        inputValue: '',
        outputValue: ''
      }
    },
  }

</script>

<style scoped>
.profile-header {
  width: 100%;
}
.header {
  margin-top: 46px;
}

.avatar {
  display: flex;
}

.main-title {
  margin: 30px 0px 30px 15px;
  font-style: normal;
  font-weight: bold;
  font-size: 25px;
  line-height: 25px;
}

.premium-free {
  justify-content: flex-end;
  padding: 33px 15px 35px 0px;
  text-align: right;
}

.premium-button {
  background-color: #D9D39F78 !important;
}

.v-card {
  margin-left: 52px;
  margin-right: 46px;
  margin-bottom: 25px;
  padding: 21px 20px 16px 20px;
}

.title-lines {
  margin-top: 1px;
  margin-left: 1px;
  font-style: normal;
  font-weight: bold;
  font-size: 18px;
  line-height: 25px;
}
.personal-row {
  justify-content: flex-start !important;
  align-content: flex-start !important;
  
}
.footer {
  justify-content: flex-end;
  padding: 14px 21px 14px 0px;
}
.edit-button {
  background-color: #263758  !important;
  color: ivory !important;
  width: 162px;
  height: 47px;
}
</style>
