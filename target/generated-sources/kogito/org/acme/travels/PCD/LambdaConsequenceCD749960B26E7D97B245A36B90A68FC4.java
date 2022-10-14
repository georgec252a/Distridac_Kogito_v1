package org.acme.travels.PCD;

import static org.acme.travels.Rules2E460E98FBDF296CF50748F35F942A65.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.acme.travels.IntrareCLE;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceCD749960B26E7D97B245A36B90A68FC4 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.travels.IntrareCLE>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "292B635D850E209EA84F053212CDA490";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$intrareCLE = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_IntrareCLE_Metadata_INSTANCE, "VINok");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.travels.IntrareCLE $intrareCLE) throws java.lang.Exception {
        {
            {
                ($intrareCLE).setVINok(true);
            }
            drools.update($intrareCLE, mask_$intrareCLE);
        }
    }
}
