package explore.programing.java.database;

public class Customers {

    private String id, name, email;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString()
    {
        return "Id: " + this.getId()
                + ", Nama: " + this.getName() +
                ", Email: " + this.getEmail();
    }
}
