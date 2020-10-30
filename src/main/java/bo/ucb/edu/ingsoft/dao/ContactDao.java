package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.Contact;
import bo.ucb.edu.ingsoft.dto.ContactRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ContactDao {
    public Contact findByContactId(Integer contactId);

    public void create(Contact contact);

    public void insertAllData(ContactRequest contactRequest);
}
