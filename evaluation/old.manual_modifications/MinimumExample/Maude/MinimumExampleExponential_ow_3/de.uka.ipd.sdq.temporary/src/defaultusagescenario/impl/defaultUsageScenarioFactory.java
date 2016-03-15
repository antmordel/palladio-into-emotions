
			package defaultusagescenario.impl;
			public class defaultUsageScenarioFactory 
			extends 
de.uka.ipd.sdq.simucomframework.usage.OpenWorkloadUserFactory

			{
				
	
		private de.uka.ipd.sdq.simucomframework.model.SimuComModel model = null;
		
		private defaultsystem.impl.defaultSystem mydefaultSystem = null;
		
		public defaultUsageScenarioFactory(de.uka.ipd.sdq.simucomframework.model.SimuComModel model,
	defaultsystem.impl.defaultSystem mydefaultSystem
){
			
	super(model);

			this.model = model;
			
			this.mydefaultSystem = mydefaultSystem; 
			
		}
	

				
				public de.uka.ipd.sdq.simucomframework.usage.IScenarioRunner createScenarioRunner() {
					return new defaultusagescenario.impl.defaultUsageScenario(model,
	mydefaultSystem
);
				}
			}
		