public class Main {
    public static void main(String[] args) {
        int[] names = new int[3];
        names[1] = 3;
        names[0] = 4;
        names[2] = 5;
        int Summe = names[1] + names[0] ;
        System.out.println("Die Zahl ist " +  Summe);
        System.out.println("Die länge des Arrays ist " + names.length);
    }
}