package org.acme.travels.P81;

import static org.acme.travels.Rules2E460E98FBDF296CF50748F35F942A65.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.acme.travels.IntrareCLE;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor811B81A535BB1BE0D6FA109AB4A7A673 implements org.drools.model.functions.Function1<org.acme.travels.IntrareCLE, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "ADFFD79C61F5BC95EE1BC6451E1EECD7";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.String apply(org.acme.travels.IntrareCLE _this) {
        return _this.getContDestinatar();
    }
}
