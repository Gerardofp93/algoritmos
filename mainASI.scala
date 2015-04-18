object mainASI{
	def main(args: Array[String]): Unit = {
		val S = Array(0,1,3,0,5,3,5,6,8,8,2,12)
		val F = Array(0,4,5,6,7,9,9,10,11,12,14,16) 

		var B = new activitySelectorItera();
		println(B.asIterativo(S,F));	  
	}
	
}