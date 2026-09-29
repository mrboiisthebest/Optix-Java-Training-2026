public class PartyTask{
    public static void main(String[] args){
        int outcome = TeaParty(5,5);
        int outcome2 = TeaParty(2,5);
        int outcome3 = TeaParty(5,15);

        System.out.println(outcome);
        System.out.println(outcome2);
        System.out.println(outcome3);

    }

    public static int TeaParty(int tea, int candals){
        int result = 0;

        if(tea < 5 || candals < 5){
            return 0;
        }
        
        if(tea >= 5 && candals >= 5){
            result = 1;
        }

        if(tea >= (candals * 2) || candals >= (tea * 2)){
            result = 2;
        }
        return result;
    }
}