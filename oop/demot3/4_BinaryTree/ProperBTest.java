public class ProperBTest{
	public static void main(String[] args) {

    	ProperBT<Integer> B = new ProperBT<Integer>();
    	B.add(1);
    	B.print();
    	B.add(5);
    	B.print();
    	B.add(3);
    	B.print();
		B.find(3);
		B.add(42);
		B.add(2021);
		B.add(364);
		B.add(34);
		B.add(769);
		B.add(6);
    	B.print();
	}
}
