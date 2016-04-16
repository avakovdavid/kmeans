import scala.io.Source
import kmeans.Point
import kmeans.Cluster

object KMeans {
	def usage(){
		println("Usage : scala KMeans [data file] [K: number of clusters]")
	}


	def main(args: Array[String]): Unit = {
		if(args.length != 2){
			usage()
			return 
		}

		var points: List[Point]	= List()	

		for(line<-Source.fromFile(args(0)).getLines){
			var xy = line.replace('\n', ' ').split(" ")
			points = points ::: List(new Point(xy(0).toDouble, xy(1).toDouble))
		}

		var cluster: Cluster = new Cluster(points)
		
		println(cluster.getMeanPoint)
	}
}
