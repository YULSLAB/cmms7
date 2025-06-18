<!-- axios.js (create this in frontend/src/plugins/axios.js) -->
import axios from 'axios';

const instance = axios.create({
  baseURL: 'http://localhost:8080',
  headers: {
    'Content-Type': 'application/json',
  },
});

export default instance;