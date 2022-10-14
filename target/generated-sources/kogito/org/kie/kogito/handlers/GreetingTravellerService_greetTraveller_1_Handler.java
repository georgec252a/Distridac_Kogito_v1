package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@org.springframework.stereotype.Component()
public class GreetingTravellerService_greetTraveller_1_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    org.acme.travels.services.GreetingTravellerService service;

    public GreetingTravellerService_greetTraveller_1_Handler() {
        this(new org.acme.travels.services.GreetingTravellerService());
    }

    @org.springframework.beans.factory.annotation.Autowired(required = false)
    @org.springframework.context.annotation.Lazy()
    public GreetingTravellerService_greetTraveller_1_Handler(org.acme.travels.services.GreetingTravellerService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        java.lang.Object result;
        result = service.greetTraveller((org.acme.travels.Person) workItem.getParameter("Parameter"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.singletonMap("person", result));
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "org.acme.travels.services.GreetingTravellerService_greetTraveller_1_Handler";
    }
}
