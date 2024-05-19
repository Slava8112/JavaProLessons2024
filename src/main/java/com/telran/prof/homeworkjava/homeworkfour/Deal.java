package com.telran.prof.homeworkjava.homeworkfour;
import java.util.List;
import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();

        System.out.println("Введите количество игроков: ");
        int players = scanner.nextInt();

        while (players <= 1) {
            if (players == 1) {
                System.out.println("Игра закончена,недопустимое количество игроков");
                return;
            } else {
                System.out.println("Количество игроков не может быть меньше 2");
            }
            players = scanner.nextInt();
        }

        final int cardsForPlayer = 5;
        for (int i = 0; i < players; i++) {
            Player player = new Player("Player " + (i + 1));
            List<Card> hand = deck.dealCards(cardsForPlayer);
            for (Card card : hand) {
                player.addCard(card);
            }
            player.printHand();
        }
    }
}
