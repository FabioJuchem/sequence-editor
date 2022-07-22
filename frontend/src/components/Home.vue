<template>
  <v-container id="container d-flex">
    <v-card class="header">
      <v-row class="row"> 
        <v-col class="avatar">
          <v-avatar
            size="80px">
              <v-img
                :src="require('../assets/pic-user.jpg')"
               />
            </v-avatar>
          <span class="main-title">Olá, Fábio!</span>
        </v-col>
        <v-col class="premium-free">
          <v-btn class="premium-button">Premium/Free</v-btn>
        </v-col>
      </v-row>
    </v-card>
    
    <div class="profile">
      <v-card class="personal-data">
        <v-row class="title-lines">
          <v-text> 1.Dados do Usuário </v-text>
        </v-row>
        <v-row class="personal-row">
          <v-col>
            <v-text-field
              id="nome"
              class="field"
              v-model="personalData.name"
              label="Nome"
              outlined
              readonly
            ></v-text-field>
          </v-col>
          <v-col>
            <v-text-field
              class="field"
              v-model="personalData.surname"
              label="Sobrenome"
              outlined
              readonly
            ></v-text-field>
          </v-col>
          <v-col>
            <v-text-field
              class="field"
              v-model="personalData.email"
              label="E-mail"
              outlined
              readonly              
            ></v-text-field>
          </v-col>
        </v-row>
        <v-row class="personal-row">
          <v-col>
            <v-text-field
              class="field"
              v-model="personalData.company"
              label="Empresa"
              outlined
              readonly              
            ></v-text-field>
          </v-col>
          <v-col>
            <v-text-field
              class="field"
              v-model="personalData.address"
              label="Endereço"
              outlined
              readonly              
            ></v-text-field>
          </v-col>
          <v-col></v-col>
        </v-row>
      </v-card>
    </div>

    <div class="profile">
      <v-card class="professional-experience">
        <v-row class="title-lines">
          <v-text
          class=""> 2.Histórico de Análises </v-text>
        </v-row>
        <v-row class="row">
          <v-col class="company-list-item" 
          cols="2"
          v-for="company in companies"
          :key="company.name">
            
                <business-card 
                  :company="company.name"
                  :role="company.role">
                </business-card>

          </v-col>
        </v-row>
      </v-card>
    </div>

    <div class="profile">
      <v-card class="">
        <v-row class="footer">
          <v-btn class="edit-button">Editar</v-btn>
        </v-row>
      </v-card>
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
        personalData: {
          name: 'Fábio',
          surname: 'Vansovis Juchem',
          company: 'Vansovis ltda.',
          address: 'Maringá - PR, Brazil',
          email: 'fabiojuchem@gmail.com'
        },
      }
    },
  }

</script>

<style scoped>
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
