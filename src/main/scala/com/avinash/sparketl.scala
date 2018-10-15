package com.avinash

import org.apache.spark.sql.types._

object sparketl {
  def main(args: Array[String]): Unit = {
    val schema1= StructType(
      StructField("sourc_dest",StringType,true)::
        StructField("sourc",StringType,true)::
        StructField("dest",StringType,true)::
        StructField("mode",IntegerType,true)::
        StructField("adult_travel",IntegerType,true)::
        StructField("seniors_travel",IntegerType,true)::
        StructField("child_travel",StringType,true)::
        StructField("youth_travel",StringType,true)::
        StructField("infant_travel",StringType,true)::
        StructField("air_price",FloatType,true)::
        StructField("car_price",FloatType,true)::
        StructField("journ_start",StringType,true)::
        StructField("dest_reach",StringType,true)::
        StructField("hotel_price",FloatType,true)::
        StructField("airline_code",StringType,true)::
        StructField("airline_name",StringType,true)::
        StructField("car_vndr_code",StringType,true)::
        StructField("hotel_name",StringType,true)::Nil
    )
  }
}
