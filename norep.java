
/**
 * Write a description of norep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class norep {    
    public String norep(){
        String b1 = null;
        String arr[]  = new String[] {"C++", "Python", "Java", "Java"};
        for(int i= 0; i<arr.length; i++) {
            
            for(int j=i+1;j<arr.length;j++) {
                
                if(arr[i]==arr[j]) {
                    b1 = arr[i];
                }
                else{
                    break;
                }
                
            }
            
        }
            return b1;
    }
    
    public void np () {
        String b2 = norep();
        if(b2!=null){
            System.out.println(b2);
        }
        else{
            System.out.println("No repeat");
        }
        
    }
    public static void main(String[] args) {
        norep pr = new norep();
        pr.np();
        
    }
}   
    

