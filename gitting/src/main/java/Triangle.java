public class Triangle {

    String kindOfTriangle(int one, int two, int three) {

        if(one == 0 || two == 0 || three == 0)
        {
            return "Invalid";
        }

        if(one >= 20 || two >=20 || three >= 20)
        {
            return "Invalid";

        }

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
