package Model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @Column(name = "id")
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "teacher_Id")
    private Integer teacherId;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "teacher_Id", insertable = false, updatable = false)
    private Teacher teacher;

    public Student() {
    }

    public Student(String name, String email, Integer TeacherId) {

    }


    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Integer getTeacherId() {
        return teacherId;
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacherId(Integer teacherId) {
        teacherId = teacherId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
