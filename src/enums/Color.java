package enums;

/**
 * Enumeration
 * Whenever we will be using some constant which will be interacted
 * by the program/programs exactly the same way, we use enums.
 * For example:
 * public enum Day{
 *      SUNDAY, MONDAY< TUESDAY< WEDNESDAY< THURSDAY< FRIDAY< SATURDAY
 * }
 */
public enum Color{
    RED("red"), GREEN("green"), BLUE("blue");

    private String value;

    Color(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
