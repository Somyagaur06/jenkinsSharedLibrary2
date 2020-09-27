

def gitCheckout(){

 
 stage("Git checkout"){
 
 git url: "https://github.com/Somyagaur06/jenkinsDemo.git" 
  
 }
  
}

return this
