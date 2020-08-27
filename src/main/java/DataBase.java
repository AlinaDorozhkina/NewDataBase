import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DataBase {

    public static void main(String[] args) {
        try {
            Class.forName("com.MySQL.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Driver is not found");
        }

        Connection connection;
        try {
            //DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat_users", "root", "root");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException("Driver Registration error");
        }
    }
}

        /*try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM STUDENT");
            List<Users> users = new ArrayList<>();
            while (resultSet.next()) {
                users.add(new Users(
                                resultSet.getInt("id"),
                                resultSet.getString("name"),
                                resultSet.getString("login"),
                                resultSet.getString("password")

                        )
                );
            }


            System.out.println(users);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException("Statement error");
        }


    }

    }

         */

