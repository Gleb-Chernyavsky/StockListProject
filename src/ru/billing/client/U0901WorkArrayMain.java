package ru.billing.client;

import javax.naming.spi.DirObjectFactory;

class U0901WorkArray <T extends Number> {
    T[] arrNums;
    public U0901WorkArray (T[] numP) {
        arrNums = numP;
    }

    public double sum() {
        double doubleWork = 0;
        for (Number item : arrNums) {
            doubleWork += item.doubleValue();
        }
        return doubleWork;
    }
    public T method(T t){
        return t;
    }
}

public class U0901WorkArrayMain {
    public static void main(String[] args) {
        Integer[] intArr={10,20,15};
        String[] strArr = {"no", "yes"};
        Float[] floatArr = new Float[3];
        for (int i = 0; i < floatArr.length; i++) {
            floatArr[i] = (float)Math.random();
        }
        U0901WorkArray insWorkArrayInt = new U0901WorkArray<Integer>(intArr);
        U0901WorkArray insWorkArrayFloat = new U0901WorkArray<Float>(floatArr);
//        U0901WorkArray insWorkArrayString = new U0901WorkArray<Number>(strArr);
        System.out.println("int array : " + insWorkArrayInt.sum());
        System.out.println("float array : " + insWorkArrayFloat.sum());
    }

}
