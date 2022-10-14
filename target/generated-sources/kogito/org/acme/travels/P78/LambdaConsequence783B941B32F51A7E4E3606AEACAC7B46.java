package org.acme.travels.P78;

import static org.acme.travels.Rules2E460E98FBDF296CF50748F35F942A65.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.acme.travels.IntrareCLE;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence783B941B32F51A7E4E3606AEACAC7B46 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.travels.IntrareCLE>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "8629A377009221D5B0B983D5A40FAAE5";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$intrareCLE = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_IntrareCLE_Metadata_INSTANCE, "plataOK");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.travels.IntrareCLE $intrareCLE) throws java.lang.Exception {
        {
            {
                ($intrareCLE).setPlataOK(true);
            }
            drools.update($intrareCLE, mask_$intrareCLE);
        }
    }
}
