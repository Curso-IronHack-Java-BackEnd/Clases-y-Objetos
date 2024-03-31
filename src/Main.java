public class Main {
    public static void main(String[] args) {

        //Creamos 2 instancias de la clase Course, java y python y usamos sus metodos

        Course java = new Course(1, 25, "Desarrollo web con java");
        java.getDetails();
        java.changeData(23, "Introduccion a java");
        java.signUp(29);
        java.signUp(80);
        java.unEnroll(50);
        java.getDetails();

        Course python = new Course("Programacion en Python");
        python.getDetails();
        python.signUp(20);
        python.changeTitle("Programación avanzada en Python");
        python.getDetails();
    }
}