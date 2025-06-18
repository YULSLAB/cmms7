<!-- testForm.vue -->
<template>
  <div class="p-6 max-w-3xl mx-auto">
    <h1 class="text-xl font-bold mb-4">Test Form</h1>
    <form @submit.prevent="handleSubmit" class="space-y-4">
      <div v-for="n in 5" :key="n" class="flex flex-col">
        <label :for="`input${n}`" class="mb-1 font-medium">Field {{ n }}</label>
        <input
          :id="`input${n}`"
          v-model="form[`input${n}`]"
          maxlength="10"
          class="border rounded p-2"
          type="text"
          required
        />
      </div>

      <div class="flex flex-col">
        <label for="notes" class="mb-1 font-medium">Notes</label>
        <textarea
          id="notes"
          v-model="form.notes"
          class="border rounded p-2"
          rows="4"
        ></textarea>
      </div>

      <button type="submit" class="bg-blue-500 text-white px-4 py-2 rounded">
        Submit
      </button>
    </form>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'TestForm',
  data() {
    return {
      form: {
        input1: '',
        input2: '',
        input3: '',
        input4: '',
        input5: '',
        notes: '',
      },
    };
  },
  methods: {
    async handleSubmit() {
      try {
        const response = await axios.post('http://localhost:8080/api/test', this.form);
        console.log('Saved:', response.data);
        alert('저장되었습니다.');
      } catch (error) {
        console.error('Error saving:', error);
        alert('저장 중 오류가 발생했습니다.');
      }
    },
  },
};
</script>

<style scoped>
/* Optional styling */
</style>