package com.mohamedmohsen.designpatterns.creational.builder;

class User {

    private final String name;
    private final String email;
    private final String password;
    private final String country;
    private final String city;
    private final String phone;

    private User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.password = builder.password;
        this.country = builder.country;
        this.city = builder.city;
        this.phone = builder.phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    static class Builder {

        private String name;
        private String email;
        private String password;
        private String country;
        private String city;
        private String phone;

        public User build() {
            return new User(this);
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }
    }
}