public class Main2 
{

    public static void main(String[] args) 
    {
        // יוצרים מערך דו מימדי ומציבים את הערכים שקיבלנו במשימה ואחרי זה נתחיל לסדר אחרי שהצבנו
        double[][] Array = {{4, 5, 15.25, 7}, {2, 0.5, 0.3}, {11.9, 30.2}};

        // ניצור מערך חד-ממדי של מספרים עשרוניים אורך המערך שווה לאורך המערך הקודם  והוא ישמש לאחסון סכומי כל שורה
        double[] sumsArray = new double[Array.length];
      
        // הלולאה הזאתי עוברת על כל שורה במערך, בכל איטרציה המערך של הלולאה מחזיקה את השורה הנוכחית
        for (double[] innerArray : Array) 
        {
            //  ניצור עוד לולאה שהיא עוברת על כל איבר בשורה הנוכחית  עד האיבר האחרון לפני האחרון (כי אנחנו משווים זוגות עוקבים).
            for (int i = 0; i < innerArray.length - 1; i++) 
            {
                // הלולאה הזאתי תעבור על כל זוג עוקב של ערכים בשורה הנוכחית
                for (int j = 0; j < innerArray.length - i - 1; j++) 
                {
                    // עכשיו נבדוק האם האיבר הנוכחי גדול מהאיבר שאחריו
                    if (innerArray[j] > innerArray[j + 1]) 
                    {
                            // אם התנאי נכון, נשמור את הערך הנוכחי במשתנה זמני
                            double TempValue = innerArray[j];
                            // נעביר את הערך של האיבר שאחרילמקום של האיבר הנוכחי
                            innerArray[j] = innerArray[j + 1];
                            //  נעביר את הערך ששמרנו במשתנה הזמני למקום של האיבר שאחרי  
                            innerArray[j + 1] = TempValue;
                    }
                }
            }
        }
        
        // הלולאה הזאתי עוברת על כל שורה במערך
        for (int i = 0; i < Array.length; i++) 
        {
            // הלולאה הזאת עוברת על כל איבר בשורה הנוכחית בכל איטרציה ומחזיקה את הערך הנוכחי
            for (double Value : Array[i]) 
            {
                // נוסיף את הערך הנוכחי  לסכום של השורה הנוכחית
                sumsArray[i] += Value;
            }
        }
        
        // הלולאה הזאתי עוברת על כל איבר במערך
        for (int i = 0; i < sumsArray.length - 1; i++) 
        {
            //  לולאה נידנית בתוך הלולאה הקודמת היא עוברת על כל זוג עוקב של סכומי שורות
            for (int j = i + 1; j < sumsArray.length; j++) 
            {
                // נבדוק האם סכום השורה הנוכחית גדול מסכום השורה שאחריה
                if (sumsArray[i] > sumsArray[j]) 
                {
                    // אם התנאי נכון, שומרת את סכום השורה הנוכחית במשתנה זמני 
                    double TempValue = sumsArray[i];
                    // נעביר את סכום השורה שאחריה למקום של סכום השורה הנוכחית
                    sumsArray[i] = sumsArray[j];
                    // מעבירה את סכום השורה ששמרנו במשתנה הזמני  למקום של סכום השורה שאחריה 
                    sumsArray[j] = TempValue;
                    // נשמור את השורה הנוכחית  במערך זמני 
                    double[] TempArray = Array[i];
                    // נעביר את השורה שאחריה  למקום של השורה הנוכחית 
                    Array[i] = Array[j];
                    // נעביר את השורה ששמרנו במערך הזמני  למקום של השורה שאחריה
                    Array[j] = TempArray;
                }
            }
        }

        // אחרי שמיימנו וסידרנו הכל נדפיס את המערך המוסדר בלולאה
        for (double[] innerArray : Array) 
        {
            for (double value : innerArray) 
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
