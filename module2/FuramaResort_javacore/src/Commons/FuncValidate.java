package Commons;

public class FuncValidate {
    private static String regex ="";
    public static boolean checkServiceCodeVilla(String str){
        regex ="^SVVL-[0-9]{4}$";
        return str.matches(regex);
    }
    public static boolean checkServiceCodeHouse(String str){
        regex ="^SVHO-[0-9]{4}$";
        return str.matches(regex);
    }
    public static boolean checkServiceCodeRoom(String str){
        regex ="^SVRO-[0-9]{4}$";
        return str.matches(regex);
    }
    public static boolean checkNameService(String str){
        regex ="^[A-Z][a-z]*$";
        return str.matches(regex);
    }

    public static boolean checkArea(int number){
        return number > 30;
    }
    public static boolean checkRentalCost(int number){
        return number > 0;
    }
    public static boolean checkPeople(int number){
        return number > 0 && number < 20;
    }
}
