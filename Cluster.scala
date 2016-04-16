package kmeans

class Cluster(pts: List[Point]) {
	var points: List[Point] = pts

	def getMeanPoint(): Point = {
		var a:Double = 0
		var b:Double = 0
		
		for(p <- points) { 
			a += p.x
			b += p.y
		}

		new Point(a/points.length, b/points.length)
	}
	
	override def toString(): String = "Cluster " + points.toString();
}
