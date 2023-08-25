package Practice_Advanced.Test1_Advanced;

public class Test1_Advanced {
    public static void main(String[] args) {
        Phone iPhone = new Phone();
        Phone Samsung = new Phone();
        Phone Huawei = new Phone();

        iPhone.provideDetails("iPhone");
        Samsung.provideDetails("Samsung");
        Huawei.provideDetails("Huawei");

        iPhone.printDetails("iPhone");
        Samsung.printDetails("Samsung");
        Huawei.printDetails("Huawei");
    }

}
