package bo.ucb.edu.ingsoft.model;

import java.util.Date;

public class Contact extends Transaction {
    private Integer contactId;
    private String firstName;
    private String firstSurname;
    private Integer status;


    public Contact() {
    }


    public Contact(Integer contactId, String firstName, String firstSurname, Integer status) {
        this.contactId = contactId;
        this.firstName = firstName;
        this.firstSurname = firstSurname;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactId=" + contactId +
                ", firstName='" + firstName + '\'' +
                ", firstSurname='" + firstSurname + '\'' +
                ", status=" + status +
                '}';
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
