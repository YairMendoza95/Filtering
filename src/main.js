import Vue from 'vue';
import App from './App.vue';
import VueRouter from 'vue-router';
import VueResource from 'vue-resource';
import { routes } from './routes'
import { BootstrapVue, IconsPlugin, NavbarPlugin, TablePlugin } from 'bootstrap-vue';

Vue.use(VueRouter);
const router = new VueRouter({
    routes,
    mode: 'history'
});

Vue.use(VueResource);
Vue.http.options.root = 'http://localhost:8889/api';

import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap-vue/dist/bootstrap-vue.css';

Vue.use(BootstrapVue);
Vue.use(IconsPlugin);
Vue.use(NavbarPlugin);
Vue.use(TablePlugin);

new Vue({
    el: '#app',
    router,
    render: h => h(App)
});