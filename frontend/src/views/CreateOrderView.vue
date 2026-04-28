<template>
  <div>
    <h1>Create Order</h1>
    <form @submit.prevent="submitOrder">
      <label for="product">Product:</label>
      <input id="product" v-model="order.product" required />

      <label for="quantity">Quantity:</label>
      <input id="quantity" type="number" v-model="order.quantity" required />

      <button type="submit">Submit Order</button>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      order: {
        product: '',
        quantity: null
      }
    };
  },
  methods: {
    submitOrder() {
      alert(`Order created: ${this.order.product} x ${this.order.quantity}`);
    }
  }
};
</script>