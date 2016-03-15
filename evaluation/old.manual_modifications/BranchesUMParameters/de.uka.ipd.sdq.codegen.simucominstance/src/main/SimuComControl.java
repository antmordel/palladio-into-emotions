
		package main;
		
		/**
		* Main class of this SimuCom instance. Used as entry by the SimuCom Framework. The 
		* simulation starts executing in the abstract base class and calls the methods of this 
		* class as template methods from the template method design pattern. This class is instanciated
		* by the SimuCom framework simulation loader via the simulation dock and Eclipse's service
		* instanciation mechanismn.
		**/
		public class SimuComControl extends de.uka.ipd.sdq.simucomframework.AbstractMain 
		{
			// Override abstract framework method and return the workloads of this usage model
			protected de.uka.ipd.sdq.simucomframework.usage.IWorkloadDriver[] getWorkloads(
				de.uka.ipd.sdq.simucomframework.SimuComConfig config) {
				
					// Create 1 System(s)
					
						defaultsystem.impl.defaultSystem mydefaultSystem = new defaultsystem.impl.defaultSystem(getModel());
						
		defaultsystem.impl.contexts.defaultSystemContext contextdefaultSystem = 
			new defaultsystem.impl.contexts.defaultSystemContext
				(
				
				
				);
      	// read UserData
      	de.uka.ipd.sdq.simucomframework.variables.userdata.UserData userData
      	   = new de.uka.ipd.sdq.simucomframework.variables.userdata.UserData();
      	
      	
      	contextdefaultSystem.setUserData(userData);
      	
      	mydefaultSystem.setContext(contextdefaultSystem);
      	

					
				return new de.uka.ipd.sdq.simucomframework.usage.IWorkloadDriver[] {
					
	new 
	
		de.uka.ipd.sdq.simucomframework.usage.OpenWorkload(getModel(),
			new defaultusagescenario.impl.defaultUsageScenarioFactory(getModel(),
	mydefaultSystem
),
			"5.0",
			"_rYd-UKDPEeSTa-m_xXpXMw")
	


				};
				
			}

			// Return the generated resource container class
			protected de.uka.ipd.sdq.simucomframework.resources.IResourceContainerFactory getResourceContainerFactory(){
				return new ResourceEnvironment();
			}
			
			@Override
			protected void setupCalculators(de.uka.ipd.sdq.simucomframework.SimuComConfig config) {
				
	
	// Setup calculator for usage scenario defaultUsageScenario
	
	getModel().getProbeSpecContext().getCalculatorRegistry().registerCalculator(
			"defaultUsageScenario", getModel().getProbeSpecContext().getCalculatorFactory().buildResponseTimeCalculator(
					"defaultUsageScenario", 
					getModel().getProbeSpecContext().obtainProbeSetId("startdefaultUsageScenario"),
					getModel().getProbeSpecContext().obtainProbeSetId("enddefaultUsageScenario")));

	if(getModel().getConfiguration().getSimulateFailures()){
		
	getModel().getProbeSpecContext().getCalculatorRegistry().registerCalculator(
		"defaultUsageScenario/_rYd-UKDPEeSTa-m_xXpXMw/ExecutionResult",
		getModel().getProbeSpecContext().getCalculatorFactory().buildExecutionResultCalculator(
			"UsageScenario defaultUsageScenario <_rYd-UKDPEeSTa-m_xXpXMw>", 
			getModel().getProbeSpecContext().obtainProbeSetId(
				de.uka.ipd.sdq.simucomframework.ReliabilitySensorHelper.getScenarioProbeSetId(
					"_rYd-UKDPEeSTa-m_xXpXMw"))));

	}

	
	
		// Setup calculator for system call aName (_4dpyQKDXEeSTa-m_xXpXMw)
		
	getModel().getProbeSpecContext().getCalculatorRegistry().registerCalculator(
			"Call_do0 <EntryLevelSystemCall id: _4dpyQKDXEeSTa-m_xXpXMw >", getModel().getProbeSpecContext().getCalculatorFactory().buildResponseTimeCalculator(
					"Call_do0 <EntryLevelSystemCall id: _4dpyQKDXEeSTa-m_xXpXMw >", 
					getModel().getProbeSpecContext().obtainProbeSetId("startCall_do0 <EntryLevelSystemCall id: _4dpyQKDXEeSTa-m_xXpXMw >"),
					getModel().getProbeSpecContext().obtainProbeSetId("endCall_do0 <EntryLevelSystemCall id: _4dpyQKDXEeSTa-m_xXpXMw >")));

	

	
		// Setup calculator for system call aName (_gr5-4KDYEeSTa-m_xXpXMw)
		
	getModel().getProbeSpecContext().getCalculatorRegistry().registerCalculator(
			"Call_do0 <EntryLevelSystemCall id: _gr5-4KDYEeSTa-m_xXpXMw >", getModel().getProbeSpecContext().getCalculatorFactory().buildResponseTimeCalculator(
					"Call_do0 <EntryLevelSystemCall id: _gr5-4KDYEeSTa-m_xXpXMw >", 
					getModel().getProbeSpecContext().obtainProbeSetId("startCall_do0 <EntryLevelSystemCall id: _gr5-4KDYEeSTa-m_xXpXMw >"),
					getModel().getProbeSpecContext().obtainProbeSetId("endCall_do0 <EntryLevelSystemCall id: _gr5-4KDYEeSTa-m_xXpXMw >")));

	



			}
			
		}
	