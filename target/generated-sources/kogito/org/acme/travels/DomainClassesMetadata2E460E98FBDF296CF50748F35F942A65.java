package org.acme.travels;
public class DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65 {

    public static final org.drools.model.DomainClassMetadata org_acme_travels_IntrareCLE_Metadata_INSTANCE = new org_acme_travels_IntrareCLE_Metadata();
    private static class org_acme_travels_IntrareCLE_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.acme.travels.IntrareCLE.class;
        }

        @Override
        public int getPropertiesSize() {
            return 11;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "VIN": return 0;
                case "VINok": return 1;
                case "compoundFull": return 2;
                case "compoundOcupat": return 3;
                case "contDestinatar": return 4;
                case "contDestinatarOK": return 5;
                case "neafectat": return 6;
                case "plata": return 7;
                case "plataOK": return 8;
                case "stocareCLE": return 9;
                case "stocareCompound": return 10;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class org.acme.travels.IntrareCLE");
        }
    }

    public static final org.drools.model.DomainClassMetadata org_acme_travels_Person_Metadata_INSTANCE = new org_acme_travels_Person_Metadata();
    private static class org_acme_travels_Person_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.acme.travels.Person.class;
        }

        @Override
        public int getPropertiesSize() {
            return 3;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "adult": return 0;
                case "age": return 1;
                case "name": return 2;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class org.acme.travels.Person");
        }
    }

}