package org.acme.travels.P06;

import static org.acme.travels.Rules2E460E98FBDF296CF50748F35F942A65.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.acme.travels.IntrareCLE;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence0614E28C9417A5E19F213BF9F503232C implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.travels.IntrareCLE>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "9167BD58485EBB8E3523F4AEC1DF50A5";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$intrareCLE = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_IntrareCLE_Metadata_INSTANCE, "compoundFull");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.travels.IntrareCLE $intrareCLE) throws java.lang.Exception {
        {
            {
                ($intrareCLE).setCompoundFull(true);
            }
            drools.update($intrareCLE, mask_$intrareCLE);
        }
    }
}
