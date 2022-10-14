package org.acme.travels;

public class Intrare_auto_cleProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<Intrare_auto_cleModel> {

    public Intrare_auto_cleProcessInstance(org.acme.travels.Intrare_auto_cleProcess process, Intrare_auto_cleModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public Intrare_auto_cleProcessInstance(org.acme.travels.Intrare_auto_cleProcess process, Intrare_auto_cleModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public Intrare_auto_cleProcessInstance(org.acme.travels.Intrare_auto_cleProcess process, Intrare_auto_cleModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public Intrare_auto_cleProcessInstance(org.acme.travels.Intrare_auto_cleProcess process, Intrare_auto_cleModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public Intrare_auto_cleProcessInstance(org.acme.travels.Intrare_auto_cleProcess process, Intrare_auto_cleModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(Intrare_auto_cleModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(Intrare_auto_cleModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
