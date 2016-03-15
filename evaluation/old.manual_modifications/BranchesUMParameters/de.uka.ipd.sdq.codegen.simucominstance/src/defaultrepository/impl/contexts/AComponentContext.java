
      package defaultrepository.impl.contexts;

      // Component context class for AComponent
      public class AComponentContext implements defaultrepository.impl.contexts.IAComponentContext, java.io.Serializable
      {
         
         
         
         
         
         

         public AComponentContext () {
         }
         
         
         
         
  

  de.uka.ipd.sdq.simucomframework.variables.userdata.UserData myUserData;
  
  public de.uka.ipd.sdq.simucomframework.variables.userdata.UserData getUserData(){
    return this.myUserData;
  }
    	  
  public void setUserData(de.uka.ipd.sdq.simucomframework.variables.userdata.UserData data){
    this.myUserData = data;
  }



      }
   