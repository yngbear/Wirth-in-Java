package wirth_linkesassigninginrecords;
/**
 *
 * @author yngbear
 */
public class Wirth_LinkesAssigningInRecords {

    public static void main(String[] args) {
        
        int[] index = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] name = {"Carolyn", "Christopher", "Paula", "Robert", "John", 
            "Jenny", "Richard", "Mary", "Anna", "Matthew"};
        char[] gender = {'F', 'M', 'F', 'M', 'M', 'F', 'M', 'F', 'F', 'M'};
        int[] linkValue = new int[10];
        
        //COUNTING FEMALES
        int femaleCount = 0;
        for(int i = 0; i < gender.length; i++) {
            if(gender[i] == 'F')
                femaleCount++;    
        }    
        System.out.println("There are " + femaleCount + " females in the table.");
        
        //COUNTING MALES
        int maleCount = 0;
        for(int i = 0; i < gender.length; i++) {
            if(gender[i] == 'M')
                maleCount++;    
        }    
        System.out.println("There are " + maleCount + " males in the table.");
        
        //ASSINGNING LINKES
        int previousFemaleLinkValueIndex = 0;
        int currentFemaleLinkValueIndex = 0;
        int previousMaleLinkValueIndex = 0;
        int currentMaleLinkValueIndex = 0;
        
        for(int i = 0; i < gender.length; i++) {
            if(gender[i] == 'F') {
		currentFemaleLinkValueIndex = i;
                break;
            }
        }
        for(int i = 0; i < gender.length; i++) {
            if(gender[i] == 'M') {
		currentMaleLinkValueIndex = i;
                break;
            }
        }
        for(int i = currentFemaleLinkValueIndex + 1; i < gender.length; i++) {	
            if(gender[i] == 'F') {
		linkValue[currentFemaleLinkValueIndex] = i - currentFemaleLinkValueIndex;
                previousFemaleLinkValueIndex = currentFemaleLinkValueIndex;
                currentFemaleLinkValueIndex = i;
                break;
            }
        }
        for(int i = currentMaleLinkValueIndex + 1; i < gender.length; i++) {	
            if(gender[i] == 'M') {
		linkValue[currentMaleLinkValueIndex] = i - currentMaleLinkValueIndex;
                previousMaleLinkValueIndex = currentMaleLinkValueIndex;
                currentMaleLinkValueIndex = i;
                break;
            }
        }
        for(int i = currentFemaleLinkValueIndex + 1; i < gender.length; i++) {	
            if(gender[i] == 'F') {
		linkValue[currentFemaleLinkValueIndex] = i - previousFemaleLinkValueIndex;
                previousFemaleLinkValueIndex = currentFemaleLinkValueIndex;
                currentFemaleLinkValueIndex = i;
            }
        }
        for(int i = currentMaleLinkValueIndex + 1; i < gender.length; i++) {	
            if(gender[i] == 'M') {
		linkValue[currentMaleLinkValueIndex] = i - previousMaleLinkValueIndex;
                previousMaleLinkValueIndex = currentMaleLinkValueIndex; 
                currentMaleLinkValueIndex = i;
            }
        }
       	linkValue[currentFemaleLinkValueIndex] = currentFemaleLinkValueIndex - previousFemaleLinkValueIndex;
	linkValue[currentMaleLinkValueIndex] = currentMaleLinkValueIndex - previousMaleLinkValueIndex;
                
        System.out.println("Succeding link values:");
        for(int i = 0; i < linkValue.length; i++) 
        System.out.println(linkValue[i]);
    }    
}   
