import java.util.*;
public class coinProblem {
    static int count=0;
    public static void coinsPerm(int coin[],int target,String psf)
    {
        if(target==0)
        {
            count++;
            System.out.println(count+". "+psf);
            return;
        }

        for(int inst=0;inst<coin.length;inst++)
        {
            if(target>=coin[inst])
            {
                coinsPerm(coin, target-coin[inst], psf+coin[inst]);
            }
        }
    }
    public static void coinsPerm_01(int coin[],int target,boolean[] vis,int i,String psf)
    {
        if(target==0)
        {
            count++;
            System.out.println(count+". "+psf);
            return;
        }

        for(int inst=0;inst<coin.length;inst++)
        {
            int temp=coin[inst];
            if(coin[inst]>0 && target>=coin[inst])
            {
                coin[inst]=-coin[inst];
                coinsPerm_01(coin, target-temp, vis ,inst ,psf+temp);
                coin[inst]=-coin[inst];
            }
        }
    }
    public static void coinscomb(int coin[],int target,int lpi,String psf)
    {
        if(target==0)
        {
            count++;
            System.out.println(count+". "+psf);
            return;
        }

        for(int inst=lpi;inst<coin.length;inst++)
        {
            if(target>=coin[inst])
            {
                coinscomb(coin, target-coin[inst], inst,psf+coin[inst]);
            }
        }
    }
    public static void coinscomb_01(int coin[],int target,int lpi,String psf)
    {
        if(target==0)
        {
            count++;
            System.out.println(count+". "+psf);
            return;
        }

        for(int inst=lpi;inst<coin.length;inst++)
        {
            if(target>=coin[inst])
            {
                coinscomb(coin, target-coin[inst], inst+1,psf+coin[inst]);
            }
        }
    }
    public static void coinsCombSubs(int coin[],int lidx,int tar,int ans)
    {
        
    }
    public static void main(String[] args) {
        int coin[]={2,3,5,7};
        boolean vis[]=new boolean[coin.length];
        coinsPerm_02(coin,10,vis ,0,"");
    }
}