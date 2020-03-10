package homework.epamspringboothw26.model;

import javax.persistence.*;

@Entity
@Table(name = "bills")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private int balance;
    @Column(name = "mail")
    private String userMail;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMail(String mail) {
        this.userMail = mail;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getUserMail() {
        return userMail;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + getId()+
                ", name='" + getName() + '\'' +
                ", balance=" + getBalance() +
                ", userMail='" + getUserMail() + '\'' +
                '}';
    }
}
