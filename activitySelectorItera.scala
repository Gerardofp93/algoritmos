import scala.collection.immutable.Set;

class activitySelectorItera{
	def asIterativo(S: Array[Int],F: Array[Int]):Set[String] = {
		var n = S.length;
		var A = Set("A1")
		var k = 1

		for( m <- 2 to n-1) {
			if(S(m)>=F(k)){
				A += ("A" + m)
				k = m
			}
			
		}
		return A
	}
}