package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.Address;
import bo.ucb.edu.ingsoft.model.Contact;
import bo.ucb.edu.ingsoft.model.Phone;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ContactDao {
    public Contact findByContactId(Integer contactId);
    public void createContact(Contact contact);
    public void createPhone(Phone phone);
    public void createAddress(Address address);

}
