import org.example.calcolatrice;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class testcalcolatrice {

    calcolatrice calc;

    public final void  setup(){

        calc= new calcolatrice();

    }


    public void testadd(){
        assertTrue(calc.add(2,1)==3,"somma corretta");
    }

    public void testasub(){
        assertTrue(calc.sub(2,1)==1,"sottrazione corretta");
    }

    public void testamul(){
        assertTrue(calc.multiply(2,1)==2,"sottrazione corretta");
    }

    public void testadiv(){
        assertTrue(calc.divide(10,2)==5,"sottrazione corretta");
    }
}
