package herencia01;

public class Person {
    //Atributos-atributes
    private String name;
    private int phoneNumber;
    private String addres;
    private String mail;

    public  Person() {

    }
    //toString

    @Override
    public String toString() {
        return
                "name= " + name + '\n' +
                "addres= " + addres + '\n' +
                "mail= " + mail + '\n' +
                "phoneNumber= " + phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
