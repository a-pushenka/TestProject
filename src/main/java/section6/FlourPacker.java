package section6;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(2,0,9));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,5,12));
        System.out.println(canPack(1,0,6));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigWeight = 5;
        int totalBigWeight = bigCount * bigWeight;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else if (totalBigWeight >= goal) { // 10 > 9
            return (goal % bigWeight) <= smallCount; //(9кг/10=остаток 1 лишний кг остался в мешке который нельзя поделить) <= 0 будет False
        }        //else if (smallCount >= remainingWeight);{        }
        else if (totalBigWeight < goal) {
            return goal - totalBigWeight <= smallCount;
        }
        return false;
    }
}