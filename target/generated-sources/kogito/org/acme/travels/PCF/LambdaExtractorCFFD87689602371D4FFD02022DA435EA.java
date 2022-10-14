package org.acme.travels.PCF;

import static org.acme.travels.Rules2E460E98FBDF296CF50748F35F942A65.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.acme.travels.IntrareCLE;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorCFFD87689602371D4FFD02022DA435EA implements org.drools.model.functions.Function1<org.acme.travels.IntrareCLE, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "8550CFC469B4C17202A9E58A2F802444";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(org.acme.travels.IntrareCLE _this) {
        return _this.getVIN();
    }
}
