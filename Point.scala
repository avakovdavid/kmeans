package kmeans

class Point(xc: Double, yc: Double) {
    var x: Double = xc
    var y: Double = yc

    override def toString(): String = "(" + x + ", " + y + ")";
}
