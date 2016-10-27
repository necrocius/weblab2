public class system {
    float a, b, c;
    system(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    String decision(system ob1) {
        if (ob1.a==a && ob1.b==b)
            return "0";
        if ((ob1.a==0 && ob1.b==0) || (a==0 && b==0))
            return "1";
        float d;
        d = ob1.a*b - a*ob1.b;
        if (d==0)
            return "2";
        return "9";
    }
}
