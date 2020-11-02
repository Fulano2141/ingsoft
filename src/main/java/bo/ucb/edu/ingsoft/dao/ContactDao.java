package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.Address;
import bo.ucb.edu.ingsoft.dto.Contact;
import bo.ucb.edu.ingsoft.dto.ContactRequest;
import bo.ucb.edu.ingsoft.dto.Phone;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ContactDao {
    public Contact findByContactId(Integer contactId);
    public void createContact(Contact contact);
    public void createPhone(Phone phone);
    public void createAddress(Address address);

}
