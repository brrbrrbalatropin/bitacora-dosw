package dosw.bitacora.corte2.semana1.service;

import org.junit.jupiter.api.Test;
import dosw.bitacora.corte2.semana1.Student;
import dosw.bitacora.corte2.semana1.SolucionEstudiante;

import java.util.List;


public class SolucionEstudianteTest {
    @Test
    void PruebaNaranja(){
        Student s1 = new Student();
        s1.id = "1";
        s1.name = "Juan";
        s1.team = "NARANJA";

        Student s2 = new Student();
        s2.id = "2";
        s2.name = "Pedro";
        s2.team = "AZUL";
        List<Student> estudiantes = List.of(s1, s2);
    }
}
