package org.acme;

import org.acme.GreetingsModel;

public class GreetingsProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<GreetingsModel> {

    public GreetingsProcessInstance(org.acme.GreetingsProcess process, GreetingsModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public GreetingsProcessInstance(org.acme.GreetingsProcess process, GreetingsModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public GreetingsProcessInstance(org.acme.GreetingsProcess process, GreetingsModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public GreetingsProcessInstance(org.acme.GreetingsProcess process, GreetingsModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public GreetingsProcessInstance(org.acme.GreetingsProcess process, GreetingsModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(GreetingsModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(GreetingsModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
