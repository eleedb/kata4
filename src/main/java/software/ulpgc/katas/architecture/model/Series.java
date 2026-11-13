package software.ulpgc.katas.architecture.model;

import java.util.Arrays;

public record Series(int[] values) {
    public Series() { this(new int[0]); }

    public Series put(int value){
        int[] values = Arrays.copyOf(this.values, this.values.length +1);
        values[this.values.length] = value;
        return new Series(values);
    }
    public int length(){
        return this.values.length;
    }
    public int first(){
        return this.values[0];
    }
    public int last(){return values[length()-1];}
}
