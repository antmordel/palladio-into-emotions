
	   
	

	   
	   package middlewarerepository.impl; 

	      
	   
public class Glassfish_J2EE_Server

	   

	   implements middlewarerepository.impl.IGlassfish_J2EE_Server
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
	

	
	public Glassfish_J2EE_Server (String assemblyContextID, de.uka.ipd.sdq.simucomframework.model.SimuComModel model) {
		this.assemblyContextID = assemblyContextID;
		this.model = model;
		
		
	
	
		
	// Setup calculators for service call encrypt,
	// contained ExternalCallActions: [] ([])
	
	
	// contained InternalActions: [aName] ([_a3hIoIcKEdyZxaUslMevFQ])
	
	


	// Setup calculators for service call decrypt,
	// contained ExternalCallActions: [] ([])
	
	
	// contained InternalActions: [aName] ([_jjvR4IcKEdyZxaUslMevFQ])
	
	


	// Setup calculators for service call marshall,
	// contained ExternalCallActions: [] ([])
	
	
	// contained InternalActions: [aName] ([_P7umgId4Edy96K_wt3MxFg])
	
	


	// Setup calculators for service call demarshall,
	// contained ExternalCallActions: [] ([])
	
	
	// contained InternalActions: [aName] ([_8jeEcIePEdyQ3uCQlnUoDQ])
	
	


	// Setup calculators for service call createCredentials,
	// contained ExternalCallActions: [] ([])
	
	
	// contained InternalActions: [aName] ([_UUgVIIvMEdy1W5zscXFO9A])
	
	


	// Setup calculators for service call checkCredentials,
	// contained ExternalCallActions: [] ([])
	
	
	// contained InternalActions: [aName] ([_kqNYQIvMEdy1W5zscXFO9A])
	
	


	  
	 


	}

 
	      
	
    

	
   	
    protected middlewarerepository.impl.ports.IMiddleware_Glassfish_J2EE_Server m_portProvided_IMiddleware_Glassfish_J2EE_Server = new middlewarerepository.impl.ports.IMiddleware_Glassfish_J2EE_Server(this);

   	
   	
   public middlewarerepository.IMiddleware getPortProvided_IMiddleware_Glassfish_J2EE_Server () {
      return m_portProvided_IMiddleware_Glassfish_J2EE_Server;
   }

   	

	      
   
   

   
   

   
   protected middlewarerepository.impl.contexts.IGlassfish_J2EE_ServerContext myContext = null;

   
   public void setContext(middlewarerepository.impl.contexts.IGlassfish_J2EE_ServerContext myContext) {
      this.myContext = myContext;
      
   }


	      
	
	
   public 
	
   de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>

      iMiddleware_encrypt0
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

 

      /*PROTECTED REGION ID(encrypt0__26-3Q4X1EdyWta7nHuXiHQ__1luUhIX1EdyWta7nHuXiHQ) START*/
   	  
   	  	
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
	      
	action_WQTF4IcKEdyZxaUslMevFQ(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_a3hIoIcKEdyZxaUslMevFQ(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_PgW__gIeLEdy96K_wt3MxFg(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_WQU7EIcKEdyZxaUslMevFQ(ctx, resultStackFrame, methodBodyStackFrame);
   

   

   

   

	      return resultStackFrame;   
    	
   	  
   	  /*PROTECTED REGION END*/
   }   
   
	
    	
	private void action_WQTF4IcKEdyZxaUslMevFQ(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__StartAction
	   
	
	
		
		
			
				
					
				
			
		
	


   }
   

   
      
	private void action_a3hIoIcKEdyZxaUslMevFQ(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__InternalAction
	   
/* InternalAction - START */
    // software failures:
	
	
	


	// direct resource demands:
	
	
	
    {
      double demand = de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(ctx.evaluate("stream.BYTESIZE",Double.class));
      ctx.findResource(this.assemblyContextID).loadActiveResource(ctx.getThread(),"CPU",demand);
    }


	

	// infrastructure calls:
    
/* InternalAction - END */

   }
   

   
      
	private void action_PgW__gIeLEdy96K_wt3MxFg(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__SetVariableAction
	   
	
	
		
			
				resultStackFrame.addValue("RETURN.BYTESIZE",
					ctx.evaluate("stream.BYTESIZE * 2"));
			
		
	


   }
   

   
      
	private void action_WQU7EIcKEdyZxaUslMevFQ(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__StopAction
	   
	


   }
   

   

   

   

   
      
	
  


	
   public 
	
   de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>

      iMiddleware_decrypt1
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

 

      /*PROTECTED REGION ID(decrypt1__26-3Q4X1EdyWta7nHuXiHQ__1luUhIX1EdyWta7nHuXiHQ) START*/
   	  
   	  	
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
	      
	action_WQViIYcKEdyZxaUslMevFQ(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_jjvR4IcKEdyZxaUslMevFQ(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_osZMUIePEdyQ3uCQlnUoDQ(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_WQWJMIcKEdyZxaUslMevFQ(ctx, resultStackFrame, methodBodyStackFrame);
   

   

   

   

	      return resultStackFrame;   
    	
   	  
   	  /*PROTECTED REGION END*/
   }   
   
	
    	
	private void action_WQViIYcKEdyZxaUslMevFQ(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__StartAction
	   
	
	
		
		
			
				
					
				
			
		
	


   }
   

   
      
	private void action_jjvR4IcKEdyZxaUslMevFQ(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__InternalAction
	   
/* InternalAction - START */
    // software failures:
	
	
	


	// direct resource demands:
	
	
	
    {
      double demand = de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(ctx.evaluate("stream.BYTESIZE",Double.class));
      ctx.findResource(this.assemblyContextID).loadActiveResource(ctx.getThread(),"CPU",demand);
    }


	

	// infrastructure calls:
    
/* InternalAction - END */

   }
   

   
      
	private void action_osZMUIePEdyQ3uCQlnUoDQ(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__SetVariableAction
	   
	
	
		
			
				resultStackFrame.addValue("RETURN.BYTESIZE",
					ctx.evaluate("stream.BYTESIZE / 2"));
			
		
	


   }
   

   
      
	private void action_WQWJMIcKEdyZxaUslMevFQ(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__StopAction
	   
	


   }
   

   

   

   

   
      
	
  


	
   public 
	
   de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>

      iMiddleware_marshall2
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

 

      /*PROTECTED REGION ID(marshall2__26-3Q4X1EdyWta7nHuXiHQ__1luUhIX1EdyWta7nHuXiHQ) START*/
   	  
   	  	
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
	      
	action_Ktr0UId4Edy96K_wt3MxFg(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_P7umgId4Edy96K_wt3MxFg(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_Q6ulYId4Edy96K_wt3MxFg(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_KttCcId4Edy96K_wt3MxFg(ctx, resultStackFrame, methodBodyStackFrame);
   

   

   

   

	      return resultStackFrame;   
    	
   	  
   	  /*PROTECTED REGION END*/
   }   
   
	
    	
	private void action_Ktr0UId4Edy96K_wt3MxFg(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__StartAction
	   
	
	
		
		
			
				
					
				
			
		
	


   }
   

   
      
	private void action_P7umgId4Edy96K_wt3MxFg(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__InternalAction
	   
/* InternalAction - START */
    // software failures:
	
	
	


	// direct resource demands:
	
	
	
    {
      double demand = de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(ctx.evaluate("DoublePDF[ (3.0500000000000004E-4; 0.00000000) (3.1500000000000007E-4; 0.00004000) (3.250000000000001E-4; 0.06844000) (3.35E-4; 0.59768000) (3.4500000000000004E-4; 0.21221000) (3.5500000000000006E-4; 0.07866000) (3.650000000000001E-4; 0.02875000) (3.75E-4; 0.01422000) ] / 2",Double.class));
      ctx.findResource(this.assemblyContextID).loadActiveResource(ctx.getThread(),"CPU",demand);
    }


	

	// infrastructure calls:
    
/* InternalAction - END */

   }
   

   
      
	private void action_Q6ulYId4Edy96K_wt3MxFg(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = resultSetter, Type = pcm__seff__SetVariableAction
	   
	
	
		
			
				resultStackFrame.addValue("RETURN.BYTESIZE",
					ctx.evaluate("ints.NUMBER_OF_ELEMENTS * 2"));
			
		
	


   }
   

   
      
	private void action_KttCcId4Edy96K_wt3MxFg(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__StopAction
	   
	


   }
   

   

   

   

   
      
	
  


	
   public 
	
   de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>

      iMiddleware_demarshall3
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

 

      /*PROTECTED REGION ID(demarshall3__26-3Q4X1EdyWta7nHuXiHQ__1luUhIX1EdyWta7nHuXiHQ) START*/
   	  
   	  	
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
	      
	action_Lf57cId4Edy96K_wt3MxFg(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_8jeEcIePEdyQ3uCQlnUoDQ(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_Lf6igId4Edy96K_wt3MxFg(ctx, resultStackFrame, methodBodyStackFrame);
   

   

   

	      return resultStackFrame;   
    	
   	  
   	  /*PROTECTED REGION END*/
   }   
   
	
    	
	private void action_Lf57cId4Edy96K_wt3MxFg(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__StartAction
	   
	
	
		
		
			
				
					
				
			
		
	


   }
   

   
      
	private void action_8jeEcIePEdyQ3uCQlnUoDQ(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__InternalAction
	   
/* InternalAction - START */
    // software failures:
	
	
	


	// direct resource demands:
	
	
	
    {
      double demand = de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(ctx.evaluate("DoublePDF[ (3.9500000000000006E-4; 0.00000000) (4.050000000000001E-4; 0.07065000) (4.1500000000000006E-4; 0.48902000) (4.250000000000001E-4; 0.19040000) (4.3500000000000006E-4; 0.08020000) (4.450000000000001E-4; 0.03977000) (4.5500000000000006E-4; 0.03577000) (4.650000000000001E-4; 0.02377000) (4.750000000000001E-4; 0.00955000) (4.8500000000000013E-4; 0.01400000) (4.95E-4; 0.01977000) (5.05E-4; 0.01333000) (5.15E-4; 0.01244000) (5.250000000000001E-4; 0.00133000) ] / 2",Double.class));
      ctx.findResource(this.assemblyContextID).loadActiveResource(ctx.getThread(),"CPU",demand);
    }


	

	// infrastructure calls:
    
/* InternalAction - END */

   }
   

   
      
	private void action_Lf6igId4Edy96K_wt3MxFg(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__StopAction
	   
	


   }
   

   

   

   
      
	
  


	
   public 
	
   de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>

      iMiddleware_createCredentials4
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

 

      /*PROTECTED REGION ID(createCredentials4__26-3Q4X1EdyWta7nHuXiHQ__1luUhIX1EdyWta7nHuXiHQ) START*/
   	  
   	  	
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
	      
	action_KNVQ0IvMEdy1W5zscXFO9A(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_UUgVIIvMEdy1W5zscXFO9A(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_VmQ38IvMEdy1W5zscXFO9A(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_KNV34IvMEdy1W5zscXFO9A(ctx, resultStackFrame, methodBodyStackFrame);
   

   

   

   

	      return resultStackFrame;   
    	
   	  
   	  /*PROTECTED REGION END*/
   }   
   
	
    	
	private void action_KNVQ0IvMEdy1W5zscXFO9A(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__StartAction
	   
	
	
		
		
			
				
					
				
			
		
	


   }
   

   
      
	private void action_UUgVIIvMEdy1W5zscXFO9A(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__InternalAction
	   
/* InternalAction - START */
    // software failures:
	
	
	


	// direct resource demands:
	
	
	
    {
      double demand = de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(ctx.evaluate("DoublePDF[ (3.9E-4; 0.00000000) (4.0E-4; 1.00000000) ]",Double.class));
      ctx.findResource(this.assemblyContextID).loadActiveResource(ctx.getThread(),"CPU",demand);
    }


	

	// infrastructure calls:
    
/* InternalAction - END */

   }
   

   
      
	private void action_VmQ38IvMEdy1W5zscXFO9A(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__SetVariableAction
	   
	
	
		
			
				resultStackFrame.addValue("RETURN.BYTESIZE",
					ctx.evaluate("stream.BYTESIZE"));
			
		
	


   }
   

   
      
	private void action_KNV34IvMEdy1W5zscXFO9A(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__StopAction
	   
	


   }
   

   

   

   

   
      
	
  


	
   public 
	
   de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>

      iMiddleware_checkCredentials5
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

 

      /*PROTECTED REGION ID(checkCredentials5__26-3Q4X1EdyWta7nHuXiHQ__1luUhIX1EdyWta7nHuXiHQ) START*/
   	  
   	  	
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
	      
	action_KyRw8IvMEdy1W5zscXFO9A(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_kqNYQIvMEdy1W5zscXFO9A(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_lBZwQIvMEdy1W5zscXFO9A(ctx, resultStackFrame, methodBodyStackFrame);
   
      
	action_KyRw8YvMEdy1W5zscXFO9A(ctx, resultStackFrame, methodBodyStackFrame);
   

   

   

   

	      return resultStackFrame;   
    	
   	  
   	  /*PROTECTED REGION END*/
   }   
   
	
    	
	private void action_KyRw8IvMEdy1W5zscXFO9A(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__StartAction
	   
	
	
		
		
			
				
					
				
			
		
	


   }
   

   
      
	private void action_kqNYQIvMEdy1W5zscXFO9A(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__InternalAction
	   
/* InternalAction - START */
    // software failures:
	
	
	


	// direct resource demands:
	
	
	
    {
      double demand = de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(ctx.evaluate("DoublePDF[ (6.0E-4; 0.00000000) (6.2E-4; 0.80000000) (9.5E-4; 0.20000000) ]",Double.class));
      ctx.findResource(this.assemblyContextID).loadActiveResource(ctx.getThread(),"CPU",demand);
    }


	

	// infrastructure calls:
    
/* InternalAction - END */

   }
   

   
      
	private void action_lBZwQIvMEdy1W5zscXFO9A(
			final 
	de.uka.ipd.sdq.simucomframework.Context
 ctx, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		// EntityName = aName, Type = pcm__seff__SetVariableAction
	   
	
	
		
			
				resultStackFrame.addValue("RETURN.BYTESIZE",
					ctx.evaluate("stream.BYTESIZE"));
			
		
	


   }
   

   
      
	private void action_KyRw8YvMEdy1W5zscXFO9A(
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
	   

	