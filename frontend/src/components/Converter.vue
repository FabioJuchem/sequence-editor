<template>
  <v-container id="container d-flex">    
    <div class="profile">
      <profile-header @login="login" :userData="userData"></profile-header>

    <div class="profile">
      <v-card class="professional-experience">
        <v-row class="title-lines">
          <span> Conversor DNA/RNA </span>
        </v-row>
      </v-card>
    </div>

      <v-card class="personal-data" style="background-color:#676258">
        <v-row class="title-lines">
          <span> Entrada </span>
        </v-row>
        <v-row class="personal-row">
          <v-col>
            <v-textarea
              id="input"
              class="field"
              v-model="inputValue"
              label="Entre a sequencia aqui (formato fasta)"
              outlined
              background-color="white"
            ></v-textarea>
          </v-col>
        </v-row>
        <v-row class="title-lines" no-gutters>
          <v-col cols="2">
            <v-select class="mr-2"
              background-color="#FB8C00"
              outlined
              label="Métodos de conversão"
              :items="convertionMethods"
              attach
              v-model="selectedMethod"
              item-text="description"
              value="value"
            />
          </v-col>
           <v-col cols="2">
            <v-select class="mr-2"
              background-color="#FB8C00"
              outlined
              multiple
              deletable-chips
              label="Direção da converção"
              :items="convertionDirection"
              attach
              item-text="description"
              value="value"
              v-model="selectedDirection"
            />
          </v-col>
           <v-col cols="2">
            <v-select
              background-color="#FB8C00"
              outlined
              height="auto"
              label="Outros"
              :items="convertionsOthers"
              attach
              v-model="selectedOthers"
              item-text="description"
              value="value"
            />
          </v-col>
        </v-row>
      </v-card>
    </div>

    <div class="profile">
      <v-card class="" style="background-color:#676258">
        <v-row class="title-lines">
          <span> Saída </span>
        </v-row>
         <v-row class="personal-row">
          <v-col>
            <v-textarea
              id="output"
              class="field"
              v-model="outputResponse.value"
              label="Output"
              outlined
              background-color="white"
              readonly
            ></v-textarea>
          </v-col>
        </v-row>
        <v-row class="footer">
          <v-btn class="edit-button"
            v-on:click="convert(selectedMethod)"
            >Converter
          </v-btn>
        </v-row>
      </v-card>
    </div> 
  </v-container>
</template>

<script>
  import ProfileHeader from '../components/shared/ProfileHeader.vue';
  import axios from 'axios';

  export default {
    name: 'Converter',
    props: {
      userData: Object
    },

    components: {
      'profile-header' : ProfileHeader
    },

    methods: {
        convert: function (type) {
          axios.post(`https://sequence-editor-api.herokuapp.com/convert/${type}?options=${this.prepareOptions()}`, {value: this.inputValue})
          .then((resp) => this.outputResponse =  resp.data)
        },

        prepareOptions: function () {
          return this.selectedDirection.concat(this.selectedOthers).join(',')
        },

        login: function () {
          this.$emit('login')
        }
      
    },
    
    data () {
      return {
        convertionMethods: [
          {
            description: 'DNA -> RNA',
            value: 'DNA_TO_RNA'
          },
          {
            description: 'RNA -> DNA',
            value: 'RNA_TO_DNA'
          }
        ],
        convertionDirection: [
          {
            description: 'Reverso',
            value: 'REVERSE'
          },
          {
            description: 'Complementar',
            value: 'COMPLEMENTARY'
          }
        ],
        convertionsOthers: [
          {
          description: 'Maiusculo',
          value: 'UPPERCASE'
          },
          {
            description: 'Minusculo',
            value: 'LOWERCASE'
          }
        ],
        inputValue: '',
        outputValue: '',
        selectedMethod: [],
        selectedDirection: [],
        selectedOthers: [],
        outputResponse: ''
      }
    },
  }

</script>

<style scoped>

.options {
  margin-right: 10px;
}
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
