package dosw.bitacora.corte2.semana1.service;

import dosw.bitacora.corte2.semana1.Grade;
import org.junit.jupiter.api.Test;
import dosw.bitacora.corte2.semana1.Student;
import dosw.bitacora.corte2.semana1.SolucionEstudiante;

import java.time.LocalDate;
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

    @Test
    void PruebaPromedioGeneral(){
        SolucionEstudiante solucion = new SolucionEstudiante();
        Grade g1 = new Grade("DOSW", 3.7, LocalDate.of(2026,3,7), true );
        Grade g2 = new Grade("DOSW", 4.5, LocalDate.of(2026,3,7), true );
        Grade g3 = new Grade("DOSW", 2.0, LocalDate.of(2026,3,7),false );
        Grade g4 = new Grade("DOSW", 1.7, LocalDate.of(2026,3,7), false );

        List<Grade> notas = List.of(g1, g2,g3,g4);

        double resultado = solucion.promedioEstudiantes(notas);
        assertEquals(2.975,resultado);

    }
}
