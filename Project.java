package com.company;


import java.util.Scanner;

public class Project {

    String name, designation, password;
    float dues, paidDues;

    public Project() {

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Project admin = new Project();
        Project accountant = new Project();
        Project student = new Project();
        admin.name = "Amartya Mukherjee";
        admin.designation = "admin";
        admin.password = "amartya811";
        String input;
        int a = 0;
        String user = sc.next();
        String password;
        while (true) {
            if (user.toLowerCase().equals("admin")) {
                while (a < 3) {
                    password = sc.nextLine();
                    if (password.equals(admin.password)) {
                        while (true) {
                            System.out.println("What operation would you like to perform on Accountant?\n1. Add\n2. View\n3. Edit\n4. Delete");
                            input = sc.next();
                            if (input.toLowerCase().equals("add")) {

                                accountant.name = sc.nextLine();
                                accountant.designation = "accountant";
                                accountant.password = "password";
                            } else if (input.toLowerCase().equals("view")) {
                                System.out.println(accountant.name);
                                System.out.println(accountant.designation);
                                System.out.println(accountant.password);
                            } else if (input.toLowerCase().equals("edit")) {
                                accountant.name = sc.nextLine();
                                accountant.designation = "accountant";
                                accountant.password = sc.nextLine();
                            } else if (input.toLowerCase().equals("delete")) {
                                accountant = null;
                            } else {
                                System.out.println("Wrong input!");
                                break;
                            }

                        }
                        a += 1;
                    } else {
                        a += 1;
                    }
                }
            } else if (user.toLowerCase().equals("accountant")) {
                while (a < 8) {
                    password = sc.nextLine();
                    if (password == accountant.password) {
                        while (true) {
                            System.out.println("What operation would you like to perform on Student?\n1. Add\n2. View\n3. Edit\n4. Delete");
                            input = sc.next();
                            if (input.toLowerCase().equals("add")) {

                                student.name = sc.nextLine();
                                student.designation = "student";
                                student.password = sc.nextLine();
                            } else if (input.toLowerCase().equals("view")) {
                                System.out.println(student.name);
                                System.out.println(student.designation);
                                System.out.println(student.dues);
                            } else if (input.toLowerCase().equals("edit")) {
                                student.dues = sc.nextFloat();
                            } else if (input.toLowerCase().equals("delete")) {
                                student = null;
                            } else {
                                System.out.println("Wrong input!");
                                break;
                            }

                        }
                        a += 1;
                    } else {
                        a += 1;
                    }
                }
            } else if (user.toLowerCase().equals("student")) {
                while (a < 15) {
                    password = sc.nextLine();
                    if (password.equals(student.password)) {
                        while (true) {
                            System.out.println("What operation would you like to perform on Student?\n1. Add\n2. View\n3. Edit\n4. Delete");
                            input = sc.next();

                            if (input.toLowerCase().equals("view")) {
                                System.out.println(student.name);
                                System.out.println(student.designation);
                                System.out.println(student.password);
                                System.out.println(student.dues);
                            } else if (input.toLowerCase().equals("pay dues")) {
                                student.paidDues = sc.nextFloat();
                                //A link can be added to here for a payment gateway which will inturn show changes in student.dues
                                student.dues -= student.paidDues;
                            } else {
                                System.out.println("Wrong input!");
                                break;
                            }

                        }
                        a += 1;
                    } else {
                        a += 1;
                    }
                }
            }
        }

    }
}
