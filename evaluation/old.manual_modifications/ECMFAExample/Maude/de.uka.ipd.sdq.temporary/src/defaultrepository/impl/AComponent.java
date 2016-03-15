
	   
	

	   
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
	
	
	// contained InternalActions: [compute, computeMore, compute2] ([_rl6MwCHbEd62GabW1zGSBw, _0eyYUCHjEd6ZSMvOJK-6LQ, _g4bLgLB8EeS5MJmxutaYvA])
	
	

	

	


	  
	 


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

 

      /*PROTECTED REGION ID(do0__os1t4CHbEd62GabW1zGSBw__n7g-oCHbEd62GabW1zGSBw) START*/
   	  
   	  	
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
	      
	action_qZUd0CHbEd62GabW1zGSBw(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_tfAiwCHjEd6ZSMvOJK__6LQ(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_qZUd0SHbEd62GabW1zGSBw(ctx, resultStackFrame, methodBodyStackFrame);
   

   

   

	      return resultStackFrame;   
    	
   	  
   	  /*PROTECTED REGION END*/
   }   
   
	
    	
	private void action_qZUd0CHbEd62GabW1zGSBw(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__StartAction
	   
	
	
		
		
			
				
					
				
			
		
	


   }
   

   
      
	private void action_tfAiwCHjEd6ZSMvOJK__6LQ(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = branch, Type = pcm__seff__BranchAction
	   
	
	{
		
			
				double u_tfAiwCHjEd6ZSMvOJK__6LQ = (Double)ctx.evaluate("DoublePDF[(1;1.0)]",Double.class);
				double sum_tfAiwCHjEd6ZSMvOJK__6LQ = 0;
				
	if (sum_tfAiwCHjEd6ZSMvOJK__6LQ <= u_tfAiwCHjEd6ZSMvOJK__6LQ && u_tfAiwCHjEd6ZSMvOJK__6LQ < sum_tfAiwCHjEd6ZSMvOJK__6LQ + 0.1 )
	{
		
	action_vN34USHjEd6ZSMvOJK__6LQ(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_rl6MwCHbEd62GabW1zGSBw(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_vN34UiHjEd6ZSMvOJK__6LQ(ctx, resultStackFrame, methodBodyStackFrame);
   

   

   

	}
	sum_tfAiwCHjEd6ZSMvOJK__6LQ += 0.1;

	if (sum_tfAiwCHjEd6ZSMvOJK__6LQ <= u_tfAiwCHjEd6ZSMvOJK__6LQ && u_tfAiwCHjEd6ZSMvOJK__6LQ < sum_tfAiwCHjEd6ZSMvOJK__6LQ + 0.7 )
	{
		
	action_zcoXwSHjEd6ZSMvOJK__6LQ(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_0eyYUCHjEd6ZSMvOJK__6LQ(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_zcoXwiHjEd6ZSMvOJK__6LQ(ctx, resultStackFrame, methodBodyStackFrame);
   

   

   

	}
	sum_tfAiwCHjEd6ZSMvOJK__6LQ += 0.7;

	if (sum_tfAiwCHjEd6ZSMvOJK__6LQ <= u_tfAiwCHjEd6ZSMvOJK__6LQ && u_tfAiwCHjEd6ZSMvOJK__6LQ < sum_tfAiwCHjEd6ZSMvOJK__6LQ + 0.2 )
	{
		
	action_Ter_sLB7EeS5MJmxutaYvA(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_g4bLgLB8EeS5MJmxutaYvA(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_TesmwLB7EeS5MJmxutaYvA(ctx, resultStackFrame, methodBodyStackFrame);
   

   

   

	}
	sum_tfAiwCHjEd6ZSMvOJK__6LQ += 0.2;

			
		
	}


   }
   
	
		
	private void action_vN34USHjEd6ZSMvOJK__6LQ(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__StartAction
	   
	
	


   }
   

   
      
	private void action_rl6MwCHbEd62GabW1zGSBw(
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
      double demand = de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(ctx.evaluate("5",Double.class));
      ctx.findResource(this.assemblyContextID).loadActiveResource(ctx.getThread(),"CPU",demand);
    }


	

	// infrastructure calls:
    
/* InternalAction - END */

   }
   

   
      
	private void action_vN34UiHjEd6ZSMvOJK__6LQ(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__StopAction
	   
	


   }
   

   

   

   

	 
		
	private void action_zcoXwSHjEd6ZSMvOJK__6LQ(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__StartAction
	   
	
	


   }
   

   
      
	private void action_0eyYUCHjEd6ZSMvOJK__6LQ(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = computeMore, Type = pcm__seff__InternalAction
	   
/* InternalAction - START */
    // software failures:
	
	
	


	// direct resource demands:
	
	
	
    {
      double demand = de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(ctx.evaluate("DoublePDF[ (1.0; 0.25000000) (3.0; 0.50000000) (4.0; 0.25000000) ]",Double.class));
      ctx.findResource(this.assemblyContextID).loadActiveResource(ctx.getThread(),"CPU",demand);
    }


	

	// infrastructure calls:
    
/* InternalAction - END */

   }
   

   
      
	private void action_zcoXwiHjEd6ZSMvOJK__6LQ(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__StopAction
	   
	


   }
   

   

   

   

	 
		
	private void action_Ter_sLB7EeS5MJmxutaYvA(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__StartAction
	   
	
	


   }
   

   
      
	private void action_g4bLgLB8EeS5MJmxutaYvA(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = compute2, Type = pcm__seff__InternalAction
	   
/* InternalAction - START */
    // software failures:
	
	
	


	// direct resource demands:
	
	
	
    {
      double demand = de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(ctx.evaluate("Exp(1)",Double.class));
      ctx.findResource(this.assemblyContextID).loadActiveResource(ctx.getThread(),"CPU",demand);
    }


	

	// infrastructure calls:
    
/* InternalAction - END */

   }
   

   
      
	private void action_TesmwLB7EeS5MJmxutaYvA(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__StopAction
	   
	


   }
   

   

   

   

	

   
      
	private void action_qZUd0SHbEd62GabW1zGSBw(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__StopAction
	   
	


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
	   

	