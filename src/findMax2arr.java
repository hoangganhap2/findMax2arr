import java.util.Scanner;

public class findMax2arr {
    public static int maxValue(int a[][]){
        int max=a[0][0];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j]>max){
                    max=a[i][j];

                }
            }
        }return max;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Nhap vao col");
        int col=input.nextInt();

        System.out.println("Nhap vao row");
        int row=input.nextInt();
        int a[][]= new int[col][row];
        for (int i=0;i<col;i++){
            for (int j=0;j<row;j++){
                System.out.println("Nhap vao phan tu cua ma tran"+i+j);
                a[i][j]=input.nextInt();
            }
        }
        System.out.print("So lon nhat la "+ maxValue(a));
    }

}
