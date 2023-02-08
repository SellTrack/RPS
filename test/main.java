package test;

public class main {
	public static void main(String[] args) {
		legend_rock rock2 = new legend_rock();
		rock2.temperature = 20;
		System.out.println(rock2.temperature);
		normal_rock rock1 = new normal_rock();
		rock1.temperature = rock2.gettemp();
		System.out.println(rock1.temperature);
	}
}
