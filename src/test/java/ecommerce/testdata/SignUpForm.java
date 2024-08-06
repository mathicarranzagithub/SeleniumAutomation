package ecommerce.testdata;

public class SignupForm {
    private String signupFirstName;
    private String signupLastName;
    private String mobileNumber;
    private String loginEmail;
    private String password;
    private String address;
    private String zipcode;
    private String state;
    private String city;

    // Constructor
    public SignupForm(String signupFirstName, String signupLastName, String mobileNumber, String loginEmail,
            String password, String address, String zipcode, String state, String city) {
        this.signupFirstName = signupFirstName;
        this.signupLastName = signupLastName;
        this.mobileNumber = mobileNumber;
        this.loginEmail = loginEmail;
        this.password = password;
        this.address = address;
        this.zipcode = zipcode;
        this.state = state;
        this.city = city;
    }

    // Getters
    public String getLoginEmail() {
        return loginEmail;
    }

    public String getPassword() {
        return password;
    }

    public String getSignupFirstName() {
        return signupFirstName;
    }

    public String getSignupLastName() {
        return signupLastName;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}
