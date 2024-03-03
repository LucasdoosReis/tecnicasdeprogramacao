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
 * @brief class Exercicio08
 */
public class Exercicio08 {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
        int a,b,maior;
        System.out.println("INFORME O VALOR DE A");
        a = in.nextInt();
        System.out.println("INFORME O VALOR DE B");
        b = in.nextInt();
        // operação ternaria 
        maior = (a>b)? a : b;
        System.out.println("Maior:"+maior);
    }

}
