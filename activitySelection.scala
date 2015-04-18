import scala.collection.immutable.Set;

class activitySelection{
	def RecursiveActivitySelection(S: Array[Int], f: Array[Int], k: Int, n: Int):Set[String] = {
		var m = k + 1
		while((m <= n)&&(S(m)<=f(k))){
			m = m + 1
		}
		if(m <= n){
			var ac = "A" + m
			var a = Set(ac)
			return a ++  RecursiveActivitySelection(S,f,m,n)
		}
		else{
			return Set.empty 
		}
		
	}
}