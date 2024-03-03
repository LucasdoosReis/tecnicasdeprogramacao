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
 * @brief class Exercicio05
 */
public class Exercicio05 {
        public static void main(String[] args) {
        Scanner in= new Scanner(System.in); 
        int  velocidade,tempo,distancia;
        System.out.println("INFORME A VELOCIDADE EM KM/H");
        velocidade = in.nextInt();
        System.out.println("INFORME INFORME O TEMPO DA VIAGEM EM HORAS");
        tempo = in.nextInt();
        distancia = tempo * velocidade;
             System.out.println("DISTANCIA PERCORRIDA = " + distancia +" KM/H");
        
        
    }

}
