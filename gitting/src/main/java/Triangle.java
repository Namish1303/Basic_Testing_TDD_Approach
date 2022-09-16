public class Triangle {

    String kindOfTriangle(int one, int two, int three) {
        if (one == two) {
            if (two == three) {
                return "Equilateral";
            }
            else
            {
                return "Isosceles";
            }

        }
        else if (two == three){
            if(one == three)
            {
                return "Equilateral";
            }
            else{
                return "Isosceles";
            }
        }
        else if (one == three)
        {
            if(two == three)
            {
                return "Equilateral";
            }
            else
            {
                return "Isosceles";
            }
        }
        else
        {
            return "Scalene";
        }
    }


}
