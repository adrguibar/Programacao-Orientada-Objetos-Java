package school;

public class Student implements Comparable<Student> {

    private String id;
    private String name;
    private double nota;

    Student(String id, String name, double nota) {
        this.id = id;
        this.name = name;
        this.nota = nota;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return String.format("Id: %s %nName: %s %nNota: %s", getId(), getName(), getNota());
    }

    @Override
    public int compareTo(Student s) {
        if (s == null) {
            return 1;
        }

        int comparacao = 0;
        double diferenca = nota - s.getNota();

        if (diferenca < 0) {
            comparacao += Math.floor(diferenca);
        } else {
            comparacao += Math.ceil(diferenca);
        }

        return comparacao;
    }
}
