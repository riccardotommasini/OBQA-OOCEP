package rdf.museo.inheritanceOnEvents.activeEvents.esper.events;

import rdf.museo.inheritanceOnEvents.activeEvents.rdfs.RDFEvent;
import rdf.museo.inheritanceOnEvents.activeEvents.rdfs.RDFProperty;
import rdf.museo.inheritanceOnEvents.activeEvents.rdfs.RDFResource;

public class RDFS9 extends RDFEvent<RDFResource, RDFProperty, RDFResource> {

	public RDFS9(RDFResource s, RDFProperty p, RDFResource o, long ts) {
		super(s, p, o, ts, "RDFS9");
	}

	@Override
	public RDFEvent<? extends RDFResource, ? extends RDFProperty, ? extends RDFResource> getSuperEvent() {
		// TODO Auto-generated method stub
		return null;
	}

}
