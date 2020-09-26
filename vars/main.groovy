import demo.gitCheckout
def call(){


node{
 
  


 stage("Git Checkout")
 {
 
   def u=new gitCheckout();
  u.gitCheckout();
 
 
 }











}}

