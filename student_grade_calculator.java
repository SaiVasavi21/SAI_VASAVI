import java.util.*;

public class task2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the numebr of subjects: ");
        int num=sc.nextInt();
        int[] marks=new int[num];
        for(int i=0;i<num;i++)
        {
            System.out.println("Enetr the marks for subject"+(i+1)+":");
            marks[i]=sc.nextInt();
            
        }
        int totalmarks=0;
        for(int mark:marks)
        {
            totalmarks+=mark;
        }
        double averagepercentage=(double) totalmarks/num;
        String grade="";
        if(averagepercentage>=90)
        {
            grade="A";
        }
        else if(averagepercentage>=80)
        {
            grade="B";
        }
        else if(averagepercentage>=70)
        {
            grade="C";
        }
        else if(averagepercentage>=60)
        {
            grade="D";
        }
        else
        {
            grade="F";
        }
        System.out.println("Total Marks:"+totalmarks);
        System.out.println("Average Percentage: "+averagepercentage);
        System.out.println("GRADE: "+grade);
    }
}
