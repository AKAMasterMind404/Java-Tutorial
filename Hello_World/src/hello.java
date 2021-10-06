class Hello{
    public static void main(String[] args){
        int n1 = 9;
        double d2 = 4.6;

        System.out.println("Hello, World!");
        CapyBara capyBara = new CapyBara();
        System.out.println(capyBara.name);
        System.out.println(n1*d2);
    }
}

class CapyBara{
    String name = "Atharv";
}