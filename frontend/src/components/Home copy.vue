<template>
  <v-container id="container d-flex">
    <v-card class="header">
      <v-row>
        <v-col class="justify-content d-flex mt-4">
          <v-avatar
            size="80px">
              <v-img
                :src="require('../assets/pic.jpg')"
               />
            </v-avatar>
          <span id="name-tile">Fábio Juchem</span>
        </v-col>
        <v-col class="d-flex flex-end mt-5">
          <v-btn class="button">Premium/Free</v-btn>
        </v-col>
      </v-row>
    </v-card>
    
  <div class="profile">
    <v-row class="">
      <v-card id="personal-data"
        class="justify-start mb-6 pa-4">
        <v-row id="lines">
          <v-text> 1.Dados Pessoais </v-text>
        </v-row>
        <v-row id="lines">
          <v-col>
            <!-- <v-label for="nome">teste</v-label>
            <span>{{personalData.name}}</span> -->
            <v-text-field
              id="nome"
              class="field"
              v-model="personalData.name"
              label="Nome usuário"
              outlined
              readonly
            ></v-text-field>
          </v-col>
          <v-col>
            <v-text-field
              class="field"
              v-model="personalData.surname"
              label="Sobrenome usuário"
              outlined
              readonly
            ></v-text-field>
          </v-col>
          <v-col>
            <v-text-field
              class="field"
              v-model="personalData.itin"
              label="CPF do usuário"
              outlined
              readonly              
            ></v-text-field>
          </v-col>
        </v-row>
        <v-row class="row">
          <v-col>
            <v-text-field
              class="field"
              v-model="personalData.city"
              label="Cidade do usuário"
              outlined
              readonly              
            ></v-text-field>
          </v-col>
          <v-col>
            <v-text-field
              class="field"
              v-model="personalData.country"
              label="País do usuário"
              outlined
              readonly              
            ></v-text-field>
          </v-col>
        </v-row>
      </v-card>
    </v-row>
  </div>

  <div class="profile">
    <v-row class="mb-3 ml-8 d-flex">
      <v-card class="professional-experience mb-6 pa-4">
        <v-row class="lines">
          <v-text> 2.Dados Profissionais </v-text>
        </v-row>
        <v-row class="lines">
          <v-col class="company-list-item" 
          cols="3"
          v-for="company in companies"
          :key="company.name">
            
                <business-card 
                  :company="company.name"
                  :role="company.role">
                </business-card>

          </v-col>
        </v-row>
      </v-card>
    </v-row>
  </div>
<!-- 
    <v-spacer class="mb-3 ml-8"></v-spacer>
    <br> -->
    <div class="profile">
      <v-row class="footer mb-3 ml-8">
        <v-card id="lines">
          <v-row >
            <v-btn id="edit-button">Editar</v-btn>
          </v-row>
        </v-card>
      </v-row>
    </div>  
  </v-container>
</template>

<script>
  import Business from './shared/business/Business.vue';

  export default {
    name: 'Home',

    components: {
      'business-card' : Business 
    },

    data () {
      return {
        companies: {
            company1: {
            name: 'DB1',
            role: 'Dev Java Trainee'
          },
          company2: {
            name: 'UEM',
            role: 'Doutorando'
          },
          company3: {
            name: 'UEM',
            role: 'Mestrando'
          },
          company4: {
            name: 'UEM',
            role: 'Mestrando'
          },
          company5: {
            name: 'UEM',
            role: 'Mestrando'
          }
        },
        personalData: {
          name: 'Fábio',
          surname: 'Vansovis Juchem',
          itin: '123456789-01',
          city: 'Maringá',
          country: 'Brasil'
        },
        
      }
    },

  }

</script>

<style scoped>
#container {
  display: flexbox;
}

.profile {
  display: flex;
  justify-content: space-between;
  width: 100%;
}

.field {
  width: 300px;
  justify-content: flex-start;
}

.row {
  justify-content: left;
}

.header {
  display: flexbox;
  width: 1115px;
  height: 111px;
  left: 279px;
  top: 46px;

  background: #FFFFFF;
  border: 1px solid #D7D7D7;
  border-radius: 3px;
}

.button {
  width: 175px;
  height: 43px;
  background: rgba(217, 211, 159, 0.47);
  border: 2px solid #D9D39F;
  box-sizing: border-box;
  border-radius: 3px;
}

#personal-data {
  width: 1115px;
  height: 224px;
  left: 279px;
  top: 182px;

  background: #FFFFFF;
  border: 1px solid #D7D7D7;
  box-sizing: border-box;
  border-radius: 3px;
}

.professional-experience {
  display: flexbox;
  max-width: 1115px;
  left: 279px;
  top: 431px;

  background: #FFFFFF;
  border: 1px solid #D7D7D7;
  box-sizing: border-box;
  border-radius: 3px;
}
.company-list {
  list-style: none;
  display: flex;
  flex-wrap: wrap;
}

.company-card {
  width: 235px;
  height: 122px;
  left: 25px;
  top: 71px;

  background: #EBF1FC;
  border-radius: 3px;
}

.footer {
  max-width: 1115px;
  height: 75px;

  background: #FFFFFF;
  border: 1px solid #D7D7D7;
  box-sizing: border-box;
  border-radius: 3px;
}

#edit-button {
  color: #FFFFFF;
  background: #263758;
  width: 162px;
  height: 47px;
  left: 932px;
  top: 14px;
}
</style>
