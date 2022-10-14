package org.acme.travels.P27;

import static org.acme.travels.Rules2E460E98FBDF296CF50748F35F942A65.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.acme.travels.IntrareCLE;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate2767E59C9BB069B7A82959F9CFBEDA1F implements org.drools.model.functions.Predicate1<org.acme.travels.IntrareCLE>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "4CDE5A146E203EB62CDBFA2B5B5D430C";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.acme.travels.IntrareCLE _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterThanNumbers(_this.getPlata(), 0);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("plata>0");
        info.addRuleNames("Plata Valida", "C:/Programs/Distridac_Kogito/process-business-rules-springboot_07_10_2022/src/main/resources/org/acme/travels/VerificarePlata.drl");
        return info;
    }
}
