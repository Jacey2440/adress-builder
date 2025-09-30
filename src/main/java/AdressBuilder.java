@SuppressWarnings("StringBufferReplaceableByString")
public class AdressBuilder {
    public static void main(String[] args) {
        StringBuilder billing = new StringBuilder();
        StringBuilder shipping = new StringBuilder();
        System.out.println("Full name : Jacey Garcia");
        billing.append("Billing Street : 123 Main Street ,");
        billing.append("Billing City : Middleton ,");
        billing.append("Billing State : TX ,");
        billing.append("Billing Zip : 75111");

        shipping.append("Shipping Street : 456 Big Sky Blvd ,");
        shipping.append("Shipping City : Outer Rim ,");
        shipping.append("Shipping State : TX ,");
        shipping.append("Shipping Zip : 75333 ");

        String billingFrom = billing.toString();
        System.out.println(billingFrom);

        String shipTo = shipping.toString();
        System.out.println(shipTo);


    }
}
