public class KthBitSetOrNot {
    public boolean kthBitSetOrNot(int n, int k){
        int bitmask = n<<k;
        int ans = bitmask & 1;

        if(ans>0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
