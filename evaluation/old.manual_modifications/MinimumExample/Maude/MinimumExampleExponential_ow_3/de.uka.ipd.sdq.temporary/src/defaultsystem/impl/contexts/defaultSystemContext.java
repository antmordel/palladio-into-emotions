
      package defaultsystem.impl.contexts;

      // Component context class for defaultSystem
      public class defaultSystemContext implements defaultsystem.impl.contexts.IdefaultSystemContext, java.io.Serializable
      {
         
         
         
         
         
         

         public defaultSystemContext () {
         }
         
         
         
         
  

  de.uka.ipd.sdq.simucomframework.variables.userdata.UserData myUserData;
  
  public de.uka.ipd.sdq.simucomframework.variables.userdata.UserData getUserData(){
    return this.myUserData;
  }
    	  
  public void setUserData(de.uka.ipd.sdq.simucomframework.variables.userdata.UserData data){
    this.myUserData = data;
  }



      }
   