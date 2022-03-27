/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import entity.Address;
import entity.Customer;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author root
 */
@Stateless
@LocalBean
public class NewSessionBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
@PersistenceContext(unitName = "TestJPA-ejbPU")
EntityManager em;

public Collection<Address> getCustomerwiseAddresses(Integer custid)
{
    
    Customer c = (Customer) em.find(Customer.class, custid);
    
    return c.getAddressCollection();
    
}

public Collection getCustomers()
{
    return em.createNamedQuery("Customer.findAll").getResultList();
            }

}
