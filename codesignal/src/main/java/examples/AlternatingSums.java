package examples;

public class AlternatingSums {

    int[] alternatingSums(int[] a){
        if(a.length<1 || a.length > 100000)
            return null;
        int team1,team2;
        team1=team2=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<45 || a[i]>100)
                return null;
            if(i%2==0)
                team1+=a[i];
            else
                team2+=a[i];
        }
        return new int[]{team1, team2};
    }

}
