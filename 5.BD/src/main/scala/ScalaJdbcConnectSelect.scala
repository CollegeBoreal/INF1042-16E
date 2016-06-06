package tests

import java.sql.{Connection,DriverManager}

object ScalaJdbcConnectSelect extends App {

  // connect to the database named "mysql" on port 8889 of localhost
  val url = "jdbc:mysql://208.75.75.209:3306/world"
  val driver = "com.mysql.jdbc.Driver"
  val username = "etudiants"
  val password = "etudiants_1"
  var connection:Connection = _
  try
    Class.forName(driver)
    connection = DriverManager.getConnection(url, username, password)
    val statement = connection.createStatement
    val rs = statement.executeQuery("SELECT Code, Name, Population FROM Country Where Code = 'HTI'")
    while (rs.next) {
      val code = rs.getString("Code")
      val name = rs.getString("Name")
      println("Code = %s, Nom = %s, Population = ".format(code, name))
      println("code = %s,Nom = %s,Population From Contry where code = 'HTI",.format(code, name))
    }



  case e: Exception => e.printStackTrace
  }
  connection.close

}
