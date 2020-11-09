package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.AgendaBl;
import bo.ucb.edu.ingsoft.bl.TransactionBl;
import bo.ucb.edu.ingsoft.dto.ContactRequest;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/v1/contact")
public class ContactApi {

    private AgendaBl agendaBl;
    private TransactionBl transactionBl;

    private static final Logger LOGGER = LoggerFactory.getLogger(ContactApi.class);

    @Autowired
    public ContactApi(AgendaBl agendaBl, TransactionBl transactionBl) {
        this.agendaBl = agendaBl;
        this.transactionBl = transactionBl;
    }

//    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public Contact findById(HttpServletRequest request) {
//        return agendaBl.findContactById(1);
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String get() {
        return agendaBl.findAllStudents();
    }

//    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public Contact createContact(@RequestBody Contact contact, HttpServletRequest request) {
//        // Creamos transaccion para la operación.
//        Transaction transaction = TransactionUtil.createTransaction(request);
//        transactionBl.createTransaction(transaction);
//        Contact contactResponse = agendaBl.createContact(contact, transaction);
//        return contactResponse;
//    }
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ContactRequest createContactRequest(@RequestBody ContactRequest contact, HttpServletRequest request) {
        // Creamos transaccion para la operación.
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        return agendaBl.createContactRequest(contact, transaction);
    }
}
