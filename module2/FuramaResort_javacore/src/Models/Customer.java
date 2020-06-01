package Models;

public class Customer {
    private String name;
    private String birthday;
    private String gender;
    private long phone;
    private long identityCard;
    private String email;
    private String typeCustomer;
    private String address;
    private Services services;

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public long getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(long identityCard) {
        this.identityCard = identityCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public void showInfor() {
    }
    public int getYearBirthday() {
        String temp = "";
        for (int i = birthday.length() - 4; i < birthday.length(); i++) {
            temp += birthday.charAt(i);
        }
        return new Integer(temp);
    }
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender=" + gender +
                ", phone=" + phone +
                ", identityCard=" + identityCard +
                ", email='" + email + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                ", services=" + services +
                '}';
    }
}
