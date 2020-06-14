class Calc {

    public static void main(String[] args) {
    System.out.println(Calculator.powerDouble(12.5, 10));
    System.out.println(Calculator.powerInt(12,10));
    }

}

class Calculator
{
    static double powerInt(int num1,int num2)
    {
        return Math.pow(num1,num2);
    }
static double powerDouble(double num1,int num2)
{
    return Math.pow(num1,num2);
}
}
