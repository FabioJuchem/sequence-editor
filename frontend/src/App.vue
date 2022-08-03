<template>
  <v-app id="app">
    <v-navigation-drawer id="nav" 
      app
      permanent>

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
      <converter/>
    </v-main>
  </v-app>
</template>

<script>
import Converter from './components/Converter.vue';

export default {
  name: 'App',
  components: {
    'converter': Converter,
  },
  data: () => ({
      items: [
          { title: 'Conversor DNA/RNA', icon: 'mdi-swap-horizontal' },
          { title: 'Protein Translator', icon: 'mdi-swap-horizontal' },
          { title: 'Option 3', icon: 'mdi-swap-horizontal' },
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
  background: #5A5AE2;
}
#nav-header {
  color: #FFFFFF;
  background: #5A5AE2;
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
