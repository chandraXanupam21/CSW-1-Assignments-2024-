package pack1;

public class Q4 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		boolean primitiveBoolean = false;

        Boolean autoboxedBoolean = primitiveBoolean;
        System.out.println("Autoboxed Boolean: " + autoboxedBoolean);

        Boolean constructedBoolean = new Boolean(primitiveBoolean); 
        System.out.println("Constructed Boolean: " + constructedBoolean);
    }
	}


