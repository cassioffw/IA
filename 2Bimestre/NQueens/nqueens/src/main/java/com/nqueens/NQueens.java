package com.nqueens;

import java.util.ArrayList;
import java.util.Random;

public class NQueens {

    public void hillClimbing(Board board) {
        Board current = new Board(board.getBoard());
        int globalMax = goal(current.getBoard().length);
        boolean localMax = false;
        while (true) {
            if (current.getSafePairs() == globalMax) {
                System.out.println(current.toString());
                break;
            } else {
                for (int i = 0; i < current.getBoard().length; i++) {
                    Board nextAdj = exp(current, i);
                    if (nextAdj.getSafePairs() > current.getSafePairs()) {
                        current.setBoard(nextAdj.getBoard());
                        localMax = false;
                    } else {
                        localMax = true;
                    }
                }
                if (localMax) {
                    System.out.println(current.toString());
                    break;
                }
            }
        }
    }

    public void simulatedAnnealing(Board board) {
        Board current = new Board(board.getBoard());
        Board nextAdj = new Board(current.getBoard());
        for (int t = 1; true; t++) {
            double T = 1 / (1 + Math.pow(2.718, t * 0.00005));
            System.out.println("Temperatura: " + T);
            if (T <= 0.1) {
                System.out.println("Esfriou! Solução encontrada: ");
                System.out.println(current.toString());
                break;
            }
            for (int i = 0; i < current.getBoard().length; i++) {
                nextAdj = exp(current, i);
                int deltaE = nextAdj.getSafePairs() - current.getSafePairs();
                if (deltaE < 0) {
                    current.setBoard(nextAdj.getBoard());
                } else {
                    Random r = new Random();
                    double temp3 = r.doubles(0, 1).findAny().getAsDouble();
                    if (temp3 < Math.pow(2.718, -deltaE / T)) {
                        current.setBoard(nextAdj.getBoard());
                    }
                }
            }
            System.out.println(current.toString());
        }
    }

    public Board exp(Board board, int i) {
        ArrayList<Board> children = new ArrayList<Board>();
        Board child;

        for (int j = 0; j < board.getBoard().length; j++) {
            if (board.getBoard()[i][j] != 1) {
                int child1[][] = new int[board.getBoard().length][board.getBoard().length];
                child1[i][j] = 1;
                for (int k = 0; k < child1.length; k++) {
                    if (k != i) {
                        child1[k] = board.getBoard()[k];
                    }
                }
                children.add(new Board(child1));
            }
        }
        child = children.get(0);

        for (int c = 1; c < children.size(); c++) {
            int best = child.getSafePairs();
            int next = children.get(c).getSafePairs();

            if (next > best) {
                child = children.get(c);
            } else if (next == best) {
                Random r = new Random();
                int random = (r.nextInt(2));
                if (random == 1) {
                    child = children.get(c);
                }
            }
        }
        return child;
    }

    public int goal(int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += i;
        }
        return sum;
    }
}
