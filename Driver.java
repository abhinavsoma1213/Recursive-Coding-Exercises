class Driver {
    static boolean isPal(String s) {
        return isPal(s,0,s.length()-1);
    }
    private static boolean isPal(String s, int low, int high) {
        /*This checks and uses if statements to check whether the string is a
        palendrome by using individiual characters of the string and checking them
        */
        if(low > high) {
            return true;
        }
        if(s.charAt(low) != s.charAt(high)) {
            return false;
        }
        return isPal(s, low+1, high-1);
    }
    public static void main(String[] args) {
        Driver Drive = new Driver();
        System.out.println(Drive.isPal("anna"));

    }  
}

