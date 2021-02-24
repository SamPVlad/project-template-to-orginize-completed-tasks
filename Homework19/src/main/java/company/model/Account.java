package company.model;

public class Account {

    private String gender;
    private String firstCustomerName;
    private String lastCustomerName;
    private String password;
    private String email;
    private String day;
    private String month;
    private String year;
    private String firstName;
    private String lastName;
    private String company;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String postcode;
    private String country;
    private String phone_mobile;
    private String alias;

    public static class AccountBuilder {
        private Account newAccount;

        public AccountBuilder() {
            newAccount = new Account();
        }

        public AccountBuilder withGender(String gender) {
            newAccount.gender = gender;
            return this;
        }

        public AccountBuilder withFirstNameCustomer(String firstCustomerName) {
            newAccount.firstCustomerName = firstCustomerName;
            return this;
        }

        public AccountBuilder withLastNameCustomer(String lastCustomerName) {
            newAccount.lastCustomerName = lastCustomerName;
            return this;
        }

        public AccountBuilder withPassword(String password) {
            newAccount.password = password;
            return this;
        }

        public AccountBuilder withEmail(String email) {
            newAccount.email = email;
            return this;
        }

        public AccountBuilder withBirthdayDay(String day) {
            newAccount.day = day;
            return this;
        }

        public AccountBuilder withBirthdayMonth(String month) {
            newAccount.month = month;
            return this;
        }

        public AccountBuilder withBirthdayYear(String year) {
            newAccount.year = year;
            return this;
        }

        public AccountBuilder withFirstNameAddress(String firstName) {
            newAccount.firstName = firstName;
            return this;
        }

        public AccountBuilder withLastNameAddress(String lastName) {
            newAccount.lastName = lastName;
            return this;
        }

        public AccountBuilder withCompany(String company) {
            newAccount.company = company;
            return this;
        }

        public AccountBuilder withAddress1(String address1) {
            newAccount.address1 = address1;
            return this;
        }

        public AccountBuilder withAddress2(String address2) {
            newAccount.address2 = address2;
            return this;
        }

        public AccountBuilder withCity(String city) {
            newAccount.city = city;
            return this;
        }

        public AccountBuilder withState(String state) {
            newAccount.state = state;
            return this;
        }

        public AccountBuilder withZipCode(String postcode) {
            newAccount.postcode = postcode;
            return this;
        }

        public AccountBuilder withCountry(String country) {
            newAccount.country = country;
            return this;
        }

        public AccountBuilder withPhoneMobile(String phone_mobile) {
            newAccount.phone_mobile = phone_mobile;
            return this;
        }

        public AccountBuilder withAliasAddress(String alias) {
            newAccount.alias = alias;
            return this;
        }

        public Account build() {
            return newAccount;
        }

    }

    public String getGender() {
        return gender;
    }

    public String getFirstNameCustomer() {
        return firstCustomerName;
    }

    public String getLastNameCustomer() {
        return lastCustomerName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getFirstNameAddress() {
        return firstName;
    }

    public String getLastNameAddress() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCountry() {
        return country;
    }

    public String getPhone_mobile() {
        return phone_mobile;
    }

    public String getAlias() {
        return alias;
    }

    public Account setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Account setFirstCustomerName(String firstCustomerName) {
        this.firstCustomerName = firstCustomerName;
        return this;
    }

    public Account setLastCustomerName(String lastCustomerName) {
        this.lastCustomerName = lastCustomerName;
        return this;
    }

    public Account setPass(String password) {
        this.password = password;
        return this;
    }

    public Account setEmail(String email) {
        this.email = email;
        return this;
    }

    public Account setDay(String day) {
        this.day = day;
        return this;
    }

    public Account setMonth(String month) {
        this.month = month;
        return this;
    }

    public Account setYear(String year) {
        this.year = year;
        return this;
    }

    public Account setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Account setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Account setCompany(String company) {
        this.company = company;
        return this;
    }

    public Account setAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    public Account setAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    public Account setCity(String city) {
        this.city = city;
        return this;
    }

    public Account setState(String state) {
        this.state = state;
        return this;
    }

    public Account setPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public Account setCountry(String country) {
        this.country = country;
        return this;
    }

    public Account setPhone_mobile(String phone_mobile) {
        this.phone_mobile = phone_mobile;
        return this;
    }

    public Account setAlias(String alias) {
        this.alias = alias;
        return this;
    }
}
