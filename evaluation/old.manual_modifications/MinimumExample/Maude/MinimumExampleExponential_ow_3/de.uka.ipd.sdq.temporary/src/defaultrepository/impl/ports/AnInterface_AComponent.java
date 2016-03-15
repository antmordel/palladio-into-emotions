
	  package defaultrepository.impl.ports;
      
	  // Port class for AnInterface_AComponent 
	  public class AnInterface_AComponent implements defaultrepository.AnInterface, java.io.Serializable
	  {
	     protected defaultrepository.impl.IAComponent myComponent = null;
	     
	     public AnInterface_AComponent(){}

	     public AnInterface_AComponent(defaultrepository.impl.IAComponent myComponent){
	        this.myComponent = myComponent;
	     }
	     
	     
	
	     public String getComponentAssemblyContextID() {
	     	return this.myComponent.getAssemblyContextID();
	     }


	     
   public 
   
   de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>

   do0
   ( 
	de.uka.ipd.sdq.simucomframework.Context ctx
 )
 {
   	  
   
	return myComponent.anInterface_do0(
	     
	ctx
);


   }   

	  }

   