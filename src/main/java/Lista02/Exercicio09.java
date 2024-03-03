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
 * @brief class Exercicio09
 */
public class Exercicio09 {

        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base,ld,le;
        System.out.println("INFORME 3 VALORES PARA OBTER A CLASSIFICAÇÃO DO TRIANGULO");
        System.out.println("---------------------------------------------------------");
        
        System.out.println("INFORME O VALOR DA BASE");
        base = in.nextInt();
             System.out.println("INFORME O VALOR DO LADO DIREITO");
             ld = in.nextInt();
                  System.out.println("INFORME O VALOR DO LADO ESQUERDO");
                  le = in.nextInt();
                  
                  if(base == le && base == ld){
                      System.out.println("TRIANGULO DO TIPO EQUILÁTERO");
                  }
                  if(base == ld && ld != le && base != le  || ld == le && le != base && ld != base || base == le && le != ld && ld != base){
                      System.out.println("TRIANGULO DO TIPO ISÓCELES");
                  }
                  if(base != ld && base != le && ld != le){
                      System.out.println("TRIANGULO DO TIPO ESCALENO");
        
    }
        

    }
}
