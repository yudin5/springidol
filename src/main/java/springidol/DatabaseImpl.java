package springidol;

import java.sql.*;

public class DatabaseImpl {
    // URL, юзер и пароль для подключения
    private static final String url =
            "jdbc:mysql://localhost:3306/foodb?" +
                    "autoReconnect=true&useSSL=false" +
                    "&useLegacyDatetimeCode=false" +
                    "&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "root";

    // Переменные JDBC для манипулирования данными
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static void requestDb() {
        try {
            // Открываем соединение
            con = DriverManager.getConnection(url, user, password);
            // Создаем стейтмент для запросов
            stmt = con.createStatement();
            // Формируем строку для запроса
//            String query = "SELECT * FROM foodb.persons WHERE age > 45";
            String query = "INSERT INTO foodb.persons (name, surname, age) " +
                    "VALUES ('Charlie', 'Graff', 22)";
            // Выполняем запрос, выбираем данные с БД
//            ResultSet rs = stmt.executeQuery(query);
            stmt.execute(query);

            // Извлекаем данные из ResultSet и отображаем их
//            while (rs.next()) {
//                System.out.println(
//                        "Name: "    + rs.getString("name") +    ", " +
//                                "Surname: " + rs.getString("surname") + ", " +
//                                "Age: "     + rs.getString("age"));
//            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //закрываем здесь всё
            try { con.close(); } catch(SQLException se) {}
            try { stmt.close(); } catch(SQLException se) {}
            //try { rs.close(); } catch(SQLException se) {}
        }
    }
}
