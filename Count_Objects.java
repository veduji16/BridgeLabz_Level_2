package Level_2;

// Java Program to Count Number of Objects Created for Class

public class Count_Objects {

    static int count = 0;

    public Count_Objects() {
        count++;
    }

    public static int getObjectCount() {
        return count;
    }

    public static void main(String[] args) {
        Count_Objects obj1 = new Count_Objects();
        Count_Objects obj2 = new Count_Objects();
        Count_Objects obj3 = new Count_Objects();

        int objectCount = Count_Objects.getObjectCount();
        System.out.println("Number of objects created: " + objectCount);
    }
}
