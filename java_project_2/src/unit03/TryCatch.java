package Unit03;

public class TryCatch {

	    public static void main(String[]args)
	    {
	        try  //Throw the exception
	        {
	            int data = 50/0;
	        }
	        //Handle the exception
	        catch (Exception e){
	            //Inside catch block exception
	            int data2 = 100/0;
	        }
	        System.out.println("Code Run properly :)");
	    }
	}
