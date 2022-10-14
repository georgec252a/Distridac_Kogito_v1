package org.acme.travels;

import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.BooleanDataType;

@org.springframework.stereotype.Component("intrare_auto_cle")
public class Intrare_auto_cleProcess extends org.kie.kogito.process.impl.AbstractProcess<org.acme.travels.Intrare_auto_cleModel> {

    public Intrare_auto_cleProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        this(app, correlations, new org.kie.kogito.handlers.GenerareMesajBSD_generateMessage_12_Handler());
    }

    @org.springframework.beans.factory.annotation.Autowired()
    public Intrare_auto_cleProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.handlers.GenerareMesajBSD_generateMessage_12_Handler generareMesajBSD_generateMessage_12_Handler) {
        super(app, java.util.Arrays.asList(generareMesajBSD_generateMessage_12_Handler), correlations);
        activate();
    }

    public Intrare_auto_cleProcess() {
    }

    @Override()
    public org.acme.travels.Intrare_auto_cleProcessInstance createInstance(org.acme.travels.Intrare_auto_cleModel value) {
        return new org.acme.travels.Intrare_auto_cleProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.acme.travels.Intrare_auto_cleProcessInstance createInstance(java.lang.String businessKey, org.acme.travels.Intrare_auto_cleModel value) {
        return new org.acme.travels.Intrare_auto_cleProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public org.acme.travels.Intrare_auto_cleProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, org.acme.travels.Intrare_auto_cleModel value) {
        return new org.acme.travels.Intrare_auto_cleProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public org.acme.travels.Intrare_auto_cleModel createModel() {
        return new org.acme.travels.Intrare_auto_cleModel();
    }

    public org.acme.travels.Intrare_auto_cleProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.acme.travels.Intrare_auto_cleModel) value);
    }

    public org.acme.travels.Intrare_auto_cleProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.acme.travels.Intrare_auto_cleModel) value);
    }

    public org.acme.travels.Intrare_auto_cleProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.Intrare_auto_cleProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.acme.travels.Intrare_auto_cleProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.Intrare_auto_cleProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("intrare_auto_cle", true);
        factory.variable("stored", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.Boolean.class), null, "customTags", null);
        factory.variable("VinValid", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.Boolean.class), null, "customTags", null);
        factory.variable("intrareCLE", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.travels.IntrareCLE.class), null, "customTags", null);
        factory.name("intrare_auto_cle");
        factory.packageName("org.acme.travels");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        factory.imports("org.acme.travels.IntrareCLE");
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode1 = factory.endNode(1);
        endNode1.name("End Event 2");
        endNode1.terminate(false);
        endNode1.metaData("UniqueId", "_5DB7A50E-F65A-459D-98B9-7F9D717E4C5D");
        endNode1.metaData("elementname", "End Event 2");
        endNode1.metaData("x", 1645);
        endNode1.metaData("width", 56);
        endNode1.metaData("y", 322);
        endNode1.metaData("height", 56);
        endNode1.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode2 = factory.splitNode(2);
        splitNode2.name("Compound FULL?");
        splitNode2.type(2);
        splitNode2.metaData("UniqueId", "_0F983606-2637-4E8A-B362-D3E0002FFE0F");
        splitNode2.metaData("elementname", "Compound FULL?");
        splitNode2.metaData("x", 1645);
        splitNode2.metaData("width", 56);
        splitNode2.metaData("y", 129);
        splitNode2.metaData("Default", null);
        splitNode2.metaData("height", 56);
        splitNode2.constraint(1, "_E6A1273D-712E-4E62-BE5D-4BF62F21D4CF", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.Boolean stored = (java.lang.Boolean) kcontext.getVariable("stored");
            java.lang.Boolean VinValid = (java.lang.Boolean) kcontext.getVariable("VinValid");
            org.acme.travels.IntrareCLE intrareCLE = (org.acme.travels.IntrareCLE) kcontext.getVariable("intrareCLE");
            return !intrareCLE.isCompoundFull();
        }, 0, false);
        splitNode2.constraint(17, "_3D71E61F-BD1B-469B-B450-71C8EF73B398", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.Boolean stored = (java.lang.Boolean) kcontext.getVariable("stored");
            java.lang.Boolean VinValid = (java.lang.Boolean) kcontext.getVariable("VinValid");
            org.acme.travels.IntrareCLE intrareCLE = (org.acme.travels.IntrareCLE) kcontext.getVariable("intrareCLE");
            return intrareCLE.isCompoundFull();
        }, 0, false);
        splitNode2.done();
        org.jbpm.ruleflow.core.factory.RuleSetNodeFactory<?> ruleSetNode3 = factory.ruleSetNode(3);
        ruleSetNode3.name("Verifica Compound Ocupat");
        ruleSetNode3.ruleFlowGroup("VerificareCompound", () -> {
            org.kie.kogito.rules.RuleConfig ruleConfig = app.config().get(org.kie.kogito.rules.RuleConfig.class);
            org.kie.api.runtime.KieSession ksession = org.drools.project.model.ProjectRuntime.INSTANCE.newKieSession("defaultStatelessKieSession");
            ruleConfig.ruleEventListeners().agendaListeners().forEach(ksession::addEventListener);
            ruleConfig.ruleEventListeners().ruleRuntimeListeners().forEach(ksession::addEventListener);
            return ksession;
        });
        ruleSetNode3.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("intrareCLE", "intrareCLE", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_73C1684F-00A6-4E68-A449-AF0228B854A4_intrareCLEInputX", "intrareCLE", "org.acme.travels.IntrareCLE", null), null, null));
        ruleSetNode3.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_73C1684F-00A6-4E68-A449-AF0228B854A4_intrareCLEOutputX", "intrareCLE", "org.acme.travels.IntrareCLE", null)), new org.jbpm.workflow.core.impl.DataDefinition("intrareCLE", "intrareCLE", "java.lang.Object", null), null, null));
        ruleSetNode3.metaData("UniqueId", "_73C1684F-00A6-4E68-A449-AF0228B854A4");
        ruleSetNode3.metaData("elementname", "Verifica Compound Ocupat");
        ruleSetNode3.metaData("x", 1437);
        ruleSetNode3.metaData("width", 140);
        ruleSetNode3.metaData("y", 116);
        ruleSetNode3.metaData("height", 91);
        ruleSetNode3.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode4 = factory.endNode(4);
        endNode4.name("End Event 2");
        endNode4.terminate(false);
        endNode4.metaData("UniqueId", "_826F9D16-2EDD-444A-B1D1-E54DFD133B63");
        endNode4.metaData("elementname", "End Event 2");
        endNode4.metaData("x", 1317);
        endNode4.metaData("width", 56);
        endNode4.metaData("y", 322);
        endNode4.metaData("height", 56);
        endNode4.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode5 = factory.splitNode(5);
        splitNode5.name("Cont Valid?");
        splitNode5.type(2);
        splitNode5.metaData("UniqueId", "_BEF058F9-1709-4CBD-9F41-51383DB8C905");
        splitNode5.metaData("elementname", "Cont Valid?");
        splitNode5.metaData("x", 1317);
        splitNode5.metaData("width", 56);
        splitNode5.metaData("y", 133);
        splitNode5.metaData("Default", null);
        splitNode5.metaData("height", 56);
        splitNode5.constraint(3, "_F942476C-2675-409A-9877-EC87E6A80388", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.Boolean stored = (java.lang.Boolean) kcontext.getVariable("stored");
            java.lang.Boolean VinValid = (java.lang.Boolean) kcontext.getVariable("VinValid");
            org.acme.travels.IntrareCLE intrareCLE = (org.acme.travels.IntrareCLE) kcontext.getVariable("intrareCLE");
            return intrareCLE.isContDestinatarOK();
        }, 0, false);
        splitNode5.constraint(4, "_6025253B-5380-4177-8340-89BEA49962D7", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.Boolean stored = (java.lang.Boolean) kcontext.getVariable("stored");
            java.lang.Boolean VinValid = (java.lang.Boolean) kcontext.getVariable("VinValid");
            org.acme.travels.IntrareCLE intrareCLE = (org.acme.travels.IntrareCLE) kcontext.getVariable("intrareCLE");
            return !intrareCLE.isContDestinatarOK();
        }, 0, false);
        splitNode5.done();
        org.jbpm.ruleflow.core.factory.RuleSetNodeFactory<?> ruleSetNode6 = factory.ruleSetNode(6);
        ruleSetNode6.name("Verifica Cont");
        ruleSetNode6.ruleFlowGroup("VerificareCont", () -> {
            org.kie.kogito.rules.RuleConfig ruleConfig = app.config().get(org.kie.kogito.rules.RuleConfig.class);
            org.kie.api.runtime.KieSession ksession = org.drools.project.model.ProjectRuntime.INSTANCE.newKieSession("defaultStatelessKieSession");
            ruleConfig.ruleEventListeners().agendaListeners().forEach(ksession::addEventListener);
            ruleConfig.ruleEventListeners().ruleRuntimeListeners().forEach(ksession::addEventListener);
            return ksession;
        });
        ruleSetNode6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("intrareCLE", "intrareCLE", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_FA3665CF-8471-493F-A908-6E75B4791760_intrareCLEInputX", "intrareCLE", "org.acme.travels.IntrareCLE", null), null, null));
        ruleSetNode6.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_FA3665CF-8471-493F-A908-6E75B4791760_intrareCLEOutputX", "intrareCLE", "org.acme.travels.IntrareCLE", null)), new org.jbpm.workflow.core.impl.DataDefinition("intrareCLE", "intrareCLE", "java.lang.Object", null), null, null));
        ruleSetNode6.metaData("UniqueId", "_FA3665CF-8471-493F-A908-6E75B4791760");
        ruleSetNode6.metaData("elementname", "Verifica Cont");
        ruleSetNode6.metaData("x", 1118);
        ruleSetNode6.metaData("width", 140);
        ruleSetNode6.metaData("y", 115);
        ruleSetNode6.metaData("height", 91);
        ruleSetNode6.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode7 = factory.endNode(7);
        endNode7.name("End Event 2");
        endNode7.terminate(false);
        endNode7.metaData("UniqueId", "_2F77F859-074F-4790-A68E-C59ABF0EAC89");
        endNode7.metaData("elementname", "End Event 2");
        endNode7.metaData("x", 999);
        endNode7.metaData("width", 56);
        endNode7.metaData("y", 322);
        endNode7.metaData("height", 56);
        endNode7.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode8 = factory.splitNode(8);
        splitNode8.name("Plata Valida?");
        splitNode8.type(2);
        splitNode8.metaData("UniqueId", "_EFC46438-3D69-4ADB-A91E-2A40503F2BB4");
        splitNode8.metaData("elementname", "Plata Valida?");
        splitNode8.metaData("x", 999);
        splitNode8.metaData("width", 56);
        splitNode8.metaData("y", 134);
        splitNode8.metaData("Default", null);
        splitNode8.metaData("height", 56);
        splitNode8.constraint(6, "_3314C708-6F97-4778-942D-47851BB64973", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.Boolean stored = (java.lang.Boolean) kcontext.getVariable("stored");
            java.lang.Boolean VinValid = (java.lang.Boolean) kcontext.getVariable("VinValid");
            org.acme.travels.IntrareCLE intrareCLE = (org.acme.travels.IntrareCLE) kcontext.getVariable("intrareCLE");
            return intrareCLE.isPlataOK();
        }, 0, false);
        splitNode8.constraint(7, "_37FADE14-0752-4DBD-83F3-09EEA22719AD", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.Boolean stored = (java.lang.Boolean) kcontext.getVariable("stored");
            java.lang.Boolean VinValid = (java.lang.Boolean) kcontext.getVariable("VinValid");
            org.acme.travels.IntrareCLE intrareCLE = (org.acme.travels.IntrareCLE) kcontext.getVariable("intrareCLE");
            return !intrareCLE.isPlataOK();
        }, 0, false);
        splitNode8.done();
        org.jbpm.ruleflow.core.factory.RuleSetNodeFactory<?> ruleSetNode9 = factory.ruleSetNode(9);
        ruleSetNode9.name("Verifica Plata");
        ruleSetNode9.ruleFlowGroup("VerificarePlata", () -> {
            org.kie.kogito.rules.RuleConfig ruleConfig = app.config().get(org.kie.kogito.rules.RuleConfig.class);
            org.kie.api.runtime.KieSession ksession = org.drools.project.model.ProjectRuntime.INSTANCE.newKieSession("defaultStatelessKieSession");
            ruleConfig.ruleEventListeners().agendaListeners().forEach(ksession::addEventListener);
            ruleConfig.ruleEventListeners().ruleRuntimeListeners().forEach(ksession::addEventListener);
            return ksession;
        });
        ruleSetNode9.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("intrareCLE", "intrareCLE", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_23F10215-19D4-4677-856D-099E1B33F6F0_intrareCLEInputX", "intrareCLE", "org.acme.travels.IntrareCLE", null), null, null));
        ruleSetNode9.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_23F10215-19D4-4677-856D-099E1B33F6F0_intrareCLEOutputX", "intrareCLE", "org.acme.travels.IntrareCLE", null)), new org.jbpm.workflow.core.impl.DataDefinition("intrareCLE", "intrareCLE", "java.lang.Object", null), null, null));
        ruleSetNode9.metaData("UniqueId", "_23F10215-19D4-4677-856D-099E1B33F6F0");
        ruleSetNode9.metaData("elementname", "Verifica Plata");
        ruleSetNode9.metaData("x", 773);
        ruleSetNode9.metaData("width", 140);
        ruleSetNode9.metaData("y", 115);
        ruleSetNode9.metaData("height", 91);
        ruleSetNode9.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode10 = factory.endNode(10);
        endNode10.name("End Event 2");
        endNode10.terminate(false);
        endNode10.metaData("UniqueId", "_E13AFEB2-386F-473A-9061-AC895A96C615");
        endNode10.metaData("elementname", "End Event 2");
        endNode10.metaData("x", 347);
        endNode10.metaData("width", 56);
        endNode10.metaData("y", 322);
        endNode10.metaData("height", 56);
        endNode10.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode11 = factory.splitNode(11);
        splitNode11.name("VIN valid?");
        splitNode11.type(2);
        splitNode11.metaData("UniqueId", "_BB5F7180-E876-4381-90E1-BD94F9941195");
        splitNode11.metaData("elementname", "VIN valid?");
        splitNode11.metaData("x", 347);
        splitNode11.metaData("width", 56);
        splitNode11.metaData("y", 134);
        splitNode11.metaData("Default", null);
        splitNode11.metaData("height", 56);
        splitNode11.constraint(10, "_FD25BBB4-A93B-461F-97EE-DE745D629ACF", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.Boolean stored = (java.lang.Boolean) kcontext.getVariable("stored");
            java.lang.Boolean VinValid = (java.lang.Boolean) kcontext.getVariable("VinValid");
            org.acme.travels.IntrareCLE intrareCLE = (org.acme.travels.IntrareCLE) kcontext.getVariable("intrareCLE");
            return !intrareCLE.isVINok();
        }, 0, false);
        splitNode11.constraint(12, "_C8EF977E-D1B3-4B68-A10F-7E339C7942D3", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.Boolean stored = (java.lang.Boolean) kcontext.getVariable("stored");
            java.lang.Boolean VinValid = (java.lang.Boolean) kcontext.getVariable("VinValid");
            org.acme.travels.IntrareCLE intrareCLE = (org.acme.travels.IntrareCLE) kcontext.getVariable("intrareCLE");
            return intrareCLE.isVINok();
        }, 0, false);
        splitNode11.done();
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode12 = factory.workItemNode(12);
        workItemNode12.name("Generare Mesaje LA01");
        workItemNode12.workName("org.acme.travels.services.GenerareMesajBSD_generateMessage_12_Handler");
        workItemNode12.workParameter("NodeName", "Generare Mesaje LA01");
        workItemNode12.workParameter("Interface", "org.acme.travels.services.GenerareMesajBSD");
        workItemNode12.workParameter("Operation", "generateMessage");
        workItemNode12.workParameter("interfaceImplementationRef", "org.acme.travels.services.GenerareMesajBSD");
        workItemNode12.workParameter("operationImplementationRef", "generateMessage");
        workItemNode12.workParameter("implementation", "Java");
        workItemNode12.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("intrareCLE", "intrareCLE", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_FA0224F1-04A8-419E-92B0-EB3D6534817F_intrareCLEInputX", "intrareCLE", "org.acme.travels.IntrareCLE", null), null, null));
        workItemNode12.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_FA0224F1-04A8-419E-92B0-EB3D6534817F_intrareCLEOutputX", "intrareCLE", "org.acme.travels.IntrareCLE", null)), new org.jbpm.workflow.core.impl.DataDefinition("intrareCLE", "intrareCLE", "java.lang.Object", null), null, null));
        workItemNode12.done();
        workItemNode12.metaData("UniqueId", "_FA0224F1-04A8-419E-92B0-EB3D6534817F");
        workItemNode12.metaData("Implementation", "Java");
        workItemNode12.metaData("elementname", "Generare Mesaje LA01");
        workItemNode12.metaData("Type", "Service Task");
        workItemNode12.metaData("OperationRef", "_FA0224F1-04A8-419E-92B0-EB3D6534817F_ServiceOperation");
        workItemNode12.metaData("x", 443);
        workItemNode12.metaData("width", 154);
        workItemNode12.metaData("y", 111);
        workItemNode12.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode13 = factory.endNode(13);
        endNode13.name("Sfarsit");
        endNode13.terminate(false);
        endNode13.metaData("UniqueId", "_6BDF2751-F544-4AFC-AB47-8C5F52EC97AD");
        endNode13.metaData("elementname", "Sfarsit");
        endNode13.metaData("x", 2008);
        endNode13.metaData("width", 56);
        endNode13.metaData("y", 129);
        endNode13.metaData("height", 56);
        endNode13.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode14 = factory.startNode(14);
        startNode14.name("StartProcess");
        startNode14.interrupting(true);
        startNode14.metaData("UniqueId", "_F2CC5C1D-5116-4C20-8702-A8357341790F");
        startNode14.metaData("elementname", "StartProcess");
        startNode14.metaData("x", 57);
        startNode14.metaData("width", 56);
        startNode14.metaData("y", 134);
        startNode14.metaData("height", 56);
        startNode14.done();
        org.jbpm.ruleflow.core.factory.RuleSetNodeFactory<?> ruleSetNode15 = factory.ruleSetNode(15);
        ruleSetNode15.name("Verifica cod VIN");
        ruleSetNode15.ruleFlowGroup("IntrareCLE", () -> {
            org.kie.kogito.rules.RuleConfig ruleConfig = app.config().get(org.kie.kogito.rules.RuleConfig.class);
            org.kie.api.runtime.KieSession ksession = org.drools.project.model.ProjectRuntime.INSTANCE.newKieSession("defaultStatelessKieSession");
            ruleConfig.ruleEventListeners().agendaListeners().forEach(ksession::addEventListener);
            ruleConfig.ruleEventListeners().ruleRuntimeListeners().forEach(ksession::addEventListener);
            return ksession;
        });
        ruleSetNode15.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("intrareCLE", "intrareCLE", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_7B8CC121-6F99-464A-93F8-9EAC4BE4601A_intrareCLEInputX", "intrareCLE", "org.acme.travels.IntrareCLE", null), null, null));
        ruleSetNode15.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_7B8CC121-6F99-464A-93F8-9EAC4BE4601A_intrareCLEOutputX", "intrareCLE", "org.acme.travels.IntrareCLE", null)), new org.jbpm.workflow.core.impl.DataDefinition("intrareCLE", "intrareCLE", "java.lang.Object", null), null, null));
        ruleSetNode15.metaData("UniqueId", "_7B8CC121-6F99-464A-93F8-9EAC4BE4601A");
        ruleSetNode15.metaData("elementname", "Verifica cod VIN");
        ruleSetNode15.metaData("x", 166);
        ruleSetNode15.metaData("width", 140);
        ruleSetNode15.metaData("y", 116);
        ruleSetNode15.metaData("height", 91);
        ruleSetNode15.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode16 = factory.splitNode(16);
        splitNode16.name("VIN Valid?");
        splitNode16.type(2);
        splitNode16.metaData("UniqueId", "_CB2B4CEB-E636-4F0C-904B-3468083FF1EF");
        splitNode16.metaData("elementname", "VIN Valid?");
        splitNode16.metaData("x", 652);
        splitNode16.metaData("width", 56);
        splitNode16.metaData("y", 134);
        splitNode16.metaData("Default", null);
        splitNode16.metaData("height", 56);
        splitNode16.constraint(9, "_8421CD4D-5529-4FEA-AE56-071DEEC58E13", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.Boolean stored = (java.lang.Boolean) kcontext.getVariable("stored");
            java.lang.Boolean VinValid = (java.lang.Boolean) kcontext.getVariable("VinValid");
            org.acme.travels.IntrareCLE intrareCLE = (org.acme.travels.IntrareCLE) kcontext.getVariable("intrareCLE");
            return intrareCLE.isVINok();
        }, 0, false);
        splitNode16.constraint(18, "_87F7456E-DF48-4110-B450-C39A27B6E1ED", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.Boolean stored = (java.lang.Boolean) kcontext.getVariable("stored");
            java.lang.Boolean VinValid = (java.lang.Boolean) kcontext.getVariable("VinValid");
            org.acme.travels.IntrareCLE intrareCLE = (org.acme.travels.IntrareCLE) kcontext.getVariable("intrareCLE");
            return !intrareCLE.isVINok();
        }, 0, false);
        splitNode16.done();
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode17 = factory.humanTaskNode(17);
        humanTaskNode17.name("Inregistrare auto");
        humanTaskNode17.workParameter("NodeName", "Inregistrare auto");
        humanTaskNode17.workParameter("TaskName", "ChildrenHandling");
        humanTaskNode17.workParameter("Priority", "1");
        humanTaskNode17.workParameter("Skippable", "true");
        humanTaskNode17.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_TaskNameInputX", "TaskName", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("21743787-831a-42a2-aba2-161faf599d99", "EXPRESSION (ChildrenHandling)", "java.lang.Object", "ChildrenHandling"), new org.jbpm.workflow.core.impl.DataDefinition("_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_TaskNameInputX", "TaskName", "Object", null))), null));
        humanTaskNode17.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("intrareCLE", "intrareCLE", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_intrareCLEInputX", "intrareCLE", "org.acme.travels.IntrareCLE", null), null, null));
        humanTaskNode17.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_SkippableInputX", "Skippable", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("0a8755cc-bf85-40c4-b90b-9c39cb5578bd", "EXPRESSION (true)", "java.lang.Object", "true"), new org.jbpm.workflow.core.impl.DataDefinition("_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_SkippableInputX", "Skippable", "Object", null))), null));
        humanTaskNode17.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_PriorityInputX", "Priority", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("b5a09e85-6271-427d-93e5-7350314b11fe", "EXPRESSION (1)", "java.lang.Object", "1"), new org.jbpm.workflow.core.impl.DataDefinition("_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_PriorityInputX", "Priority", "Object", null))), null));
        humanTaskNode17.done();
        humanTaskNode17.metaData("UniqueId", "_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D");
        humanTaskNode17.metaData("elementname", "Inregistrare auto");
        humanTaskNode17.metaData("x", 1765);
        humanTaskNode17.metaData("width", 154);
        humanTaskNode17.metaData("y", 106);
        humanTaskNode17.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode18 = factory.endNode(18);
        endNode18.name("End Event 2");
        endNode18.terminate(false);
        endNode18.metaData("UniqueId", "_44052DCF-2D80-48EC-9691-556FEDD102FD");
        endNode18.metaData("elementname", "End Event 2");
        endNode18.metaData("x", 652);
        endNode18.metaData("width", 56);
        endNode18.metaData("y", 322);
        endNode18.metaData("height", 56);
        endNode18.done();
        factory.connection(2, 1, "_E6A1273D-712E-4E62-BE5D-4BF62F21D4CF");
        factory.connection(3, 2, "_181F0BBC-E03C-47F9-9139-2859DCDF0C49");
        factory.connection(5, 3, "_F942476C-2675-409A-9877-EC87E6A80388");
        factory.connection(5, 4, "_6025253B-5380-4177-8340-89BEA49962D7");
        factory.connection(6, 5, "_2D99A1D1-4656-486B-B7F2-05B12898D71D");
        factory.connection(8, 6, "_3314C708-6F97-4778-942D-47851BB64973");
        factory.connection(8, 7, "_37FADE14-0752-4DBD-83F3-09EEA22719AD");
        factory.connection(9, 8, "_0A1E251E-C2DA-4B97-A30C-8240F3C3DD01");
        factory.connection(16, 9, "_8421CD4D-5529-4FEA-AE56-071DEEC58E13");
        factory.connection(11, 10, "_FD25BBB4-A93B-461F-97EE-DE745D629ACF");
        factory.connection(15, 11, "_AC5E2A9A-19F9-4D85-8351-A23BA4688424");
        factory.connection(11, 12, "_C8EF977E-D1B3-4B68-A10F-7E339C7942D3");
        factory.connection(17, 13, "_C93EF8F2-D9C0-45D1-A3D6-C8A376D07806");
        factory.connection(14, 15, "_41D07816-A956-491C-9787-5B8C0B8C4F58");
        factory.connection(12, 16, "_2343C29F-8F7D-4851-AC13-787077D90B69");
        factory.connection(2, 17, "_3D71E61F-BD1B-469B-B450-71C8EF73B398");
        factory.connection(16, 18, "_87F7456E-DF48-4110-B450-C39A27B6E1ED");
        factory.validate();
        return factory.getProcess();
    }
}
