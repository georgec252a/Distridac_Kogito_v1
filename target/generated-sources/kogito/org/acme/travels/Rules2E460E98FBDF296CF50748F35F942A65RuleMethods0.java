package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import org.acme.travels.IntrareCLE;
import static org.acme.travels.Rules2E460E98FBDF296CF50748F35F942A65.*;

public class Rules2E460E98FBDF296CF50748F35F942A65RuleMethods0 {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P02.LambdaPredicate0238A52B29B856ED88E7804E78C8FC08.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P82.LambdaExtractor8240E7ED90AEBE615B797DBA67B70574.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P64.LambdaConsequence64191CC69F8D52BCEA8D347489259D16.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Is VIN Valid
     */
    public static org.drools.model.Rule rule_Is_32VIN_32Valid() {
        final org.drools.model.Variable<org.acme.travels.IntrareCLE> var_$intrareCLE = D.declarationOf(org.acme.travels.IntrareCLE.class,
                                                                                                       DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_IntrareCLE_Metadata_INSTANCE,
                                                                                                       "$intrareCLE");
        final org.drools.model.BitMask mask_$intrareCLE = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_IntrareCLE_Metadata_INSTANCE,
                                                                                                  "VINok");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is VIN Valid")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "IntrareCLE")
                                      .build(D.pattern(var_$intrareCLE).expr("GENERATED_D278D6113A9635D3261E536986845F0C",
                                                                             org.acme.travels.PBC.LambdaPredicateBC23E4ECD33BCEC5B87EAA61C790C8E9.INSTANCE,
                                                                             D.alphaIndexedBy(int.class,
                                                                                              org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                              DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_IntrareCLE_Metadata_INSTANCE.getPropertyIndex("VIN"),
                                                                                              org.acme.travels.PCF.LambdaExtractorCFFD87689602371D4FFD02022DA435EA.INSTANCE,
                                                                                              100),
                                                                             D.reactOn("VIN")),
                                             D.on(var_$intrareCLE).execute(org.acme.travels.PCD.LambdaConsequenceCD749960B26E7D97B245A36B90A68FC4.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Verifica locuri Compound
     */
    public static org.drools.model.Rule rule_Verifica_32locuri_32Compound() {
        final org.drools.model.Variable<org.acme.travels.IntrareCLE> var_$intrareCLE = D.declarationOf(org.acme.travels.IntrareCLE.class,
                                                                                                       DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_IntrareCLE_Metadata_INSTANCE,
                                                                                                       "$intrareCLE");
        final org.drools.model.BitMask mask_$intrareCLE = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_IntrareCLE_Metadata_INSTANCE,
                                                                                                  "compoundFull");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Verifica locuri Compound")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "VerificareCompound")
                                      .build(D.pattern(var_$intrareCLE).expr("GENERATED_F52230A54415FAA780CBC632CADA4C0A",
                                                                             org.acme.travels.P4D.LambdaPredicate4D0036B0F5FB995C11008CA9B2C2A398.INSTANCE,
                                                                             D.alphaIndexedBy(int.class,
                                                                                              org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                              DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_IntrareCLE_Metadata_INSTANCE.getPropertyIndex("compoundOcupat"),
                                                                                              org.acme.travels.PE7.LambdaExtractorE7DF92B2466F7AD676CDB46E36C5CE68.INSTANCE,
                                                                                              10),
                                                                             D.reactOn("compoundOcupat")),
                                             D.on(var_$intrareCLE).execute(org.acme.travels.P06.LambdaConsequence0614E28C9417A5E19F213BF9F503232C.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Cont Valid
     */
    public static org.drools.model.Rule rule_Cont_32Valid() {
        final org.drools.model.Variable<org.acme.travels.IntrareCLE> var_$intrareCLE = D.declarationOf(org.acme.travels.IntrareCLE.class,
                                                                                                       DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_IntrareCLE_Metadata_INSTANCE,
                                                                                                       "$intrareCLE");
        final org.drools.model.BitMask mask_$intrareCLE = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_IntrareCLE_Metadata_INSTANCE,
                                                                                                  "contDestinatarOK");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Cont Valid")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "VerificareCont")
                                      .build(D.pattern(var_$intrareCLE).expr("GENERATED_2FCAB2D1088A47357B16DCA283CF77CA",
                                                                             org.acme.travels.P0D.LambdaPredicate0D7D10C2572DC476C69A8CDDDBFA101D.INSTANCE,
                                                                             D.alphaIndexedBy(java.lang.String.class,
                                                                                              org.drools.model.Index.ConstraintType.EQUAL,
                                                                                              DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_IntrareCLE_Metadata_INSTANCE.getPropertyIndex("contDestinatar"),
                                                                                              org.acme.travels.P81.LambdaExtractor811B81A535BB1BE0D6FA109AB4A7A673.INSTANCE,
                                                                                              "aaaa"),
                                                                             D.reactOn("contDestinatar")),
                                             D.on(var_$intrareCLE).execute(org.acme.travels.PC1.LambdaConsequenceC1BC02FC19CA90299AE1275AA4719B01.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Plata Valida
     */
    public static org.drools.model.Rule rule_Plata_32Valida() {
        final org.drools.model.Variable<org.acme.travels.IntrareCLE> var_$intrareCLE = D.declarationOf(org.acme.travels.IntrareCLE.class,
                                                                                                       DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_IntrareCLE_Metadata_INSTANCE,
                                                                                                       "$intrareCLE");
        final org.drools.model.BitMask mask_$intrareCLE = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_IntrareCLE_Metadata_INSTANCE,
                                                                                                  "plataOK");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Plata Valida")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "VerificarePlata")
                                      .build(D.pattern(var_$intrareCLE).expr("GENERATED_AEB75E12341F36635B21438EBB3E0790",
                                                                             org.acme.travels.P27.LambdaPredicate2767E59C9BB069B7A82959F9CFBEDA1F.INSTANCE,
                                                                             D.alphaIndexedBy(int.class,
                                                                                              org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                              DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_IntrareCLE_Metadata_INSTANCE.getPropertyIndex("plata"),
                                                                                              org.acme.travels.PE8.LambdaExtractorE8274CD54C9AF925E1071A4FB5D6D690.INSTANCE,
                                                                                              0),
                                                                             D.reactOn("plata")),
                                             D.on(var_$intrareCLE).execute(org.acme.travels.P78.LambdaConsequence783B941B32F51A7E4E3606AEACAC7B46.INSTANCE));
        return rule;
    }
}
