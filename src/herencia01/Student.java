package herencia01;

public class Student extends Person {
    //Atributos-atributes
    private int state;


    //Metodo-Function

    //toString
    @Override
    public String toString() {
        return
                super.toString() +
                "\nstate= " + state;
    }

    public void setState(int state) {
            if (state > 4 || state < 1) {
                this.state = 1;
            } else {
                this.state = state;
            }
    }
}
