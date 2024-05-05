package org.example.dp.creational.builder;

public class Client {

    public static void main(String[] args) {

        Student.getBuilder().setStudentId("1").setStudentName("Arafat").setAge(9).build();

    }
}
