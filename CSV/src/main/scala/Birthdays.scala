import scala.io.Source

object Csv {
  def main(args: Array[String]): Unit = {
    println("Please enter the CSV file:")
    val filename = Console.readLine
    avgDaily(filename)
    avgYearlyHourly(filename)
    totalAnnual(filename)
    monthlyUsage(filename)
  }
  def avgDaily(file: String): Unit = {
    val newfile = Source.fromFile(file)
    val lines = newfile.getLines.drop(1)
    val days = 365
    var usage = 0.0
    for (line <- lines ) {
      val arr = line.split("\\s+")
      usage += arr(4).toDouble
    }
    val average = usage/days
    println("The average daily usage is " + average +".")
  }

  /*
   * Average usage in KWH/hour/year
   */

  def avgYearlyHourly(file: String): Unit ={
    val newfile = Source.fromFile(file)
    val lines = newfile.getLines.drop(1)
    var hour = 0 //total number of hours
    var totalUsage = 0.0 // total usage
    for (line <- lines ) {
      hour += 1 //number of line (hours)
      val arr = line.split("\\s+") // creates array dividing with spaces
      val perHour = arr(4).toDouble //gets usage, turns it into a double
      totalUsage += perHour
    }
    val avgHour = totalUsage/hour
    println("The average annual hourly usage is " + avgHour +".")
  }

  def totalAnnual(file: String): Unit = {
    val newfile = Source.fromFile(file)
    val lines = newfile.getLines.drop(1)
    var usage = 0.0
    for (line <- lines ) {
      val arr = line.split("\\s+")
      usage += arr(4).toDouble
    }
    println("The total annual usage is " + usage +".")
  }

  def monthlyUsage(file: String): Unit = {
    val newfile = Source.fromFile(file)
    val lines = newfile.getLines.drop(1)
    var usageJan = 0.0
    var usageFeb = 0.0
    var usageMar = 0.0
    var usageApr = 0.0
    var usageMay = 0.0
    var usageJun = 0.0
    var usageJul = 0.0
    var usageAug = 0.0
    var usageSept = 0.0
    var usageOct = 0.0
    var usageNov = 0.0
    var usageDec = 0.0

    for (line <- lines ) {
      val arr = line.split("\\s+")
      if(arr(0).charAt(0) == '2') {
        usageFeb += arr(4).toDouble
      } else if(arr(0).charAt(0) == '3') {
        usageMar += arr(4).toDouble
      } else if(arr(0).charAt(0) == '4') {
        usageApr += arr(4).toDouble
      } else if(arr(0).charAt(0) == '5') {
        usageMay += arr(4).toDouble
      } else if(arr(0).charAt(0) == '6') {
        usageJun += arr(4).toDouble
      } else if(arr(0).charAt(0) == '7') {
        usageJul += arr(4).toDouble
      } else if(arr(0).charAt(0) == '8') {
        usageAug += arr(4).toDouble
      } else if(arr(0).charAt(0) == '9') {
        usageSept += arr(4).toDouble
      } else if((arr(0).charAt(0) == '1') && (arr(0).charAt(1) == '0')) {
        usageOct += arr(4).toDouble
      } else if((arr(0).charAt(0) == '1') && (arr(0).charAt(1) == '1')) {
        usageNov += arr(4).toDouble
      } else if((arr(0).charAt(0) == '1') && (arr(0).charAt(1) == '2')) {
        usageDec += arr(4).toDouble
      } else if(arr(0).charAt(0) == '1') {
        usageJan += arr(4).toDouble
      }
    }

    println("The monthly usage totals are as follows: ")
    println("January: " + usageJan)
    println("February: " + usageFeb)
    println("March: " + usageMar)
    println("April: " + usageApr)
    println("May: " + usageMay)
    println("June: " + usageJun)
    println("July: " + usageJul)
    println("August: " + usageAug)
    println("September: " + usageSept)
    println("October: " + usageOct)
    println("November: " + usageNov)
    println("December: " + usageDec)

  }
// in progress - trying to find the hours that the max usage occures
  def maxHourUsage (file: String): Unit = {
    val newfile = Source.fromFile(file)
    val lines = newfile.getLines.drop(1)
    var tally = new Array[Int](24)
    var date = "2/1/11"
    for (line <- lines ) {
      val arr = line.split("\\s+")
      if(arr(0) == date) {
        var hourUsage = new Array[Double](24)
        }
      }
    }







  }
}