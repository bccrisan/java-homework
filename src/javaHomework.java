import java.util.*;

class Main {

    public static void main(String[] args) {
//        week1Exercise1();
//        week1Exercise2();
//        week1Exercise3();
//        week1Exercise4();
//
        week2Exercise1();
//        week2Exercise2();
//        week2Exercise3();
//        week2Exercise4();
    }

    private static void week1Exercise1() {
        Random random = new Random();

        //Define and print on separate lines the following data types, using random values:
        //Primitive: boolean, char, int, long, double

        Boolean shouldIPrintIt = true;

        char myChar = (char) (random.nextInt(26) + 'a');

        int upperIntLimit = 101715968;
        int myIntNumber = random.nextInt(upperIntLimit);

        //usual long assignment, not used in this case
        long upperLongLimit = 3000000000L;
        long myLongNumber = random.nextLong();

        double myDoubleNumber = random.nextDouble();

        if (shouldIPrintIt) {
            System.out.println("Variable shouldIPrintIt is true if you see this message: " + shouldIPrintIt);
            System.out.println("Random int number: " + myIntNumber);
            System.out.println("Random long number: " + myLongNumber);
            System.out.println("Random double number: " + myDoubleNumber);
        }

        //Non-primitive: String, array;

        // Literal string - Each time you create a string literal, the JVM checks the "string constant pool" first.
        // If the string already exists in the pool, a reference to the pooled instance is returned.
        // If the string doesn't exist in the pool, a new string instance is created and placed in the pool.
        String stringExample = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut nulla lorem ..";
        String stringExample2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut nulla lorem ..";
        // stringExample2 will not create a new instance at runtime
        System.out.println(stringExample);

        //New string using the "new keyword"
        String stringExample3 = new String("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut nulla lorem ..");
        String stringExample4 = new String("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut nulla lorem ..");
        //creating Java string by new keyword
    }

    private static void week1Exercise2() {
        //Define some integer variables. Perform the operations below and print the result
        int a = 50;
        int b = 5;
        Boolean c = false;
        int d = 8;

        //perform some random arithmetic operations using the arithmetic operators
        System.out.println("Base value: " + a + " New Value Incremented: " + a++);
        System.out.println("Base value: " + b + " New Value Decremented: " + b--);
        System.out.println("Base value: " + c + " New Value Negated: " + !c);
        System.out.println("Base value: " + a + " New Value Negated: " + ~a); // Numbers are getting negated using ~
        System.out.println("Base Values: " + a + ", " + b + " => Output a+b: " + a + b);
        System.out.println("Base Values: " + a + ", " + b + " => Output a-b: " + (a - b));
        System.out.println("Base Values: " + a + ", " + b + " => Output a*b: " + a * b);
        System.out.println("Base Values: " + a + ", " + b + " => Output a/b: " + a / b);
        System.out.println("Base Values: " + a + ", " + b + " => Output a%b: " + a % b);
        System.out.println("Base Values: " + a + ", " + b + " => Output a<<b: " + (a << b)); // a*2^b
        System.out.println("Base Values: " + a + ", " + b + " => Output a>>b: " + (a >> b)); // b/2^b

        //compare two variables using the comparison operator
        System.out.println(b > a && a++ < d);
        System.out.println(a < b | a++ > d); // checks both conditions
        System.out.println(a < b || a++ > d); // if the 1st condition is true, the 2nd condition is not evaluated

    }

    private static void week1Exercise3() {
        //Define two integer variables, a and b
        // Defined as x and y, since I have already used a and b before
        //Using an if-else statement, compare the values, and
        //if a is larger, print "<value of a> is larger than <value of b>"
        //if b is larger, print "<value of b> is larger than <value of a>"
        //if numbers are equal, print "<value of a> is equal to <value of b>"
        Random random = new Random();
        int upperIntLimit = 100;

        int x = random.nextInt(upperIntLimit);
        int y = random.nextInt(upperIntLimit);

        if (x > y) {
            System.out.println("Value of x: " + x + " is larger than value of y: " + y);
        } else if (x < y) {
            System.out.println("Value of y: " + y + " is larger than value of x: " + x);
        } else {
            System.out.println("Value of x: " + x + " is equal to value of y: " + y);
        }
    }

    static void generateArray(){
        Random random = new Random();
        int upperIntLimit = 100;

        int numberArray[] = new int[100];

        for (int i=0; i<numberArray.length; i++){
            numberArray[i] = random.nextInt(upperIntLimit);
            if(i == 3){
                numberArray[i] = 15;
            }
        }

        for (int i=0; i<numberArray.length; i++){
            if(numberArray[i] != 15){
                System.out.println("Value stored in numberArray["+i+"] is = " + numberArray[i]);
            }else{
                System.out.println("Nothing to see here..");
            }

        }
    }

    private static void week1Exercise4() {
        //Define a number array of 10 elements, using random values from range 1 to 100, which needs to include number 15;
        //Using a for loop,
        //  print the values of every element on separate lines.
        //  If an element has value 15, skip printing this value.
        generateArray();
    }

    static void prettyPrint(String printThis) {
        System.out.println(printThis);
    }

    static void week2Exercise1() {
        // Given two strings, check if the strings are equal.
        // After that, concatenate them into one single string

        String firstString = "String 1";
        String secondString = " String 2";
        String result = "";

        if (!firstString.equals(secondString)) {
            result = firstString + secondString;
        }

        prettyPrint(result);
    }

    static char[] reverse_array(char[] subject, int arrayLength) {
        char[] final_array = new char[arrayLength];
        int j = arrayLength;

        for (int i = 0; i < arrayLength; i++) {
            final_array[j - 1] = subject[i];
            j = j - 1;
        }

        return final_array;
    }

    static void week2Exercise2() {
        // Given a one word string, return true if the string is a palindrome
        // (word that reads the same forwards or backwards - e.g. madam, mom, abba )

        String testingPalindrome = "ababababa";

        char[] palindromeBreakdown = new char[testingPalindrome.length()];
        char[] returnedPalindrome;

        for (int i = 0; i < testingPalindrome.length(); i++) {
            palindromeBreakdown[i] = testingPalindrome.charAt(i);
        }
        returnedPalindrome = reverse_array(palindromeBreakdown, palindromeBreakdown.length);
        String palindromeResult = String.valueOf(returnedPalindrome);

        if (testingPalindrome.equals(palindromeResult)) {
            prettyPrint("True");
        } else {
            prettyPrint("False");
        }
    }

    private static String generateWord(int length) {
        Random random = new Random();

        String abc = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char[] abcArray = new char[abc.length()];
        char[] abcResult = new char[length];

        for (int i = 0; i < abc.length(); i++) {
            abcArray[i] = abc.charAt(i);
        }

        for (int i = 0; i < length; i++) {
            abcResult[i] = abcArray[random.nextInt(abc.length())];
        }

        return String.valueOf(abcResult);
    }

    private static String checkForVowels(String subject) {
        // Vowels: A, E, I, O, U, and Y
        char[] vowelsList = {'a', 'e', 'i', 'o', 'u', 'y'};
        char[] subjectBreakdown = new char[subject.length()];

        for (int i = 0; i < subject.length(); i++) {
            subjectBreakdown[i] = subject.charAt(i);
        }

        for (char c : vowelsList) {
            if (subjectBreakdown[0] == c) {
                return subject.toLowerCase();
            }
        }
        return "";
    }

//    private static String checkForConsonant(String subject) {
//        // Consonants: B, C, D, F, G, J, K, L, M, N, P, Q, S, T, V, X, Z, H, R, W, Y
//        char[] consonantList = {'b', 'c', 'd', 'f', 'g', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 's', 't', 'v', 'x', 'z', 'h',
//                'r', 'w', 'y'};
//        char[] subjectBreakdown = new char[subject.length()];
//
//        for (int i = 0; i < subject.length(); i++) {
//            subjectBreakdown[i] = subject.charAt(i);
//        }
//
//        for (char c : consonantList) {
//            if (subjectBreakdown[0] == c) {
//                return subject.toUpperCase();
//            }
//        }
//        return subject;
//    }

    private static String[] addConsonantToArray(String[] sourceArray, String item) {
        String[] destinationArray = new String[sourceArray.length + 1];

        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);

        destinationArray[destinationArray.length - 1] = item;

        return destinationArray;
    }

    private static List<String> checkXCriteriaSelection(List<String> items) {
        String replaceWithThis = "Skipped";
        for (String item : items) {
            if (item.length() < 3) {
                int itemIndex = items.indexOf((item));
                prettyPrint("Item index: " + itemIndex);

                items.set(itemIndex, replaceWithThis);
                prettyPrint("Current word \"" + item +
                        "\" was replaced with \"" + replaceWithThis + "\"");
            }
        }
        return items;
    }

    private static void week2Exercise3() {
        //        Create an empty string, an empty array of strings, and a list of strings with random upper and lowercase letters
        //        Iterate the list.
        //              If the word starts with a vowel, make it all lowercase and append it to the empty string
        //              If the word starts with a consonant, make it all uppercase and add it to the empty array
        //              If the word contains letter x or X or has less than 3 letters,
        //                  replace the word with "skipped" and
        //                  print into the console the current word and the replaced word

        String emptyString = "";
        String[] emptyArrayOfStrings = new String[0];
        List<String> listOfRandomWords = new ArrayList<String>();
        int numberOfListElements = 50;
        int maxWordLength = 25;
        Random random = new Random();


        // Filling the list with random words
        for (int i = 0; i < numberOfListElements; i++) {
            listOfRandomWords.add(generateWord(1 + random.nextInt(maxWordLength)));
        }

        checkXCriteriaSelection(listOfRandomWords);

        // Showing the generated words in the populated list
        for (String item : listOfRandomWords) {
            prettyPrint("Default generated word[" + listOfRandomWords.indexOf(item) + "]: " + item);
        }


        for (String item : listOfRandomWords) {
            String checkForVowels = checkForVowels(item);

            if (item.equals(checkForVowels)) {
                emptyString += checkForVowels;
                prettyPrint("I have added \"" + item + "\" to the list of vowels.");
            } else {
                emptyArrayOfStrings = addConsonantToArray(emptyArrayOfStrings, item.toUpperCase());
            }
        }
        // Show content from emptyArrayOfStrings
        for (String itemFromEmptyArray : emptyArrayOfStrings) {
            System.out.println("Items from emptyArrayOfStrings: " + itemFromEmptyArray);
        }

        // Show content from emptyString
        if (emptyString.equals("")) {
            prettyPrint("emptyString doesn't contain anything.. ");
        } else {
            prettyPrint("emptyString content: " + emptyString);
        }
    }

    private static void week2Exercise4() {
        /*
        Create an empty map that will contain Name and Email as key-value pairs
            Add a couple of K-V entries
            Get the size of the map
            Check that map contains a specific name
            Get the email that contains a specific name
            Remove an entry
            Sort the map by key
         */

        // Create an empty map that will contain Name and Email as key-value pairs
        HashMap<String, String> agenda = new HashMap<String, String>();

        // Add a couple of K-V entries
        agenda.put("John, Doe1", "john.doe1@gmail.com");
        agenda.put("John, Doe2", "john.doe2@gmail.com");
        agenda.put("John, Doe4", "john.doe4@gmail.com");
        agenda.put("John, Doe3", "john.doe3@gmail.com");

        // Get the size of the map
        prettyPrint("Agenda size: " + agenda.size());

        // Check that map contains a specific name
        prettyPrint("Do we have any John, Doe3?");
        if(agenda.containsKey("John, Doe3")){prettyPrint("Yes");
        } else {prettyPrint("No");}

        // Get the email that contains a specific name
        prettyPrint("John, Doe1 please give me your email.");
        prettyPrint("John, Doe1 OMW: " + agenda.get("John, Doe1"));

        // Remove an entry
        prettyPrint("John, Doe2 you are naughty, please get out!");
        if(agenda.containsKey("John, Doe2")){
            agenda.remove("John, Doe2");
            if(!agenda.containsKey("John, Doe2")){
                prettyPrint("Alright, I'm out");
            }
        }

        prettyPrint("Let's see how the Hash Looks like..");
        for(String name: agenda.keySet()){
            prettyPrint("Name: " + name + "\t Email: " + agenda.get(name));
        }
        prettyPrint("This look weird, let's sort them out..");

        // Sort the map by key

        //Complicated and partially works as expected - the agenda is not updated, only the printed values are sorted
//        SortedSet<String> keySet = new TreeSet<>(agenda.keySet());
//
//        HashMap<String, String> updatedAgenda = new HashMap<String, String>();
//
//        for(String key:keySet){
//            String value = agenda.get(key);
//            updatedAgenda.put(keyName, value);
//        }

        //Simple an correct
        Map<String, String> treeMap = new TreeMap<String, String>(agenda);

        for(String name: treeMap.keySet()){
            prettyPrint("Name: " + name + "\t Email: " + treeMap.get(name));
        }
    }
}
