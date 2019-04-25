$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/Addproduct.feature");
formatter.feature({
  "name": "Add new products to TestMeApp",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Alex has to login as admin and add the products",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "skipped"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the URL of TestMeApp",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "admin enters all the data to add product",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "product is added successfully",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});