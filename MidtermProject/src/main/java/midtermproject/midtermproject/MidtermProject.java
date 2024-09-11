

package midtermproject.midtermproject;

import java.util.Scanner;


public class MidtermProject {
    //ميثود يسمح للمستخدم بادخال قيم المصفوفتين
      public static int[][] printarray(int row,int col){
          int array[][] =new int [row][col] ;
             Scanner in=new Scanner (System.in);

          for (int i = 0; i < row; i++) {
              for (int j = 0; j < col; j++) {
                  array[i][j]=in.nextInt();
              }
              
          }
          return array;
      }
      //ميثود يعمل على جمع المصفوفتين
      public static void sum(int[][]arr1,int[][]arr2){
          int [][]array=new int[arr1.length][arr1[0].length];
          for (int i = 0; i < arr1.length; i++) {
              for (int j = 0; j < arr1[0].length; j++) {
                  array[i][j]=arr1[i][j]+arr2[i][j];
                  
              }
          }  
           for (int i = 0; i < array.length; i++) {
              for (int j = 0; j < array[0].length; j++) {
          System.out.print(array[i][j]+" ");
          
          }
               System.out.println("");
           }
      }
           //ميثود يعمل على طرح المصفوفتين
    private static void SUBT(int[][] arr1, int[][] arr2) {
         int [][]array=new int[arr1.length][arr1[0].length];
          for (int i = 0; i < arr1.length; i++) {
              for (int j = 0; j < arr1[0].length; j++) {
                  array[i][j]=arr1[i][j]-arr2[i][j];
                  
              }
    }
          for (int i = 0; i < array.length; i++) {
              for (int j = 0; j < array[0].length; j++) {
          System.out.print(array[i][j]+" ");
          
          }
              System.out.println("");
           }
}
//ميثود يعمل على ضرب المصفوفتين 
    private static void MUL(int[][] arr1, int[][] arr2) {
         int [][]array=new int[arr1.length][arr2[0].length];
         int counter =0;
         if(arr1[0].length==arr2.length){
          for (int i = 0; i < arr1.length; i++) {
              for (int j = 0; j < arr2[0].length; j++) {
                  for (int k = 0; k < arr2.length; k++) {
                       array[i][j]+=arr1[i][k]*arr2[k][j];
                  }
                  
              }
    }
             System.out.println("mul is");
             for (int row = 0; row < array.length; row++) {
                 for (int col = 0; col < array[0].length; col++) {
                     System.out.print(array[row][col]+" ");
                 }
                 System.out.println("");
             }
         }
}
//ميثود يعمل على قلب اعمدة المصفوفة المستدعاه الى صفوف والصفوف الى اعمدة
    private static void Transpose(int[][] arr1) {
         int [][]array=new int[arr1.length][arr1[0].length];
          for (int i = 0; i < arr1[0].length; i++) {
              for (int j = 0; j < arr1.length; j++) {
                  System.out.print(arr1[j][i]+" ");
              }
              System.out.println("");
    }
          
}
    //تعريف ميثود يقبل المصفوفتين وعدد العمليات التي ستقام عليها يعمل على اختيار نوع العمليات  
      public static void working(int numberOfOperations ,int[][]arr1,int[][]arr2){
          Scanner in =new Scanner (System.in);
          //String str=in.nextLine();
          System.out.println("Available Operations is : \n arr1+arr2\narr1-arr2\narr2-arr1\narr1*arr2\narr2*arr1\nTranspose arr1\nTranspose arr2\n");
          System.out.println("Please select the text of the operation with the same mentioned above\n");
          for (int i = 1; i <= numberOfOperations; i++) {
              String str=in.nextLine();
              switch(str){
                  case "arr1+arr2":System.out.println("arr1+arr2");
                                   sum(arr1,arr2);break;
                  case "arr1-arr2":System.out.println("arr1-arr2");
                                   SUBT(arr1,arr2); break;
                  case "arr2-arr1":System.out.println("arr2-arr1");
                                   SUBT(arr2,arr1); break;
                  case "arr1*arr2":System.out.println("arr1*arr2");
                                   MUL(arr1,arr2);  break;
                  case "arr2*arr1":System.out.println("arr2*arr1");
                                   MUL(arr2,arr1);  break;
                  case "Transpose arr1":System.out.println("Transpose arr1");
                                   Transpose(arr1); break;
                  case "Transpose arr2":System.out.println("Transpose arr2");
                                   Transpose(arr2); break;
                  default: System.out.println("try again");                
              }
          }
      }
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        //تم تعريف متغير يشير الى عدد مرات تكرار البرنامنج يتم ادخاله عن طريق المستخدم
        System.out.println("Enter the number of times the program is repeated");
        int T=in.nextInt();
        if(T>=1&&T<=100){
            for (int i = 1; i <= T; i++) {
           //ادخال عدد اعمدة وصفوف المصفوفتين المراد اجراء العمليات عليها
        System.out.println("inter the row of arr1");
        int row1=in.nextInt();
        System.out.println("inter the column of arr1");
        int col1=in.nextInt();
        System.out.println("inter the row of arr2");
        int row2=in.nextInt();
        System.out.println("inter the column of arr2");
        int col2=in.nextInt();
         int arr1[][] =new int[row1][col1],arr2[][] = new int[row2][col2];
        if((row1>=1&&row1<=30)&&(col1>=1&&col1<=30)&&(row2>=1&&row2<=30)&&(col2>=1&&col2<=30)){
             System.out.println("Enter the elements of the arr1 ");
       arr1= printarray(row1,col1);
             System.out.println("Enter the elements of the arr2 ");
       arr2= printarray(row2,col2);
        }
        System.out.println("inter the number of operations\n");
        int numberOfOperations=in.nextInt();
        working(numberOfOperations,arr1,arr2);
    }
        }
    }

   
}