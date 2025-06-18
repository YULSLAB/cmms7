<template>
  <div>
    <nav class="p-4 bg-gray-200 flex gap-4">
      <router-link to="/test-form" class="text-blue-600">Form</router-link>
      <router-link to="/test-list" class="text-blue-600">List</router-link>
    </nav>
    <router-view />
  </div>
</template>
