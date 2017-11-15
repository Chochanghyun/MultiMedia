//  ex_1.java
//  Created by deok9 on 2017. 11. 13..
//  Copyright © 17year deok9. All rights reserved.
//
//  I think author intending inputMismatch
//  But if i just do read question
//  What is mean? very confuse
//  ps. But it wasn't difficult for me

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args){
        int x=0, y=0, z=0;
        Scanner input = new Scanner(System.in);

        //InputZone
        System.out.println("Insert Two Integer : ");
        try{
            x = input.nextInt();
            y = input.nextInt();
        }catch(InputMismatchException e){
            System.out.println(e.toString());//showing traceback
        }

        //OutputZone
        z = x*y;
        System.out.printf("%d * %d = %d ",x,y,z);

    }
}
