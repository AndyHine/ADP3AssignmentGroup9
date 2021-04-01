package za.ac.cput;

public class operator {

    String a;

    public operator(String ab) {
        a = ab;
    }

    public boolean equals(Object object2) {
        if(a == object2) {
            return true;
        }
        else return false;
    }

    public boolean equals2(Object object2) {
        if(a.equals(object2)) {
            return true;
        }
        else return false;
    }



    public static void main(String[] args) {

        operator object1 = new operator("test");
        operator object2 = new operator("test");

        object1.equals(object2);
        System.out.println(object1.equals(object2));

        object1.equals2(object2);
        System.out.println(object1.equals2(object2));
    }


}