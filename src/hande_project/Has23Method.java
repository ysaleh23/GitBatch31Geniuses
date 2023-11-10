package hande_project;

public class Has23Method {

    public static void main(String[] args) {
        System.out.println(has23(new int[]{2, 5}));
    }

    public static boolean has23(int[] nums) {

        for(int each : nums){
            if(each ==2 || each ==3){
                return true;
            }
        }
        return false;
    }
}

/*
Given an int array length 2, return true if it contains a 2 or a 3.
 */
