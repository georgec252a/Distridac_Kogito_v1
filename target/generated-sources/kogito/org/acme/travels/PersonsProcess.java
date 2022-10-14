package org.acme.travels;

import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.BooleanDataType;

@org.springframework.stereotype.Component("persons")
public class PersonsProcess extends org.kie.kogito.process.impl.AbstractProcess<org.acme.travels.PersonsModel> {

    public PersonsProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        this(app, correlations, new org.kie.kogito.handlers.GreetingTravellerService_greetTraveller_1_Handler());
    }

    @org.springframework.beans.factory.annotation.Autowired()
    public PersonsProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.handlers.GreetingTravellerService_greetTraveller_1_Handler greetingTravellerService_greetTraveller_1_Handler) {
        super(app, java.util.Arrays.asList(greetingTravellerService_greetTraveller_1_Handler), correlations);
        activate();
    }

    public PersonsProcess() {
    }

    @Override()
    public org.acme.travels.PersonsProcessInstance createInstance(org.acme.travels.PersonsModel value) {
        return new org.acme.travels.PersonsProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.acme.travels.PersonsProcessInstance createInstance(java.lang.String businessKey, org.acme.travels.PersonsModel value) {
        return new org.acme.travels.PersonsProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public org.acme.travels.PersonsProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, org.acme.travels.PersonsModel value) {
        return new org.acme.travels.PersonsProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public org.acme.travels.PersonsModel createModel() {
        return new org.acme.travels.PersonsModel();
    }

    public org.acme.travels.PersonsProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.acme.travels.PersonsModel) value);
    }

    public org.acme.travels.PersonsProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.acme.travels.PersonsModel) value);
    }

    public org.acme.travels.PersonsProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.PersonsProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.acme.travels.PersonsProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.PersonsProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("persons", true);
        factory.variable("person", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.travels.Person.class), null, "customTags", null);
        factory.variable("stored", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.Boolean.class), null, "customTags", null);
        factory.variable("adult", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.Boolean.class), null, "customTags", null);
        factory.name("persons");
        factory.packageName("org.acme.travels");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        factory.imports("org.acme.travels.Person");
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode1 = factory.workItemNode(1);
        workItemNode1.name("Person Service");
        workItemNode1.workName("org.acme.travels.services.GreetingTravellerService_greetTraveller_1_Handler");
        workItemNode1.workParameter("NodeName", "Person Service");
        workItemNode1.workParameter("Interface", "org.acme.travels.services.GreetingTravellerService");
        workItemNode1.workParameter("Operation", "greetTraveller");
        workItemNode1.workParameter("interfaceImplementationRef", "org.acme.travels.services.GreetingTravellerService");
        workItemNode1.workParameter("operationImplementationRef", "greetTraveller");
        workItemNode1.workParameter("implementation", "Java");
        workItemNode1.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("person", "person", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_FA0224F1-04A8-419E-92B0-EB3D6534817F_ParameterInputX", "Parameter", "org.acme.travels.Person", null), null, null));
        workItemNode1.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_FA0224F1-04A8-419E-92B0-EB3D6534817F_personOutputX", "person", "org.acme.travels.Person", null)), new org.jbpm.workflow.core.impl.DataDefinition("person", "person", "java.lang.Object", null), null, null));
        workItemNode1.done();
        workItemNode1.metaData("UniqueId", "_FA0224F1-04A8-419E-92B0-EB3D6534817F");
        workItemNode1.metaData("Implementation", "Java");
        workItemNode1.metaData("elementname", "Person Service");
        workItemNode1.metaData("Type", "Service Task");
        workItemNode1.metaData("OperationRef", "_FA0224F1-04A8-419E-92B0-EB3D6534817F_ServiceOperation");
        workItemNode1.metaData("x", 443);
        workItemNode1.metaData("width", 154);
        workItemNode1.metaData("y", 101);
        workItemNode1.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode2 = factory.endNode(2);
        endNode2.name("End Event 1");
        endNode2.terminate(false);
        endNode2.metaData("UniqueId", "_6BDF2751-F544-4AFC-AB47-8C5F52EC97AD");
        endNode2.metaData("elementname", "End Event 1");
        endNode2.metaData("x", 1060);
        endNode2.metaData("width", 56);
        endNode2.metaData("y", 135);
        endNode2.metaData("height", 56);
        endNode2.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode3 = factory.startNode(3);
        startNode3.name("StartProcess");
        startNode3.interrupting(true);
        startNode3.metaData("UniqueId", "_F2CC5C1D-5116-4C20-8702-A8357341790F");
        startNode3.metaData("elementname", "StartProcess");
        startNode3.metaData("x", 102);
        startNode3.metaData("width", 56);
        startNode3.metaData("y", 129);
        startNode3.metaData("height", 56);
        startNode3.done();
        org.jbpm.ruleflow.core.factory.RuleSetNodeFactory<?> ruleSetNode4 = factory.ruleSetNode(4);
        ruleSetNode4.name("Evaluate Person");
        ruleSetNode4.ruleFlowGroup("person", () -> {
            org.kie.kogito.rules.RuleConfig ruleConfig = app.config().get(org.kie.kogito.rules.RuleConfig.class);
            org.kie.api.runtime.KieSession ksession = org.drools.project.model.ProjectRuntime.INSTANCE.newKieSession("defaultStatelessKieSession");
            ruleConfig.ruleEventListeners().agendaListeners().forEach(ksession::addEventListener);
            ruleConfig.ruleEventListeners().ruleRuntimeListeners().forEach(ksession::addEventListener);
            return ksession;
        });
        ruleSetNode4.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("person", "person", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_7B8CC121-6F99-464A-93F8-9EAC4BE4601A_personInputX", "person", "org.acme.travels.Person", null), null, null));
        ruleSetNode4.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_7B8CC121-6F99-464A-93F8-9EAC4BE4601A_personOutputX", "person", "org.acme.travels.Person", null)), new org.jbpm.workflow.core.impl.DataDefinition("person", "person", "java.lang.Object", null), null, null));
        ruleSetNode4.metaData("UniqueId", "_7B8CC121-6F99-464A-93F8-9EAC4BE4601A");
        ruleSetNode4.metaData("elementname", "Evaluate Person");
        ruleSetNode4.metaData("x", 228);
        ruleSetNode4.metaData("width", 140);
        ruleSetNode4.metaData("y", 106);
        ruleSetNode4.metaData("height", 91);
        ruleSetNode4.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode5 = factory.splitNode(5);
        splitNode5.name("Exclusive Gateway 1");
        splitNode5.type(2);
        splitNode5.metaData("UniqueId", "_CB2B4CEB-E636-4F0C-904B-3468083FF1EF");
        splitNode5.metaData("elementname", "Exclusive Gateway 1");
        splitNode5.metaData("x", 672);
        splitNode5.metaData("width", 56);
        splitNode5.metaData("y", 129);
        splitNode5.metaData("Default", null);
        splitNode5.metaData("height", 56);
        splitNode5.constraint(7, "_FA444C47-2749-42FF-ACE3-7CF52A2AB11A", "DROOLS_DEFAULT", "java", kcontext -> {
            org.acme.travels.Person person = (org.acme.travels.Person) kcontext.getVariable("person");
            java.lang.Boolean stored = (java.lang.Boolean) kcontext.getVariable("stored");
            java.lang.Boolean adult = (java.lang.Boolean) kcontext.getVariable("adult");
            return !person.isAdult();
        }, 0, false);
        splitNode5.constraint(6, "_7D17E3E6-8F21-46E7-8651-664B053C6296", "DROOLS_DEFAULT", "java", kcontext -> {
            org.acme.travels.Person person = (org.acme.travels.Person) kcontext.getVariable("person");
            java.lang.Boolean stored = (java.lang.Boolean) kcontext.getVariable("stored");
            java.lang.Boolean adult = (java.lang.Boolean) kcontext.getVariable("adult");
            return person.isAdult();
        }, 0, false);
        splitNode5.done();
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode6 = factory.humanTaskNode(6);
        humanTaskNode6.name("Special handling for children");
        humanTaskNode6.workParameter("NodeName", "Special handling for children");
        humanTaskNode6.workParameter("TaskName", "ChildrenHandling");
        humanTaskNode6.workParameter("Priority", "1");
        humanTaskNode6.workParameter("Skippable", "true");
        humanTaskNode6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_TaskNameInputX", "TaskName", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("0525791d-d52c-44b5-a69b-e8a52055abab", "EXPRESSION (ChildrenHandling)", "java.lang.Object", "ChildrenHandling"), new org.jbpm.workflow.core.impl.DataDefinition("_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_TaskNameInputX", "TaskName", "Object", null))), null));
        humanTaskNode6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("person", "person", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_personInputX", "person", "org.acme.travels.Person", null), null, null));
        humanTaskNode6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_SkippableInputX", "Skippable", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("ceffc319-b31a-4abf-844c-ac05f6d813c9", "EXPRESSION (true)", "java.lang.Object", "true"), new org.jbpm.workflow.core.impl.DataDefinition("_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_SkippableInputX", "Skippable", "Object", null))), null));
        humanTaskNode6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_PriorityInputX", "Priority", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("52dbfed7-9a4b-4ffe-8d01-6ec4c029db1a", "EXPRESSION (1)", "java.lang.Object", "1"), new org.jbpm.workflow.core.impl.DataDefinition("_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_PriorityInputX", "Priority", "Object", null))), null));
        humanTaskNode6.done();
        humanTaskNode6.metaData("UniqueId", "_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D");
        humanTaskNode6.metaData("elementname", "Special handling for children");
        humanTaskNode6.metaData("x", 826);
        humanTaskNode6.metaData("width", 154);
        humanTaskNode6.metaData("y", 112);
        humanTaskNode6.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode7 = factory.endNode(7);
        endNode7.name("End Event 2");
        endNode7.terminate(false);
        endNode7.metaData("UniqueId", "_44052DCF-2D80-48EC-9691-556FEDD102FD");
        endNode7.metaData("elementname", "End Event 2");
        endNode7.metaData("x", 992);
        endNode7.metaData("width", 56);
        endNode7.metaData("y", 581);
        endNode7.metaData("height", 56);
        endNode7.done();
        factory.connection(4, 1, "_43A8366E-0BDB-40A5-8654-2629009E94D3");
        factory.connection(6, 2, "_C93EF8F2-D9C0-45D1-A3D6-C8A376D07806");
        factory.connection(3, 4, "_41D07816-A956-491C-9787-5B8C0B8C4F58");
        factory.connection(1, 5, "_2343C29F-8F7D-4851-AC13-787077D90B69");
        factory.connection(5, 6, "_7D17E3E6-8F21-46E7-8651-664B053C6296");
        factory.connection(5, 7, "_FA444C47-2749-42FF-ACE3-7CF52A2AB11A");
        factory.validate();
        return factory.getProcess();
    }
}
