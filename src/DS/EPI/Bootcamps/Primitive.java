package DS.EPI.Bootcamps;

/**
 * Created by jude on 4/6/16.
 */
public class Primitive {

    /* both must be set */
    public void andOperation(){
        int andOperation = 6 & 4;
        System.out.println("AND Operation of 6 , 4 is : " + andOperation);
    }

    /* either one must be set */
    public void orOperation() {
        int orOpeation = 1 | 2;
        System.out.println("OR operation of 1 , 2 is : " + orOpeation);
    }

    public static void main (String[]args){
        Primitive p = new Primitive();
        p.andOperation();
        p.orOperation();
    }

}
