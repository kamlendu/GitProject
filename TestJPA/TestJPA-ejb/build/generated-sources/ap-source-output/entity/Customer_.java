package entity;

import entity.Address;
import entity.Subscription;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-03-26T17:02:32", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> firstName;
    public static volatile SingularAttribute<Customer, String> lastName;
    public static volatile CollectionAttribute<Customer, Subscription> subscriptionCollection;
    public static volatile CollectionAttribute<Customer, Address> addressCollection;
    public static volatile SingularAttribute<Customer, Integer> customerID;

}