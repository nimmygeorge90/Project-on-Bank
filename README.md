 Project-on-Banking System
 --------------------------
 
This is the mini project for the Banking system in basic Scala.Scala is a general-purpose programming language that supports both functional and object-oriented programming paradigms.Scala's static types help avoid bugs in complex applications, and its JVM and JavaScript runtimes let you build high-performance systems with easy access to huge ecosystems of libraries.Scala provide more security due to its functional programming concepts. And the importance of scala is increasing day by day at the same time scala's applications have been extended to a wide variety of fields such as data science and cluster computing.

Here, we implement there are two main users :
1.Bank Employee

2.Customers

The importand activitues include login the application,opening and closing account,deposit and withdraw the money, generate account number, calculate the interest, give the status of customers, Will provide an overview on banking sector, calculate interest etc


Set Up
-------
Scala Version: 2.13.10

Sbt Version: 1.7.2

JDK :azul 13

JDBC driver : com.mysql.jdbc.Driver

Database url: jdbc:mysql://localhost:3306/Fundforfuture

Library Depenedencies:
----------------------
val scalaLogging="com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"

val utilControl="org.scala-sbt" %% "util-control" % "1.7.2"

val scalaTest2="org.scalatest" %% "scalatest" % "3.2.14" % Test

val jodaTime = "joda-time" % "joda-time" % "2.12.0"

val jodaconvert ="org.joda" % "joda-convert" % "2.2.2"

val mysql ="mysql" % "mysql-connector-java" % "8.0.30"

val dep1="org.scalikejdbc" %% "scalikejdbc" % "3.5.0"

val dep2="com.h2database" % "h2" % "2.1.214" % Test

val dep3="ch.qos.logback" % "logback-classic" % "1.4.4" % Test


The complete code available on Github.

Architecture
------------
This is not production application, but we are going to understand more about banks and main activities perform in the banks.
And I'm used here basic scala code such as different types of inheritence,method overriding, case, if- else, control structures,
list buffer,object and classes,map(), threading ,abstract class, exceptional handling, mysql jdbc connector and query statements,
with data bases, functions,file reading etc.
Below activities are performed by the employee:

1.Account details

2.Calculate the Interest

3.Deposit the Amount 

4.Withdraw the Amount 

5.Opening the Account 

6.Closing the Account

7.Generate the account number

8.See the status of particular user



Account Details:
----------------
This is the parent class which stores the details current account holder.
Here I'm used ListBuffer where index of one's client account number and its corresponding
value stored in same index value of different listbuffer And here also print the complete details of the account holders and which is used by employees.

Calculate the Interest
--------------------
 This is the child class of Account and it contains method calculate interest of particular amount .   
 
 Deposit the Amount
 ------------------
 This is the child class of the account and the class is used to add amount to the particular account.
 
 Witdraw  from the Account
 ------------------
 Used to withdraw money from an account and function name is debit(). here also debit the money when user needs, first it
 check overdrift limit which is nothing but the minimum limit set by the bank that requires
 every account to have the balance above that overdraft limit in order to avoid cash deduction.
 
 Opening the Account
 -------------------
 This is the child class of class account where,Opening() method is used to open a new online account
 It asks the user for its name and  initial balance ask to user, then employee set and provide an account number to user.
 Closing the Account
 -------------------
  It asks the user to enter the account number and then checks the index of that particular
  account number using the indexOf() method of ListBuffer and then deletes that particular index
  from all the Lisuffer respectively.
 
 Generate the account Number
 ---------------------------
 This function is used by employee to generate account number for the new customer and inform to the customer into details.
 
 See the status of particular user
------------------------------------
Display the Status of selected user.

The activities for the Customer are:
1.Login User

2.Deposit to Account 

3.Withdraw from Account

4.Opening the Account 

5.Closing the Account

6.Standrd Rules of Bank

Login:
------
This method is used by users where they login using username and password. This is an application through which user can perform and know the current status.

 Deposit the Amount
 ------------------
 This is the child class of the account and the class is used to add amount to the particular account.
 
 
 Witdraw  from the Account
 ------------------
 Used to withdraw money from an account and function name is debit(). here also debit the money when user needs, first it
 check overdrift limit which is nothing but the minimum limit set by the bank that requires
 every account to have the balance above that overdraft limit in order to avoid cash deduction.
 
  Opening the Account
 -------------------
 This is the child class of class account where,Opening() method is used to open a new online account
 It asks the user for its name and  initial balance ask to user, then employee set and provide an account number to user.
 
 Closing the Account
 -------------------
  It asks the user to enter the account number and then checks the index of that particular
  account number using the indexOf() method of ListBuffer and then deletes that particular index
  from all the Lisuffer respectively.
  
  Standrd Rules of Bank
  ---------------------
  
This provide an information about the overall structure of banking and different types of account.
