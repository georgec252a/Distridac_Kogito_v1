package org.acme.travels.P0D;

import static org.acme.travels.Rules2E460E98FBDF296CF50748F35F942A65.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.acme.travels.IntrareCLE;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate0D7D10C2572DC476C69A8CDDDBFA101D implements org.drools.model.functions.Predicate1<org.acme.travels.IntrareCLE>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "9D7C595FBA0A591179A76EAA68F822C0";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.acme.travels.IntrareCLE _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getContDestinatar(), "aaaa");
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("contDestinatar==\"aaaa\"");
        info.addRuleNames("Cont Valid", "C:/Programs/Distridac_Kogito/process-business-rules-springboot_07_10_2022/src/main/resources/org/acme/travels/VerificareCont.drl");
        return info;
    }
}
