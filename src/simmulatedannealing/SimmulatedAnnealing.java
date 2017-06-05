/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simmulatedannealing;

import java.util.Random;

/**
 * Implementacion de Simmulated annealing inspirado en
 * http://katrinaeg.com/simulated-annealing.html
 *
 * @author castudil
 */
public class SimmulatedAnnealing {

//    def anneal(solution):
//    old_cost = cost(solution)
//    T = 1.0
//    T_min = 0.00001
//    alpha = 0.9
//    while T > T_min:
//        i = 1
//        while i <= 100:
//            new_solution = neighbor(solution)
//            new_cost = cost(new_solution)
//            ap = acceptance_probability(old_cost, new_cost, T)
//            if ap > random():
//                solution = new_solution
//                old_cost = new_cost
//            i += 1
//        T = T*alpha
//    return solution, old_cost
    int solution[];
    double new_cost;
    double old_cost;
    private double temperature;
    private double tmin;
    private double alpha;
    private int[] new_solution;
    Random r = new Random();

    public double cost(int sol[]) {
        return 0.0;
    }

    public int[] neighbor(int sol[]) {
        int[] newsolution = null;
        return newsolution;
    }

    private double acceptance_probability(double old_cost, double new_cost, double temperature) {
        return 0;
    }

    public int[] solve() {
        old_cost = cost(solution);
        temperature = 1.0;
        tmin = 0.00001;
        alpha = 0.9;
        int i;
        while (temperature > tmin) {
            i = 1;
            while (i <= 100) {
                new_solution = neighbor(solution);
                new_cost = cost(new_solution);
                double ap = acceptance_probability(old_cost, new_cost, temperature);
                if (ap > r.nextDouble()) {
                    solution = new_solution;
                    old_cost = new_cost;
                }
                i += 1;
            }
            temperature = temperature * alpha;
        }
        return solution;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
