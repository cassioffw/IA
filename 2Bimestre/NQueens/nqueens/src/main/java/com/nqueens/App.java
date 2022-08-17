package com.nqueens;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
		NQueens n = new NQueens();
		Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de rainhas (Rainhas > 4  &  16 < Rainhas) ");
        int queens = sc.nextInt();

        while (queens < 4 || queens > 16) {
            System.out.println("Informe um número válido de rainhas!");
            System.out.print("Informe o número de rainhas (Rainhas > 4  &  16 < Rainhas) ");
            queens = sc.nextInt();
        } 

        System.out.println("Informe o algoritmo desejado para solucionar o problema!");
        System.out.println("1 - Subida de Encosta");
        System.out.println("2 - Têmpera Simulada (não resolve o problema)");
        int alg = sc.nextInt();

        Board board = new Board(queens);
		System.out.println("Tabuleiro criado: \n" + board.toString());
        
        switch(alg){
            case 1:
                System.out.println("Solução encontrada pelo algoritmo Subida de Encosta: ");
                n.hillClimbing(board);
                break;
            case 2:
                System.out.println("================Simulated Annealing================");
                n.simulatedAnnealing(board);
            default:
                System.out.println("Nenhum algoritmo foi selecionado.");
        }
        sc.close();
	}
}
