package dosw.bitacora.corte2.semana1;

import java.util.List;

public class Student {
    private String id;
    private String name;
    private String team; // "NARANJA", "AZUL", "VERDE"
    private List<Grade> grades;


    public Student(String id, String name, String team, List<Grade> grades) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.grades = grades;
    }


    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
}