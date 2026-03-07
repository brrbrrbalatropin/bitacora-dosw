package dosw.bitacora.corte2.semana1.service;

import org.junit.jupiter.api.Test;
import dosw.bitacora.corte2.semana1.Student;
import dosw.bitacora.corte2.semana1.SolucionEstudiante;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolucionEstudianteTest {
    @Test
    void pruebaNaranja(){
        SolucionEstudiante solucion = new SolucionEstudiante();
        Student s1 = new Student("1","Juan","NARANJA");
        Student s2 = new Student("2","Pedro","AZUL");
        Student s3 = new Student("3","Paco","NARANJA");
        Student s4 = new Student("4","Juanito Alcachofa", "NARANJA");

        List<Student> estudiantes = List.of(s1, s2,s3,s4);

        List<Student> resultado = solucion.filtrarPorEquipo(estudiantes, "NARANJA");

        assertEquals(3, resultado.size());
    }

    @Test
    void pruebaOrdenador(){
        SolucionEstudiante solucion = new SolucionEstudiante();
        Student s1 = new Student("1","Juan","NARANJA");
        Student s2 = new Student("2","Pedro","AZUL");
        Student s3 = new Student("3","Paco","NARANJA");
        Student s4 = new Student("4","Juanito Alcachofa", "NARANJA");

        List<Student> estudiantes = List.of(s1, s2,s3,s4);

        List<String> resultado = solucion.ordenaEstudiantes(estudiantes);

        assertEquals(List.of("Juan","Juanito Alcachofa","Paco","Pedro"),resultado);
    }
}
