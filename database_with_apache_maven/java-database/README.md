# Coba CRUD Java Database

Disini menggunakan library mysql-connector-java untuk menggunakan database MySQL, 
kemudian untuk Connection Pool menggunakan [HikariCP](https://github.com/brettwooldridge/HikariCP)

Connection Pool disini konsep nya yaitu membuat koneksi baru setiap ada request yang membutuhkan database dimana 
untuk mengatasi masalah pada Connection yaitu lambat yang diharuskan untuk membuka tutup koneksi setiap ada request.

## Fungsi pada Statement Database
- statement.executeUpdate(String sql) -> digunakan untuk mengeksekusi perintah SQL yang tidak memberikan output data seperti
pada MySQL yaitu UPDATE, INSERT, DELETE.
- statement.executeQuery(String sql) -> digunakan untuk mengeksekusi perintah SQL yang memberikan output data
Pada fungsi ini harus menggunakan ResultSet resultSet = statement.executeQuery(sql) yang dapat dilihat contoh script [Disini](https://github.com/HaiDiazo/my-exploration-programing/blob/dependency_management/database_with_apache_maven/java-database/src/test/java/explore/programing/java/database/StatementTest.java);

