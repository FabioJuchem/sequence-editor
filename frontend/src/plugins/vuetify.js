import Vue from 'vue';
import Vuetify from 'vuetify/lib/framework';

Vue.use(Vuetify);

export default new Vuetify({
    theme: { 
        themes: {
            light: {
                primary: '#3f51b5',
                secondary: '#2196f3',
                accent: '#03a9f4',
                error: '#f44336',
                warning: '#ff9800',
                info: '#00bcd4',
                success: '#4caf50'
            },
            dark: false            
        }
    }
});
