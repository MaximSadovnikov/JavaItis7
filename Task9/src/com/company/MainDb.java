package com.company;

import java.sql.*;
import java.util.Scanner;

public class MainDb {
    private static final String URL = "jdbc:postgresql://localhost:5433/owner";
    private static final String USER = "postgres";
    private static final String PASSWORD = "password3926";

    public static void main(String[] args) throws Exception {
        Connection connection =
                DriverManager.getConnection(URL, USER, PASSWORD);

        // Statement - выражение, которое можно запустить в Базе данных
//        Меню:
//        1) Добавить пользователя
//        2) Добавить пользователю машину
//        3) Посмотреть всех пользователей
//        4) Посмотреть все машины
        Scanner scanner = new Scanner(System.in);
        Statement statement = connection.createStatement();
        while (true) {
            System.out.println("Menu : " + '\n' + "1 - Add user" + '\n' + "2 - Add car to user" + '\n' + "3 - Show all users" + '\n' + "4 - Show all cars" + '\n' + "5 - Show cars and owners" + '\n' + "0 - EXIT");
            int command = scanner.nextInt();
            switch (command) {
                case 1: {
                    System.out.println("Введите имя:");
                    String name = scanner.next();
                    System.out.println("Введите Возраст:");
                    int age = scanner.nextInt();
                    PreparedStatement preparedStatement = connection.prepareStatement(
                            "INSERT INTO owner(name, age) VALUES (?, ?)");
                    preparedStatement.setString(1, name);
                    preparedStatement.setInt(2, age);
                    preparedStatement.execute();
                }
                break;
                case 2: {
                    System.out.println("Введите название:");
                    String name = scanner.next();
                    System.out.println("Введите id пользователя:");
                    int userid = scanner.nextInt();
                    PreparedStatement preparedStatement = connection.prepareStatement(
                            "INSERT INTO car(model, owner_id) VALUES (?, ?)");
                    preparedStatement.setString(1, name);
                    preparedStatement.setInt(2, userid);
                    preparedStatement.execute();
                }
                break;
                case 3: {
                    ResultSet resultSet = statement.executeQuery("SELECT * FROM owner;");
                    while (resultSet.next()) {
                        System.out.println(
                                resultSet.getInt("id") + " " +
                                        resultSet.getString("name") + " " +
                                        resultSet.getInt("age")
                        );
                    }
                }
                break;
                case 4: {
                    ResultSet resultSet = statement.executeQuery("SELECT * FROM car;");
                    while (resultSet.next()) {
                        System.out.println(
                                resultSet.getInt("id") + " " +
                                        resultSet.getString("model") + " "
                        );
                    }
                }
                break;
                case 5: {
                    ResultSet resultSet = statement.executeQuery("SELECT name, model FROM owner INNER JOIN car ON owner.id = car.owner_id;");
                    while (resultSet.next()) {
                        System.out.println(
                                resultSet.getString("name") + " " +
                                        resultSet.getString("model") + " "
                        );
                    }
                }
                break;
                case 0: {
                    System.exit(0);
                }
            }
        }
    }
}
