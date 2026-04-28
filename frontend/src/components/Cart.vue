<template>
  <div v-if="cartItems.length > 0">
    <h2>Shopping Cart</h2>
    <ul>
      <li v-for="item in cartItems" :key="item">
        {{ item }} <button @click="removeFromCart(item)">Remove</button>
      </li>
    </ul>
  </div>
  <div v-else>
    <h2>Your cart is empty</h2>
  </div>
</template>

<script>
export default {
  props: ['cartItems'],
  methods: {
    removeFromCart(item) {
      this.$emit('remove-item', item);
    }
  }
};
</script>
