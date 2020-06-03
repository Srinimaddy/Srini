
public class Range {
	void add_distance() {
		HeadPhone H = new HeadPhone();
		H.wire();
		H.speaker();
		System.out.println("--------------");
		BluetoothHeadphone BH = new BluetoothHeadphone();
		BH.wireless();
		BH.power();
		
	}
	
	public static void main(String[] args) {
		Range R = new Range();
		R.add_distance();
		

	}

}
