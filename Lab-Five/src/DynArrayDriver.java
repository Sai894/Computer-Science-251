public class DynArrayDriver {

    public static void main(String[] args) {

        DynArray ary = new DynArray();

        System.out.println("Here is the array size: " + ary.arraySize());
        ary.grow();
        System.out.println("Here is the array growth: " + ary.arraySize());
        ary.shrink();
        System.out.println("Here is the array shrinking: " + ary.arraySize());

    }
}
