package Entites;

import jakarta.persistence.*;
import javax.annotation.processing.Generated;

@Entity
public class Customer {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "customerID", nullable = false)
        private int customerId;

        @Column(name = "firstName", length = 25, nullable = false)
        private String firstName;

        @Column(name = "lastName", length = 25, nullable = false)
        private String lastName;

        @Column(name = "address", length = 25, nullable = false)
        private String address;

        @Column(name = "email", length = 50, nullable = false)
        private String email;

        @Column(name = "password", length = 25, nullable = false)
        private String password;

        public Customer(){

        }

        public Customer(int Id, String firstName, String lastName, String address, String email, String password){
            this.customerId = Id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.email = email;
            this.password = password;
        }

        public int getCustomerId() {
            return customerId;
        }

        public void setCustomerId(int customerId) {
            this.customerId = customerId;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }


        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
}


