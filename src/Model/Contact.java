package Model;

public class Contact {
    private String name;
    private String phone;
    private String email;
    private String bookName;

    public Contact(String name, String phone, String email, String bookName) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.bookName = bookName;
    }

    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getBookName() { return bookName; }

    public void setName(String name) { this.name = name; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setEmail(String email) { this.email = email; }
    public void setBookName(String bookName) { this.bookName = bookName; }
}
