package dosw.bitacora.corte2.semana1;

import java.util.List;
import java.util.Objects;

public class SolucionEstudiante {

    public List<Student> filtrarPorEquipo(List<Student> estudiantes, String equipo){
        estudiantes = estudiantes.stream()
                .filter(student -> equipo.equals(student.getTeam()))
                .toList();
        return estudiantes;
    }

    public List<Student> ordenaEstudiantes(List<Student> estudiantes){
        estudiantes = estudiantes.stream()
                .sorted()
                .toList();
        return estudiantes;
    }
}
