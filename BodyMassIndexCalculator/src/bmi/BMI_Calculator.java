package bmi;

import java.text.DecimalFormat;

public class BMI_Calculator {
	public static String calcolaBMI(double altezza, double peso) {
		if (altezza<0 || peso<0) return "Invalid values! Please enter positive  values.";
		else {
			DecimalFormat df = new DecimalFormat("#.##");
			double bmi = peso/(altezza*altezza);
			if(bmi<18.5) return "Your BMI is: "+df.format(bmi)+". You are underweight.";
			else if(bmi>=18.5 && bmi < 25) return "Your BMI is: "+df.format(bmi)+". You have a normal weight.";
			else if(bmi>=25 && bmi< 30) return "Your BMI is: "+df.format(bmi)+". You are overweight.";
			else if(bmi>=30 && bmi< 35) return "Your BMI is: "+df.format(bmi)+". You are obese.";
			else return "Your BMI is: "+df.format(bmi)+". You are clinically obese.";
		}
	}
}
