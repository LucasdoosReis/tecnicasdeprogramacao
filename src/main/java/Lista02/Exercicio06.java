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
 * @brief class Exercicio06
 */
public class Exercicio06 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1,x2,y1,y2,distancia;
        System.out.println("INFORME OS VALORES DE CORDENADAS DO PLANO CARTEZIANO");
        System.out.println("-----------------------------------------------------");
        System.out.println("INFORME O VALOR DO EIXO X1");
        x1 = in.nextInt();
              System.out.println("INFORME O VALOR DO EIXO  Y1");
              y1 = in.nextInt();
                    System.out.println("INFORME O VALOR DO EIXO X2");
                     x2 = in.nextInt();
                              System.out.println("INFORME O VALOR DO EIXO Y2");
                               y2 = in.nextInt();
       distancia = (int)(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        System.out.println("pont 1: (" +x1 +","+ y1 +")");
        System.out.println("pont 2: (" +x2 +"," + y2 + ")");
        System.out.println("DISTANCIA :" + distancia);
        
    }

}
