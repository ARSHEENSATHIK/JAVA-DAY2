public class elseIfLadder {
    public static void main(String[] args) {
        int rollNumber[] = {05,26,40,39};
        int marks[] = {81,75,43,58};
        for(int i=0;i<rollNumber.length;i++)
        {
            if(marks[i]>70)
                System.out.println(rollNumber[i] + ":  HOnors" );
            else if(marks[i]>60)
                System.out.println(rollNumber[i] + " :  I DIvision");
            else if(marks[i]>50)
                System.out.println(rollNumber[i] + " : II Division");
            else
                System.out.println(rollNumber[i]+ " : Fail");
          

        }
    }
    
}
