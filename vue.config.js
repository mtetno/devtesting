module.exports = {
  lintOnSave: false,
  css: { extract: false },
  publicPath: "/GrievanceManagement/",
  devServer: {
    proxy: 'http://34.228.17.50:8082/GrievanceManagement/',
  }
};
