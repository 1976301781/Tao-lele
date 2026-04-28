<template>
  <div class="products">
    <h1>Products</h1>
    <ul>
      <li v-for="product in products" :key="product">
        {{ product }}
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  data() {
    return {
      products: ["Vase", "Plate", "Bowl"]
    };
  }
};
</script>

<style>
.products {
  max-width: 600px;
  margin: 0 auto;
}
</style>