package org.acme.travels.PE7;

import static org.acme.travels.Rules2E460E98FBDF296CF50748F35F942A65.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.acme.travels.IntrareCLE;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorE7DF92B2466F7AD676CDB46E36C5CE68 implements org.drools.model.functions.Function1<org.acme.travels.IntrareCLE, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "65CB2428F42C21744B693B2CB670DCA2";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(org.acme.travels.IntrareCLE _this) {
        return _this.getCompoundOcupat();
    }
}
