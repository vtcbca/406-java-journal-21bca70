class OverloadMethod
{
    public void display(String s1,String s2)
	{
        System.out.println("The Concated String is:"+(s1+s2));
    }
    public void display(int a,int b)
	{
        System.out.println("The Addition of "+a+" and "+b+" is:"+(a+b));
    }
    public static void main(String args[])
	{
        OverloadMethod o=new OverloadMethod();
        o.display("het","patel");
        o.display(13,11);   
    }
}
