import axios from 'axios';

export const AXIOS = axios.create({
  baseURL: 'http://localhost:8088',
  headers: {
    'Access-Control-Allow-Origin': '*'
  }
});
