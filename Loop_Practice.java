public class Loop_Practice{
    public static void main( String[] args){
        
        //print out the cubes of the integers from 1 to 10 inclusive
        
        int i, cube;
        System.out.println();
        System.out.println("i\tcube i");
        cube=1;
        for(i=1; i<=10; i++){
            cube= i*i*i;
            System.out.println(i + "\t" + cube);
        }
        
        //print out decreasing consecutive odd integers from 99 to 1
        
        int j;
        System.out.println();
        System.out.println("j");
        for(j=99; j>=1; j-=2){
            System.out.println(j);
        }
        
        //print out the characters of the string on separate lines
        //"The quick brown fox jumped over the lazy dog"
        
        int k;
        String str= "The quick brown fox jumped over the lazy dog";
        System.out.println();
        System.out.println("'The quick brown fox jumped over th lazy dog.'");
        System.out.println("\tNumber of Characters");
        for(k=0; k<=44; k++){
            k=str.length();
            char l=str.charAt(0);
            System.out.println("\t"+k);
        }
    }
}