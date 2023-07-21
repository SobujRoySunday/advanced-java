package enums;

class Enumeration {
    public static void main(String[] args) {
        Color blue = Color.BLUE;

        System.out.println("Blue Enum name: " + blue.name());
        System.out.println("Blue Enum value: " + blue.getValue());

        System.out.println("\nIteration:");
        for(Color color : Color.values()){
            System.out.println(color.name() + " : " + color.getValue());
        }
    }
}