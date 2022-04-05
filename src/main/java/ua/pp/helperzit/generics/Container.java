package ua.pp.helperzit.generics;

public class Container<T, R, U> {

    T valueT;
    R valueR;
    U valueU;

    public Container(T valueT, R valueR, U valueU) {
        this.valueT = valueT;
        this.valueR = valueR;
        this.valueU = valueU;
    }

    public T getValueT() {
        return valueT;
    }

    public void setValueT(T valueT) {
        this.valueT = valueT;
    }

    public R getValueR() {
        return valueR;
    }

    public void setValueR(R valueR) {
        this.valueR = valueR;
    }

    public U getValueU() {
        return valueU;
    }

    public void setValueU(U valueU) {
        this.valueU = valueU;
    }
}
