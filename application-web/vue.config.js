const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  // devServer: {
  //   port: process.env.INTEGRATION_API_PORT
  //   // proxy: `http://localhost:${process.env.INTEGRATION_API_PORT}`
  // }
})
