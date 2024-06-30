class Solution {
    public int find(int x,int[] parent){
        if(parent[x]==x){
            return x;
        }
        parent[x]=find(parent[x],parent);
        return parent[x];
    }
    public boolean union(int x,int y,int[] parent,int[] rank){
        int lx=find(x,parent);
        int ly=find(y,parent);
        if(lx!=ly){
            if(rank[lx]>rank[ly]){
                parent[ly]=lx;
            }else if(rank[lx]<rank[ly]){
                parent[lx]=ly;
            }else{
                parent[lx]=ly;
                rank[ly]++;
            }
            return true;
        }
        return false;
    }
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        Arrays.sort(edges,(a,b)->Integer.compare(b[0],a[0]));
        int[] parenta=new int[n+1];
        int[] parentb=new int[n+1];
        int[] ranka=new int[n+1];
        int[] rankb=new int[n+1];
        for(int i=0;i<=n;i++){
            parenta[i]=i;
            parentb[i]=i;
            ranka[i]=1;
            rankb[i]=1;
        }
        int counta=1;
        int countb=1;
        int remove=0;
        for(int[] e:edges){
            if(e[0]==3){
                boolean alice=union(e[1],e[2],parenta,ranka);
                boolean bob=union(e[1],e[2],parentb,rankb);
                if(alice){
                    counta++;
                }
                if(bob){
                    countb++;
                }
                if(!alice&&!bob){
                    remove++;
                }
            }
            else if(e[0]==1){
                boolean alice=union(e[1],e[2],parenta,ranka);
                if(alice){
                    counta++;
                }else{
                    remove++;
                }
            }else{
                boolean bob=union(e[1],e[2],parentb,rankb);
                if(bob){
                    countb++;
                }else{
                    remove++;
                }
            }
            
        }
        if(counta!=n||countb!=n){
            return -1;
        }
        return remove;
    }
}