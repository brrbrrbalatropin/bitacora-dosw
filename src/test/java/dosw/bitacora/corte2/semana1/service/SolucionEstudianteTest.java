package dosw.bitacora.corte2.semana1.service;

import dosw.bitacora.corte2.semana1.Grade;
import org.junit.jupiter.api.Test;
import dosw.bitacora.corte2.semana1.Student;
import dosw.bitacora.corte2.semana1.SolucionEstudiante;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolucionEstudianteTest {
    @Test
    void pruebaNaranja(){
        SolucionEstudiante solucion = new SolucionEstudiante();
        Student s1 = new Student("1","Juan","NARANJA", null);
        Student s2 = new Student("2","Pedro","AZUL", null);
        Student s3 = new Student("3","Paco","NARANJA", null);
        Student s4 = new Student("4","Juanito Alcachofa", "NARANJA", null);

        List<Student> estudiantes = List.of(s1, s2,s3,s4);

        List<Student> resultado = solucion.filtrarPorEquipo(estudiantes, "NARANJA");

        assertEquals(3, resultado.size());
    }

    @Test
    void pruebaOrdenador(){
        SolucionEstudiante solucion = new SolucionEstudiante();
        Student s1 = new Student("1","Juan","NARANJA", null);
        Student s2 = new Student("2","Pedro","AZUL", null);
        Student s3 = new Student("3","Paco","NARANJA", null);
        Student s4 = new Student("4","Juanito Alcachofa", "NARANJA", null);

        List<Student> estudiantes = List.of(s1, s2,s3,s4);

        List<String> resultado = solucion.ordenaEstudiantes(estudiantes);

        assertEquals(List.of("Juan","Juanito Alcachofa","Paco","Pedro"),resultado);
    }

    @Test
    void PruebaPromedioGeneral(){
        SolucionEstudiante solucion = new SolucionEstudiante();
        Grade g1 = new Grade("DOSW", 3.7, LocalDate.of(2026,3,7));
        Grade g2 = new Grade("DOSW", 4.5, LocalDate.of(2026,3,7));
        Grade g3 = new Grade("DOSW", 2.0, LocalDate.of(2026,3,7));
        Grade g4 = new Grade("DOSW", 1.7, LocalDate.of(2026,3,7));

        List<Grade> notas = List.of(g1, g2,g3,g4);

        double resultado = solucion.promedioEstudiantes(notas);
        assertEquals(2.975,resultado);

    }

    @Test
    void pruebaPromedioPorMateria(){
        SolucionEstudiante solucion = new SolucionEstudiante();

        Student s1 = new Student("1", "Juan", "NARANJA", List.of(
                new Grade("DOSW", 4.0, LocalDate.of(2026, 3, 7)),
                new Grade("DOSW", 2.0, LocalDate.of(2026, 3, 7)),
                new Grade("BD", 3.0, LocalDate.of(2026, 3, 7)),
                new Grade("BD", 5.0, LocalDate.of(2026, 3, 7))
        ));

        Map<String, Double> resultado = solucion.promedioPorMateria(s1);

        assertEquals(3.0, resultado.get("DOSW"));
        assertEquals(4.0, resultado.get("BD"));
    }

    @Test
    void PruebaEstudiantePromedioMasAlto(){
        SolucionEstudiante solucion = new SolucionEstudiante();
        Student s1 = new Student("1", "Juan", "NARANJA", List.of(
                new Grade("DOSW", 3.7, LocalDate.of(2026, 3, 7)),
                new Grade("BD", 4.5, LocalDate.of(2026, 3, 7)),
                new Grade("REDES", 4.5, LocalDate.of(2026, 3, 7))
        ));

        Student s2 = new Student("2", "Pedro","AZUL", List.of(
                new Grade("DOSW", 3.9, LocalDate.of(2026, 3, 7)),
                new Grade("BD", 2.7, LocalDate.of(2026, 3, 7)),
                new Grade("REDES", 4.4, LocalDate.of(2026, 3, 7))
        ));

        Student s3 = new Student("3","Paco","NARANJA", List.of(
                new Grade("DOSW", 3.8, LocalDate.of(2026, 3, 7)),
                new Grade("BD", 3.2, LocalDate.of(2026, 3, 7)),
                new Grade("REDES", 4.0, LocalDate.of(2026, 3, 7))
        ));

        Student s4 = new Student("4","Juanito Alcachofa","NARANJA", List.of(
                new Grade("DOSW", 2.3, LocalDate.of(2026, 3, 7)),
                new Grade("BD", 3.1, LocalDate.of(2026, 3, 7)),
                new Grade("REDES", 3.0, LocalDate.of(2026, 3, 7))
        ));

        List<Student> estudiantes = List.of(s1, s2,s3,s4);

        Student resultado = solucion.promedioMasAlto(estudiantes);
        assertEquals(s1, resultado);
    }

    @Test
    void pruebaMateriasPerdidas(){
        SolucionEstudiante solucion = new SolucionEstudiante();

        Student s1 = new Student("1", "Juan", "NARANJA", List.of(
                new Grade("DOSW", 2.0, LocalDate.of(2026, 3, 7)),
                new Grade("BD", 4.0, LocalDate.of(2026, 3, 7))
        ));

        Student s2 = new Student("2", "Pedro", "NARANJA", List.of(
                new Grade("DOSW", 1.5, LocalDate.of(2026, 3, 7)),
                new Grade("BD", 4.5, LocalDate.of(2026, 3, 7))
        ));

        Student s3 = new Student("3", "Ana", "AZUL", List.of(
                new Grade("DOSW", 1.0, LocalDate.of(2026, 3, 7)),
                new Grade("BD", 1.0, LocalDate.of(2026, 3, 7))
        ));

        List<Student> estudiantes = List.of(s1, s2, s3);

        Map<String, Long> resultado = solucion.materiasPerdidas(estudiantes);

        assertEquals(2L, resultado.get("NARANJA"));
        assertEquals(2L, resultado.get("AZUL"));
    }
}
