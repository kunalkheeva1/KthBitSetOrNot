public class KthBitSetOrNot {

    // return true or false
    public boolean kthBitSetOrNot(int n, int k){

        // get a bit mask after shifting the 1 kth times
        int bitmask = 1<<k;

        // take and operator and if its 1 it will return 1 otherwise 0
        int ans = bitmask & n;
        // if ans greater than 0 return true otherwise false
        if(ans>0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
