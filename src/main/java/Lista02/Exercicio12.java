/*
 * Copyright (C) 2024 Lucas  Reis <lucaslladder@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package Lista02;

import java.util.Scanner;

/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 01/03/24
 * @brief class Exercicio12
 */
public class Exercicio12 {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,fatorial;
        fatorial = 1;
        System.out.println("INFORME UM NUMERO");
        n = in.nextInt();
        
        for(int i=1;i<=n;i++){
            fatorial = fatorial * i;
        
        }
        System.out.println("NUMERO FATORADO = " +fatorial);
        
        
        
        // fatorial usando while
        int x,n2,fat2;
            System.out.println("INFORME UM NUMERO");
        n2 = in.nextInt();
        x = 1;
        fat2 = 1;
       
        while(x <= n2){
             
            fat2 = fat2 *x;
           
            x++;
        }
        
        System.out.println("NUMERO FATORADO = " + fat2 );
 
        
        
    }
}
