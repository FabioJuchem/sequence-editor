<template>
  <v-app id="app">
    <v-navigation-drawer id="nav" 
      app
      permanent>
<!--       
      <v-row>
        <v-img class="helix-icon"
          src="@/assets/helix_horizontal.png"
        ></v-img>
      </v-row> -->

      <v-list-item id="nav-header">
        <span class="title">Sequence Editor</span>
      </v-list-item>
      <v-list class="options"
          dense
          nav>
          <v-list-item id="list"
          v-for="item in items"
          :key="item.title"
          link>
          <v-list-item-icon class="itens">
              <v-icon class="icon">{{ item.icon }}</v-icon>
          </v-list-item-icon>
          <v-list-item-content class="itens">
              <v-list-item-title>{{ item.title }}</v-list-item-title>
          </v-list-item-content>
          </v-list-item>
      </v-list>

    </v-navigation-drawer>

    <v-main>
      <home/>
      <!-- <v-text-area class="mb-3">
        Kiko Tozatti: Só se sabe para onde vai, quando se lembra de onde veio. Quem esquece de suas origens, está arriscando se perder no cominho.
      </v-text-area> -->
    </v-main>
  </v-app>
</template>

<script>
//import HelloWorld from './components/HelloWorld.vue';
import Home from './components/Home.vue';

export default {
  name: 'App',
  components: {
    // HelloWorld,
    Home,
  },
  data: () => ({
      items: [
          { title: 'Informações de Usuário', icon: 'mdi-account' },
          { title: 'Conversor DNA - RNA', icon: 'mdi-swap-horizontal' },
          { title: 'Conversor DNA - Proteínas', icon: 'mdi-swap-horizontal' },
          { title: 'Conversor de Unidades', icon: 'mdi-swap-horizontal' },
          { title: 'Cálculos de Molaridade', icon: 'mdi-calculator-variant' },
          { title: 'Cálculos de diluições', icon: 'mdi-calculator-variant' },
          { title: 'Configurações', icon: 'mdi-cog-outline' },
          { title: 'Sobre a Helix', icon: 'mdi-help-box' },
        ]
    })
}
</script>

<style scoped>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  background: #EEF0F3;
}
#nav {
  width: 225px;
  height: 900px;
  left: 0px;
  top: 0px;
  background: #30436B;
}
#nav-header {
  color: #FFFFFF;
  background: #30436B;
}
.options {
  margin-top: -50px;
}
#list {
  width: 100%;
  height: 55px;
  left: 0px;
  top: 89px;
  background: #495D87;
}
.title {
  padding: 5px 0px 1px 0px;
  font-style: normal;
  font-weight: bold;
  font-size: 30px !important;
  line-height: 50px;
  display: flex;
  align-items: center;
  font-family: Roboto;
  font-style: normal;
  font-weight: bold;
  color: #FFFFFF !important;
}
.itens {
  padding: 15px 0px 1px 5px;
  font-style: normal;
  font-weight: bold;
  font-size: 25px;
  line-height: 19px;
  display: flex;
  align-items: center;
  color: #FFFFFF !important;

}
.icon {
  size: 100px;
  color:  #FFFFFF;
}
.helix-icon {
  display: flex;
  size: 200px;
}
#option {
  width: 165px;
  height: 31px;
  left: 52px;
  top: 96px;
  font-family: Open Sans;
  font-style: normal;
}
</style>
