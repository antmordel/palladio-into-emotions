
	   
	

	   
	   package defaultrepository.impl; 

	      
	   
public class AComponent

	   

	   implements defaultrepository.impl.IAComponent
	   {
	   	  
	
	private static org.apache.log4j.Logger logger = 
			org.apache.log4j.Logger.getLogger(de.uka.ipd.sdq.simucomframework.model.SimuComModel.class.getName());
			
	
	private String assemblyContextID = null;
	
	public String getAssemblyContextID() {
		return assemblyContextID;
	}
	
	private de.uka.ipd.sdq.simucomframework.model.SimuComModel model;

	private de.uka.ipd.sdq.simucomframework.model.SimuComModel getModel() {
		return model;
	} 
	
	
	// Initialise this component's passive resources
	

	
	public AComponent (String assemblyContextID, de.uka.ipd.sdq.simucomframework.model.SimuComModel model) {
		this.assemblyContextID = assemblyContextID;
		this.model = model;
		
		
	
	
		
	// Setup calculators for service call do,
	// contained ExternalCallActions: [] ([])
	
	
	// contained InternalActions: [compute] ([_h3ZMgKDWEeSTa-m_xXpXMw])
	
	


	  
	 


	}

 
	      
	
    

	
   	
    protected defaultrepository.impl.ports.AnInterface_AComponent m_portProvided_AnInterface_AComponent = new defaultrepository.impl.ports.AnInterface_AComponent(this);

   	
   	
   public defaultrepository.AnInterface getPortProvided_AnInterface_AComponent () {
      return m_portProvided_AnInterface_AComponent;
   }

   	

	      
   
   

   
   

   
   protected defaultrepository.impl.contexts.IAComponentContext myContext = null;

   
   public void setContext(defaultrepository.impl.contexts.IAComponentContext myContext) {
      this.myContext = myContext;
      
   }


	      
	
	
   public 
	
   de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>

      anInterface_do0
         (
	de.uka.ipd.sdq.simucomframework.Context ctx
)

   {
   	  
	
	// Simulate a failure if one or multiple of the processing resources
	// required by the executing resource container are currently unavailable:
	de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer container = ctx.findResource(assemblyContextID);
	java.util.List<de.uka.ipd.sdq.simucomframework.resources.AbstractScheduledResource> failedResources = container.getFailedResources();
	if(failedResources.size() > 0){
		double randValue = ctx.getModel().getConfiguration().getRandomGenerator().random();
		int index = (int)Math.floor(randValue * failedResources.size());
		de.uka.ipd.sdq.simucomframework.exceptions.FailureException.raise(de.uka.ipd.sdq.reliability.core.FailureStatistics
				.getInstance().getInternalHardwareFailureType(
						container.getResourceContainerID(),
						failedResources.get(index).getResourceTypeId()));
	}

 

      /*PROTECTED REGION ID(do0__G9PwsKDKEeSTa-m_xXpXMw__tfjfQKDSEeSTa-m_xXpXMw) START*/
   	  
   	  	
			de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame =
				new de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>();
			de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame =
				ctx.getStack().currentStackFrame();
			if (this.myDefaultComponentStackFrame.getContents().size() > 0) {
				methodBodyStackFrame.addVariables(this.myDefaultComponentStackFrame);
			}
			if (this.myComponentStackFrame.getContents().size() > 0) {
				methodBodyStackFrame.addVariables(this.myComponentStackFrame);
			}
	      
	action_DjwWQaDTEeSTa__m_xXpXMw(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_h3ZMgKDWEeSTa__m_xXpXMw(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_DjwWQqDTEeSTa__m_xXpXMw(ctx, resultStackFrame, methodBodyStackFrame);
   

   

   

	      return resultStackFrame;   
    	
   	  
   	  /*PROTECTED REGION END*/
   }   
   
	
    	
	private void action_DjwWQaDTEeSTa__m_xXpXMw(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = start, Type = pcm__seff__StartAction
	   
	
	
		
		
			
				
					
				
			
		
	


   }
   

   
      
	private void action_h3ZMgKDWEeSTa__m_xXpXMw(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = compute, Type = pcm__seff__InternalAction
	   
/* InternalAction - START */
    // software failures:
	
	
	


	// direct resource demands:
	
	
	
    {
      double demand = de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(ctx.evaluate("doA.VALUE*2",Double.class));
      ctx.findResource(this.assemblyContextID).loadActiveResource(ctx.getThread(),"CPU",demand);
    }


	

	// infrastructure calls:
    
/* InternalAction - END */

   }
   

   
      
	private void action_DjwWQqDTEeSTa__m_xXpXMw(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = stop, Type = pcm__seff__StopAction
	   
	


   }
   

   

   

   
      
	
  


	

		  
	
	// Component Parameter Defaults
	// TODO: The stackframes are not yet initialised by calling setComponentFrame in Protocom, thus initialise them here, too
	protected de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> myDefaultComponentStackFrame = new de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>();

	// Component Parameter setter
	// TODO: The stackframes are not yet initialised by calling setComponentFrame in Protocom, thus initialise them here, too
	protected de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> myComponentStackFrame = new de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>();
	
	public void setComponentFrame(de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> myComponentStackFrame) {
		this.myComponentStackFrame = myComponentStackFrame;	
		this.myDefaultComponentStackFrame = new de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>();
		
			
		
	}


	   }
	   

	