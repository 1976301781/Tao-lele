import axios from 'axios';

const api = axios.create({
  baseURL: 'http://localhost:8080/api'
});

export const login = async (credentials) => {
  return api.post('/auth/login', credentials);
};

export const createOrder = async (order) => {
  return api.post('/orders', order);
};

export const fetchOrders = async () => {
  return api.get('/orders');
};