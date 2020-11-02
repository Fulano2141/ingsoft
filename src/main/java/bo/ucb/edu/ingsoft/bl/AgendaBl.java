package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.api.ContactApi;
import bo.ucb.edu.ingsoft.dao.ContactDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendaBl {
    private ContactDao contactDao;
    private TransactionDao transactionDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(AgendaBl.class);

    @Autowired
    public AgendaBl(ContactDao contactDao, TransactionDao transactionDao) {
        this.contactDao = contactDao;
        this.transactionDao = transactionDao;
    }

    public Contact findContactById(Integer contactId) {
        return contactDao.findByContactId(contactId);
    }


    public String findAllStudents() {
//        Optional<Student> result = studentRepository.findById(studentId);
//        if (result.isPresent()) {
//            return result.get();
//        } else {
//            throw new RuntimeException("No existe un contacto para la llave primaria: " + studentId);
//        }
//        List result = jdbcTemplate.query("SELECT * FROM student",
//                new Object[]{}, (resultSet, i) -> {
//                    Student student = new Student();
//                    student.setContactId(resultSet.getInt(1));
//                    student.setFullName(resultSet.getString(2));
//                    return student;
//                });
//        return result.toString();
        return "EN DESARROLLO";
    }

    public Contact createContact(Contact contact, Transaction transaction) {
        contact.setTxId(transaction.getTxId());
        contact.setTxUserId(transaction.getTxUserId());
        contact.setTxHost(transaction.getTxHost());
        contact.setTxDate(transaction.getTxDate());
        contactDao.createContact(contact);
        Integer getLastId = transactionDao.getLastInsertId();
        contact.setContactId(getLastId);
        return contact;
    }

    public ContactRequest createContactRequest(ContactRequest contactRequest, Transaction transaction) {
        contactRequest.setTxId(transaction.getTxId());
        contactRequest.setTxUserId(transaction.getTxUserId());
        contactRequest.setTxHost(transaction.getTxHost());
        contactRequest.setTxDate(transaction.getTxDate());
        LOGGER.debug(contactRequest.toString());

        Contact contact1 = new Contact(null, contactRequest.getFirstName(), contactRequest.getFirstSurname(), 1, contactRequest.getTxId(), contactRequest.getTxHost(), contactRequest.getTxUserId(), contactRequest.getTxDate());
        contactDao.createContact(contact1);
        Integer getLastId = transactionDao.getLastInsertId();
        contact1.setContactId(getLastId);
        contactRequest.setContactId(getLastId);
        LOGGER.warn(contact1.toString());

        Phone phone = new Phone(null, contactRequest.getPhoneNumber(), contact1.getContactId(), 1, contactRequest.getTxId(), contactRequest.getTxHost(), contactRequest.getTxUserId(), contactRequest.getTxDate());
        contactDao.createPhone(phone);
        getLastId = transactionDao.getLastInsertId();
        phone.setPhoneId(getLastId);
        LOGGER.debug(phone.toString());

        Address address = new Address(null, contactRequest.getAddressStreet(), contactRequest.getAddressCity(), contactRequest.getAddressCountry(), contactRequest.getContactId(), contactRequest.getTxId(), contactRequest.getTxHost(), contactRequest.getTxUserId(), contactRequest.getTxDate());
        contactDao.createAddress(address);
        getLastId = transactionDao.getLastInsertId();
        address.setAddressId(getLastId);
        LOGGER.debug(address.toString());


        return contactRequest;
    }
}
