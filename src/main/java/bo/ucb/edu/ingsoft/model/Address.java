package bo.ucb.edu.ingsoft.model;

import java.util.Date;

public class Address {
    private Integer addressId;
    private String street;
    private String city;
    private String country;
    private Integer contactContactId;
    //    private Integer status;
    private Integer txId;
    private String txHost;
    private Integer txUserId;
    private Date txDate;

    public Address(Integer addressId, String street, String city, String country, Integer contactContactId, Integer txId, String txHost, Integer txUserId, Date txDate) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.country = country;
        this.contactContactId = contactContactId;
        this.txId = txId;
        this.txHost = txHost;
        this.txUserId = txUserId;
        this.txDate = txDate;
    }

    public Address() {
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getContactContactId() {
        return contactContactId;
    }

    public void setContactContactId(Integer contactContactId) {
        this.contactContactId = contactContactId;
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

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", contactContactId=" + contactContactId +
                ", txId=" + txId +
                ", txHost='" + txHost + '\'' +
                ", txUserId=" + txUserId +
                ", txDate=" + txDate +
                '}';
    }
}
