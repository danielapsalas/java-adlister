import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection;
    public MySQLAdsDao(Config config) throws SQLException {
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/azeban_cohort_example_db?allowPublicKeyRetrieval=true&useSSL=false",
                "root",
                "codeup"
        );
    }
    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList();
        String selectQuery = "SELECT * FROM ads";

        try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);

            while (rs.next()) {

                ads.add(new Ad(rs.getLong("id"), rs.getLong("user_id"), rs.getString("title"), rs.getString("description")));

                System.out.println("  user id: " + rs.getLong("user_id"));
                System.out.println("  title: " + rs.getString("title"));
                System.out.println("  description: " + rs.getRef("description"));
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        ResultSet rs;

        try {
            String adTitle = ad.getTitle();
            String adDescription = ad.getDescription();

            String insertStmt = String.format("INSERT INTO ads(title, description) VALUES (%s, %s):", adTitle, adDescription);
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(insertStmt, stmt.RETURN_GENERATED_KEYS);

            rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                System.out.println("Inserted a new record! New id: " + rs.getLong(1));
            }
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
