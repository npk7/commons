package democommons;

import org.apache.commons.math3.stat.StatUtils;

public class demo1 {
	public static void main(String[] args){
		double input[] = {12,1502,54,87};
		double mean = StatUtils.mean(input);
		System.out.println("Answer is " + mean);
	}
}
