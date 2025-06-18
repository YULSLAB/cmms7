<!-- testList.vue -->
<template>
  <div class="p-6 max-w-5xl mx-auto">
    <h1 class="text-xl font-bold mb-4">Test List</h1>
    <table class="min-w-full table-auto border border-gray-300">
      <thead class="bg-gray-100">
        <tr>
          <th class="px-4 py-2 border">#</th>
          <th class="px-4 py-2 border">Input 1</th>
          <th class="px-4 py-2 border">Input 2</th>
          <th class="px-4 py-2 border">Input 3</th>
          <th class="px-4 py-2 border">Input 4</th>
          <th class="px-4 py-2 border">Input 5</th>
          <th class="px-4 py-2 border">Notes</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="(item, index) in testList" :key="index">
          <td class="px-4 py-2 border text-center">{{ index + 1 }}</td>
          <td class="px-4 py-2 border">{{ item.input1 }}</td>
          <td class="px-4 py-2 border">{{ item.input2 }}</td>
          <td class="px-4 py-2 border">{{ item.input3 }}</td>
          <td class="px-4 py-2 border">{{ item.input4 }}</td>
          <td class="px-4 py-2 border">{{ item.input5 }}</td>
          <td class="px-4 py-2 border">{{ item.notes }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'TestList',
  data() {
    return {
      testList: [],
    };
  },
  mounted() {
    this.fetchData();
  },
  methods: {
    async fetchData() {
      try {
        const response = await axios.get('http://localhost:8080/api/test');
        this.testList = response.data;
      } catch (error) {
        console.error('Error fetching data:', error);
      }
    },
  },
};
</script>

<style scoped>
/* Optional styling */
</style>
