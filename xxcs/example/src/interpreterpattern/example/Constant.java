package interpreterpattern.example;

import org.omg.CORBA.CODESET_INCOMPATIBLE;
import org.omg.CORBA.PUBLIC_MEMBER;

public class Constant extends Expression {
    /**
     * 一个Constant对象代表一个布尔常量
     */

    private boolean value;

    public Constant(boolean value){
        this.value = value;
    }

    @Override
    public boolean equals(Object obj){

        if (obj != null && obj instanceof Constant){
            return this.value == ((Constant) obj).value;
        }

        return false;
    }

    @Override
    public int hashCode(){
        return this.toString().hashCode();
    }

    @Override
    public boolean interpret(Context ctx){
        return value;
    }

    @Override
    public String toString(){
        return new Boolean(value).toString();
    }
}
