package org.example.dp.creational.builder;

public class Student {

    private String studentId;
    private String studentName;
    private int age;
    private Student(Builder builder){

        if(builder.age < 10) {
            System.out.println("He/She is not eligible to join in this school");
        }

        this.studentId = builder.studentId;
        this.studentName = builder.studentName;
        this.age = builder.age;

    }

    // getBuilder method helps to create a Builder object from Student class
    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{

        private String studentId;
        private String studentName;
        private int age;

        public String getStudentId() {
            return studentId;
        }

        public Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public String getStudentName() {
            return studentName;
        }

        public Builder setStudentName(String studentName) {
            this.studentName = studentName;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public void build(){
            new Student(this);
        }


    }

}
