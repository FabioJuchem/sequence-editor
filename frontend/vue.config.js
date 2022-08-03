module.exports = {
  transpileDependencies: [
    'vuetify'
  ],
  devServer: {
    port: 4200,
    proxy: {
      '^/': {
        target: 'http://localhost:8080/',
        changeOrigin: true,
      },
    },
    watchOptions: {
      poll: 2000,
    },
  },
}
