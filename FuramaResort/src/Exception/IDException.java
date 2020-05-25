package Exception;

public class IDException extends Exception {
    public IDException(String message) {
        super(message);
    }
    public static String idCardException(String idCard) throws IDException {
        String regex="^\\d{3}\\s\\d{3}\\s\\d{3}$";
        if (idCard.matches(regex)) {
            return idCard;
        } else {
            throw new IDException("ID Card không hợp lệ");
        }
    }
}
