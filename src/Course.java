public class Course {

    //Variables de la clase
    private int classId;
    private final int CAPACITY = 100;
    private int studentCount;
    private String title;

    //Constructores
    public Course (int classId, int studentCount, String title){
        this.classId = classId;
        this.studentCount = studentCount;
        this.title = title;
    }
    public Course (int studentCount, String title){
        classId = (int)(Math.random()*100+1);
        this.studentCount = studentCount;
        this.title = title;
    }
    public Course (String title){
        classId = (int)(Math.random()*100+1);
        studentCount = 0;
        this.title = title;
    }

    //Metodos

    public void changeData(int classId, String title){
        this.classId = classId;
        this.title = title;
        System.out.println("Datos cambiados con exito!!!");
        getDetails();
    }
    public void changeTitle(String title){
        this.title = title;
        System.out.println("Datos cambiados con exito!!!");
        getDetails();
    }

    public void signUp(int students){
        if (studentCount+students <= CAPACITY) {
            studentCount+= students;
            System.out.println(students + " alumnos se han registrado con exito en la clase de "+ title);
        }else {
            System.out.println("Se ha excedido el número máximo de estudiantes, no se ha podido hacer el registro");
        }
    }
    public void unEnroll(int students){
        if (studentCount-students >= 0) {
            studentCount-= students;
            System.out.println(students + " alumnos se han dado de baja con exito en la clase de "+ title);
        }else {
            System.out.println("No hay tantos alumnos inscritos en el curso, no se ha podido realizar la baja");
        }
    }

    public void getDetails() {

        System.out.println("======================= ");
        System.out.println("El Id de la clase es: "+ classId);
        System.out.println("La capacidad máxima de la clase es: "+ CAPACITY);
        System.out.println("El número actual de estudiantes es: "+ studentCount);
        System.out.println("El título a obtener es: "+ title.toUpperCase());
        System.out.println("======================= ");
    }

}
