
	  package defaultsystem.impl.ports;
      
	  // Port class for AnInterface_defaultSystem
	  public class AnInterface_defaultSystem implements defaultrepository.AnInterface, java.io.Serializable
	  {
		private static org.apache.log4j.Logger logger = 
			org.apache.log4j.Logger.getLogger(AnInterface_defaultSystem.class.getName());
	  
	     protected defaultrepository.AnInterface myInnerPort = null;
	     
	     public AnInterface_defaultSystem(defaultrepository.AnInterface myInnerPort){
	        this.myInnerPort = myInnerPort;
	     }
	 	 
	 	 
	
	     public String getComponentAssemblyContextID() {
	     	return this.myInnerPort.getComponentAssemblyContextID();
	     }

    
	     
	     
   public 
   
   de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>

   do0
   ( 
	de.uka.ipd.sdq.simucomframework.Context ctx
 )
 {
   	  
   
	//logger.debug("Entering port of composed structure defaultSystem");
	

	
   de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
 result = myInnerPort.do0(
	     
	ctx
);
	

	return result;


   }   

	  }

   