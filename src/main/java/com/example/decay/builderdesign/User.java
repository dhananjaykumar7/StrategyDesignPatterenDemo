package com.example.decay.builderdesign;

public  class User {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phone;
    private final String address;
    private final int age;
    public User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.email = userBuilder.email;
        this.phone = userBuilder.phone;
        this.address = userBuilder.address;
        this.age = userBuilder.age;
    }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName +
                ", email=" + email + ", phone=" + phone + ", address=" + address +
                ", age=" + age + "]";
    }
    public static class UserBuilder {
        private final String firstName;  // Required Parameter
        private final String lastName;   // Required Parameter
        private String email;            // Optional
        private String phone;            // Optional
        private String address;          // Optional
        private int age;                 // Optional

        // Constructor for Required Fields
        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // Setter Methods (Returning Builder Itself)
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        // Build Method to Create User Object
        public User build() {
            return new User(this);
        }
    }

}
