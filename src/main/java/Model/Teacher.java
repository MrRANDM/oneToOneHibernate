package Model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "Teacher")
public class Teacher {
    @Id
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Column(name = "id")
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer teacherId;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "student_id")
    private Integer StudentId;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id", insertable = false, updatable = false)
    private Student student;

    public Teacher() {
    }

    public Integer getStudentId() {
        return StudentId;
    }

    public void setStudentId(Integer studentId) {
        StudentId = studentId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
//    private List<Course> courses;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public List<Course> getCourses() {
//        return courses;
//    }
//
//
//    public void setCourses(List<Course> courses) {
//        this.courses = courses;
//    }
}
