// determine if a string has all unique characters.

class Exercise1{
	public static boolean isUnique(String str) {
		// use a set of character array to check
		boolean[] char_set = new boolean[128];

		for (char c : str.toCharArray()) {
			if (char_set[c]) {
				// is not unique
				return false;
			} else {
				// this character is existed
				char_set[c] = true;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isUnique("hello"));
		System.out.println(isUnique("world"));
	}

}

