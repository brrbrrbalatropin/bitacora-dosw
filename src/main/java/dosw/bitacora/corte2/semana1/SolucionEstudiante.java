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

    public Map<String,Long> materiasPerdidas(List<Student> estudiantes){
        Map<String,Long> resultado = estudiantes.stream()
                .collect(Collectors.groupingBy(student -> student.getTeam(),Collectors.summingLong(student -> student.getGrades().stream().filter(grade -> !grade.isPassed()).count())));
        return resultado;
    }

    public List<Student> top3Aprobados(List<Student> estudiantes){
        List<Student> resultado = estudiantes.stream()
                .sorted(Comparator.comparingLong((Student student) ->
                        student.getGrades().stream()
                                .filter(grade -> grade.isPassed())
                                .count()).reversed())
                .limit(3)
                .toList();
        return resultado;
    }

    public Map<String, List<Student>> agruparPorEstado(List<Student> estudiantes){
        Map<String, List<Student>> resultado = estudiantes.stream()
                .collect(Collectors.groupingBy(student -> {
                    double promedio = promedioEstudiantes(student.getGrades());
                    if(promedio >= 4.5) return "ALTO RENDIMIENTO"; //Perdone profe el if y else if pero sino no tengo idea, ademas recien leí que no se valia usar if else
                    else if(promedio >= 3.5) return "REGULAR";
                    else return "RIESGO";
                }));
        return resultado;
    }

    public String masReprobados(List<Student> estudiantes){
        String resultado = estudiantes.stream()
                .flatMap(student -> student.getGrades().stream())
                .filter(grade -> !grade.isPassed())
                .collect(Collectors.groupingBy(Grade::getSubject, Collectors.counting()))
                .entrySet().stream() // Convierte un map en un set al que se le pueden aplicar streams
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        return resultado;
    }
}
