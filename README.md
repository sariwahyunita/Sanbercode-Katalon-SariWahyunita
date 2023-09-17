# Katalon Web UI Automation demoblaze
Created by [Sari Wahyunita](https://www.linkedin.com/in/sariwahyunita/)
Stack details:
* Katalon v 8.6.5

Link webApp [demoblaze](https://demoblaze.com/)

## Scenario that being used
Module Sign Up : 
* valid sign up
* sign up wihtout input form sign up
* sign up wiht duplicate username
  
Module Log In :
* valid log in
* log in wihtout input form sign up
* log in wiht unregistered username
* log in wiht wrong password
* log out after log in
  
Module Home :
* filter categories with databinding (ddt)
* view detail item
* add to cart item
  
Module Cart :
* submit valid place order
* place order wihtout input form sign up place order
  
Module Contact :
* submit valid new message with databinding (ddt)

## How to run the automation test
Make sure you already clone this repository. <br>
You can use your terminal / git cmd with command:<br>
`git clone https://github.com/sariwahyunita/Sanbercode-Katalon-SariWahyunita.git` <br>
and make sure check out to branch `master` for final code befor running test suite.

After that, you can running the test suite fom each module :
* Module Sign Up >> `ts_singUp`
* Module Log In >> `ts_logIn`
* Module Home >> `ts_home`
* Module Cart >> `ts_cart`
* Module Contact >> `ts_contact`
  
or running the test suite collection for all module :
`ts_regression`
