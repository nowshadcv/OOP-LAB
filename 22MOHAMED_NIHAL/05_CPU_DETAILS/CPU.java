package cpudetails;

public class CPU {
		double price;
		
		class Processor{
			double cores;
			String manufacturer;
			double getCache(){
				return 4.3;
			}
		}
		static class RAM{
			double memopry;
			String manufacturer;
			double getClockSpeed(){
				return 5.5 ;
			}
		}
}
