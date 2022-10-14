package org.acme.travels.P4D;

import static org.acme.travels.Rules2E460E98FBDF296CF50748F35F942A65.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.acme.travels.IntrareCLE;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate4D0036B0F5FB995C11008CA9B2C2A398 implements org.drools.model.functions.Predicate1<org.acme.travels.IntrareCLE>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "DE881756E2E4AD0E12FE1C0EBF0DAD63";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.acme.travels.IntrareCLE _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterThanNumbers(_this.getCompoundOcupat(), 10);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("compoundOcupat>10");
        info.addRuleNames("Verifica locuri Compound", "C:/Programs/Distridac_Kogito/process-business-rules-springboot_07_10_2022/src/main/resources/org/acme/travels/VerificareCompound.drl");
        return info;
    }
}
