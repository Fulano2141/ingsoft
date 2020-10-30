package bo.ucb.edu.ingsoft.dto;

public class ContactRequest {
    private String firstName;
    private String firstSurname;
    private String phoneNumber;
    private String addressStreet;
    private String addressCity;
    private String addressCountry;

    public ContactRequest() {
    }

    public ContactRequest(String firstName, String firstSurname, String phoneNumber, String addressStreet, String addressCity, String addressCountry) {
        this.firstName = firstName;
        this.firstSurname = firstSurname;
        this.phoneNumber = phoneNumber;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
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
