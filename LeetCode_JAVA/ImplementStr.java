public class ImplementStr {
	public static String spinWords(String sentence) {
		String[] Arr = sentence.split(" ");
		String newArr = new String();
		for (int i = 0; i < Arr.length; i++){
			if (Arr[i].length() < 5){
				newArr += Arr[i] + " ";
			}else{
				for (int j = Arr[i].length(); j > 0; j--){
					newArr += Arr[i].charAt(j-1); 
				}
				newArr += " ";
			}
		}
		//System.out.println(newArr.trim());
		return newArr; 
	  }
	
	public static void main(String[] args){
		spinWords("This is a test for spinwords!");
	}
}


