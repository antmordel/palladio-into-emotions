
      
	
   package defaultsystem.impl;
  
   public class defaultSystem 
   {
		private static org.apache.log4j.Logger logger = 
			org.apache.log4j.Logger.getLogger(defaultSystem.class.getName());
	  

    
	
	
	private String assemblyContextID = "";
	
	public String getAssemblyContextID() {
		return assemblyContextID;
	}
	
	private de.uka.ipd.sdq.simucomframework.model.SimuComModel model;
	
	private de.uka.ipd.sdq.simucomframework.model.SimuComModel getModel() {
		return model;
	}

	
	
	public defaultSystem(de.uka.ipd.sdq.simucomframework.model.SimuComModel model) {
	this.model = model; 
	
	


		
		
		logger.info("Creating composed structure defaultSystem");
		
	
	
   myAssembly_AComponent__AComponent_ = new defaultrepository.impl.AComponent
         	(

    
    	"_wB98MKDTEeSTa-m_xXpXMw"
	

, model);



	      
		
			/* And finally, my ports */
			
m_portProvided_AnInterface = new defaultsystem.impl.ports.AnInterface_defaultSystem(
		
			myAssembly_AComponent__AComponent_.
			getPortProvided_AnInterface_AComponent()
		
		);

			
		
	} 
		
      
      // Composed child components member variables
      
   protected 
      defaultrepository.impl.AComponent 
         myAssembly_AComponent__AComponent_ = null;

            
      /**
      * Inner Structure initialisation
      */
      private void initInnerComponents() {

		  /* First, initialise composite child structures */
		  
		  /* Then initialise basic components */
		  
			  initAssembly_AComponent__AComponent_();
		  
      }

      
   private void initAssembly_AComponent__AComponent_() {
      defaultrepository.impl.contexts.AComponentContext context = new defaultrepository.impl.contexts.AComponentContext(
         
         
      );
      
	
  context.setUserData(this.myContext.getUserData());
    
  
	//Initialise Component Parameters
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> componentStackFrame = 
		new de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>();
	
	
	// possibly overwrite some with user data if this AssemblyContext is meant
	this.myContext.getUserData().overwriteParametersForAssemblyContext(myAssembly_AComponent__AComponent_.getAssemblyContextID(), componentStackFrame);
	
	myAssembly_AComponent__AComponent_.setComponentFrame(componentStackFrame);
  


      myAssembly_AComponent__AComponent_.setContext(context);
   }

      /**
      * Inner Structure initialisation end
      */


    
	
    

	
	
    protected defaultsystem.impl.ports.AnInterface_defaultSystem m_portProvided_AnInterface = null;

	
   	
   public defaultrepository.AnInterface getPortProvided_AnInterface () {
      return m_portProvided_AnInterface;
   }

   	

	
   
   

   
   

   
   protected defaultsystem.impl.contexts.IdefaultSystemContext myContext = null;

   
   public void setContext(defaultsystem.impl.contexts.IdefaultSystemContext myContext) {
      this.myContext = myContext;
      
      	initInnerComponents();
      
   }


	

	
   }

	


   