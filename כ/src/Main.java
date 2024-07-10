
public class Main 
{
    public static void main(String[] args) 
    {
        double[][] arr = {{4, 5, 15.25, 7}, {2, 0.5, 0.3}, {11.9, 30.2}};

        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length - 1; j++) 
            {
                for (int k = 0; k < arr[i].length - j - 1; k++) 
                {
                    if (arr[i][k] > arr[i][k + 1]) 
                    {
                        double temp = arr[i][k];

                        arr[i][k] = arr[i][k + 1];

                        arr[i][k + 1] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
