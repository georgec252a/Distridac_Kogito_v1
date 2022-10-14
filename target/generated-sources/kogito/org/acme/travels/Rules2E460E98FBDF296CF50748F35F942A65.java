package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import org.acme.travels.IntrareCLE;

public class Rules2E460E98FBDF296CF50748F35F942A65 implements org.drools.model.Model {

    public final static java.time.format.DateTimeFormatter DATE_TIME_FORMATTER = new java.time.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern(org.drools.util.DateUtils.getDateFormatMask()).toFormatter(java.util.Locale.ENGLISH);

    @Override
    public String getName() {
        return "org.acme.travels";
    }

    @Override
    public java.util.List<org.drools.model.EntryPoint> getEntryPoints() {
        return java.util.Collections.emptyList();
    }

    @Override
    public java.util.List<org.drools.model.Global> getGlobals() {
        return globals;
    }

    @Override
    public java.util.List<org.drools.model.TypeMetaData> getTypeMetaDatas() {
        return typeMetaDatas;
    }

    java.util.List<org.drools.model.Global> globals = java.util.Collections.emptyList();

    java.util.List<org.drools.model.TypeMetaData> typeMetaDatas = java.util.Collections.emptyList();

    /**
     * With the following expression ID:
     * org.drools.model.codegen.execmodel.generator.DRLIdGenerator@4618871c
     */
    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(Rules2E460E98FBDF296CF50748F35F942A65RuleMethods0.rule_Is_32adult(),
                                       Rules2E460E98FBDF296CF50748F35F942A65RuleMethods0.rule_Is_32VIN_32Valid(),
                                       Rules2E460E98FBDF296CF50748F35F942A65RuleMethods0.rule_Verifica_32locuri_32Compound(),
                                       Rules2E460E98FBDF296CF50748F35F942A65RuleMethods0.rule_Cont_32Valid(),
                                       Rules2E460E98FBDF296CF50748F35F942A65RuleMethods0.rule_Plata_32Valida());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return java.util.Collections.emptyList();
    }
}
