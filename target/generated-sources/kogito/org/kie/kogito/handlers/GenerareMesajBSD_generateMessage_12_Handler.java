package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@org.springframework.stereotype.Component()
public class GenerareMesajBSD_generateMessage_12_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    org.acme.travels.services.GenerareMesajBSD service;

    public GenerareMesajBSD_generateMessage_12_Handler() {
        this(new org.acme.travels.services.GenerareMesajBSD());
    }

    @org.springframework.beans.factory.annotation.Autowired(required = false)
    @org.springframework.context.annotation.Lazy()
    public GenerareMesajBSD_generateMessage_12_Handler(org.acme.travels.services.GenerareMesajBSD service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        java.lang.Object result;
        result = service.generateMessage((org.acme.travels.IntrareCLE) workItem.getParameter("intrareCLE"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.singletonMap("intrareCLE", result));
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "org.acme.travels.services.GenerareMesajBSD_generateMessage_12_Handler";
    }
}
