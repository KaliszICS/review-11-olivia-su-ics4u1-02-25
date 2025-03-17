public class PracticeProblem {

	public static void main(String args[]) {
		
	}

	public static int[] createIntArray(){
		int numArr[] = new int[5];
		for (int i = 0; i < 5 ; i++){
			numArr[i] = i + 1;
		} 
		return numArr;
	}

	public static String[] createArray(String a, String b, String c, String d){
		String strArr[] = {a, b, c, d};
		return strArr;
	}

	public static int findValue(int num, int[] numArr){
		for (int i = 0; i < numArr.length; i++){
			if (numArr[i] == num){
				return i;
				}
			}
			return -1;
		}


		public static int findThirdValue(String word, String[] strArr){
			int occurance = 0;
			for (int i = 0; i < strArr.length; i++){
				if (strArr[i] == word){
					occurance++;
					if (occurance == 3){
					return i;
					}
				}
			}
			return -1;
		}
		
	}


