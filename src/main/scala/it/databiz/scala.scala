package it.databiz

import com.typesafe.config._
import java.sql.DriverManager
import java.sql.Connection

object Main extends App{
  // Change to Your Database Config
val conn_str = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=password"
Class.forName("org.postgresql.Driver")

// Setup the connection
val conn = DriverManager.getConnection(conn_str)
  val username = ConfigFactory.load().getString("app.dbusername")
  val password = ConfigFactory.load().getString("app.dbpassword")
  println(s"dbusername is: $username")
  println(s"dbpassword is: $password")
}

