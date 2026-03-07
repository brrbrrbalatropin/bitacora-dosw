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

    public List<String> ordenaEstudiantes(List<Student> estudiantes){
        List<String> resultado = estudiantes.stream()
                .map(Student ::getName)
                .sorted()
                .toList();
        return resultado;
    }

    public double promedioEstudiantes(List<Grade> notas){
        double resultado = notas.stream()
                .mapToDouble(Grade :: getScore)
                .average()
                .orElse(0.0); //si es nulo da cero
        return resultado;
    }

}
