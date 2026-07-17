package String;

public class String_Problem23 {
    int ans;
    public int findOccurrence(char mat[][], String target){
        ans=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                dfs(mat,target,i,j,0);
            }
        }
        return ans;
    }
    public void dfs(char mat[][], String target,int i,int j, int idx){
        if(i<0 || j<0 || i== mat.length|| j==mat[0].length|| target.charAt(idx)!=mat[i][j])return;
        if(idx==target.length()-1){
            ans++;
            return;
        }
        char temp = mat[i][j];
        mat[i][j] ='0';
        dfs(mat,target,i+1,j,idx+1);
        dfs(mat,target,i-1,j,idx+1);
        dfs(mat,target,i,j+1,idx+1);
        dfs(mat,target,i,j-1,idx+1);
        mat[i][j]=temp;

    }

    public static void main(String[] args) {

    }


}
