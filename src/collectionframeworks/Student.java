package collectionframeworks;

import java.util.Comparator;

class Asc implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(), o2.getId());


    }

}

class SortbyName implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());


    }

}

public class Student implements Comparable<Student> {

    public Student(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Integer id;
    String name;

    public String toString(){
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    //@Override
    //public int compareTo(Comparator o) {
     //   return Integer.compare(this.id, o.id);

    @Override
    public int compareTo(Student o) {
        return CharSequence.compare(this.name, o.name);

    }
}
