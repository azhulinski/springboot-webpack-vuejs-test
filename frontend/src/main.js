import Vue from 'vue'
import App from './App'
import axios from 'axios';

axios.defaults.baseURL = 'http://localhost:8088';
axios.defaults.headers.common['Access-Control-Allow-Origin'] = 'http://localhost:8080';


Vue.config.productionTip = false;

new Vue({
  el: '#app',
  render: h => h(App)
  /*template: '<App/>',
  components: { App }*/
});
