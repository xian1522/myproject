<template>
  <div class="home">
    <h1>Welcome to Project</h1>
    <el-button type="primary" @click="handleClick">Click Me</el-button>
  </div>
</template>

<script setup>
import { ElMessage } from 'element-plus'

const handleClick = () => {
  ElMessage.success('Hello World!')
}
</script>

<style scoped>
.home {
  padding: 20px;
}
</style>