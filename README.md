 Project-on-Bank
This is the mini project for the Banking system in basic Scala.
The importand activity the opening and closing online bank accounts, retrieve the details of customers, and interact with their bank account to deposit/withdraw money.
Set Up
-------
Scala Version: 2.13.10
Sbt Version: 1.7.2
JDK :azul 13
Library Depenedencies:
----------------------
val scalaLogging="com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"
val utilControl="org.scala-sbt" %% "util-control" % "1.7.2"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.2"
libraryDependencies ++= Seq(scalaLogging,utilControl)

The complete code available on Github.

Architecture
------------
This is not production application, but we are going to understand more about banks and main activities perform in the banks.
And I'm used here basic scala code such as different types of inheritence,method overriding, case, if- else, control structures,
list buffer,object and classes,map() etc.
Below activities are perform in this applications:
1.Login User
2.Account details
3.Interest Amount
4.Credit the Account 
5.Debit the Account 
6.Opening the Account 
7.Closing the Account
8.To see details of particular user"

Login:
------
This method is used by users where they login using username and password. And they can see the current status of users.
Account Details:
----------------
This is the parent class which stores the details current account holder.
Here I'm used ListBuffer where index of one's client account number and its corresponding
value stored in same index value of different listbuffer And here also print the complete details of the account holders and which is used by employees.
Interest Amount
---------------
 This is the child class of Account and it contains method calculate interest of particular amount .   
 Credit the Account
 ------------------
 This is the child class of the account and the class is used to add amount to the particular account.
 Debit the Account
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
    To see details of particular account
    ------------------------------------
    Display the report on particular user status.
 
