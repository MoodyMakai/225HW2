public class Grove {
    public Tree[] trees;
    public String GroveName;


    public Grove(String GroveName){
        trees = new Tree[13];
        this.GroveName = GroveName;
    }

    public int planter(Tree tree){
        for(int i=0; i<13;i++){
            if (trees[i]==null){
                trees[i] = tree;
                return i;
            }
        }
        return -1;
    }


    public int chopper(int x){
        if (trees[x] != null){
            trees[x] = null;
            return x;
        }
        return 0;
    }

    public String toString(){
        int x = 0;
        for(int i=0; i<13;i++){
            if (trees[i]!=null){
                x++;
            }
        }
        return "" + x;
    }








}
