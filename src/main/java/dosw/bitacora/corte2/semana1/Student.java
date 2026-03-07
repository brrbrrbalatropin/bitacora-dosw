package dosw.bitacora.corte2.semana1;

import java.util.List;

public class Student {
    private String id;
    private String name;
    private String team; // "NARANJA", "AZUL", "VERDE"
    List<Grade> grades;

    public Student(String id, String name, String team) {
        this.id = id;
        this.name = name;
        this.team = team;
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

}