package com.bsc.uf;
@SuppressWarnings({"all"})
public class UF {
    private int[] eleAndGroup;
    private int count;
    private int[] size;
    public UF (int N){
        this.eleAndGroup = new int[N];
        this.count = N;
        for (int i = 0; i < eleAndGroup.length; i++) {
            eleAndGroup[i] = i;
        }
        for (int i = 0; i < size.length; i++) {
            size[i] = 1;
        }
    }
    public int count(){
        return this.count;
    }
    public int find (int p){
        while (eleAndGroup[p]!=p) {
            p = eleAndGroup[p];
        }
        return eleAndGroup[p];
//        return eleAndGroup[p];
    }
    public boolean connect(int p,int q){
        return eleAndGroup[p] == eleAndGroup[q];
    }
    public void union(int p,int q){
        int proot = find(p);
        int qroot = find(q);
        if (proot==qroot){
            return;
        }
        if (size[proot]<size[qroot]){
            size[proot] = qroot;
            size[qroot]+=size[proot];
        }else {
            size[qroot] = proot;
            size[proot] = qroot;
        }
        count--;
    }
//        if (connect(p,q)){
//            return;
//        }
//        int pGroup = find(p);
//        int qGroup = find(q);
//        for (int i = 0; i < eleAndGroup.length; i++) {
//            if (eleAndGroup[i]==pGroup){
//                eleAndGroup[i] = qGroup;
//            }
//        }
//        this.count--;
//    }
}
