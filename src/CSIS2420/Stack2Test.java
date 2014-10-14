package CSIS2420;


//Test Driver for the Stack 2 class



public class Stack2Test{
	public static void main (String[] args) {
		String [] fight = new String[10];
		fight[0] = "We will cheer for the red and white of our fighting SUU";
		fight[1] = "Hear our battle cry echo through the sky";
		fight[2] = "As our team comes racing through";
		fight[3] = "They will fight, fight, fight, 'til they hear us shout";
		fight[4] = "And we sing our victory song";
		fight[5] = "We will run, we will score";
		fight[6] = "'Til the thunder roars, and the T-birds win once more";
		fight[7] = "Go, Go, Go";
		fight[8] = "Fight, Fight, Fight";
		fight[9] = "WIN T-BIRDS!!!";
		
		
		Stack2 objStack = new Stack2();
		
		for(int i=9; i>-1; i--){
			objStack.push(fight[i]);
			System.out.println(objStack.print());
		}
		
		while(!objStack.isEmpty()){
			objStack.pop();
			System.out.println(objStack.print());
		}
	}
}