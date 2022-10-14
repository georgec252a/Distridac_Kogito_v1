package org.acme.travels.PE8;

import static org.acme.travels.Rules2E460E98FBDF296CF50748F35F942A65.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.acme.travels.IntrareCLE;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorE8274CD54C9AF925E1071A4FB5D6D690 implements org.drools.model.functions.Function1<org.acme.travels.IntrareCLE, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "D67EAD02810125168DCC087AB5730110";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(org.acme.travels.IntrareCLE _this) {
        return _this.getPlata();
    }
}
