public abstract class Person extends Account {
    private String name;
    private Address address;
    private String email;
    private String phone;
    private Account account;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for address
    public Address getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(Address address) {
        this.address = address;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for phone
    public String getPhone() {
        return phone;
    }

    // Setter for phone
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Getter for account
    public Account getAccount() {
        return account;
    }

    // Setter for account
    public void setAccount(Account account) {
        this.account = account;
    }
}

