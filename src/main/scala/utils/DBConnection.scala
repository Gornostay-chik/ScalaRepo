package utils

import java.sql.{Connection, DriverManager}

object DBConnection extends  App {

  println("Connect to MySQL...")

  val url = "jdbc:mysql://localhost:3306/mysql"
  val driver = "com.mysql.cj.jdbc.Driver"
  val username = ""
  val password = ""
  var connection:Connection = _
  try {
    Class.forName(driver)
    connection = DriverManager.getConnection(url, username, password)
    val statement = connection.createStatement
    val rs = statement.executeQuery("SELECT 1 field1, 2 field2")
    while (rs.next) {
      val host = rs.getString("field1")
      val user = rs.getString("field2")
      println("host = %s, user = %s".format(host,user))
    }
  } catch {
    case e: Exception => e.printStackTrace()
  }
  connection.close()

}
