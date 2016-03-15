
		package main;
		
		public class ResourceEnvironment implements de.uka.ipd.sdq.simucomframework.resources.IResourceContainerFactory {
			
			private static final ResourceEnvironment instance = new ResourceEnvironment();
			
			public static ResourceEnvironment getInstance() {
				return instance;
			}
		
		   
	public String[] getResourceContainerIDList() {
		java.util.List<String> resourceContainerIds = new java.util.ArrayList<String>();
		
	resourceContainerIds.add("_B0aZ0CHdEd6lJo4DCALHMw");
	

		return resourceContainerIds.toArray(new String[]{});
	}

	public String[] getLinkingResourceContainerIDList() {
		return new String[] { 
			
		};
	}
	
	public java.util.ArrayList<String> getFromResourceContainerID(String linkingResourceContainerID) {
		java.util.ArrayList<String> resultList = new java.util.ArrayList<String>();
		
		return resultList;
	}
	
	public java.util.ArrayList<String> getToResourceContainerID(String linkingResourceContainerID) {
		java.util.ArrayList<String> resultList = new java.util.ArrayList<String>();
		
		return resultList;
	}
	
	public String getLinkingResourceContainerID(String fromResourceContainerID, String toResourceContainerID) {
		for (String id: getLinkingResourceContainerIDList()) {
			if (getFromResourceContainerID(id).contains(fromResourceContainerID) && getToResourceContainerID(id).contains(toResourceContainerID)) {
				return id;
			}
		}
		return null;
	}
	
	public void fillResourceContainerWithResources(de.uka.ipd.sdq.simucomframework.resources.SimulatedResourceContainer rc) {
		
	if (rc.getResourceContainerID().equals("_B0aZ0CHdEd6lJo4DCALHMw")) {
		
	String[] _oro4gG3fEdy4YaaT__RYrLQ_provInterfaces = null;
	
		_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces = new String[1];
		
			_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces[0] = "CpuInterface";
		
	
	rc.addActiveResource(
		"CPU",
		_oro4gG3fEdy4YaaT__RYrLQ_provInterfaces,
		rc.getResourceContainerID(),
		"_oro4gG3fEdy4YaaT-RYrLQ",
		"appserver [CPU] <_B0aZ0CHdEd6lJo4DCALHMw>",
		"1",
		0.0,
		0.0,
		"TODO: unit!",
		
	
		
		
			de.uka.ipd.sdq.simucomframework.resources.SchedulingStrategy.PROCESSOR_SHARING
		
		
	
,
		1,
		false);

		
	} else 
	

			throw new RuntimeException("Unknown resource container should be initialised. This should never happen");	
	}
	
	public void fillResourceContainerWithNestedResourceContainers(de.uka.ipd.sdq.simucomframework.resources.SimulatedResourceContainer rc) {
		
	if (rc.getResourceContainerID().equals("_B0aZ0CHdEd6lJo4DCALHMw")) {
		
		
	} else 
	

			throw new RuntimeException("Unknown resource container should be initialised. This should never happen");	
	}

	public void fillLinkingResourceContainer(de.uka.ipd.sdq.simucomframework.resources.SimulatedLinkingResourceContainer rc) {
		
			
	}


		}
	