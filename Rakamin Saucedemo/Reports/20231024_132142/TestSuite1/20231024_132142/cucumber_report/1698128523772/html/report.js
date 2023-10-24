$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ramad/Katalon Studio/Rakamin Saucedemo/Include/features/AddToCart.feature");
formatter.feature({
  "name": "Add to Cart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User can view product added to the cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "ProductDetailsStep.navigateToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click add to cart",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCartStep.clickAddToCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click cart",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartStep.clickCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view the items added to the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartStep.verifyItems()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("C:/Users/ramad/Katalon Studio/Rakamin Saucedemo/Include/features/Checkout.feature");
formatter.feature({
  "name": "Checkout",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User can checkout several items",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "ProductDetailsStep.navigateToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click add to cart item 1",
  "keyword": "When "
});
formatter.match({
  "location": "Checkout.clickAddToCartItem1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click add to cart item 2",
  "keyword": "And "
});
formatter.match({
  "location": "Checkout.clickAddToCartItem2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click cart button",
  "keyword": "And "
});
formatter.match({
  "location": "Checkout.clickCartButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click checkout button",
  "keyword": "And "
});
formatter.match({
  "location": "Checkout.clickCheckout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input first name",
  "keyword": "And "
});
formatter.match({
  "location": "Checkout.enterFirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input last name",
  "keyword": "And "
});
formatter.match({
  "location": "Checkout.enterLastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input postal code",
  "keyword": "And "
});
formatter.match({
  "location": "Checkout.enterZipPostalCode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click continue",
  "keyword": "And "
});
formatter.match({
  "location": "Checkout.clickContinue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click finish",
  "keyword": "And "
});
formatter.match({
  "location": "Checkout.clickFinish()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view thank you message",
  "keyword": "Then "
});
formatter.match({
  "location": "Checkout.verifyThankYouMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("C:/Users/ramad/Katalon Studio/Rakamin Saucedemo/Include/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Success login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on Swag Labs login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.navigateToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input username",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.enterUsername()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.enterPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigated to Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Failed login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on Swag Labs login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.navigateToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input username",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.enterUsername()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input invalid password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.enterInvalidPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User get error message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyErrorLoginMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("C:/Users/ramad/Katalon Studio/Rakamin Saucedemo/Include/features/ProductDetails.feature");
formatter.feature({
  "name": "Product Details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User can view product details",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "ProductDetailsStep.navigateToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click a product",
  "keyword": "When "
});
formatter.match({
  "location": "ProductDetailsStep.navigateToProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view product details",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductDetailsStep.verifyProductDetails()"
});
formatter.result({
  "status": "passed"
});
});