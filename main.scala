object Fit{
	def main(args: Array[String]){
		val x = Array[Double](1,2,3,4,5,6,7,8,9)
		val y = Array[Double](1,2,3,4,5,6,7,8,9)
		calculator(x,y,x.length)
	}

	def calculator(x: Array[Double],y:Array[Double],sum: Int){
		val avex = x.reduce(_+_)/sum
		val avey = y.reduce(_+_)/sum
		calculator0(x,y,sum,avex,avey)
	}
	def calculator0(x: Array[Double],y:Array[Double],sum: Int,avex:Double,avey: Double){
		val r0 = new Array[Double](sum)
		for (i <- 0 until x.length)
			r0(i) = x(i) * y(i)
		val k = x.map((x: Double)=>(x-avex)*(x-avex)).reduce(_+_)
		calculator1(r0,k,sum,avex,avey)
	}
	def calculator1(r0: Array[Double],k: Double,sum: Int,avex:Double,avey: Double){
	
		val b = (r0.reduce(_+_) - sum*avex*avey)/k
		val a = avey - b*avex
		printf("y=%fx+%f\n",b,a)

	}

}	
