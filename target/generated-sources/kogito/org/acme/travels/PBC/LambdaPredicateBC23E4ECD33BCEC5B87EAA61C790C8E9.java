package org.acme.travels.PBC;

import static org.acme.travels.Rules2E460E98FBDF296CF50748F35F942A65.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.acme.travels.IntrareCLE;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateBC23E4ECD33BCEC5B87EAA61C790C8E9 implements org.drools.model.functions.Predicate1<org.acme.travels.IntrareCLE>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "0C2E3E995750190183A5C281224BFEBC";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.acme.travels.IntrareCLE _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterThanNumbers(_this.getVIN(), 100);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("VIN > 100");
        info.addRuleNames("Is VIN Valid", "C:/Programs/Distridac_Kogito/process-business-rules-springboot_07_10_2022/src/main/resources/org/acme/travels/ValidareVIN.drl");
        return info;
    }
}
