class OddException extends Exception{
    OddException(String str){
        System.out.println(str);
    }
}
class ExceptionHandaling{
    public static void main(String args[]){
        int a=Integer.parseInt(args[0]);
        try{
            if(a%2==0){
                System.out.println("The "+a+" is Even.");
            }
            else{
                throw new OddException("Number Consist Odd Value.");
            }

        }
        catch(OddException e){
            System.out.println(e);;
        }

    }
}

