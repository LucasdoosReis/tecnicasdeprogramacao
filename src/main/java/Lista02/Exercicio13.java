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
 * @brief class Exercicio13
 */
public class Exercicio13 {
        public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int x,y;
       x = 2;
       y = 2;
       int res = 0;
       int res2 = 0;

         for(int i = 0;i<=x;i++){
             res = (x = x)*  y;
             res2 = res2 +res;
             
             System.out.println("n=" + res2 );
         }
      
    }

}
