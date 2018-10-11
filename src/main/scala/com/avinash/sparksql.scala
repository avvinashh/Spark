package com.avinash

import org.apache.spark.sql.SparkSession
//import org.apache.spark.{SparkConf, SparkContext}
//import org.apache.spark.sql

object sparksql {
  def main(args: Array[String]): Unit = {
   // val conf=new SparkConf().setAppName("Spark sql example").setMaster("local")
    //val sc=new SparkContext(conf)
    val spark = SparkSession.builder().appName("SPARK SQL EXAMPLE")
      .config("spark.some.config.option", "some-value")
      .getOrCreate()
    import spark.implicits._
    val df1=spark.read.format("csv").option("header", "true").load("file:///home/edureka/Downloads/Telecomdata.csv")
    val df2=spark.read.format("csv").option("header", "true").load("file:///home/edureka/Downloads/Telecomdatacustomer.csv")
    val df3=df1.as('a).join(df2.as('b),$"a.customerID"===$"b.Customer_ID")
    df3.createOrReplaceTempView("telecom3")
    //sql("select customerID,city,locality,gender,phoneservice from telecom3").show()
    df1.createOrReplaceTempView("telecom1")
    df2.createOrReplaceTempView("telecom2")
    val result=spark.sql("select df1.customerId,df2.Customer_Name,df2.city,df2.address,df1.gender,df1.PhoneService,df1.contract from telecom1 df1 inner join telecom2 df2 on df1.customerId=df2.Customer_ID")
    result.show()
   result.write.csv("file:///home/edureka/Downloads/op1")
   df3.write.csv("file:///home/edureka/Downloads/op2")
   spark.close()
  }
}
