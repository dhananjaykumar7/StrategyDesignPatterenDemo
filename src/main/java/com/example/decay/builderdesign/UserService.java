package com.example.decay.builderdesign;

public class UserService {
    public static void main(String[] args) {
        // Creating User with Required Fields Only
        User user1 = new User.UserBuilder("John", "Doe")
                .email("john.doe@example.com")
                .phone("123-456-7890")
                .build();

        // Creating User with All Fields
        User user2 = new User.UserBuilder("Alice", "Smith")
                .email("alice.smith@example.com")
                .phone("987-654-3210")
                .address("123 Main St, New York")
                .age(30)
                .build();

        System.out.println(user1);
        System.out.println(user2);
    }
}