package Builder;

public class Shop {
    public static void main(String[] args) {
        Phone phone = new Phone.PhoneBuilder().setChipset("Qcom").setOS("R").getPhone();
        System.out.println(phone);
    }
}
