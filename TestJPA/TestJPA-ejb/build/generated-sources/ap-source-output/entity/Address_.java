package entity;

import entity.Customer;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-03-26T17:02:32", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, String> zip;
    public static volatile SingularAttribute<Address, String> city;
    public static volatile SingularAttribute<Address, String> street;
    public static volatile SingularAttribute<Address, Customer> customerId;
    public static volatile SingularAttribute<Address, String> state;
    public static volatile SingularAttribute<Address, Integer> addressId;

}