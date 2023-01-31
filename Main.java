public class Main {
    public static void main(String[] args) {
        suma(10, 40, 50);//Primera parte
        int doors;
        Coche micoche;
        micoche = new Coche();
        micoche.maspuertas();
        doors = micoche.getPuertas();
        System.out.println(doors);

    }

    //Primera parte
    public static void suma(int num1, int num2, int num3) {
        int result;
        result = num1 + num2 + num3;
        System.out.println(result);
    }
}

