import java.util.*;

public class cap{
Scanner input = new Scanner(System.in); 
int arr[][];
int row; 
int col; 

public cap(int row, int col){
int arr[][] = new int[row][col]; 
this.row = row; 
this.col = col; 
}

public void populate(int arr[][]){
System.out.print("Please enter "+(this.row*this.col)+" numbers: ");
for(int i = 0; i < this.row; i++){
for(int j = 0; j < this.col; j++){
arr[i][j]=input.nextInt(); 
}
}

}

public void display(int arr[][]){
System.out.println("Array contents: "); 
for(int i = 0; i < this.row; i++){
for(int j = 0; j < this.col; j++){
System.out.print(arr[i][j]+" \t"); 
}
System.out.print("\n"); 
}

}

public void even_numbers(int arr[][]){
    int sum = 0;
    System.out.println("Array contents: ");
    for(int i = 0; i < this.row; i++){
        for(int j = 0; j < this.col; j++){
        if(arr[i][j]%2==0){
            sum+=arr[i][j];
            System.out.print(arr[i][j]+" \t\t");
        } else{
            System.out.print(" "+"\t\t");
        }
        }
        System.out.print("\n");
    }
    System.out.print("Sum of even numbers is: "+sum);
    System.out.println();
}

public void odd_numbers(int arr[][]){
    int sum = 0;
    System.out.println("Array contents: ");
    for(int i = 0; i < this.row; i++){
        for(int j = 0; j < this.col; j++){
            if(arr[i][j]%2!=0){
                sum+=arr[i][j];
                System.out.print(arr[i][j]+" \t\t");
            } else{
                System.out.print(" "+"\t\t");
            }
        }
        System.out.print("\n");
    }
    System.out.print("Sum of odd numbers is: "+sum);
System.out.println();
}
public void displaysort(int arr[][]){

    sortarray(arr);

}
public void sortarray(int [][]arr, int row, int col){
    for(int i = 0; i < this.row; i++){
        for(int j = 0 ; j < this.col; j++){
            insertsort(arr[i][j], row, col);
        }
    }
}
public void insertsort(int[][] arr, int row, int col){
int key, j;
for(int i =1; i < row; i++){
    key = arr[i][col];
    int[] keyrow=arr[i];
    j = i -1;
    while((j >=0)&&(arr[j][col]>key)){
        arr[j+1] = arr[j];
        j = j-1;
    }
    arr[j+1]=keyrow;
    }
}
}