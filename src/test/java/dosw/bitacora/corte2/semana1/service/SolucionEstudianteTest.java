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
        Student s1 = new Student();
        s1.id = "1";
        s1.name = "Juan";
        s1.team = "NARANJA";

        Student s2 = new Student();
        s2.id = "2";
        s2.name = "Pedro";
        s2.team = "AZUL";

        Student s3 = new Student();
        s3.id = "3";
        s3.name = "Paco";
        s3.team = "NARANJA";

        Student s4 = new Student();
        s4.id = "4";
        s4.name = "Juanito Alcachofa";
        s4.team = "NARANJA";

        List<Student> estudiantes = List.of(s1, s2,s3,s4);

        List<Student> resultado = solucion.filtrarPorEquipo(estudiantes, "NARANJA");

        assertEquals(3, resultado.size());
    }
}
