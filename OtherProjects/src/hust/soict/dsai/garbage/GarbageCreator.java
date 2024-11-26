package hust.soict.dsai.garbage;
public class GarbageCreator {
    public static void main(String[] args) {
        StringBuilder outputString = new StringBuilder();  
        String data = "Some example data to simulate a large amount of text";  
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {  
            outputString.append(data);  
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken using inefficient string concatenation: " + (endTime - startTime) + " ms");
    }
}

