<template>
  <div class="products">
    <h1>Products</h1>
    <ul>
      <li v-for="product in products" :key="product">
        {{ product }} <button @click="addToCart(product)">Add to Cart</button>
      </li>
    </ul>
    <cart :cartItems="cart" @remove-item="removeFromCart" />
  </div>
</template>

<script>
import Cart from '../components/Cart.vue';

export default {
  components: { Cart },
  data() {
    return {
      products: ["Vase", "Plate", "Bowl"],
      cart: []
    };
  },
  methods: {
    addToCart(product) {
      this.cart.push(product);
    },
    removeFromCart(product) {
      this.cart = this.cart.filter(item => item !== product);
    }
  }
};
</script>