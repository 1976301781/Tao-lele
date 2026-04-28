<template>
  <div class="login">
    <h1>Login</h1>
    <form @submit.prevent="login">
      <label for="username">Username:</label>
      <input id="username" v-model="username" required />

      <label for="password">Password:</label>
      <input id="password" type="password" v-model="password" required />

      <button type="submit">Login</button>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      username: '',
      password: ''
    };
  },
  methods: {
    login() {
      alert(`Logging in as ${this.username}`);
    }
  }
};
</script>

<style>
.login {
  max-width: 300px;
  margin: 0 auto;
}
</style>