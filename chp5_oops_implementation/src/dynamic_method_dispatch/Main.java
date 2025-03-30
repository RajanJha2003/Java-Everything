package dynamic_method_dispatch;

class RBI{
	float getRateOfInterest() {
		return 0.0f;
	}
}


class SBI extends RBI{
	@Override
	float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 8.3f;
	}
	
}


class HDFC extends RBI{
	@Override
	float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 8.4f;
	}
	
}


class ICICI extends RBI{
	@Override
	float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 8.8f;
	}
	
}


public class Main {
	
	public static void main(String[] args) {
		RBI rbi;
		rbi=new SBI();
		System.out.println(rbi.getRateOfInterest());
		
		rbi=new HDFC();
		System.out.println(rbi.getRateOfInterest());
		
		
		rbi=new ICICI();
		System.out.println(rbi.getRateOfInterest());
	}

}
