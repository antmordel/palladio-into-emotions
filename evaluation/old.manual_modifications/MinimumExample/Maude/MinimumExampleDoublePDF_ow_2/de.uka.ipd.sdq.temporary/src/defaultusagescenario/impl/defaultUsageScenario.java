
		package defaultusagescenario.impl;
		public class defaultUsageScenario 
		implements de.uka.ipd.sdq.simucomframework.usage.IScenarioRunner
		{
			
   protected defaultrepository.AnInterface m_portProvided_AnInterface = null;

			
			
			// Workaround to specify and retrieve the priority for a system call
			public int getPriorityForEntryLevelSystemCallID(String id){
				int defaultPriority = 0;
			
				// priority for EntrySystemLevelCall Provided_AnInterface: 0
				if(id.equalsIgnoreCase("_-r1fUCHcEd6lJo4DCALHMw")){
					return 0;
				} 
			
				return defaultPriority;
			}
			
			

			
			private de.uka.ipd.sdq.simucomframework.Context ctx = null;
			
	
		public defaultUsageScenario(de.uka.ipd.sdq.simucomframework.model.SimuComModel model,
	defaultsystem.impl.defaultSystem mydefaultSystem
) {
			ctx = new defaultsystem.impl.allocation.defaultAllocationRuntimeContext(model);
			ctx.getStack().createAndPushNewStackFrame();
			
	// Initialise local interface pointer pointing to system roles
	
		m_portProvided_AnInterface = mydefaultSystem.getPortProvided_AnInterface();
	

		}
	

			
			
	public void scenarioRunner(de.uka.ipd.sdq.simucomframework.SimuComSimProcess thread) {
		
		// Store our thread in the context. The thread is used later to suspend execution in case
		// of waiting at a resource
		ctx.setSimProcess(thread);
		
		
	
	// Take current time
	ctx.getModel().getProbeSpecContext().getSampleBlackboard().addSample(
		de.uka.ipd.sdq.probespec.framework.utils.ProbeSpecUtils.buildProbeSetSample(
			ctx.getModel().getProbeSpecContext().getProbeStrategyRegistry().getProbeStrategy(
				de.uka.ipd.sdq.probespec.framework.ProbeType.CURRENT_TIME, null).takeSample(
					"startdefaultUsageScenario", ctx.getModel().getSimulationControl()),
						ctx.getThread().getRequestContext(), "defaultUsageScenario", ctx.getModel().getProbeSpecContext().obtainProbeSetId("startdefaultUsageScenario")));
	

		{
							
			// Here comes the usage scenario code...
			
   

   
      
   
			// Set the priority for aName	
			thread.setPriority(0);
    
	
	
	
	
	try {
	
	// Start Simulate an external call
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
	// prepare stackframe
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
	

	
		
	
	// Take current time
	ctx.getModel().getProbeSpecContext().getSampleBlackboard().addSample(
		de.uka.ipd.sdq.probespec.framework.utils.ProbeSpecUtils.buildProbeSetSample(
			ctx.getModel().getProbeSpecContext().getProbeStrategyRegistry().getProbeStrategy(
				de.uka.ipd.sdq.probespec.framework.ProbeType.CURRENT_TIME, null).takeSample(
					"startCall_do0 <EntryLevelSystemCall id: _GL3QUKfLEeSf8oVhFTxEXg >", ctx.getModel().getSimulationControl()),
						ctx.getThread().getRequestContext(), "Call_do0 <EntryLevelSystemCall id: _GL3QUKfLEeSf8oVhFTxEXg >", ctx.getModel().getProbeSpecContext().obtainProbeSetId("startCall_do0 <EntryLevelSystemCall id: _GL3QUKfLEeSf8oVhFTxEXg >")));
	

	
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> callResult =



   	m_portProvided_AnInterface.do0
	   	(
	ctx
);
	
	
	
	// Stop the time measurement
	
		
	
	// Take current time
	ctx.getModel().getProbeSpecContext().getSampleBlackboard().addSample(
		de.uka.ipd.sdq.probespec.framework.utils.ProbeSpecUtils.buildProbeSetSample(
			ctx.getModel().getProbeSpecContext().getProbeStrategyRegistry().getProbeStrategy(
				de.uka.ipd.sdq.probespec.framework.ProbeType.CURRENT_TIME, null).takeSample(
					"endCall_do0 <EntryLevelSystemCall id: _GL3QUKfLEeSf8oVhFTxEXg >", ctx.getModel().getSimulationControl()),
						ctx.getThread().getRequestContext(), "Call_do0 <EntryLevelSystemCall id: _GL3QUKfLEeSf8oVhFTxEXg >", ctx.getModel().getProbeSpecContext().obtainProbeSetId("endCall_do0 <EntryLevelSystemCall id: _GL3QUKfLEeSf8oVhFTxEXg >")));
	

	
	
	

	
	}
	finally
	{
		
 	ctx.getStack().removeStackFrame();

	}
	// END Simulate an external call

	




   
      
   
	
	{
	double delay = de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(ctx.evaluate("1.0"));
	ctx.getThread().hold(delay);
	}


   
      
   
	


   

   

   

   

			
		}
		
	
	// Take current time
	ctx.getModel().getProbeSpecContext().getSampleBlackboard().addSample(
		de.uka.ipd.sdq.probespec.framework.utils.ProbeSpecUtils.buildProbeSetSample(
			ctx.getModel().getProbeSpecContext().getProbeStrategyRegistry().getProbeStrategy(
				de.uka.ipd.sdq.probespec.framework.ProbeType.CURRENT_TIME, null).takeSample(
					"enddefaultUsageScenario", ctx.getModel().getSimulationControl()),
						ctx.getThread().getRequestContext(), "defaultUsageScenario", ctx.getModel().getProbeSpecContext().obtainProbeSetId("enddefaultUsageScenario")));
	

		
		// A run through this usage model is complete
		// The counter for main measurements is incremented by the SimuComSimProcess.internalLifeCycle that called this  
		// ctx.getModel().increaseMainMeasurementsCount();
	}

		}
	