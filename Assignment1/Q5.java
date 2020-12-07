package LabAssignments.Assignment1;

public class Q5 {
    public static void main(String[] args) {


        System.out.println("The prime numbers b/w 37 & 129 are:");

        for(int num = 38 ;num < 129; num++)
        {
            int count = 0;
            for(int j = 2; j<num/2; j++)
            {
                if(num%j == 0)
                {
                    count++;
                }
            }
            if(count == 0)
            {
                System.out.print(num+ "\t");
            }

        }


    }
}
