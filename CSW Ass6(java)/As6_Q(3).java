package pack1;

public class Q2_float {
	
	public static void main(String[] args) {
	float Float = 21;

    float autoboxedInteger = Float; 
    System.out.println("Autoboxed Float: " + autoboxedInteger);

    float constructedInteger = new Float(Float); 
    System.out.println("Constructed Float: " + constructedInteger);
}
}