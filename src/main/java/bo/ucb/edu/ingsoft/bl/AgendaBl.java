package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.ContactDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dto.Contact;
import bo.ucb.edu.ingsoft.dto.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaBl {
    private ContactDao contactDao;
    private TransactionDao transactionDao;

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
        contactDao.create(contact);
        Integer getLastId = transactionDao.getLastInsertId();
        contact.setContactId(getLastId);
        return contact;
    }
}
