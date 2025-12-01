public class logicaloperator {
    public static void main(String[] args) {
        int a = 25;
        int b = 45 ;
        System.out.println(a > 20 && b < 40);
        System.out.println(a > 20 && b < 49);
        System.out.println(a > 20 ||  b < 40);

        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
        System.out.println("Has access: " + (isLoggedIn || isAdmin));
        System.out.println("Not logged in: " + (!isLoggedIn));
    }
    
}
