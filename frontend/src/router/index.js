import { createRouter, createWebHistory } from 'vue-router';
import TestForm from '../pages/testForm.vue';
import TestList from '../pages/testList.vue';

const routes = [
  { path: '/test-form', name: 'TestForm', component: TestForm },
  { path: '/test-list', name: 'TestList', component: TestList },
  { path: '/', redirect: '/test-form' },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
