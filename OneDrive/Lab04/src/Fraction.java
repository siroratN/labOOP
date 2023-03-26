public class Fraction {
    public int topN;
    public int btmN;
    public String toFraction(){
        return topN+"/"+btmN;
    }
    public String toFloat(){
        double N = topN;
        double M = btmN;
        return String.valueOf(N/M);
    }
     public void addFraction(Fraction f){
        if (btmN == f.btmN){
            topN = topN+f.topN;
        }
        else if (btmN != f.btmN);{
            topN = topN*f.btmN + f.topN*btmN;
            btmN = btmN*f.btmN;
        }
    }
    public boolean myEquals(Fraction x){
        double t = x.topN;
        double b = x.btmN;
        double n = topN;
        double m = btmN;
        return t/b == n/m;
        
    }
    public void LowestTermFrac(){
        btmN = btmN / topN;
        topN /= topN;
    }
}
