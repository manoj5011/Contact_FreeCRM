$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CreateContact.feature");
formatter.feature({
  "line": 1,
  "name": "Create a contact",
  "description": "Description: This feature will test creating a contact functionality",
  "id": "create-a-contact",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "User is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user navigates to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password in the fields",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login and should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateContact.user_navigates_to_the_login_page()"
});
formatter.result({
  "duration": 2874204300,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_enters_username_and_password_in_the_fields()"
});
formatter.result({
  "duration": 3064176200,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_should_login_and_should_be_on_home_page()"
});
formatter.result({
  "duration": 1148725500,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User fills the required fields",
  "description": "",
  "id": "create-a-contact;user-fills-the-required-fields",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@create"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user enters first name, last name and clicks on save",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user should see the contact on the dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateContact.user_enters_first_name_last_name_and_clicks_on_save()"
});
formatter.result({
  "duration": 1003847100,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d90.0.4430.93)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-JD5SB963\u0027, ip: \u0027192.168.0.103\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 90.0.4430.93, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\manoj\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:58066}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: c3e51ad666fadbc8663415483774e4de\n*** Element info: {Using\u003dname, value\u003dlast_name}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:404)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:284)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.sendKeys(Unknown Source)\r\n\tat POM.ContactModulePOM.lastName(ContactModulePOM.java:102)\r\n\tat StepDefinition.CreateContact.user_enters_first_name_last_name_and_clicks_on_save(CreateContact.java:86)\r\n\tat ✽.When user enters first name, last name and clicks on save(CreateContact.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CreateContact.user_should_see_the_contact_on_the_dashboard()"
});
formatter.result({
  "status": "skipped"
});
