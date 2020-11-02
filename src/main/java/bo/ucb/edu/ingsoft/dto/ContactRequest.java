package bo.ucb.edu.ingsoft.dto;

import java.util.Date;

public class ContactRequest {
    private Integer contactId;
    private String firstName;
    private String firstSurname;
    private String phoneNumber;
    private String addressStreet;
    private String addressCity;
    private String addressCountry;
    private Integer status;
    private Integer txId;
    private String txHost;
    private Integer txUserId;
    private Date txDate;

    public ContactRequest() {
    }

    public ContactRequest(Integer contactId, String firstName, String firstSurname, String phoneNumber, String addressStreet, String addressCity, String addressCountry) {
        this.contactId = contactId;
        this.firstName = firstName;
        this.firstSurname = firstSurname;
        this.phoneNumber = phoneNumber;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTxId() {
        return txId;
    }

    public void setTxId(Integer txId) {
        this.txId = txId;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public Integer getTxUserId() {
        return txUserId;
    }

    public void setTxUserId(Integer txUserId) {
        this.txUserId = txUserId;
    }

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }
    /*

    {
  "firstName": "Juan",
  "firstSurname": "Perez",
  "phoneNumber": "70834566",
  "addresStreet": "14 de septiembre",
  "addresCity": "La Paz",
  "addresCoutry": "Bolivia"
}
     */
}
