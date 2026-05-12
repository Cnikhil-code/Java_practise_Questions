class OnlineShopping {

    // Method to be overridden
    void paymentMethod() {
        System.out.println("Payment can be done using different methods.");
    }
}

// Derived class 1
class CreditCardPayment extends OnlineShopping {

    // Override method
    @Override
    void paymentMethod() {
        System.out.println("Payment done using Credit Card.");
    }
}

// Derived class 2
class UpiPayment extends OnlineShopping {

    // Override method
    @Override
    void paymentMethod() {
        System.out.println("Payment done using UPI.");
    }
}

// Derived class 3
class CashOnDelivery extends OnlineShopping {

    // Override method
    @Override
    void paymentMethod() {
        System.out.println("Payment done using Cash on Delivery.");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {

        // Parent class reference with child class objects
        OnlineShopping obj;

        obj = new CreditCardPayment();
        obj.paymentMethod();

        obj = new UpiPayment();
        obj.paymentMethod();

        obj = new CashOnDelivery();
        obj.paymentMethod();
    }
}
