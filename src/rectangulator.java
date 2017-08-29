public class Rectangulator {

    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        Rectangle myRec = new Rectangle(length, width);
        String output = String.format("*** Your rectangle ***\n\nLength: %d\nArea: %d\nPerimeter: %d\n\n", myRec.length, myRec.getArea(),myRec.getPerimiter());

        System.out.println(output);

        // stuff
    }

    
}