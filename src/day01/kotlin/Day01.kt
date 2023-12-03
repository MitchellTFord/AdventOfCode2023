import java.io.File

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Expected one argument but received ${args.size}.")
        println("Expected Arguments: <inputFilePath>")
        return
    }

    val inputFilePath = args[0]

    var sum = 0
    File(inputFilePath).forEachLine { line ->
        sum += getCalibrationValue(line)
    }
    println("Sum of all calibration values: $sum")
}

fun getCalibrationValue(line: String): Int {
    val firstDigit = line.first(Char::isDigit).toString()
    val lastDigit = line.last(Char::isDigit).toString()
    val calibrationValue = firstDigit + lastDigit
    return calibrationValue.toInt()
}
