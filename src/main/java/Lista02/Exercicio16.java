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
 * @brief class Exercicio16
 */
public class Exercicio16 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
    int LINHA ;
    int COLUNA ;
    int cont = 0;
    
        System.out.println("INFORME A QUANTIDADE DE LINHAS DA MATRIZ");
        LINHA = in.nextInt();
          System.out.println("INFORME A QUANTIDADE DE COLUNAS DA MATRIZ");
          COLUNA = in.nextInt();
          
           int matriz [][] = new int [LINHA][COLUNA];
           // lendo 
        for(int i =0; i< LINHA;i++){
            for(int j =0; j<COLUNA; j++){
                matriz [i][j] = in.nextInt();
            }
        }
          
          /// imprimir a matriz
          for(int i =0; i<LINHA; i++){
              for(int j=0; j<COLUNA; j++){
                  System.out.print("["+ matriz[i][j]+ "]");
              }
                 System.out.print("\n"); 
          }
           //laço para calcular diagonal secundaria em relação linha e colunas 
           for(int i =0; i<LINHA; i++){
              for(int j=0; j<COLUNA; j++){
                  if( i== 0 && j + j ==3){
                      cont = cont + matriz[i][j];
                      
                  }
                
              }
                 
          }
         System.out.println("VALOR DA DIAGONAL SECUNDARIA = " +cont);  
    }

}
