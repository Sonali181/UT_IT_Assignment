package com.knoldus.db
import com.knoldus.models.Employee
import scala.collection.immutable.HashMap

class Employees {
  val emp : Employee = Employee("Sonali","Kumari",25,15000,"Intern","Knoldus","sonali.kumari@knoldus.com")
  val emp1 : Employee = Employee("Ankit","Malik",22,15000,"Intern","Knoldus","ankit.malik@knoldus.com")
  val totalEmp : HashMap[String,Employee] = HashMap("emp1"->emp,"emp2"->emp1)
}