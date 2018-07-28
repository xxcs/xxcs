package interpreterpattern.example;

public class Not extends Expression {
    /**
     * 代表逻辑非操作的Not类，代表由一个布尔表达式通过逻辑非操作给出一个新的布尔表达式的操作
     */

    private Expression exp;

    public Not(Expression exp){
        this.exp = exp;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Not)
        {
            return exp.equals(
                    ((Not)obj).exp);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean interpret(Context ctx) {
        return !exp.interpret(ctx);
    }

    @Override
    public String toString() {
        return "(Not " + exp.toString() + ")";
    }

}

