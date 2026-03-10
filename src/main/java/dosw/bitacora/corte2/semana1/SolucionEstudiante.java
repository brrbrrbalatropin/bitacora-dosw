package dosw.bitacora.corte2.semana1;

import java.util.*;
import java.util.stream.Collectors;

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

    public Map<String,Double> promedioPorMateria(Student estudiante){
        Map<String,Double> resultado = estudiante.getGrades().stream()
                .collect(Collectors.groupingBy(grade -> grade.getSubject(),Collectors.averagingDouble(grade -> grade.getScore())));
        return resultado;
    }


    public double promedioEstudiantes(List<Grade> notas){
        double resultado = notas.stream()
                .mapToDouble(Grade :: getScore)
                .average()
                .orElse(0.0); //si es nulo da cero
        return resultado;
    }

        public Student promedioMasAlto(List<Student> estudiantes){
            Student resultado = estudiantes.stream()
                    .max(Comparator.comparingDouble(student -> this.promedioEstudiantes(student.getGrades())))
                    .orElse(null);
            return resultado;
        }
}
